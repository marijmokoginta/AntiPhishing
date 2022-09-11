package com.mmacodes.antiphishing.api.service;

import com.mmacodes.antiphishing.api.endpoint.IPQSEndpoint;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IPQSService {
    private static final String API_KEY = "CSBxNHbKIpjWTrqG2QNeamNz2IRGIDf8";
    private static final String BASE_URL = "https://ipqualityscore.com/api/json/url/" + API_KEY + "/";

    public static IPQSEndpoint ipqsEndpoint() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(IPQSEndpoint.class);
    }
}
