package com.lsn.materialdesigui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.lsn.materialdesigui.CardView.CardViewActivity;
import com.lsn.materialdesigui.TextInputLayout.TextInputLayoutActivity;
import com.lsn.materialdesigui.Toolbar_searchview.SearchViewActivity;
import com.lsn.materialdesigui.Toolbar_searchview.ToolbarActivity;
import com.lsn.materialdesigui.fab.demo1.BehaviorActivity;
import com.lsn.materialdesigui.fab.demo2.BehaviorActivity2;
import com.lsn.materialdesigui.immersivedesign.DesignActivity;
import com.lsn.materialdesigui.immersivedesign.DesignActivity1;
import com.lsn.materialdesigui.navigationview.NavigationViewActivity;
import com.lsn.materialdesigui.navigationview.SnackbarActivity;
import com.lsn.materialdesigui.palette.PaletteActivity;
import com.lsn.materialdesigui.palette.ScrollToolbarActivity;
import com.lsn.materialdesigui.recyclerview.MDRecyclerViewActivity;
import com.lsn.materialdesigui.recyclerview1.MDRecyclerViewActivity1;
import com.lsn.materialdesigui.recyclerview2.MDRecyclerViewActivity2;
import com.lsn.materialdesigui.recyclerview3.MDRecyclerViewActivity3;
import com.lsn.materialdesigui.recyclerview4.MDRecyclerViewActivity4;
import com.lsn.materialdesigui.slidingmenu.DrawerLayoutActivity;
import com.lsn.materialdesigui.tablelayout.TabLayoutActivity;
import com.lsn.materialdesigui.tablelayout.bottomNavigationBarActivity;
import com.lsn.materialdesigui.themestyle.MDThemeStyleActivity;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @InjectView(R.id.mdui_bt_style)
    Button mduiBtStyle;
    @InjectView(R.id.mdui_bt_rv)
    Button mduiBtRv;
    @InjectView(R.id.mdui_bt_rv1)
    Button mduiBtRv1;
    @InjectView(R.id.mdui_bt_rv2)
    Button mduiBtRv2;
    @InjectView(R.id.mdui_bt_rv3)
    Button mduiBtRv3;
    @InjectView(R.id.mdui_bt_rv4)
    Button mduiBtRv4;
    @InjectView(R.id.mdui_bt_ch)
    Button mduiBtCh;
    @InjectView(R.id.mdui_bt_nv)
    Button mduiBtNv;
    @InjectView(R.id.mdui_bt_SnackBar)
    Button mduiBtSnackBar;
    @InjectView(R.id.mdui_bt_TextInputLayout)
    Button mduiBtTextInputLayout;
    @InjectView(R.id.mdui_bt_Toolbar)
    Button mduiBtToolbar;
    @InjectView(R.id.mdui_bt_SearchView)
    Button mduiBtSearchView;
    @InjectView(R.id.mdui_bt_palette)
    Button mduiBtPalette;
    @InjectView(R.id.mdui_bt_scrolltoolbar)
    Button mduiBtScrolltoolbar;
    @InjectView(R.id.mdui_bt_TabLayout)
    Button mduiBtTabLayout;
    @InjectView(R.id.mdui_bt_bottomNavigationBar)
    Button mduiBtBottomNavigationBar;
    @InjectView(R.id.mdui_bt_design)
    Button mduiBtDesign;
    @InjectView(R.id.mdui_bt_design1)
    Button mduiBtDesign1;
    @InjectView(R.id.mdui_bt_design2)
    Button mduiBtDesign2;
    @InjectView(R.id.mdui_bt_design3)
    Button mduiBtDesign3;
    @InjectView(R.id.mdui_bt_MDCardView)
    Button mduiBtMDCardView;
    @InjectView(R.id.mdui_bt_MDFab)
    Button mduiBtMDFab;
    @InjectView(R.id.mdui_bt_fab_animation)
    Button mduiBtFabAnimation;
    @InjectView(R.id.mdui_bt_animation_Behavior)
    Button mduiBtAnimationBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
    }

    @OnClick({R.id.mdui_bt_style, R.id.mdui_bt_rv, R.id.mdui_bt_rv1, R.id.mdui_bt_rv2, R.id.mdui_bt_rv3, R.id.mdui_bt_rv4, R.id.mdui_bt_ch,
            R.id.mdui_bt_nv, R.id.mdui_bt_SnackBar, R.id.mdui_bt_TextInputLayout, R.id.mdui_bt_Toolbar, R.id.mdui_bt_SearchView, R.id.mdui_bt_palette, R.id.mdui_bt_scrolltoolbar,
            R.id.mdui_bt_TabLayout, R.id.mdui_bt_bottomNavigationBar, R.id.mdui_bt_design, R.id.mdui_bt_design1, R.id.mdui_bt_design2, R.id.mdui_bt_design3, R.id.mdui_bt_MDCardView, R.id.mdui_bt_MDFab,
            R.id.mdui_bt_fab_animation,R.id.mdui_bt_animation_Behavior})
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()) {
            /**
             * MaterialDesign_概述_样式_兼容控件使用
             */
            case R.id.mdui_bt_style:
                intent = new Intent(this, MDThemeStyleActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_兼容新控件_RecyclerView简单使用
             */
            case R.id.mdui_bt_rv:
                intent = new Intent(this, MDRecyclerViewActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_LayoutInflater源码分析_LinearLayoutCompat源码分析_RecyclerView简单封装
             */
            case R.id.mdui_bt_rv1:
                intent = new Intent(this, MDRecyclerViewActivity1.class);
                startActivity(intent);
                break;
            /**
             * MaterialDesign_RecyclerView间隔线细节处理
             */
            case R.id.mdui_bt_rv2:
                intent = new Intent(this, MDRecyclerViewActivity2.class);
                startActivity(intent);
                break;
            /**
             * MaterialDesign_RecyclerView的Grid间隔线及源码分析_添加头部和底部封装
             */
            case R.id.mdui_bt_rv3:
                intent = new Intent(this, MDRecyclerViewActivity3.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_RecyclerView交互动画
             */
            case R.id.mdui_bt_rv4:
                intent = new Intent(this, MDRecyclerViewActivity4.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_侧滑
             */
            case R.id.mdui_bt_ch:
                intent = new Intent(this, DrawerLayoutActivity.class);
                startActivity(intent);
                break;
            /**
             * MaterialDesign_NavigationView标准侧滑_Snackbar
             */
            case R.id.mdui_bt_nv:
                intent = new Intent(this, NavigationViewActivity.class);
                startActivity(intent);
                break;
            /**
             * MaterialDesign_NavigationView标准侧滑_Snackbar
             */
            case R.id.mdui_bt_SnackBar:
                intent = new Intent(this, SnackbarActivity.class);
                startActivity(intent);
                break;
            /**
             * MaterialDesign_TextInputLayout
             */
            case R.id.mdui_bt_TextInputLayout:
                intent = new Intent(this, TextInputLayoutActivity.class);
                startActivity(intent);
                break;

            /**
             * MaterialDesign_Toolbar
             */
            case R.id.mdui_bt_Toolbar:
                intent = new Intent(this, ToolbarActivity.class);
                startActivity(intent);
                break;

            /**
             * MaterialDesign_Toolbar_SearchView
             */
            case R.id.mdui_bt_SearchView:
                intent = new Intent(this, SearchViewActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_Palette状态栏颜色提取
             */
            case R.id.mdui_bt_palette:
                intent = new Intent(this, PaletteActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_TranslucentScrollToolbar
             */
            case R.id.mdui_bt_scrolltoolbar:
                intent = new Intent(this, ScrollToolbarActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_TabLayout
             */
            case R.id.mdui_bt_TabLayout:
                intent = new Intent(this, TabLayoutActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_TabLayout_bottomNavigationBar
             */
            case R.id.mdui_bt_bottomNavigationBar:
                intent = new Intent(this, bottomNavigationBarActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_沉浸式设计
             */
            case R.id.mdui_bt_design:
                intent = new Intent(this, DesignActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_沉浸式设计
             */
            case R.id.mdui_bt_design1:
                intent = new Intent(this, DesignActivity1.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_沉浸式设计_底部导航(
             */
            case R.id.mdui_bt_design2:
                intent = new Intent(this, DesignActivity1.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_沉浸式设计_底部导航2封装
             */
            case R.id.mdui_bt_design3:
                intent = new Intent(this, DesignActivity1.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_CardView
             */
            case R.id.mdui_bt_MDCardView:
                intent = new Intent(this, CardViewActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_fab的滑动显示和隐藏交互动画
             */
            case R.id.mdui_bt_MDFab:
                intent = new Intent(this, BehaviorActivity.class);
                startActivity(intent);
                break;
            /**
             *MaterialDesign_fab的滑动显示和隐藏交互动画
             */
            case R.id.mdui_bt_animation_Behavior:
                intent = new Intent(this, BehaviorActivity2.class);
                startActivity(intent);
                break;

        }
    }
}
