package com.example.android.sayit;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class weekdays extends Fragment {


    public weekdays() {
        // Required empty public constructor
    }
ListView listView;
String[] week={"Sunday","Monday","Tuesday","Wednesday",
        "Thursday","Friday","Saturday"};
    TextToSpeech t1;String l;float f;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.content_main2, container, false);

        SharedPreferences sh=getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=sh.edit();
        l=sh.getString("lang","Local.UK");
        f=sh.getFloat("pitch",1.0f);
        ed.apply();
        Toast.makeText(getContext(), l+"pitch"+f, Toast.LENGTH_SHORT).show();
    //    Toast.makeText(getContext(), l+"pitch"+f, Toast.LENGTH_SHORT).show();


        t1=new TextToSpeech(getActivity().getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    if(l.equals("Local.US")){t1.setLanguage(Locale.US);}
                    else t1.setLanguage(Locale.UK);

                t1.setPitch(f);}
            }
        });
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_listview, week);

        listView = (ListView) view.findViewById(R.id.listViews);
        listView.setAdapter(adapter);
     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             switch(position){
                 case 0: Toast.makeText(getActivity().getBaseContext(),"Sunday",Toast.LENGTH_SHORT).show();t1.speak("Sunday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 1:Toast.makeText(getActivity().getBaseContext(),"Monday",Toast.LENGTH_SHORT).show();t1.speak("Monday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 2:Toast.makeText(getActivity().getBaseContext(),"Tuesday",Toast.LENGTH_SHORT).show();t1.speak("Tuesday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 3:Toast.makeText(getActivity().getBaseContext(),"Wednesday",Toast.LENGTH_SHORT).show();t1.speak("Wednesday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 4:Toast.makeText(getActivity().getBaseContext(),"Thursday",Toast.LENGTH_SHORT).show();t1.speak("Thursday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 5:Toast.makeText(getActivity().getBaseContext(),"Friday",Toast.LENGTH_SHORT).show();t1.speak("Friday", TextToSpeech.QUEUE_FLUSH, null);break;
                 case 6:Toast.makeText(getActivity().getBaseContext(),"Saturday",Toast.LENGTH_SHORT).show();t1.speak("Saturday", TextToSpeech.QUEUE_FLUSH, null);break;
             }
         }
     });

        return view;
    }


}
