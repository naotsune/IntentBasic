package com.practice.naotsune.intentbasic;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

/**
 * Created by naoki on 2017/11/17.
 */

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
    }

    //ボタンクリック時に呼び出されるメソッド
    public void onClick(View v) {
        //SubActivityを終了
        finish();
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
