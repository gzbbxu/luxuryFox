package com.luxury.fox.api;

import com.luxury.fox.bean.UserBeanResponse;

import fox.luxury.com.base.bean.BaseRespose;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("login")
    Observable<BaseRespose<UserBeanResponse>> login(@Query("username") String username, @Query("password") String password);

}
