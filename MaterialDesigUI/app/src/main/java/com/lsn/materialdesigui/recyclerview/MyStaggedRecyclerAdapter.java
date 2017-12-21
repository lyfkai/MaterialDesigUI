package com.lsn.materialdesigui.recyclerview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lsn.materialdesigui.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MyStaggedRecyclerAdapter extends RecyclerView.Adapter {


	private List<String> list;
	private List<Integer> heights;

	public MyStaggedRecyclerAdapter(List<String> list) {
		// TODO Auto-generated constructor stub
		this.list = list;

		heights = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			heights.add((int) (200 + Math.random() * 500));
		}

	}


	@Override
	public int getItemCount() {
		// TODO Auto-generated method stub
		return list.size();
	}


	@Override
	public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int arg1) {
		// 创建ViewHolder
		MyViewHolder holder = new MyViewHolder(View.inflate(viewGroup.getContext(),R.layout.list_item_1, null));
		return holder;
	}

	@Override
	public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
		//绑定数据
		ViewGroup.LayoutParams params =  ((MyViewHolder) holder).tv.getLayoutParams();
		params.height = heights.get(position);
//		holder.tv.setBackgroundColor(Color.rgb(100, (int)(Math.random()*255), (int)(Math.random()*255)));
		((MyViewHolder) holder).tv.setLayoutParams(params);
		((MyViewHolder) holder).tv.setText(list.get(position));
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
