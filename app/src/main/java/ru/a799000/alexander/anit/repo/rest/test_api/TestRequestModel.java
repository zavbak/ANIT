package ru.a799000.alexander.anit.repo.rest.test_api;

import java.util.Map;

import ru.a799000.alexander.anit.repo.rest.BaseRqModel;

public class TestRequestModel extends BaseRqModel {
    @Override
    public void onMapCreate(Map<String, String> map) {
        map.put("test","test");
    }
}
