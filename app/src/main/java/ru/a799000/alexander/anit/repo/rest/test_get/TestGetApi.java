package ru.a799000.alexander.anit.repo.rest.test_get;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;
import ru.a799000.alexander.anit.repo.rest.BaseRqModel;
import ru.a799000.alexander.anit.repo.rest.BaseRsModel;
import ru.a799000.alexander.anit.repo.rest.test_api.TestResponseModel;

public interface TestGetApi {
    @GET("test.get/")
    Observable<BaseRsModel<TestGetRqMod>> getData(
            @QueryMap Map<String, String> map,
            @Header("Authorization") String auth);
}
