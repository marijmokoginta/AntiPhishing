package com.mmacodes.antiphishing.api.endpoint;

import com.mmacodes.antiphishing.model.ipqs.PhishingAnalyze;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPQSEndpoint {
    @GET("{url}")
    Call<PhishingAnalyze> analyzeUrl(@Path("url") String url);
}
