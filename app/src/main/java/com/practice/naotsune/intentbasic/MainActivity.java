package com.practice.naotsune.intentbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LIFE", "onCreate");
    }

    public void onClick(View v) {
        //SubActivityへのインデントを作成
        Intent i = new Intent(this, com.practice.naotsune.intentbasic.SubActivity.class);
        //アクティビティを起動
        startActivity(i);
        Log.d("EVENT", "onClick");
    }

    @Override
    protected void onDestroy() {
        Log.d("LIFE", "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("LIFE", "onRestart");
        super.onRestart();
    }

    protected void onResume() {
        Log.d("LIFE", "onResume");
        super.onResume();
    }

    protected void onStart() {
        Log.d("LIFE", "onStart");
        super.onStart();
    }

    protected void onStop() {
        Log.d("LIFE", "onStop");
        super.onStop();
    }
}