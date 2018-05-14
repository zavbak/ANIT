package ru.a799000.alexander.anit.repo.rest.test_get;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class TestGetRsModel {
    @SerializedName("HTTPМетод")
    @Expose
    public String method;

    @SerializedName("БазовыйURL")
    @Expose
    public String baseUrl;

    @SerializedName("ОтносительныйURL")
    @Expose
    public String relativeUrl;

    @SerializedName("Заголовки")
    @Expose
    public String heder;

    @SerializedName("ПараметрыURL")
    @Expose
    public String paramsUrl;

    @SerializedName("ПараметрыЗапроса")
    @Expose
    public String paramsRq;

    @SerializedName("Тело")
    @Expose
    public String body;



}
