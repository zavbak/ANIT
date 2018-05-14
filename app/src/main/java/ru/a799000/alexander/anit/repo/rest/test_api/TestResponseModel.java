package ru.a799000.alexander.anit.repo.rest.test_api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class TestResponseModel {
    @SerializedName("date")
    @Expose
    private Date date;
    @SerializedName("info")
    @Expose
    private String info;

    @SerializedName("Массив")
    @Expose
    private List<TestItemMassResponseModel> mass = null;

    public List<TestItemMassResponseModel> getMass() {
        return mass;
    }

    public void setMass(List<TestItemMassResponseModel> mass) {
        this.mass = mass;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "TestResponseModel{" +
                "date=" + date +
                ", info='" + info + '\'' +
                ", mass=" + mass +
                '}';
    }
}
