package ru.a799000.alexander.anit.repo.rest.methods.contractors;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import ru.a799000.alexander.anit.model.ContractorMod;

public class ContractorsGetRsMod {

    @SerializedName("Контрагенты")
    @Expose
    public List<ContractorMod> contractors;

    public List<ContractorMod> getContractors() {
        return contractors;
    }

    @Override
    public String toString() {
        return "ContractorsGetRsMod{" +
                "contractors=" + contractors +
                '}';
    }
}
