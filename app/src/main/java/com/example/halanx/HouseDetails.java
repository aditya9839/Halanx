package com.example.halanx;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.widget.Toast;

public class HouseDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FragmentTransaction transaction;
        FragmentManager fragmentManager;

        Toast.makeText(this, "Here is the details of house", Toast.LENGTH_SHORT).show();
        fragmentManager = getSupportFragmentManager();

        Map blankFragment = new Map();
        blankFragment.referance();
        transaction = fragmentManager.beginTransaction();

//                use addToBackStack to go
        transaction.commit();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //result of current location
        if (requestCode == CurrentLocation.REQUEST_LOCATION){
            Log.d("Asdas","asd");
            CurrentLocation.getLastKnownLocation(this);
        }

    }
}
