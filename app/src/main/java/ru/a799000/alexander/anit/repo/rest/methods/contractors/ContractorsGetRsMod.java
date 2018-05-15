package ru.a799000.alexander.anit.repo.rest.methods.contractors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContractorsGetRsMod {

    @SerializedName("Контрагенты")
    @Expose
    public List<ContractorMod> contractors;

    @Override
    public String toString() {
        return "ContractorsGetRsMod{" +
                "contractors=" + contractors +
                '}';
    }
}
