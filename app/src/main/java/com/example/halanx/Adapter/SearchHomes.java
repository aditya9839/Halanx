package com.example.halanx.Adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.widget.Toast;

import com.example.halanx.Client.ApiService;
import com.example.halanx.Client.RetrofitClient;
import com.example.halanx.CurrentLocation;
import com.example.halanx.R;
import com.example.halanx.model.MyPojo;
import com.example.halanx.model.Request;
import com.example.halanx.model.TextRes.Address;
import com.example.halanx.model.TextRes.Result;
import com.example.halanx.model.TextRes.TextResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.content.ContentValues.TAG;

public class SearchHomes extends AppCompatActivity {

    List<Houses> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_homes);


        //retrofit
        data = new ArrayList<>();
//        data.add(new Houses(1, "rent_from, 2, complete_address, 20, 20));

        ApiService myService = RetrofitClient.getInstance().create(ApiService.class);
        Toast.makeText(this, "Searching for houses \n FETCHING DATA FROM API", Toast.LENGTH_SHORT).show();
        myService.getHouses().enqueue(new Callback<MyPojo>() {
            @Override
            public void onResponse(@NonNull Call<MyPojo> call, @NonNull Response<MyPojo> response) {
                Log.d(TAG, "onResponse: Got response");

                assert response.body() != null;
                List<Request> ll = response.body().getRequests();
                List<com.example.halanx.model.Response> resp  = ll.get(0).getResponses();
                String textt = resp.get(0).getText();
                ///convert string to gson
                Gson gson = new Gson();
                TextResponse textResponse = gson.fromJson(textt,TextResponse.class);
                List<Result> textResponseResults = textResponse.getResults();


                int count = textResponse.getCount();
                Log.d(TAG, "onResponse: Count is :" +count);

                for (int i = 0; i<count; i++) {
                    int id = textResponseResults.get(i).getId();
//                    String details = textResponseResults.get(i).getName();

                    Address address = textResponseResults.get(i).getAddress();
//                    String street_address = address.getStreetAddress();
//                    String city = address.getCity();
//                    String state = address.getState();
                    String complete_address = address.getCompleteAddress();
//                    double latitude = address.getLatitude();
//                    double longitude = address.getLongitude();

                    String furnish_type = textResponseResults.get(i).getFurnishType();
                    String house_size = textResponseResults.get(i).getHouseSize();
//                    String cover_pic_url = textResponseResults.get(i).getCoverPicUrl();
                    Double rent_from = textResponseResults.get(i).getRentFrom();
//                    Double security_deposit_from = textResponseResults.get(i).getSecurityDepositFrom();
                    String accomodation_allowed_str = textResponseResults.get(i).getAccomodationAllowedStr();
//                    String house_type = textResponseResults.get(i).getHouseType();


                    data.add(new Houses(id, rent_from, 2, complete_address, furnish_type
                            , accomodation_allowed_str,house_size));
                }
                Toast.makeText(SearchHomes.this, "Click on the cards to know more about houses", Toast.LENGTH_SHORT).show();



                RecyclerView recyclerView = findViewById(R.id.recyclerView);
                Houses_Adapter adapter = new Houses_Adapter(getApplication(),data);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(SearchHomes.this));




//                String country  = address.getCountry();
//                int coun = textResponse.getCount();
//
//                Log.d("My App", ""+country+"\n"+details);

//                String did = response.body().getId();
//                String ss =  ll.get(1).toString();
//                Log.d(TAG, "onResponse: text:"+textt);

            }

            @Override
            public void onFailure(@NonNull Call<MyPojo> call, @NonNull Throwable t) {
                Log.d(TAG, "onResponse: no response");


            }
        });



//        List<Houses> data = fill_with_data();

//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        Houses_Adapter adapter = new Houses_Adapter(getApplication(),data);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        if (requestCode == CurrentLocation.REQUEST_LOCATION){
            Log.d("Asdas","asd");
            CurrentLocation.getLastKnownLocation(this);
        }
    }
}
