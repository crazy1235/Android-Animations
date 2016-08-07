package com.jacksen.transitiondemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by jacksen on 2016/4/29.
 */
public abstract class BaseRvAdapter<T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    protected Context context;

    protected List<T> list;

    public BaseRvAdapter(Context context, List<T> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
