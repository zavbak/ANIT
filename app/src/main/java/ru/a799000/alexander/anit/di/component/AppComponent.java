package ru.a799000.alexander.anit.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ru.a799000.alexander.anit.common.manager.NetworkManager;
import ru.a799000.alexander.anit.di.module.ManagerModule;
import ru.a799000.alexander.anit.di.module.RestModule;
import ru.a799000.alexander.anit.moxy.presenter.ContractorsPresenter;
import ru.a799000.alexander.anit.moxy.presenter.MainPresenter;
import ru.a799000.alexander.anit.ui.activity.BaseActivity;
import ru.a799000.alexander.anit.ui.activity.MainActivity;
import ru.a799000.alexander.anit.di.module.ApplicationModule;
import ru.a799000.alexander.anit.ui.view.holder.ContractorsItemHolder;

@Singleton
@Component(modules = {ApplicationModule.class, ManagerModule.class,RestModule.class})
public interface AppComponent {
    //activity
    void inject(MainActivity activity);
    void inject(BaseActivity baseActivity);

    //presenter
    void inject(MainPresenter mainPresenter);
    void inject(ContractorsPresenter contractorsPresenter);

    //holder
    void inject(ContractorsItemHolder newsItemBodyHolder);

    void inject(NetworkManager networkManager);
}
