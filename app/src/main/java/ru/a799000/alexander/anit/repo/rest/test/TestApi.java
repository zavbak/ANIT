package ru.a799000.alexander.anit.repo.rest.test;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface TestApi {
    @GET("test/")
    Observable<TestResponseModel> getData();
}
