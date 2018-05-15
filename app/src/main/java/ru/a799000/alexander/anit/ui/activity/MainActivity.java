package ru.a799000.alexander.anit.ui.activity;


import android.os.Bundle;
import javax.inject.Inject;
import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.R;
import ru.a799000.alexander.anit.moxy.view.MainView;
import ru.a799000.alexander.anit.ui.fragment.ContractorsFragment;


public class MainActivity extends BaseActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getApplicationComponent().inject(this);
        setContent(new ContractorsFragment());

    }

    @Override
    protected int getMainContentLayout() {
        return R.layout.activity_main;
    }
}
