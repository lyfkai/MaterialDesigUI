package com.lsn.materialdesigui.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsn.materialdesigui.R;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by pc on 2017/12/20.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter {



    private List<String> list;

    public MyRecyclerAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //绑定数据方法
        ((MyViewHolder) holder).tv.setText(list.get(position));
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //创建viewholder
        View view = View.inflate(viewGroup.getContext(), R.layout.list_item_1, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        @InjectView(R.id.tv)
        TextView tv;
        public MyViewHolder(View view) {
            super(view);
            ButterKnife.inject(this, view);
        }
    }


}
