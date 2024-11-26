package com.example.autocomplete2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
AutoCompleteTextView singleauto;
MultiAutoCompleteTextView multiauto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singleauto = findViewById(R.id.autosingle);
        multiauto = findViewById(R.id.multiauto);

        String[] str = new String[]{"shingu-professional","shingu_student","shingu-매점",
                "friday","friend","alpha", "ufc"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_dropdown_item_1line ,str);

        singleauto.setAdapter(adapter);

        MultiAutoCompleteTextView.CommaTokenizer token =
                new MultiAutoCompleteTextView.CommaTokenizer();
        multiauto.setTokenizer(token);
        multiauto.setAdapter(adapter);
    }
}