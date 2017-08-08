package com.example.android.sayit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Date extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;SharedPreferences kl;   String l; TextToSpeech t;
    float f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               finish();
            }
        });
        kl=getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=kl.edit();
        l=kl.getString("lang","Local.UK");
        f=kl.getFloat("pitch",1.0f);
        ed.apply();
        Toast.makeText(this,l, Toast.LENGTH_SHORT).show();
        t=new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    if (l.equals("Local.US")) {
                        t.setLanguage(Locale.US);
                    } else t.setLanguage(Locale.UK);

                    t.setPitch(f);
                }            }
        });
        t16=(TextView)findViewById(R.id.t16);
        t1=(TextView)findViewById(R.id.t1); t2=(TextView)findViewById(R.id.t2); t3=(TextView)findViewById(R.id.t3);
        t4=(TextView)findViewById(R.id.t4); t5=(TextView)findViewById(R.id.t5); t6=(TextView)findViewById(R.id.t6);
        t7=(TextView)findViewById(R.id.t7); t8=(TextView)findViewById(R.id.t8); t9=(TextView)findViewById(R.id.t9);
        t11=(TextView)findViewById(R.id.t11); t12=(TextView)findViewById(R.id.t12); t13=(TextView)findViewById(R.id.t13);
        t14=(TextView)findViewById(R.id.t14); t15=(TextView)findViewById(R.id.t15); t10=(TextView)findViewById(R.id.t10);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t1.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t1.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t2.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t2.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t3.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t3.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t4.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t4.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t5.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t5.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t6.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t6.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t7.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t7.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t8.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t8.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t9.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t9.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t10.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t10.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t11.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t11.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        }); t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t12.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t12.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        }); t13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t13.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t13.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t14.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t14.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t15.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t15.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        t16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),t16.getText(),Toast.LENGTH_SHORT).show();
                t.speak(t15.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });
    }
}
