package com.example.tabhost1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {
TabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabHost = findViewById(R.id.tabHost);
        //21년도 개편내용
        tabHost.setup();

        TabHost.TabSpec tabspec1 = tabHost.newTabSpec("song");
        tabspec1.setIndicator("song");
        tabspec1.setContent(R.id.song);
        tabHost.addTab(tabspec1);

        TabHost.TabSpec tabspec2 = tabHost.newTabSpec("artist");
        tabspec1.setIndicator("artist");
        tabspec1.setContent(R.id.artist);
        tabHost.addTab(tabspec2);

        TabHost.TabSpec tabspec3 = tabHost.newTabSpec("album");
        tabspec1.setIndicator("album");
        tabspec1.setContent(R.id.album);
        tabHost.addTab(tabspec3);
    }
}