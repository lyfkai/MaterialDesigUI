package com.lsn.materialdesigui.immersivedesign;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.lsn.materialdesigui.R;

public class DesignActivity3 extends BaseTranslucentActivity {
    private Toolbar toolbar;
    private View nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design2);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        nav = findViewById(R.id.nav);
        setOrChangeTranslucentColor(toolbar, nav, getResources().getColor(R.color.colorPrimary_pink));
    }
}
