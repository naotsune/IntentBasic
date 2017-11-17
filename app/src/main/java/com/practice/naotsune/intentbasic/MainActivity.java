package com.practice.naotsune.intentbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.view.Menu;
import android.view.View;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

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
        EditText txtName = (EditText)this.findViewById(R.id.txtName);
        i.putExtra("txtName", txtName.getText().toString());

        //アクティビティを起動
        //startActivity(i);

        //SubActivityを、結果を戻してもらう前提で呼び出し
        this.startActivityForResult(i, 1);

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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //リクエストコードと結果コードをチェック
        if(requestCode == 1 && resultCode == RESULT_OK) {
            //結果コードの取得＆トースト表示
            String txtName = data.getStringExtra("txtName");
            Toast.makeText(this, String.format("こんにちは、%sさん!", txtName), Toast.LENGTH_SHORT).show();
        }

    }
}