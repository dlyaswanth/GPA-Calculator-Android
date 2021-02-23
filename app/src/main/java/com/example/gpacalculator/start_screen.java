package com.example.gpacalculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class start_screen extends Activity {
    private static int TIME_OUT = 1000; //Time to launch the another activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_screen);
        TextView tv=(TextView)findViewById(R.id.textView3);
        tv.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in));
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(start_screen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
