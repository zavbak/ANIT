package ru.a799000.alexander.anit.repo.rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class BaseRsModel<T> {
    @SerializedName("Пришел")
    @Expose
    public Date received;

    @SerializedName("Подготовлен")
    @Expose
    public Date prepared;

    @SerializedName("Ошибка")
    @Expose
    public Boolean error;

    @SerializedName("ОписаниеОшибки")
    @Expose
    public String description_error;

    @SerializedName("Ответ")
    @Expose
    public T response;



}
