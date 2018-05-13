package ru.a799000.alexander.anit.repo.rest.test;

import java.util.Map;

import ru.a799000.alexander.anit.repo.rest.BaseRequestModel;

public class TestRequestModel extends BaseRequestModel {
    @Override
    public void onMapCreate(Map<String, String> map) {
        map.put("test","test");
    }
}
