package com.example.android.sayit;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class Verbs_Activity9 extends AppCompatActivity {
    ArrayList<String> wordArrayList = new ArrayList<>(); TextToSpeech t1;SharedPreferences kl; String l;
    float f;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {  final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, wordArrayList);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbs);
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
        wordArrayList.add("base word");
        wordArrayList.add("plural form");
        wordArrayList.add("past");
        wordArrayList.add("past participle");
        wordArrayList.add("i n g form");
        for(String word : ("read\treads\tread\tread\treading").split("\t")) {
            wordArrayList.add(word);
        }

        TextView t3=(TextView)findViewById(R.id.text1);
        t3.setText("Verbs like \"read\" change sound, but not spelling, in the past and past participle");
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(adapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            /*//listview clicked item index
            int itemPosition = position;

            //Listview clicked item value
            String itemValue = (String)listView.getItemAtPosition(position);

            //show alert
            Toast.makeText(getApplicationContext(),
                    "Position:"+itemPosition+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();*/
                String itemValue = (String)gridview.getItemAtPosition(position);
                switch(position){
                    case 0:
                    Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                    break;
                    case 1:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        Toast.makeText(Verbs_Activity9.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;


                }
            }
        });
    }
}
