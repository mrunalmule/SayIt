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
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class verbs_ extends Fragment {
    String[] mobileArray = {"Regular Verbs","Irregular Verbs",
    "Verbs like \"sell\" shift to \"old\" endings in the past and past participle"
    ,"Verbs like \"find\" shift to \"ound\" endings in the past and past participle", "Verbs like \"break\" shift vowel sounds in the past and past participle. They also use the \"en\" ending in the past participle"
    ,"Verbs like \"lose\" change spelling and sound in the past and past participle",
    "Verbs like \"read\" change sound, but not spelling, in the past and past participle",
    "Verbs like \"see\" have sound or spelling changes in the past and past participle",
    "Verbs like \"win\" change spelling and sound in the past and past participle"
    ,"The verb \"be\" has its own unique usage"};
    public verbs_() {
        // Required empty public constructor
    }
    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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

                    case 0 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i=new Intent(getActivity(),Verbs_Activity.class);
                        startActivity(i);
                        break;
                    case 1 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i2=new Intent(getActivity(),Verbs_Activity1.class);
                        startActivity(i2);
                        break;

                    case 2 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i6=new Intent(getActivity(),Verbs_Activity5.class);
                        startActivity(i6);
                        break;
                    case 3 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i7=new Intent(getActivity(),Verbs_Activity6.class);
                        startActivity(i7);
                        break;
                    case 4 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i8=new Intent(getActivity(),Verbs_Activity7.class);
                        startActivity(i8);
                        break;

                    case 5 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i9=new Intent(getActivity(),Verbs_Activity8.class);
                        startActivity(i9);
                        break;
                    case 6 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i10=new Intent(getActivity(),Verbs_Activity9.class);
                        startActivity(i10);
                        break;
                    case 7 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i11=new Intent(getActivity(),Verbs_Activity10.class);
                        startActivity(i11);
                        break;

                    case 8 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i12=new Intent(getActivity(),Verbs_Activity11.class);
                        startActivity(i12);
                        break;
                    case 9 : Toast.makeText(getActivity(),
                            "Position:"+position+" ListItem:" + itemValue, Toast.LENGTH_LONG).show();
                        Intent i13=new Intent(getActivity(),Verbs_Activity12.class);
                        startActivity(i13);
                        break;
                }
            }
        });
        return view;

    }

}
