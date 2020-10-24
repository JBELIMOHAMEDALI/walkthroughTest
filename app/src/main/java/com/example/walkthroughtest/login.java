package com.example.walkthroughtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class login extends AppCompatActivity {
    ConstraintLayout constraintLayout ;
    TextView tvTimeMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        constraintLayout = findViewById(R.id.container);
        tvTimeMsg = findViewById(R.id.tv_time_msg);

        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        if ( timeOfDay >=0 && timeOfDay <12) {
            constraintLayout.setBackground(getDrawable(R.drawable.good_morning_img));
            tvTimeMsg.setText("Good Morning");
        }
        else if (timeOfDay >=12 && timeOfDay <16)
        {



        }
        else if (timeOfDay >=16 && timeOfDay <21)
        {



        }
        else if (timeOfDay >=21 && timeOfDay <24)
        {

            constraintLayout.setBackground(getDrawable(R.drawable.good_night_img));
            tvTimeMsg.setText("Good Night");


        }


    }
}