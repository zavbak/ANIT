package ru.a799000.alexander.anit.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.Toast;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.R;
import ru.a799000.alexander.anit.repo.rest.test_api.TestApi;
import ru.a799000.alexander.anit.repo.rest.test_api.TestRequestModel;
import ru.a799000.alexander.anit.repo.rest.test_api.TestResponseModel;

public class MainActivity extends AppCompatActivity {

    @Inject
    TestApi mTestApi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getApplicationComponent().inject(this);




        mTestApi.getData(new TestRequestModel().toMap())
                .observeOn(AndroidSchedulers.mainThread())// Говорим в какой поток вернуть
                .subscribeOn(Schedulers.io()) // Выбераем io - для работы с данными и интернетом
                .subscribe(modelResponse -> {
                            Toast.makeText(this, ((TestResponseModel) modelResponse).toString(), Toast.LENGTH_SHORT).show();
                            //Toast.makeText(this,"kjhkjh",Toast.LENGTH_SHORT).show();
                        },
                        throwable -> {

                            Toast.makeText(this, throwable.getMessage(), Toast.LENGTH_SHORT).show();


                        }

                );
    }
}
