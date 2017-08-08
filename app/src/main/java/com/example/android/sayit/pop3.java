package com.example.android.sayit;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;

public class pop3 extends Activity {
    SharedPreferences kl;   String l;TextToSpeech t1;
    float f;
    // Array of strings...
    String[] mobileArray = {"Good morning, Good afternoon, or Good evening","It’s nice to meet you or Pleased to meet you",
            "How have you been?","How do you do?"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop2);
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int w=dm.widthPixels;
        int h=dm.heightPixels;
        getWindow().setLayout(w,h);
        getWindow().setGravity(Gravity.BOTTOM | Gravity.END);
        Toast.makeText(this, "press back to return", Toast.LENGTH_SHORT).show();
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);
        kl=getSharedPreferences("settings", Context.MODE_PRIVATE);

        SharedPreferences.Editor ed=kl.edit();
        l=kl.getString("lang","Local.UK");
        f=kl.getFloat("pitch",1.0f);
        ed.apply();
        Toast.makeText(this,l, Toast.LENGTH_SHORT).show();
        t1=new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    if (l.equals("Local.US")) {
                        t1.setLanguage(Locale.US);
                    } else t1.setLanguage(Locale.UK);

                    t1.setPitch(f);
                }            }
        });
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0 :
                        Toast.makeText(getBaseContext(),"Good morning, Good afternoon, or Good evening",Toast.LENGTH_SHORT).show();
                        t1.speak("Good morning, Good afternoon, or Good evening", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1 :
                        Toast.makeText(getBaseContext(),"It’s nice to meet you or Pleased to meet you",Toast.LENGTH_SHORT).show();
                        t1.speak("It’s nice to meet you or Pleased to meet you", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2 :  Toast.makeText(getBaseContext(),"How have you been?",Toast.LENGTH_SHORT).show();
                        t1.speak("How have you been?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:  Toast.makeText(getBaseContext(),"How do you do?",Toast.LENGTH_SHORT).show();
                        t1.speak("How do you do?", TextToSpeech.QUEUE_FLUSH, null);
                        break;

                }
            }
        });
    }

}
