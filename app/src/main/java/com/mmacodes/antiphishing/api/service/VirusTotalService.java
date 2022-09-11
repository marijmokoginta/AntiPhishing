package com.mmacodes.antiphishing.api.service;

import com.mmacodes.antiphishing.api.endpoint.VirusTotalEndpoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class VirusTotalService {

    private static final String API_KEY = "b7e9ff4380ddb2b70d5498bd0c8e5e427898dbcbe7ea847ef27e94f7311f26d4";
    private static final String BASE_URL = "https://www.virustotal.com/api/v3/";

    public static VirusTotalEndpoint apiEndpoint () {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(VirusTotalEndpoint.class);
    }

}
