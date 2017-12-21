package com.lsn.materialdesigui.CardView;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lsn.materialdesigui.R;

public class FabActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fab);
    }
    private boolean reverse = false;
    public void rotate(View v){
        float toDegree= reverse?-180f:180f;
        ObjectAnimator animator = ObjectAnimator
                .ofFloat(v, "rotation", 0.0f,toDegree)
                .setDuration(400);
        animator.start();
        reverse = !reverse;
    }
}
