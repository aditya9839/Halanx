package com.example.halanx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.material.textfield.TextInputEditText;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import com.example.halanx.Adapter.SearchHomes;

import java.util.Objects;

import static android.content.ContentValues.TAG;

public class Login extends Fragment {

    private TextInputEditText eloginemail5,m_login_pass;
    private View inflatedView = null;
     private Activity parentActivity;

    void referance(Activity activity){
        this.parentActivity = activity;
    }

    @Override
    public void onStart() {
        super.onStart();
        eloginemail5 = inflatedView.findViewById(R.id.loginemail5);
        m_login_pass = inflatedView.findViewById(R.id.login_pass);
//        eloginemail5.setKeyListener(originalKeyListener);
        eloginemail5.requestFocus();

        eloginemail5.setFocusableInTouchMode(true);
        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(getContext()).getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(eloginemail5, InputMethodManager.SHOW_IMPLICIT);
            }
        },500);


    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        this.inflatedView = view;

        Button eclosebuttonlogin = inflatedView.findViewById(R.id.closebuttonlogin);

        Button m_login_button = inflatedView.findViewById(R.id.login_button);

        m_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Objects.requireNonNull(eloginemail5.getText()).toString();
                String pass = Objects.requireNonNull(m_login_pass.getText()).toString();
                if (email.equals("test")&& pass.equals("test")){
                    Log.d(TAG, "onClick: "+email + "\n"+pass );

                    Intent intent = new Intent(getActivity(), SearchHomes.class);
                    startActivity(intent);
                    Objects.requireNonNull(getActivity()).finish();
                }
            }
        });
        eclosebuttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InputMethodManager imm = (InputMethodManager)parentActivity.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
                parentActivity.onBackPressed();

            }
        });

        return view;
    }


}
