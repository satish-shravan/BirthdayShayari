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

public class party extends AppCompatActivity {

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
        setContentView ( R.layout.activity_party );

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



        list.add(new data (R.drawable .party, "Twinkle, Twinkle little star… Point me to the nearest bar."));
        list.add(new data (R.drawable .party, "Beer is proof that God loves us."));
        list.add(new data (R.drawable .party,"I know this was very well but everybody tries to pretend it like a party"));
        list.add(new data (R.drawable .party, "It's easy to impress me, I don't need a part, all I need is good food, some good friend, and the most important good laugh, that's it."));
        list.add(new data (R.drawable .party, "Time to drink and dance on the table."));
        list.add(new data (R.drawable .party, "The only party, that's it."));
        list.add(new data (R.drawable .party, "When you at the party then don't look at the past and worried about something, just a party."));
        list.add(new data (R.drawable .party, "Life is not a party we hope so, but when you at the party than just dance."));
        list.add(new data (R.drawable .party, "I want to throw some fake alcohol on the party than watch how many are act fake drinker."));
        list.add(new data (R.drawable .party, "I am not an alcoholic that I am on the meeting,  I am a drunk, I going for parties."));
        list.add(new data (R.drawable .party,"Let's celebrate with a toast and get lost."));
        list.add(new data (R.drawable .party, "Forget about the world and enjoy the moment because we are young.\n"));
        list.add(new data (R.drawable .party, "The night is already you, are you?\n"));
        list.add(new data (R.drawable .party, "I wish this night will be long and long lasting forever.\n"));
        list.add(new data (R.drawable .party, "The night does not mean sleep."));
        list.add(new data (R.drawable .party,"Life is made by some little beautiful moment like this."));
        list.add(new data (R.drawable .party, "Come and meet some legends.\n"));
        list.add(new data (R.drawable .party, "Wine improves with age. The older I get, the better I like it."));
        String str2 = "When life hands you lemons, bust out the Tequila and salt!";
        list.add(new data (R.drawable .party, str2));
        list.add(new data (R.drawable .party, "Drugs may be the road to nowhere, but at least they’re the scenic route."));
        list.add(new data (R.drawable .party, "When we drink, we do it right, gettin’ slizzard."));
        list.add(new data (R.drawable .party, "Cool kids, never sleep "));
        list.add(new data (R.drawable .party, "No officer, there is no blood in my alcohol system."));
        list.add(new data (R.drawable .party, "He who does not get fun and enjoyment out of everyday needs to reorganize his life."));
        list.add(new data (R.drawable .party,"One shot, two shots, three shots, four shots than the floor."));
        list.add(new data (R.drawable .party, "I worked like it's my last day and party like it's my last party."));
        list.add(new data (R.drawable .party, "The weekend does not mean that just sit on the couches, sometimes it means to party."));
        list.add(new data (R.drawable .party,"Goodbye reality, hello party."));
        list.add(new data (R.drawable .party, "Reality is an illusion that occurs due to a lack of party."));
        list.add(new data (R.drawable .party,"No party is like fun unless seasoned with folly."));
        list.add(new data (R.drawable .party, "Doctor say mango vodka does not count on my fruit diet. shit \n"));
        list.add(new data (R.drawable .party,"Lets,gets,sets,party.\n"));
        list.add(new data (R.drawable .party, "Never miss a chance to dance "));
        list.add(new data (R.drawable .party,"Who's on the floor, oh sorry it just me."));
        list.add(new data (R.drawable .party,"A good man can make you feel like you can take on the world…. Oh no sorry.. No… Its wine…. wine does that."));
        list.add(new data (R.drawable .party, "Hear no evil, speak no evil and you'll never be invited to a party."));
        list.add(new data (R.drawable .party, "It’s all fun and games until someone calls the cops. Then it’s a new game; hide and seek.\n"));
        list.add(new data (R.drawable .party,"ooh, it’s party o’ clock\n"));
        list.add(new data (R.drawable .party,"If you obey all the rules you miss all the fun."));
        list.add(new data (R.drawable .party,"I have a mixed drink about feelings."));
        list.add(new data (R.drawable .party, "This is how to be cool..."));
        list.add(new data (R.drawable .party, "Surrounded yourself with people who are more excited about your birthday than you are.\n"));
        list.add(new data (R.drawable .party, "Today is the oldest you have ever been and the youngest you ever be again.\n"));
        list.add(new data (R.drawable .party, "Someone I love was born today."));
        list.add(new data (R.drawable .party, "I am not giving to wish for your birthday, rather than I going to ask you as my wish.\n"));
        list.add(new data (R.drawable .party, "We are not getting old, we are getting awesome."));
        list.add(new data (R.drawable .party, "Pop the champagne, she is changing her name."));
        list.add(new data (R.drawable .party, "Keep Calm and Party in the Club!"));
        list.add(new data (R.drawable .party, str2));
        list.add(new data (R.drawable .party, "It’s been one blur of fun."));
        list.add(new data (R.drawable .party,"Life is made of small moments like this"));
        String str3 = "When I read about the evils of drinking, I gave up reading.";
        list.add(new data (R.drawable .party, str3));
        list.add(new data (R.drawable .party,"Sleep all day. Party all night. Never grow old. Never die. "));
        list.add(new data (R.drawable .party, "She had a cocktail in her hand and confetti in her hair."));
        list.add(new data (R.drawable .party, str3));






        // list.add(new Data_show ( "" ));
    }
}
