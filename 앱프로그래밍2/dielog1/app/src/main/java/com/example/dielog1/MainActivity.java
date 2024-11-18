package com.example.dielog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder dlg
                        =new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("다이얼로그창");
                dlg.setMessage("당신은 사랑받기위해 태어난 사람");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,
                                        "확인완료",
                                        Toast.LENGTH_LONG).show();
                            }
                        });
                        dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(MainActivity.this,
                                        "취소를 눌렀어요",
                                        Toast.LENGTH_LONG).show();
                            }
                        });

                dlg.show();


               /* Toast.makeText(context:MainActivity.this,
                                text:"눌렀지?",
                                Toast.LENGTH_LONG).show();z*/
            }
        });
    }
}
