package com.example.android.sayit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class greetings extends Fragment {

    public greetings() {
        // Required empty public constructor
    }

    String[] mobileArray = {"Common English Greetings and Expressions",
            "Business Greetings and Formal Greetings",
            "Slang English Greetings",
            "Tip About Learning English",
            };
    ListView listView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_learn_, container, false);
        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_listview, mobileArray);

        listView = (ListView) view.findViewById(R.id.mobile_list);
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

                    case 0 : Intent i=new Intent(getActivity(),pop2.class);
                        startActivity(i);
                        break;
                    case 1 : Intent i1=new Intent(getActivity(),pop3.class);
                        startActivity(i1);
                        break;
                    case 2 : Intent i2=new Intent(getActivity(),pop4.class);
                        startActivity(i2);
                        break;
                    case 3 : Intent i3=new Intent(getActivity(),pop5.class);
                        startActivity(i3);
                        break;

                }
            }
        });

        return view;
    }



}

