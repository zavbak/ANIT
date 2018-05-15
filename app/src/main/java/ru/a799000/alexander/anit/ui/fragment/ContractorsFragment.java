package ru.a799000.alexander.anit.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.arellomobile.mvp.presenter.InjectPresenter;

import butterknife.ButterKnife;
import ru.a799000.alexander.anit.R;
import ru.a799000.alexander.anit.moxy.presenter.BaseFeedPresenter;
import ru.a799000.alexander.anit.moxy.presenter.ContractorsPresenter;
import ru.a799000.alexander.anit.moxy.view.ContractorsView;

public class ContractorsFragment extends BaseFeedFragment {
    @InjectPresenter
    ContractorsPresenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    protected BaseFeedPresenter onCreateFeedPresenter() {
        return mPresenter;
    }

    @Override
    public int onCreateToolbarTitle() {
        return R.string.screen_name_contractors;
    }
}