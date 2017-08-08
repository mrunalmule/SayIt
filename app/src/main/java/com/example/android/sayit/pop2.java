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


public class pop2 extends Activity {
    // Array of strings...
    SharedPreferences kl;   String l;TextToSpeech t1;
    float f;
    String[] mobileArray = {"Hey, Hey man, or Hi","How’s it going? or How are you doing?",
            "What’s up?, What’s new?, or What’s going on?","How’s everything ?, How are things?, or How’s life?",
            "How’s your day? or How’s your day going?","Good to see you or Nice to see you","Long time no see or It’s been a while"
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
        final ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0 :
                        Toast.makeText(getBaseContext(),"Hey, Hey man, or Hi",Toast.LENGTH_SHORT).show();
                        t1.speak("Hey, Hey man, or Hi", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1 :
                        Toast.makeText(getBaseContext(),"How’s it going? or How are you doing?",Toast.LENGTH_SHORT).show();
                        t1.speak("How’s it going? or How are you doing?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2 :  Toast.makeText(getBaseContext(),"What’s up?, What’s new?, or What’s going on?",Toast.LENGTH_SHORT).show();
                        t1.speak("What’s up?, What’s new?, or What’s going on?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                  case 3:  Toast.makeText(getBaseContext(),"How’s everything ?, How are things?, or How’s life?",Toast.LENGTH_SHORT).show();
                        t1.speak("How’s everything ?, How are things?, or How’s life?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4 :
                        Toast.makeText(getBaseContext(),"How’s your day? or How’s your day going?",Toast.LENGTH_SHORT).show();
                        t1.speak("How’s your day? or How’s your day going?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5 :  Toast.makeText(getBaseContext(),"Good to see you or Nice to see you",Toast.LENGTH_SHORT).show();
                        t1.speak("Good to see you or Nice to see you", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:  Toast.makeText(getBaseContext(),"Long time no see or It’s been a while",Toast.LENGTH_SHORT).show();
                        t1.speak("Long time no see or It’s been a while", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
            }
        });

    }

}
