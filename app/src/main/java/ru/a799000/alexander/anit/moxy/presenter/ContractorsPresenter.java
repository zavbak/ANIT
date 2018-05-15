package ru.a799000.alexander.anit.moxy.presenter;

import com.arellomobile.mvp.InjectViewState;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;
import ru.a799000.alexander.anit.App;
import ru.a799000.alexander.anit.common.manager.NetworkManager;
import ru.a799000.alexander.anit.model.view.BaseViewModel;
import ru.a799000.alexander.anit.model.view.ContractorItemViewModel;
import ru.a799000.alexander.anit.moxy.view.BaseFeedView;
import ru.a799000.alexander.anit.repo.rest.methods.contractors.ContractorsGetApi;
import ru.a799000.alexander.anit.repo.rest.methods.contractors.ContractorsGetRqMod;

@InjectViewState
public class ContractorsPresenter  extends BaseFeedPresenter<BaseFeedView> {
    @Inject
    ContractorsGetApi mGetApi;

    @Inject
    NetworkManager mNetworkManager;

    public ContractorsPresenter() {
        App.getApplicationComponent().inject(this);
    }

    @Override
    public Observable<BaseViewModel> onCreateLoadDataObservable(int count, int offset,String filterName) {
        return mGetApi.getData(new ContractorsGetRqMod(offset,count,filterName).toMap(),mNetworkManager.getAuthStr())
                .flatMap(baseItemResponseFull -> Observable.fromIterable(baseItemResponseFull.response.getContractors()))
                .map(ContractorItemViewModel::new);
    }
}
