package com.example.xiaoxiao;

import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        initActionBar();
    }

    private void initActionBar() {
        ActionBar actionBar = super.getActionBar();
        actionBar.show();
        actionBar.setDisplayShowHomeEnabled(true);
       actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(true);
       // actionBar.setHomeAsUpIndicator(R.drawabl);
        actionBar.setDisplayShowCustomEnabled(true);
        TextView tvTitle = new TextView(this);
        tvTitle.setText("主页");
        tvTitle.setTextColor(Color.WHITE);
        tvTitle.setTextSize(18);
        tvTitle.setGravity(Gravity.CENTER);
        ActionBar.LayoutParams params = new ActionBar.LayoutParams(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        tvTitle.setLayoutParams(params);

    }
}
