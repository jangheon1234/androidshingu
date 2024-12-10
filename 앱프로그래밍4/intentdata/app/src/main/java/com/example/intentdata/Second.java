package com.example.intentdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Second extends AppCompatActivity {
Button btnSecond;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btnSecond = findViewById(R.id.btnsecond);
        text = findViewById(R.id.text);
        Intent secondIntent = getIntent();
        String readname = secondIntent.getStringExtra("name");
        text.setText(" " + readname);
    }
}