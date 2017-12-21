package com.lsn.materialdesigui.immersivedesign;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

import com.lsn.materialdesigui.R;

public class DesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置状态栏的透明属性
//		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)//全屏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_design);
        //5.0+可以直接用API来修改状态栏的颜色。
//		getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_grey_800));


    }


}
