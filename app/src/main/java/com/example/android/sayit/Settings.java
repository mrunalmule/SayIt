package com.example.android.sayit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.List;

public class Settings extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    RadioButton b1;
    RadioGroup r1;
    Spinner spinner;String last_visited;
    Button b;
    float pitch;
    SharedPreferences kl;
pit piy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        r1 = (RadioGroup) findViewById(R.id.abcd);
        // Spinner element
        spinner = (Spinner) findViewById(R.id.spinner);
piy=new pit();
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("0.5");
        categories.add("1.0");
        categories.add("1.5");
        categories.add("2.0");
        categories.add("2.5");
        categories.add("3.0");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        kl = getSharedPreferences("settings", Context.MODE_PRIVATE);
 last_visited=kl.getString("visited","MainActivity");

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        b = (Button) findViewById(R.id.sv);
    try{
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(validationSuccess()) {
                  if (last_visited.equals("pit")) {
                  startActivity(new Intent(Settings.this, pit.class));
                     // startActivity(new Intent(Settings.this, pit.class));

                      }
                  if (last_visited.equals("practice")) {
                      startActivity(new Intent(Settings.this, practice.class));
                  }
                  if (last_visited.equals("MainActivity")) {
                      startActivity(new Intent(Settings.this, MainActivity.class));
                  }
                  if (last_visited.equals("learn")) {
                      startActivity(new Intent(Settings.this, learn.class));
                  }
                  int selectedId = r1.getCheckedRadioButtonId();
                  b1 = (RadioButton) findViewById(selectedId);
                  if (b1.getText().equals("Local.UK")) {
                      Toast.makeText(Settings.this, b1.getText(), Toast.LENGTH_SHORT).show();
                      SharedPreferences.Editor ed = kl.edit();
                      ed.putFloat("pitch", pitch);
                      ed.putString("lang", "Local.UK");
                      // ed.commit();
                      ed.apply();
                  }
                  if (b1.getText().equals("Local.US")) {
                      Toast.makeText(Settings.this, b1.getText(), Toast.LENGTH_SHORT).show();
                      SharedPreferences.Editor ed = kl.edit();
                      ed.putFloat("pitch", pitch);
                      ed.putString("lang", "Local.US");
                      ed.apply();
                  }
                  finish();
              }
            }
        });}
    catch(Exception e){
        Toast.makeText(this, "please select values", Toast.LENGTH_SHORT).show();
    }
    }

   @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        SharedPreferences.Editor ed = kl.edit();
        switch (position) {
            case 0:
                pitch = 0.5f;  ed.putFloat("pitch", pitch);ed.apply();
                break;
            case 1:
                pitch = 1.0f;  ed.putFloat("pitch", pitch);ed.apply();
                break;
            case 2:
                pitch = 1.5f;  ed.putFloat("pitch", pitch);ed.apply();
                break;
            case 3:
                pitch = 2.0f;  ed.putFloat("pitch", pitch);ed.apply();
                break;
            case 4:
                pitch = 2.5f;  ed.putFloat("pitch", pitch);ed.apply();
                break;
            case 5:
                pitch = 3.0f;  ed.putFloat("pitch", pitch);ed.apply();
                break;

        }

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
     //   SharedPreferences.Editor ed = kl.edit();
        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked) {
                   SharedPreferences.Editor ed = kl.edit();
                 //   pitch=(Float) spinner.getSelectedItem();
                 //  ed.putFloat("pitch", pitch);
                    ed.putString("lang", "Local.UK");
                    ed.apply();
                  //  Toast.makeText(Settings.this, "1", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.radioButton3:
                if (checked) {
                   SharedPreferences.Editor ed = kl.edit();
                 //   pitch=(Float) spinner.getSelectedItem();
                 //   ed.putFloat("pitch", pitch);
                    ed.putString("lang", "Local.US");
                    ed.apply();
                  //  Toast.makeText(Settings.this, "2", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
    private Boolean validationSuccess() {


        if (r1.getCheckedRadioButtonId() <= 0) {

            Toast.makeText(this, "Please select language", Toast.LENGTH_SHORT).show();
            return false;
        }

    /*    if (spinner.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "Please select pitch", Toast.LENGTH_SHORT).show();

            return false;
        }*/
        return true;
    }
}