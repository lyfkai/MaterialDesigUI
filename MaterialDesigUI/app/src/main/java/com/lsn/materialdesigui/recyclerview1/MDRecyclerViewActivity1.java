package com.lsn.materialdesigui.recyclerview1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.lsn.materialdesigui.R;

import java.util.ArrayList;

/**
 * MaterialDesign_LayoutInflater源码分析_LinearLayoutCompat源码分析_RecyclerView简单封装
 */
public class MDRecyclerViewActivity1 extends AppCompatActivity {

    private RecyclerView recylerview;
    private ArrayList<String> list;
    private MyRecyclerAdapter adapter;
    //	private MyStaggedRecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdrecycler_view1);
        list = new ArrayList<String>();
        for (int i = 0; i < 60; i++) {
            list.add("item"+i);
        }

        recylerview = (RecyclerView)findViewById(R.id.recylerview);
        adapter = new MyRecyclerAdapter(list);
//		adapter = new MyStaggedRecyclerAdapter(list);
        //LayoutManager布局摆放管理器(线性摆放、瀑布流)
        recylerview.setLayoutManager(new LinearLayoutManager(this));//默认垂直
        //reverseLayout:数据倒置，从右边开始滑动
//		recylerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
//		recylerview.setLayoutManager(new GridLayoutManager(this, 3));
        //瀑布流效果
//		recylerview.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL));
        recylerview.setAdapter(adapter);

        recylerview.setItemAnimator(new DefaultItemAnimator());
        adapter.setOnItemClickListener(new MyRecyclerAdapter.OnItemClickListener() {

            @Override
            public void onItemClick(View view, int position) {
                Toast.makeText(MDRecyclerViewActivity1.this, "点我干嘛"+position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    boolean isGrid = false;

    public void change(View v){
        if(!isGrid){
            recylerview.setLayoutManager(new GridLayoutManager(this, 3));
        }else{
            recylerview.setLayoutManager(new LinearLayoutManager(this));//默认垂直
        }
        isGrid = !isGrid;
    }

    public void addItem(View v){
        adapter.addData(3);
    }


}
