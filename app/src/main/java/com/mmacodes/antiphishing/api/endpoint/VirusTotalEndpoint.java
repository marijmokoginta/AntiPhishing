package com.mmacodes.antiphishing.api.endpoint;

import com.mmacodes.antiphishing.model.virus_total.APIResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface VirusTotalEndpoint {

    @Headers({"Accept:application/json",
            "x-apikey:b7e9ff4380ddb2b70d5498bd0c8e5e427898dbcbe7ea847ef27e94f7311f26d4" ,
            "Content-Type:application/x-www-form-urlencoded", })
    @GET("urls/{url}")
    Call<APIResponse> checkUrl(@Path("url") String url);
}
