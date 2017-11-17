package com.practice.naotsune.intentbasic;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;

/**
 * Created by naoki on 2017/11/17.
 */

public class SubActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        //インテントを取得&トーストに反映
        Intent i = this.getIntent();
        String txtName = i.getStringExtra("txtName");
        Toast.makeText(this, String.format("こんにちは、%sさん", txtName), Toast.LENGTH_SHORT).show();
    }

    //ボタンクリック時に呼び出されるメソッド
    public void onClick(View v) {
        EditText txtName = (EditText)findViewById(R.id.txtName);
        Intent i = new Intent();
        i.putExtra("txtName", txtName.getText().toString());
        setResult(RESULT_OK, i);
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
