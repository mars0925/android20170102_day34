package com.mars.android20170102_day34;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
//不在介面設定click1來產生按鈕效果
public class MainActivity extends AppCompatActivity {
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3 = (Button) findViewById(R.id.button3);//取得ID
        MyListener listener = new MyListener();//把設定好的listener NEW出來
        btn3.setOnClickListener(listener);//設定btn3的監聽者是listener
    }
    //要設設定一個內部類別來 聽 button的動作
    class MyListener implements View.OnClickListener
    {
        //一定要override 這個方法
        @Override
        public void onClick(View view) {

            Toast.makeText(MainActivity.this, "Test3", Toast.LENGTH_SHORT).show();
        }
    }
}
