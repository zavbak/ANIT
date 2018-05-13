package ru.a799000.alexander.anit.di.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.a799000.alexander.anit.repo.rest.RestClient;
import ru.a799000.alexander.anit.repo.rest.test.TestApi;


@Module
public class RestModule {
    private RestClient mRestClient;


    public RestModule() {
        mRestClient = new RestClient();
    }


    @Provides
    @Singleton
    public RestClient provideRestClient() {
        return mRestClient;
    }

    @Provides
    @Singleton
    public TestApi provideTestApi() {
        return mRestClient.createService(TestApi.class);
    }


}
