package com.example.android.sayit;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class learn extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    String[] mobileArray = {"Weekdays","Months","Verbs",
            "Time","Date","Greetings"};
    ListView listView;SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_learn);
        listView = (ListView)findViewById(R.id.listViews);
        sharedPreferences=getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("visited","learn");
        editor.apply();
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, mobileArray);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {  FragmentManager manager=getSupportFragmentManager();
                switch (position){
                    case 0: //Toast.makeText(getBaseContext(), "Position:"+position+" ListItem:" , Toast.LENGTH_LONG).show();
                        weekdays home=new weekdays();
                        manager.beginTransaction()
                                .setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_left)
                                .replace(R.id.content_main, home, home.getTag()).commit();break;
                    case 1://Toast.makeText(getBaseContext(), "Position:"+position+" ListItem:" , Toast.LENGTH_LONG).show();
                        months home1=new months();
                        manager.beginTransaction()
                                .setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_left)
                                .replace(R.id.content_main, home1, home1.getTag()).commit();break;
                    case 2 : //startActivity(new Intent(learn.this,Verbs.class));
                   //     Toast.makeText(getBaseContext(), "Position:"+position+" ListItem:" , Toast.LENGTH_LONG).show();
                        verbs_ home12=new verbs_();
                        manager.beginTransaction()
                                .setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_left)
                                .replace(R.id.content_main, home12, home12.getTag()).commit();break;
                    case 3 :startActivity(new Intent(learn.this,Time.class));
                        break;
                    case 4 :startActivity(new Intent(learn.this,Date.class));
                        break;
                    case 5 :
                     //   Toast.makeText(getBaseContext(), "Position:"+position+" ListItem:" , Toast.LENGTH_LONG).show();
                        greetings home11=new greetings();
                        manager.beginTransaction()
                                .setCustomAnimations(R.anim.slide_in_from_left, R.anim.slide_out_to_left)
                                .replace(R.id.content_main, home11, home11.getTag()).commit();
                        break;
                }
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(learn.this,Settings.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(learn.this,pit.class));

        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(learn.this,practice.class));
        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(learn.this,learn.class));
        } else if (id == R.id.nav_share) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://accounts.google.com/ServiceLogin?service=mail&passive=true&rm=false&continue=https://mail.google.com/mail/&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1#identifier"));
            startActivity(intent);
        } else if (id == R.id.nav_send) {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.addCategory(Intent.CATEGORY_BROWSABLE);
            intent.setData(Uri.parse("https://www.facebook.com/login/"));
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

