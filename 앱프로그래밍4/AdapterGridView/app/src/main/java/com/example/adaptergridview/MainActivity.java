package com.example.adaptergridview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
GridView grid;
View dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.grid);
        //격자그리드뷰에 사진 놓을 방식 ===> 아기클래스로 셋팅
        //아기클래스로 객체 생성
        GridAdapter adapter = new GridAdapter(MainActivity.this);
        grid.setAdapter(adapter);



    }//oncreate
//내부클래스

class GridAdapter extends BaseAdapter {
        //멤버변수
    Context context;
    Integer postid[]={
            R.drawable.mov01,R.drawable.mov02,R.drawable.mov03,R.drawable.mov04,R.drawable.mov05,
            R.drawable.mov06,R.drawable.mov07,R.drawable.mov08,R.drawable.mov09,R.drawable.mov10,
            R.drawable.mov11,R.drawable.mov12,R.drawable.mov13,R.drawable.mov14,R.drawable.mov15,
            R.drawable.mov16,R.drawable.mov17,R.drawable.mov18,R.drawable.mov19,R.drawable.mov20,
            R.drawable.mov21,R.drawable.mov22,R.drawable.mov23,R.drawable.mov24};
    //생성자
    public GridAdapter(Context context){
        this.context = context;
    }
    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        ImageView img = new ImageView(context);
        img.setLayoutParams(new ViewGroup.LayoutParams(150,200));
        img.setPadding(5,5,5,5);
        img.setImageResource(postid[pos]);
        final int index = pos;
        //이벤트처리
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //대화상자 표시
            dialog = View.inflate(MainActivity.this, R.layout.dialog,null);
            ImageView ivPoster=dialog.findViewById(R.id.ivPoster);
            ivPoster.setImageResource(postid[index]);
                AlertDialog.Builder dlg
                        =new AlertDialog.Builder(MainActivity.this);
                dlg.setView(dialog);
                dlg.setTitle("big image");
                dlg.setIcon(R.drawable.movie_icon);
                ivPoster.setImageResource(postid[pos]);;
                dlg.setPositiveButton("closed", null);
                dlg.show();

            }
        });
        return img;
    }
    //3멤버메소드
    @Override
    public int getCount() {
        return postid.length;
    }

    @Override
    public Object getItem(int i) { return null; }

    @Override
    public long getItemId(int i) { return 0; }


}

}//class