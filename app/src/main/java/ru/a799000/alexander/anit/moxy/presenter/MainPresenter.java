package ru.a799000.alexander.anit.moxy.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import java.util.concurrent.Callable;

import javax.inject.Inject;


import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.common.manager.MyFragmentManager;
import ru.a799000.alexander.anit.moxy.view.MainView;

@InjectViewState
public class MainPresenter extends MvpPresenter<MainView> {



    @Inject
    MyFragmentManager myFragmentManager;

    public MainPresenter() {
        App.getApplicationComponent().inject(this);
    }

}