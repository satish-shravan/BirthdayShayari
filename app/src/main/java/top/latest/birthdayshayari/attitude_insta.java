package top.latest.birthdayshayari;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

import java.util.ArrayList;

public class attitude_insta extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    insta_adapter adapterRecyclerLinear;

    ArrayList<data> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_attitude_insta );


        init_ads ();


        recyclerView = findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list = new ArrayList<data> ();
        adapterRecyclerLinear = new insta_adapter ( this, list );
        recyclerView.setAdapter ( adapterRecyclerLinear );
        // Toast.makeText ( this, "CLICK TO SHARE  :)", Toast.LENGTH_LONG ).show ();
        linearList ();

        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId () == android.R.id.home)
        {
            finish ();
            return  true;
        }
        return super.onOptionsItemSelected ( item );
    }
    public void showAd()
    {
        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId( getString ( R.string.admob_intestial_id ) );
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
    }

    public  void init_ads()
    {
        //ads
        AdView adView = new AdView ( this );
        adView.setAdSize ( AdSize.BANNER );
        mAdView = (AdView) findViewById ( R.id.adView );
        AdRequest adRequest = new AdRequest.Builder ().build ();
        mAdView.loadAd ( adRequest );
        //call interstial ad
        showAd();
        mPublisherInterstitialAd.setAdListener ( new AdListener ()
        {
            @Override
            public void onAdClosed() {
                mPublisherInterstitialAd.loadAd ( new PublisherAdRequest.Builder ().build () );
            }
        });
    }

    @Override
    public void onBackPressed() {
        if (mPublisherInterstitialAd.isLoaded()) {
            mPublisherInterstitialAd.show();
            mPublisherInterstitialAd.setAdListener(new AdListener () {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        }else{
            super.onBackPressed();
        }

    }

    private void linearList()
    {

        list.add(new data (R.drawable.attitude,"5’2 my height but my attitude 6’1\n"));

        list.add(new data (R.drawable.attitude, "You have to be ‘ODD’ to be number ‘ONE’."));
        list.add(new data (R.drawable.attitude, "I don’t have an attitude problem, you have a perception problem"));
        list.add(new data (R.drawable.attitude, "You can either take me as I am or watch me as I leave."));
        list.add(new data (R.drawable.attitude, "I’m just a vibe you can’t find nowhere else."));
        list.add(new data (R.drawable.attitude, "Guess what? Dragons are imaginations, orelse I would burn each one of you."));
        list.add(new data (R.drawable.attitude, "Aside from gravity, nothing in life can keep me down."));
        list.add(new data (R.drawable.attitude, "For someone who claims to hate my guts, you sure think and talk about me a lot. How about you get a life and stop worrying about mine?"));
        list.add(new data (R.drawable.attitude, "Silence is the best response when you’re dealing with an idiot."));
        list.add(new data (R.drawable.attitude,"I’m really not cranky. I just have a violent reaction when I meet stupid people."));
        list.add(new data (R.drawable.attitude, "Attitude is like a wristwatch. Every watch shows different time than other and everyone thinks his watch is showing the right time."));
        list.add(new data (R.drawable.attitude,"Don’t change so people will like you. Be yourself and the right people will love the real you."));
        list.add(new data (R.drawable.attitude, "I don’t follow others, I only follow my orders because I am my own boss."));
        list.add(new data (R.drawable.attitude, "I don’t have an attitude!! I have a personality you can’t handle!!"));
        list.add(new data (R.drawable.attitude, "I am who I am today because of the choice I made yesterday."));
        list.add(new data (R.drawable.attitude, "Trust no Man. Fear no bitch."));
        list.add(new data (R.drawable.attitude, "Ain’t here to do good to you…hope you don’t get me to do bad either!"));
        list.add(new data (R.drawable.attitude, "Coffee in one hand, confidence in the other."));
        list.add(new data (R.drawable.attitude, "Never lower your standards for a guy, make him raise his standards for you!"));
        list.add(new data (R.drawable.attitude,"You had me. You lost me, So keep walking cause I am done talking."));
        list.add(new data (R.drawable.attitude, "Only a strong man can handle a strong woman. A weak man will just say that she has an attitude problem."));
        list.add(new data (R.drawable.attitude, "You’re on a different road, I’m in the Milky Way, you want me down on earth, but I up in"));
        list.add(new data (R.drawable.attitude, "I am a good enough person to forgive you. But not stupid enough to trust you again."));
        list.add(new data (R.drawable.attitude, "You will search for me in another person. I promise. And you will never find me."));
        list.add(new data (R.drawable.attitude, "Better to be strong than pretty and useless."));
        list.add(new data (R.drawable.attitude, "In the land of gods and monsters, I was an angel."));
        list.add(new data (R.drawable.attitude, "Let your smile change the world, But don’t let the world change your smile."));
        list.add(new data (R.drawable.attitude, "Be the kind of woman that when your feet hit the floor each morning the devil says, “Oh crap, she’s up!"));
        list.add(new data (R.drawable.attitude, "Treat me like a Queen and I’ll treat you like a king. \nTreat me like a game, and I’ll show you how it’s played."));
        list.add(new data (R.drawable.attitude, "Let me adjust my crown and get my day started."));
        list.add(new data (R.drawable.attitude, "If you like me then raise your hands, if not then raise your standards."));
        list.add(new data (R.drawable.attitude, "If you cannot attract them with your charms just repel them with your attitude."));
        list.add(new data (R.drawable.attitude, "Kill them with success and bury them with a smile."));
        list.add(new data (R.drawable.attitude, "Don’t let someone dim your light, simply because it’s shining in their eyes"));
        list.add(new data (R.drawable.attitude, "Don’t like my attitude? Report me @ whocares.com"));
        list.add(new data (R.drawable.attitude, "I don’t like to take the right decision, I take decisions and make them right."));
        list.add(new data (R.drawable.attitude, "A bad attitude is like a flat tire, you won’t get anywhere till you change it."));
        list.add(new data (R.drawable.attitude, "He said to be cool but I’m already coolest."));
        list.add(new data (R.drawable.attitude, "If people treated you like an option, leave them like a choice."));
        list.add(new data (R.drawable.attitude, "If life gives you lemons, add vodka and have a party!"));
        list.add(new data (R.drawable.attitude, "Success is the by-product of your attitude."));
        list.add(new data (R.drawable.attitude, "Sometimes you need to burn bridges to stop yourself from crossing them again."));
        list.add(new data (R.drawable.attitude, "A strong, positive attitude has the power to move mountains. Because life is only 10% how you make it, and 90% how you take it"));
        list.add(new data (R.drawable.attitude, "Work until one day your signature will be called an autograph."));
        list.add(new data (R.drawable.attitude, "It’s funny how people judge other’s mistakes while they also do the same thing."));
        list.add(new data (R.drawable.attitude,"Be careful: attitudes are contagious. Make sure that yours is worth catching."));
        list.add(new data (R.drawable.attitude, "A can-do attitude is all one needs. It acts like a bridge between success and failure."));
        list.add(new data (R.drawable.attitude, "Sometimes you need to step outside, get some air, and remind yourself of who you are and where you want to be."));
        list.add(new data (R.drawable.attitude, "Life isn’t about waiting for the storm to pass, it’s about learning to dance in the rain."));
        list.add(new data (R.drawable.attitude, "Be happy in front of people who don’t like you, it kills them."));
        list.add(new data (R.drawable.attitude, "May my enemies live long enough to see me succeed."));
        list.add(new data (R.drawable.attitude, "It’s okay to be a glowstick, sometimes we need to break before we shine."));
        list.add(new data (R.drawable.attitude, "People are going to judge you anyway. So forget everyone and be yourself."));
        list.add(new data (R.drawable.attitude, "When life puts you in tough situations, don’t say “why me” say “try me”."));
        list.add(new data (R.drawable.attitude, "My attitude forecast for today: Partly crabby with an 80% chance of moodiness."));
        list.add(new data (R.drawable.attitude, "When a storm comes through, have enough sense to stop and play in the mud."));
        list.add(new data (R.drawable.attitude, "My middle finger salutes your attitude."));
        list.add(new data (R.drawable.attitude, "I don’t want to be in a relationship, I would rather be in a Range Rover."));
        list.add(new data (R.drawable.attitude, "If you are going to speak bad things about me on my back, come to me. I’ll tell you more."));
        list.add(new data (R.drawable.attitude,"Thank you to every person who has ever told me I can’t. You are just another reason I will."));
        list.add(new data (R.drawable.attitude, "Morality is simply the attitude we adopt towards people we personally dislike."));





        // list.add(new Data_show ( "" ));
    }
}
