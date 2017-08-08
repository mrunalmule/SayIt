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

public class pop4 extends Activity { SharedPreferences kl;   String l;TextToSpeech t1;
    float f;
    // Array of strings...
    String[] mobileArray = {"Yo!","Are you OK?, You alright?, or Alright mate?" ,

            "Howdy!","Sup? or Whazzup?","G’day mate!","Hiya!"
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
                        Toast.makeText(getBaseContext(),"Yo!",Toast.LENGTH_SHORT).show();
                        t1.speak("Yo!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1 :
                        Toast.makeText(getBaseContext(),"Are you OK?, You alright?, or Alright mate?",Toast.LENGTH_SHORT).show();
                        t1.speak("Are you OK?, You alright?, or Alright mate?", TextToSpeech.QUEUE_FLUSH, null);
                        break;

                    case 2:  Toast.makeText(getBaseContext(),"Howdy!",Toast.LENGTH_SHORT).show();
                        t1.speak("Howdy!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3 :
                        Toast.makeText(getBaseContext(),"Sup? or Whazzup?",Toast.LENGTH_SHORT).show();
                        t1.speak("Sup? or Whazzup?", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4 :  Toast.makeText(getBaseContext(),"G’day mate!",Toast.LENGTH_SHORT).show();
                        t1.speak("G’day mate!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5 :  Toast.makeText(getBaseContext(),"Hiya!",Toast.LENGTH_SHORT).show();
                        t1.speak("Hiya!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
            }
        });
    }

}
