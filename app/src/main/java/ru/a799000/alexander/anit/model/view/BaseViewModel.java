package ru.a799000.alexander.anit.model.view;

import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import ru.a799000.alexander.anit.R;
import ru.a799000.alexander.anit.ui.view.holder.BaseViewHolder;


public abstract class BaseViewModel {

    public abstract LayoutTypes getType();

    public BaseViewHolder createViewHolder(ViewGroup parent) {
        return onCreateViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(getType().getValue(), parent, false));
    }

    protected abstract BaseViewHolder onCreateViewHolder(View view);

    public boolean isItemDecorator() {
        return false;
    }


    public enum LayoutTypes {
        ContractorItem(R.layout.item_contractor);


        private final int id;

        LayoutTypes(int resId) {
            this.id = resId;
        }

        @LayoutRes
        public int getValue() {
            return id;
        }
    }
}
