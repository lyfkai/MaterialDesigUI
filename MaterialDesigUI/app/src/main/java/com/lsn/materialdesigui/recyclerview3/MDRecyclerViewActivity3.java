package com.lsn.materialdesigui.recyclerview3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

import com.lsn.materialdesigui.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * MaterialDesign_RecyclerView的Grid间隔线及源码分析_添加头部和底部封装
 */
public class MDRecyclerViewActivity3 extends AppCompatActivity {

    @InjectView(R.id.recyclerView)
    WrapRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdrecycler_view3);
        ButterKnife.inject(this);


//		View headerView = View.inflate(this, resource, root);
        TextView headerView = new TextView(this);
        //		TextView tv = headerView.findViewById(id);
        LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        headerView.setLayoutParams(params);
        headerView.setText("我是HeaderView");
        recyclerView.addHeaderView(headerView);

        TextView footerView = new TextView(this);
        params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
        footerView.setLayoutParams(params);
        footerView.setText("我是FooterView");
        recyclerView.addFooterView(footerView);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("item " + i);
        }

        MyAdapter adapter = new MyAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
