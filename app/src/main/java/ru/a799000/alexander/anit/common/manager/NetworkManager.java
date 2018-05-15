package ru.a799000.alexander.anit.common.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;



import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.repo.rest.AutoritationManager;


public class NetworkManager {
    @Inject
    Context mContext;

    private static final String TAG = "NetworkManager";

    public NetworkManager() {
        App.getApplicationComponent().inject(this);
    }

    public boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) mContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        //return ((networkInfo != null && networkInfo.isConnected()) || Util.isEmulator());
        return ((networkInfo != null && networkInfo.isConnected()));
    }


    public String getAuthStr(){
        return AutoritationManager.getStringAutorization("Гладких","123");
    }

    public Callable<Boolean> isVkReachableCallable() {
        return new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                try {
                    if (!isOnline()) {
                        return false;
                    }

                    URL url = new URL("https://api.vk.com");
                    //URL url = new URL("");
                    HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
                    urlc.setConnectTimeout(2000);
                    urlc.connect();

                    return true;

                } catch (Exception e) {
                    return false;
                }
            }
        };
    }


    public Observable<Boolean> getNetworkObservable() {
        return Observable.fromCallable(isVkReachableCallable());
    }
}
