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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class months extends Fragment {
String uname="";float f;String l;
    TextToSpeech t1,t2;
    public months() {
        // Required empty public constructor
    }
ListView listView;
    String[] mobileArray = {"January","February","March",
            "April",
            "May" ,
            "June",
            "July",
            "August" ,
            "September",
            "October",
            "November",
            "December"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.content_main2, container, false);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_listview, mobileArray);

        SharedPreferences sh=getActivity().getSharedPreferences("settings", Context.MODE_PRIVATE);
        l=sh.getString("lang","Local.UK");
        f=sh.getFloat("pitch",1.0f);

        t1=new TextToSpeech(getActivity().getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    if(l.equals("Local.US")){t1.setLanguage(Locale.US);}
                    else t1.setLanguage(Locale.UK);t1.setPitch(f);
                }

            }
        });
        t2=new TextToSpeech(getActivity().getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != TextToSpeech.ERROR) {
                    if(l.equals("Local.US")){t2.setLanguage(Locale.US);}
                    else t2.setLanguage(Locale.UK);  t2.setPitch(f);
                }

            }
        });

        Toast.makeText(getContext(), l+"pitch"+f, Toast.LENGTH_SHORT).show();
     //   Toast.makeText(getContext(), l+"pitch"+f, Toast.LENGTH_SHORT).show();
        listView = (ListView) view.findViewById(R.id.listViews);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            /*//listview clicked item index
            int itemPosition = position;

            //Listview clicked item value
            String itemValue = (String)listView.getItemAtPosition(position);

            //show alert
            Toast.makeText(getApplicationContext(),
                    "Position:"+itemPosition+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();*/
                String itemValue = (String)listView.getItemAtPosition(position);
                switch(position){

                    case 0 :Toast.makeText(getActivity(),
                            "this should be pronounced as  January", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  January", TextToSpeech.QUEUE_FLUSH, null);

                        break;
                    case 1 : Toast.makeText(getActivity(),
                            "this should be pronounced as  February", Toast.LENGTH_LONG).show();
                        t2.speak(" this should be pronounced as  February", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2 : Toast.makeText(getActivity(),
                            " this should be pronounced as  March", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  March", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3 : Toast.makeText(getActivity(),
                            "this should be pronounced as  April", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  April", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4 : Toast.makeText(getActivity(),
                            "this should be pronounced as  May", Toast.LENGTH_LONG).show();
                        t2.speak( "this should be pronounced as  May", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5 : Toast.makeText(getActivity(),
                            "this should be pronounced as  June", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  June", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6 : Toast.makeText(getActivity(),
                            "this should be pronounced as  July", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  July", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7 : Toast.makeText(getActivity(),
                            "this should be pronounced as  August", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  August", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8 : Toast.makeText(getActivity(),
                            "this should be pronounced as  September", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  September", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9 : Toast.makeText(getActivity(),
                            "this should be pronounced as  October", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  October", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 10 : Toast.makeText(getActivity(),
                            "this should be pronounced as  NOVEMBER", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  november", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 11 : Toast.makeText(getActivity(),
                            "this should be pronounced as  December", Toast.LENGTH_LONG).show();
                        t2.speak("this should be pronounced as  December", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
            }
        });

        return view;
    }


}

