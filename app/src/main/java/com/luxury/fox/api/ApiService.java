package com.luxury.fox.api;

import com.luxury.fox.bean.TestBook;
import com.luxury.fox.bean.UserBeanResponse;

import java.util.List;

import fox.luxury.com.base.bean.BaseRespose;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("hot")
    Observable<BaseRespose<List<TestBook>>> login();

}
