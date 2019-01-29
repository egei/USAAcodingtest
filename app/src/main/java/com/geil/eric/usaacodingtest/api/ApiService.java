package com.geil.eric.usaacodingtest.api;


import com.geil.eric.usaacodingtest.model.OuterData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Abhi on 06 Sep 2017 006.
 */

public interface ApiService {

    /*
    Retrofit get annotation with our URL
    And our method that will return us the List of EmployeeList
    */
    @GET("retrofit/json_object.json")
    Call<OuterData> getMyJSON();
}