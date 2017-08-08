package com.example.android.sayit;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Locale;

public class pop5 extends Activity {SharedPreferences kl;   String l;TextToSpeech t1;
    float f;
    // Array of strings...
    String[] mobileArray = {"Read everything you can get your hands on","Actively take note of new vocabulary" ,

            "Talk with real live humans","Subscribe to podcasts or youtube channels(IN ENGLISH)",
            "go abroad","use your friends",
            "Ask a lot of questions","Take a lead from the stars",
            "Start with what you really need","Dont kick yourself while you are down"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop2);
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int w=dm.widthPixels;
        int h=dm.heightPixels;
        getWindow().setLayout(w,h);
        getWindow().setGravity(Gravity.BOTTOM | Gravity.END);
        Toast.makeText(this, "press back to return", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "press return to go back", Toast.LENGTH_SHORT).show();

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, mobileArray);
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
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position){
                    case 0 :
                        Toast.makeText(getBaseContext(),"READ EVERYTHING YOU CAN GET YOUR HANDS ON",Toast.LENGTH_SHORT).show();
                        t1.speak("Read everything you can get your hands on,,,,Classic literature, paperbacks, newspapers, websites, emails, your social media feed, cereal boxes: if it’s in English, read it. Why? Well, this content will be full of juicy new vocabulary, as well as a fair amount you already know. This helps you improve quickly, as re-exposure to learned vocabulary gives you new examples in context, therefore reinforcing those words in your mind. On the other hand, learning new words and expressions is essential to building your vocabulary arsenal, particularly in a language like English with so many words! However, don’t just read and move on", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 1 :
                        Toast.makeText(getBaseContext(),"ACTIVELY TAKE NOTE OF NEW VOCABULARY",Toast.LENGTH_SHORT).show();
                        t1.speak("Actively take note of new vocabulary,,,,This tip is a classic one for good reason: it works! When learning, we often enjoy a new word of phrase so much that forgetting it seems impossible. But trust us, not everything sticks the first time. To fight this, get into the habit of carrying around a funky notebook or using a tool like Evernote. Whenever you hear or read a new word or expression, write it down in context: that is, in a sentence and with its meaning noted. This saves you time as you won’t return to that word and ask yourself: “What did that word/expression mean again?”", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 2 :  Toast.makeText(getBaseContext(),"TALK WITH REAL LIVE HUMANS",Toast.LENGTH_SHORT).show();
                        t1.speak("Talk with real live humans,,,,What is a language for if not to communicate? Sure, we humans have become experts at communicating without opening our mouths – thanks Whatsapp! – but when push comes to shove, it’s true that speaking a language helps it stick in your head far better than only reading or writing it. Just think of how many times you’ve heard people say that they “understand, but can’t speak English.” A lot of would-be English speakers have turned talking into a huge insurmountable barrier that only serves to psyche them out. Don’t be like that. Seek out native speakers for an informal language exchange, enroll in a course, or take classes online.", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 3:  Toast.makeText(getBaseContext(),"SUBSCRIBE TO PODCASTS OR YOUTUBE CHANNELS (IN ENGLISH)",Toast.LENGTH_SHORT).show();
                        t1.speak("Subscribe to podcasts or youtube channels(IN ENGLISH),,,,Like humor? Politics? Blogging? Cooking? With topics covering every interest imaginable, there’s an English-speaking podcast or Youtube channel out there for you. Subscribe to a few and listen while driving or watch during the commute to school or work. At first, you might find the native accents difficult, but stick with it and you’ll soon start to understand what you hear (as well as learning lots of new vocab from a native speaker!)", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 4 :
                        Toast.makeText(getBaseContext(),"GO ABROAD",Toast.LENGTH_SHORT).show();
                        t1.speak("go abroad,,,,If there’s a better way to learn English than being immersed in it while living and studying in an English-speaking country, we’d love to know! It’s no secret that English is the most widely-spoken language in the world, and with a long list of countries to choose between, you can select your ideal learning environment based on hemisphere, weather, or favorite city. Think Australia, New Zealand, the UK, the US, Canada, and South Africa to name a few!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 5 :
                        Toast.makeText(getBaseContext(),"USE YOUR FRIENDS",Toast.LENGTH_SHORT).show();
                        t1.speak("use your friends,,,,Have friends who post online in English? Don’t gloss over them in your newsfeed: scan the items they share and commit to exploring one or two each day. They might be news or magazine articles, videos, talks, blog posts, songs, or anything else: if it’s in English and the topic interests you, it’s going to be helpful!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 6 :  Toast.makeText(getBaseContext(),"ASK A LOT OF QUESTIONS",Toast.LENGTH_SHORT).show();
                        t1.speak("Ask a lot of questions,,,,Curiosity may have killed the cat, but it also propelled the language learner to fluency! As you learn English, you’ll soon collect a mountain of questions. Don’t sit on your doubts – be curious and resolve them! If you’re enrolled in a course, ask your teacher (it’s what they’re there for, after all). But if you’re learning alone, don’t worry: find answers in blogs or language websites, ask other learners, or read through forums. You’ll be happy you did!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 7:  Toast.makeText(getBaseContext(),"TAKE A LEAD FROM THE STARS",Toast.LENGTH_SHORT).show();
                        t1.speak("Take a lead from the stars,,,,Mix up your learning by picking a native English-speaking actor or singer you like. Now, head online, find a bunch of interviews they’ve given – and watch them! Watch once for gist, then again, taking time to note down interesting expressions and words you hear. The slang, stories, humor, and anecdotes that come out of these interview are sure to give you plenty to work with!", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 8 :  Toast.makeText(getBaseContext(),"START WITH WHAT YOU REALLY NEED",Toast.LENGTH_SHORT).show();
                        t1.speak("Start with what you really need,,,,Your English studies are likely to go far more quickly if you constantly remind yourself of your motives for learning. Are you going on a study exchange? Then, focus on vocabulary related to your studies. Have an overseas conference? Brush up on conversation starters to use with the other participants. Going on a gap year? Looks like travel and tourism vocabulary will be your guide. If you simply launch into learning English hoping to magically learn anything and everything at once, you’re likely to end up confused and burned out.", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                    case 9:  Toast.makeText(getBaseContext(),"DON’T KICK YOURSELF WHILE YOU’RE DOWN",Toast.LENGTH_SHORT).show();
                        t1.speak("Don't kick yourself while you are down,,,,When you start to feel like you’re not making ground – which happens to all learners at some point – don’t say, “I don’t speak English,” or “I’ll never get this.” In fact, ban those phrases from your vocabulary! They only blur your understanding of the progress you’re making and convince you that your dreams of speaking English well are impossible. Instead, say “I’m learning English and making improvements everyday,” “It’s not always easy, but it’s worth it,” “I’m so much better that I was six months ago,” and other phrases to remind yourself of the big picture.\n" +
                                "\n", TextToSpeech.QUEUE_FLUSH, null);
                        break;
                }
            }
        });
    }

}
