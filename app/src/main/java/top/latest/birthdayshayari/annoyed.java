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

public class annoyed extends AppCompatActivity {

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
        setContentView ( R.layout.activity_annoyed );

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

    private void linearList()
    {


        list.add(new data (R.drawable .annoyed3, "Don't invite annoying people into your life, and set ground rules for the ones you inherited."));
        list.add(new data (R.drawable .annoyed3, "Those people who think they know everything are a great annoyance to those of us who do."));
        list.add(new data (R.drawable .annoyed3, "Unless your name is GOOGLE, Don`t act as if you know everything."));
        list.add(new data (R.drawable .annoyed3, "I think people who lack humility are really annoying."));
        list.add(new data (R.drawable .annoyed3, "People who annoy people; they are the luckiest people in the world."));
        list.add(new data (R.drawable .annoyed3, "Some people just don't get that I'll rather talk to a wall than them."));
        list.add(new data (R.drawable .annoyed3, "I don't like boys. They're kind of annoying."));
        list.add(new data (R.drawable .annoyed3, "I hate when someone wants to ask me a question, I ask them what it is, then they're like 'nevermind'."));
        list.add(new data (R.drawable .annoyed3, "I find impressionists slightly annoying, really. "));
        list.add(new data (R.drawable .annoyed3, "It's not annoying if only a couple of people come up. If a bunch of them crowd around me, it's annoying."));
        list.add(new data (R.drawable .annoyed3, "People who say it cannot be done should not interrupt those who are doing it."));
        list.add(new data (R.drawable .annoyed3, "Worried about being a dull fellow? You might develop your talent for being irritating."));
        list.add(new data (R.drawable .annoyed3, "Some people are so heavenly minded that they are no earthly good"));
        list.add(new data (R.drawable .annoyed3, "There is no use whatsoever trying to help people who do not help themselves. You cannot push anyone up a ladder unless he is willing to climb himself."));
        list.add(new data (R.drawable .annoyed3, "In some cases, I quite like irritating people who need to be irritated."));
        list.add(new data (R.drawable .annoyed3, "There is nobody so irritating as somebody with less intelligence and more sense than we have."));
        list.add(new data (R.drawable .annoyed3, "Some people are like clouds. When they disappear, it's a brighter day."));
        list.add(new data (R.drawable .annoyed3, "I know that there are people who do not love their fellow man, and I hate people like that."));
        list.add(new data (R.drawable .annoyed3, "Too many people spend money they haven't earned, to buy things they don't want, to impress people they don't like."));
        list.add(new data (R.drawable .annoyed3, "People who want to share their religious views with you almost never want you to share yours with them."));
        list.add(new data (R.drawable .annoyed3, "I know nothing more annoying when people I don't know jump to conclusions on my person based on nothing but gossip or speculation. "));
        list.add(new data (R.drawable .annoyed3, "I like to call everyone that I find slightly annoying a 'sociopath.' "));
        list.add(new data (R.drawable .annoyed3, "It is really irritating to work with irritating people."));
        list.add(new data (R.drawable .annoyed3, "Nothing is as irritating as the fellow who chats pleasantly while he's overcharging you."));
        list.add(new data (R.drawable .annoyed3, "Being natural is one of the most irritating poses I know in people."));
        list.add(new data (R.drawable .annoyed3, "Annoying people with no class at all should stay far away from computers!"));
        list.add(new data (R.drawable .annoyed3, "I don't hate you, you're just the most annoying person in my life."));
        list.add(new data (R.drawable .annoyed3, "Some people have so little going on in their lives, they would rather discuss yours"));
        list.add(new data (R.drawable .annoyed3, "The fellow who thinks he knows it all is especially annoying to those of us who do. "));
        list.add(new data (R.drawable .annoyed3, "Most people are full of themselves and speak only the obnoxiously superficial, in other words they're annoying as hell."));





        // list.add(new Data_show ( "" ));
    }
}
