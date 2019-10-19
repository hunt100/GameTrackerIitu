package com.example.gametracker.service;

import android.os.Bundle;

import com.example.gametracker.R;
import com.example.gametracker.domain.Data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface CsGoService {
    /*
    @GET("csgo/standard/profile/{platform}/{platformUserIdentifier}")
    Call<List<CsGoStatsProfile>> getCsGoPlayerByIdentifier(@Header("TRN-Api-Key")String apiKey, @Path("platform")String platform, @Path("platformUserIdentifier")String platformUserIdentifier);

    //map or weapon segmentType
    @GET("csgo/standard/profile/{platform}/{platformUserIdentifier}/segments/{segmentType}")
    Call<List<CsGoSegment>> getSegmentByIdentifier(@Header("TRN-Api-Key")String apiKey, @Path("platform")String platform, @Path("platformUserIdentifier")String platformUserIdentifier, @Path("segmentType")String segmentType);
     */
    @Headers("TRN-Api-Key:60b16b1e-ffe5-4049-9a8a-0d9f1408c9bc")
    @GET("csgo/standard/search")
    Call<Data> getPlayerBySearchQuery(@Query("platform")String platform, @Query("query")String query);

}
