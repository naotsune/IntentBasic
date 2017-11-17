package com.practice.naotsune.intentbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        //SubActivityへのインデントを作成
        Intent i = new Intent(this, com.practice.naotsune.intentbasic.SubActivity.class);
        //アクティビティを起動
        startActivity(i);
    }
}