package com.example.menu1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout linaer;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linaer = findViewById(R.id.linear);
        button = findViewById(R.id.button);

    }//oncreate method
    //추가메소드 옵션 메뉴 나타내기

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);//아버지생성자를 불러서 아버지에 있는 생성자메서드 이를 처리
        MenuInflater minInflater = getMenuInflater();
        minInflater.inflate(R.menu.menu1,menu);

        return super.onCreateOptionsMenu(menu);
    }


    //추가 메소드 옵션기능 실행할 소스
}//class