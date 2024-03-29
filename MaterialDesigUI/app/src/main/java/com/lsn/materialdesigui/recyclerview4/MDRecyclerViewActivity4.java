package com.lsn.materialdesigui.recyclerview4;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.lsn.materialdesigui.R;

import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class MDRecyclerViewActivity4 extends Activity implements StartDragListener {

    @InjectView(R.id.recyclerview)
    RecyclerView recyclerview;
    private ItemTouchHelper itemTouchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mdrecycler_view4);
        ButterKnife.inject(this);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        List<QQMessage> list = DataUtils.init();
        QQAdapter adapter = new QQAdapter(list, this);
        recyclerview.setAdapter(adapter);
        //条目触摸帮助类
        ItemTouchHelper.Callback callback = new MyItemTouchHelperCallback(adapter);
        itemTouchHelper = new ItemTouchHelper(callback);
        itemTouchHelper.attachToRecyclerView(recyclerview);

    }


    public void onStartDrag(ViewHolder viewHolder) {
        itemTouchHelper.startDrag(viewHolder);
    }

}
