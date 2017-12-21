package com.lsn.materialdesigui.recyclerview;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.lsn.materialdesigui.R;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * MaterialDesign_兼容新控件_RecyclerView简单使用
 */
public class MDRecyclerViewActivity extends Activity {

    @InjectView(R.id.recyclerview)
    RecyclerView recyclerview;

    private ArrayList<String> list;
   // private MyRecyclerAdapter adapter;
    private MyStaggedRecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdrecycler_view);
        ButterKnife.inject(this);

        list = new ArrayList<String>();
        for (int i = 0; i < 60; i++) {
            list.add("item"+i);
        }

       // adapter = new MyRecyclerAdapter(list);
         adapter = new MyStaggedRecyclerAdapter(list);
        //LayoutManager布局摆放管理器(线性摆放、瀑布流)
        // recyclerview.setLayoutManager(new LinearLayoutManager(this));//默认垂直
        //reverseLayout:数据倒置，从右边开始滑动
        //recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));
        //recyclerview.setLayoutManager(new GridLayoutManager(this, 3));

        //瀑布流效果
        recyclerview.setLayoutManager(new StaggeredGridLayoutManager(3, LinearLayoutManager.VERTICAL));
        recyclerview.setAdapter(adapter);

    }
}
