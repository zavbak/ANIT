package ru.a799000.alexander.anit.repo.rest.test;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface TestApi {
    @GET("test/")
    Observable<TestResponseModel> getData(@QueryMap Map<String, String> map);
}
