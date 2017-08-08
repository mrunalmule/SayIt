package com.example.android.sayit;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class practice extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    ArrayList<String> wordArrayList = new ArrayList<>();
    Random randomGenerator = new Random();
    TextView t1;int count;
    TextToSpeech t,t2;
    String sa;int result;
    protected static final int RESULT_SPEECH = 1;
    Button b;  String l; float f;
    private ImageButton btnSpeak;
    private TextView txtText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b=(Button)findViewById(R.id.button5);

       SharedPreferences kl=getSharedPreferences("settings", Context.MODE_PRIVATE);
        SharedPreferences.Editor ed=kl.edit();
        ed.putString("visited","practice");
        l=kl.getString("lang","Local.UK");
        f=kl.getFloat("pitch",1.0f);

ed.apply();
        t1=(TextView)findViewById(R.id.word);
        t1.setText(""); count=0;
        result=0;
        txtText = (TextView)findViewById(R.id.txtText);
        t = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    if(l.equals("Local.US")){t.setLanguage(Locale.US);}
                    else t.setLanguage(Locale.UK);
                    t.setPitch(f);
                }
            }
        });
        t2 = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    if(l.equals("Local.US")){t2.setLanguage(Locale.US);}
                    else t2.setLanguage(Locale.UK);
                    t2.setPitch(f);
                }
            }
        });
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int randomInt = randomGenerator.nextInt(wordArrayList.size());
                String wordToDisplay = wordArrayList.get(randomInt);
                sa=wordToDisplay;
                t1.setText(wordToDisplay);
                if(count <= 10){++count;}
                else{
                    Toast.makeText(practice.this, "your test is completed, your final score is "+result,Toast.LENGTH_SHORT).show();
                    result=0;
                }

            }
        });
        btnSpeak = (ImageButton)findViewById(R.id.btnSpeak);
        // txtText.setText("");

        for(String word : ("able about account acid across act addition adjustment advertisement agreement after again against air all almost among amount amusement an and angry angle animal answer ant any apparatus apple approval argument arm army art as association at attack attempt attention attitude attraction authority automatic awake baby back bad bag balance ball band base basin basket bath be beautiful because bed bee before behavior bell berry best better between bird birth bit bite black blade blood blow blue board boat body bone book boot boiling bottle box boy brain brake branch bread breath brick bridge bright broken brother brown brush bucket building bulb button burn business but butter bang  bank bar beef beer biology bomb cake camera canvas card care carriage cart cat cause certain chain chalk chance change cheap cheese chemical chest chief chin church circle class clean clear clock cloth cloud coal coat cold collar color comb come comfort committee community common company comparison competition complete complex computer condition connection conscious control cook copper copy cord cork cotton cough country cover cow crack credit crime cruel crush cry culture cup custom current curtain curve cushion cut damage danger dark daughter day dead dear death debt decision deep degree delicate dependent design desire destruction detail development did different digestion direction dirty discovery discussion disease disgust distance distribution division do does dog done door down doubt drain drawer dress drink driving drop dry dust ear early earth east edge education effect egg elastic electric end engine enough environment equal error even event ever every example exchange existence expansion experience expert eye ear early earth east edge education effect egg elastic electric end engine enough environment equal error even event ever every example exchange existence expansion experience expert eye face fact fall false family far farm farther fat father fear feather feeble feeling female fertile fiction field fight finger fire first fish fixed flag flame flat flight floor flower fly fold food foolish foot for force fork form forward fowl frame free frequent friend from front fruit full further future February fifteen fifth fifty five four fourteen fourth forty Friday gave garden general get girl give glass glove go goat goes gold gone good got gat government grain grass great green gray grip group growth guide gun had hair hammer hand hanging happy harbor hard harmony has hat hate hath have he head healthy hearing heart heat helicopter help her here heredity high him history hole hollow hook hope horn horse hospital hour house how I ice idea if ill important impulse in increase industry ink insect instrument insurance interest invention iron is island it its  jelly jewel join journey judge jump jam jaw jealous jerk joint jug juice jury justice  keep kept kettle key kick kind kiss knee knife knot knowledge land language last late laugh law lead leaf learning least leather leg left less let letter level library lift light like limit line linen lip liquid list little living lock long loose loss loud love low machine made man manager make male map mark market married match material mass may me meal measure meat medical meeting memory metal middle might military milk mind mine minute mist mixed money monkey month moon more morning most mother motion mountain mouth move much muscle music my nail name narrow nation natural near necessary neck need needle nerve net never new news night no noise normal north nose not note now number nut observation of off offer office oil old on oneonly open operation opinion opposite or orange order organization ornament other our out oven over owner  page pain paint paper parallel parcel part past paste payment peace pen pencil person physical picture pig pin pipe place plane plant plate play please pleasure plough/plow pocket point poison polish political poor porter position possible pot potato powder power present price print prison private probable process produce profit property prose protest public pull pump punishment purpose push put quality question quick rain range rat rate ray reaction red reading ready reason receipt record regret regular relation religion representative request respect responsible rest reward rhythm rice right ring river road rod roll roof room root rough round rub rule run sad said safe sail salt same sand saw say scale school science scissors screw sea seat second secret secretary see seed seen . seem selection self send sense sent separate serious servant sex shade shake shame sharp she sheep shelf ship shirt shock shoe short shut side sign silk silver simple sister size skin skirt sky sleep slip slope slow small smash smell smile smoke smooth snake sneeze snow so soap society sock soft solid some son song sort sound soup south space spade special sponge spoon spring square stage standard stamp star start statement station steam steel stem step stick sticky stiff still stitch stocking stomach stone stop store story straight strange street strong structure substance such sudden sugar suggestion summer sun support surprise sweet swim system  table tail take talk tall taste tax teaching technology tendency test than that the their them then theory there these they thick thin thing this those though thought thread throat through thumb thunder ticket tight tired till time tin to toe together tomorrow tongue took tooth top touch town trade train transport tray tree trick trousers true trouble turn umbrella under unit up us use very vessel view violent voice value  walk wall waiting war warm was wash waste watch water wave wax way we weather week weight well went were west wet what wheel when where which while whip whistle white who whom whose why wide will wind window wine wing winter wire wise with woman wood wool word work worm would wound writing wrong year yellow yes yesterday you young").split(" ")) {
            wordArrayList.add(word);
        }

        btnSpeak.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(
                        RecognizerIntent.ACTION_RECOGNIZE_SPEECH);

                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, "en-US");

                try {
                    startActivityForResult(intent, RESULT_SPEECH);
                    txtText.setText("");
                } catch (ActivityNotFoundException a) {
                    Toast t = Toast.makeText(practice.this,
                            "Opps! Your device doesn't support Speech to Text",
                            Toast.LENGTH_SHORT);
                    t.show();
                }
            }
        });

        Toast.makeText(this, l+"pitch"+f, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, l+"pitch"+f, Toast.LENGTH_SHORT).show();

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
            startActivity(new Intent(practice.this,Settings.class));
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            startActivity(new Intent(practice.this,pit.class));

        } else if (id == R.id.nav_gallery) {
            startActivity(new Intent(practice.this,practice.class));
        } else if (id == R.id.nav_slideshow) {
            startActivity(new Intent(practice.this,learn.class));
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
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case RESULT_SPEECH: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> text = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    txtText.setText(text.get(0));
                    abc(sa,text.get(0));
                }
                break;
            }

        }
    }
    public void abc(String s,String h){
        if(s.equals(h))

        {result=result+1;
            String toSpeak="you pronounce it correctly and your score is now "+result;
            Toast.makeText(practice.this, toSpeak,Toast.LENGTH_SHORT).show();
            t.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

        }

        else{

            String toSpeak="you did not pronounce it correctly and your score is still "+result;

            Toast.makeText(practice.this,toSpeak ,Toast.LENGTH_SHORT).show();
            t.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            String k="  the correct pronunciation is    "+s + "  and you pronounce it as    "+h;
            Toast.makeText(practice.this,k ,Toast.LENGTH_SHORT).show();
            t2.speak(k, TextToSpeech.QUEUE_FLUSH, null);

        }
    }
}


