package com.example.liuhe.gradleflavordemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTvMainContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }


    private void initView() {
        mTvMainContent = (TextView) findViewById(R.id.tv_main_content);
        String content = FlavorUtils.logFlavor(this);
        mTvMainContent.setText(content);

    }

    private void initData() {
//        PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
//        versionName = pi.versionName;
//        int versionCode = pi.versionCode;
//        pi.packageName
    }
}
