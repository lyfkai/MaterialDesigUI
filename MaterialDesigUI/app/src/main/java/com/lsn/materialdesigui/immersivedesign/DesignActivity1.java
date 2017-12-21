package com.lsn.materialdesigui.immersivedesign;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;

import com.lsn.materialdesigui.R;

public class DesignActivity1 extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置状态栏的透明属性
//		getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)//全屏
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        setContentView(R.layout.activity_design);
        //5.0+可以直接用API来修改状态栏的颜色。
//		getWindow().setStatusBarColor(getResources().getColor(R.color.material_blue_grey_800));
        //1.先设置toolbar的高度
        toolbar = (Toolbar)findViewById(R.id.toolbar);
//		LayoutParams params = toolbar.getLayoutParams();
//		int statusBarHeight = getStatusBarHeight(this);
//		params.height += statusBarHeight ;
//		toolbar.setLayoutParams(params );
        //2.设置paddingTop，以达到状态栏不遮挡toolbar的内容。
        toolbar.setPadding(
                toolbar.getPaddingLeft(),
                toolbar.getPaddingTop()+getStatusBarHeight(this),
                toolbar.getPaddingRight(),
                toolbar.getPaddingBottom());


    }

    /**
     * 获取状态栏的高度
     * @param context
     * @return
     */
    private int getStatusBarHeight(Context context) {
        // 反射手机运行的类：android.R.dimen.status_bar_height.
        int statusHeight = -1;
        try {
            Class<?> clazz = Class.forName("com.android.internal.R$dimen");
            Object object = clazz.newInstance();
            String heightStr = clazz.getField("status_bar_height").get(object).toString();
            int height = Integer.parseInt(heightStr);
            //dp--->px
            statusHeight = context.getResources().getDimensionPixelSize(height);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return statusHeight;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}