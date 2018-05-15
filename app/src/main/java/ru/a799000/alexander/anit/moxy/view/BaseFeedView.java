package ru.a799000.alexander.anit.moxy.view;

import com.arellomobile.mvp.MvpView;

import java.util.List;

import ru.a799000.alexander.anit.model.view.BaseViewModel;


public interface BaseFeedView extends MvpView {
    void showRefreshing();

    void hideRefreshing();


    void showListProgress();

    void hideListProgress();


    void showError(String message);


    void setItems(List<BaseViewModel> items);

    void addItems(List<BaseViewModel> items);
}
