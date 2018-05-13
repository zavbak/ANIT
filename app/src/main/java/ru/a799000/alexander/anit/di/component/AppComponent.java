package ru.a799000.alexander.anit.di.component;

import javax.inject.Singleton;

import dagger.Component;
import ru.a799000.alexander.anit.di.module.RestModule;
import ru.a799000.alexander.anit.ui.activity.MainActivity;
import ru.a799000.alexander.anit.di.module.ApplicationModule;

@Singleton
@Component(modules = {ApplicationModule.class, RestModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
