package com.example.reservation;

import static com.example.reservation.R.id.rdoCal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.icu.text.UFormat;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
Chronometer chronometer;
Button btnStart, btnEnd;
RadioButton rdoCal, rdoTime;
CalendarView calender;
TimePicker timepicker;
TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;
int sYear,sMonth,sDay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.start();
                chronometer.setTextColor(Color.RED);
            }
        });
        rdoCal  = findViewById(R.id.rdoCal);
        rdoTime = findViewById(R.id.rdoTime);
        calender = findViewById(R.id.calender);
        timepicker = findViewById(R.id.timepicker);
    rdoCal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            calender.setVisibility(view.VISIBLE);
            timepicker.setVisibility(view.INVISIBLE);
        }
    });
    rdoTime.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            calender.setVisibility(view.INVISIBLE);
            timepicker.setVisibility(view.VISIBLE);
        }
    });
btnEnd = findViewById(R.id.btnEnd);
tvYear = findViewById(R.id.tvYear);
tvMonth = findViewById(R.id.tvMonth);
tvDay = findViewById(R.id.tvDay);
tvHour = findViewById(R.id.tvHour);
tvMinute = findViewById(R.id.tvMinute);
calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
    @Override
    public void onSelectedDayChange(@NonNull CalendarView calendarView, int iyear, int i1month, int i2day) {
        sYear = iyear;
        sMonth = i1month + 1;
        sDay = i2day;
    }
});
timepicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
    @Override
    public void onTimeChanged(TimePicker timePicker, int itime, int i1minute) {

    }
});
btnEnd.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        chronometer.stop();
        tvYear.setText(Integer.toString(sYear));
        tvMonth.setText(Integer.toString(sMonth));
        tvDay.setText(Integer.toString(sDay));
        tvHour.setText(Integer.toString(timepicker.getCurrentHour()));
        tvMinute.setText(Integer.toString(timepicker.getCurrentMinute()));
    }
});


    }
}