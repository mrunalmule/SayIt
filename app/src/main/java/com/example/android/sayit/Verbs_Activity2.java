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

public class Verbs_Activity2 extends AppCompatActivity {
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
        for(String word : ("think\tthinks\tthought\tthought\tthinking\t" +
                "bring\tbrings\tbrought\tbrought\tbringing\t" +
                "buy\tbuys\tbought\tbought\tbuying\t" +
                "seek\tseeks\tsought\tsought\tseeking\t" +
                "fight\tfights\tfought\tfought\tfighting\t" +
                "catch\tcatches\tcaught\tcaught\tcatching\t" +
                "teach\tteaches\ttaught\ttaught\tteaching").split("\t")) {
            wordArrayList.add(word);
        }

        TextView t3=(TextView)findViewById(R.id.text1);
        t3.setText("");
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
                    Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                    break;
                    case 1:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 26:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 27:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 28:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 29:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 30:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 31:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 32:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 33:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 34:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 35:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 36:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 37:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 38:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 39:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 40:
                        Toast.makeText(Verbs_Activity2.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;

                }
            }
        });
    }
}
