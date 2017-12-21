package com.lsn.materialdesigui.recyclerview1;

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
    private OnItemClickListener mOnItemClickListener;

    public MyRecyclerAdapter(List<String> list) {
        this.list = list;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,final int position) {
        //绑定数据
        ((MyViewHolder) holder).tv.setText(list.get(position));
        if(mOnItemClickListener!=null){
            holder.itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    mOnItemClickListener.onItemClick(view, position);
                }
            });
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        //创建viewholder
        View view = View.inflate(viewGroup.getContext(), R.layout.list_item_1, null);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }


    public void addData(int position){
        list.add(position,"additem"+position);
        //提示刷新--会影响效率
//		notifyDataSetChanged();
        notifyItemInserted(position);
    }
    public void removeData(int position){
        list.remove(position);
        notifyItemRemoved(position);
    }

    public interface OnItemClickListener{
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.mOnItemClickListener = listener;
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
