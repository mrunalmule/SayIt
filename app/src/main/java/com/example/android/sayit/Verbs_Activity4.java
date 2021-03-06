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

public class Verbs_Activity4 extends AppCompatActivity {
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
        for(String word : ("creep\tcreeps\tcrept\tcrept\tcreeping\t" +
                "keep\tkeeps\tkept\tkept\tkeeping\t" +
                "sleep\tsleeps\tslept\tslept\tsleeping\t" +
                "sweep\tsweeps\tswept\tswept\tsweeping\t" +
                "weep\tweeps\twept\twept\tweeping\t" +
                "bleed\tbleeds\tbled\tbled\tbleeding\t" +
                "breed\tbreeds\tbred\tbred\tbreeding\t" +
                "feed\tfeeds\tfed\tfed\tfeeding\t" +
                "flee\tflees\tfled\tfled\tfleeing\t" +
                "lead\tleads\tled\tled\tleading\t" +
                "speed\tspeeds\tsped\tsped\tspeeding\t" +
                "meet\tmeets\tmet\tmet\tmeeting\t" +
                "bend\tbends\tbent\tbent\tbending\t" +
                "lend\tlends\tlent\tlent\tlending\t" +
                "send\tsends\tsent\tsent\tsending\t" +
                "spend\tspends\tspent\tspent\tspending\t" +
                "deal\tdeals\tdealt\tdealt\tdealing\t" +
                "feel\tfeels\tfelt\tfelt\tfeeling\t" +
                "kneel\tkneels\tknelt\tknelt\tkneeling\t" +
                "dream\tdreams\tdreamt or dreamed\tdreamt or dreamed\tdreaming\t" +
                "mean\tmeans\tmeant\tmeant\tmeaning").split("\t")) {
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
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 12:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 13:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 14:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 15:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 16:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 17:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 18:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 19:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 20:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 21:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 22:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 23:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 24:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 25:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 26:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 27:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 28:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 29:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 30:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 31:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 32:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 33:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 34:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 35:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 36:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 37:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 38:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 39:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 40:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 41:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 42:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 43:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 44:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 45:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 46:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 47:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 48:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 49:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 50:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 51:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 52:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 53:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 54:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 55:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 56:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 57:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 58:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 59:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 60:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 61:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 62:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 63:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 64:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 65:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 66:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 67:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 68:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 69:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 70:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 71:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 72:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 73:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 74:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 75:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 76:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 77:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 78:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 79:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 80:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 81:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 82:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 83:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 84:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 85:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 86:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 87:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 88:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 89:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 90:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 91:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 92:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 93:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 94:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 95:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 96:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 97:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 98:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 99:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 100:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 101:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 102:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 103:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 104:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 105:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 106:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 107:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 108:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 109:
                        Toast.makeText(Verbs_Activity4.this, "Position:" + position + " ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        t1.speak(gridview.getItemAtPosition(position).toString(), TextToSpeech.QUEUE_FLUSH, null);
                        break;

                }
            }
        });
    }
}
