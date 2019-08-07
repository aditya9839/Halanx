package com.example.halanx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Login_Activity extends AppCompatActivity {

    Login login;
    Button mlogin;
    FragmentTransaction transaction;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CurrentLocation.getLastKnownLocation(this);

        setContentView(R.layout.activity_login_);

        Toast.makeText(this, "This is the Login page", Toast.LENGTH_SHORT).show();
        mlogin = findViewById(R.id.login);

        fragmentManager = getSupportFragmentManager();

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                login = new Login();
                login.referance(Login_Activity.this);
                transaction = fragmentManager.beginTransaction();

                transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
//                use addToBackStack to go
                transaction.replace(R.id.loginn, login).addToBackStack(null).commit();
            }
        });

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
