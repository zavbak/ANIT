package ru.a799000.alexander.anit.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.R;
import ru.a799000.alexander.anit.repo.rest.AutoritationManager;
import ru.a799000.alexander.anit.repo.rest.BaseRsMod;
import ru.a799000.alexander.anit.repo.rest.methods.contractors.ContractorsGetApi;
import ru.a799000.alexander.anit.repo.rest.methods.contractors.ContractorsGetRqMod;
import ru.a799000.alexander.anit.repo.rest.methods.test.TestGetApi;
import ru.a799000.alexander.anit.repo.rest.methods.test.TestGetRqMod;
import ru.a799000.alexander.anit.repo.rest.methods.test.TestGetRsMod;


public class MainActivity extends AppCompatActivity {



    @Inject
    TestGetApi mTestGetApi;

    @Inject
    ContractorsGetApi mContractorsGetApi;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getApplicationComponent().inject(this);

        mContractorsGetApi.getData(new ContractorsGetRqMod(3, 10, "торг").toMap(),
                AutoritationManager.getStringAutorization("Гладких", "123"))
                .observeOn(AndroidSchedulers.mainThread())// Говорим в какой поток вернуть
                .subscribeOn(Schedulers.io()) // Выбераем io - для работы с данными и интернетом
                .subscribe(response -> {
                            Toast.makeText(this, response.toString(), Toast.LENGTH_SHORT).show();

                        },
                        throwable -> {

                            Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();


                        }

                );


//        mTestGetApi.getData(new TestGetRqMod().toMap(), AutoritationManager.getStringAutorization("Гладких","123"))
//                .observeOn(AndroidSchedulers.mainThread())// Говорим в какой поток вернуть
//                .subscribeOn(Schedulers.io()) // Выбераем io - для работы с данными и интернетом
//                .subscribe(modelResponse -> {
//
//                            BaseRsMod<TestGetRsMod> baseRsModel = modelResponse;
//                            Toast.makeText(this, baseRsModel.toString(), Toast.LENGTH_SHORT).show();
//                            //Toast.makeText(this,"kjhkjh",Toast.LENGTH_SHORT).show();
//                        },
//                        throwable -> {
//
//                            Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
//
//
//                        }
//
//                );


//        mTestApi.getData(new TestRequestModel().toMap())
//                .observeOn(AndroidSchedulers.mainThread())// Говорим в какой поток вернуть
//                .subscribeOn(Schedulers.io()) // Выбераем io - для работы с данными и интернетом
//                .subscribe(modelResponse -> {
//                            Toast.makeText(this, ((TestResponseModel) modelResponse).toString(), Toast.LENGTH_SHORT).show();
//                            //Toast.makeText(this,"kjhkjh",Toast.LENGTH_SHORT).show();
//                        },
//                        throwable -> {
//
//                            Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
//
//
//                        }
//
//                );
    }
}
