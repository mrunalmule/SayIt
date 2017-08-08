package com.example.android.sayit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Launch extends AppCompatActivity {
    private static int SPLASH_TIME_OUT=3500;
    TextView t,t2,t3,t4,t5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        t=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView5);
        t4=(TextView)findViewById(R.id.textView6);
        t5=(TextView)findViewById(R.id.textView7);
        t.startAnimation(AnimationUtils.loadAnimation(Launch.this, R.anim.left));
        t2.startAnimation(AnimationUtils.loadAnimation(Launch.this, R.anim.up));
        t3.startAnimation(AnimationUtils.loadAnimation(Launch.this, R.anim.down));
        t4.startAnimation(AnimationUtils.loadAnimation(Launch.this, R.anim.up2));
        t5.startAnimation(AnimationUtils.loadAnimation(Launch.this, R.anim.down2));
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent Main=new Intent(Launch.this,MainActivity.class);
                startActivity(Main);
                finish();
            }
        },SPLASH_TIME_OUT);
    }

}
