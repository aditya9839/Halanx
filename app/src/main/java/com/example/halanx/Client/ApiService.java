package com.example.halanx.Client;

import com.example.halanx.model.MyPojo;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
        @GET("/collections/658d3774272e9da88ebb")
        Call<MyPojo> getHouses();
}
