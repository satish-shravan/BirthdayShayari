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

public class angry extends AppCompatActivity {

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
        setContentView ( R.layout.activity_angry );

        //init_ads ();
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

        list.add(new data (R.drawable .angry,"\"When angry count to ten before you speak. If very angry, count to one hundred\""));

        list.add(new data (R.drawable .angry, " \"Getting angry doesn’t solve anything.\"" ));
        list.add(new data (R.drawable .angry,"\"Anger is like a storm rising up from the bottom of your consciousness. When you feel it coming, turn your focus to your breath\""));

        list.add(new data (R.drawable .angry, "\"I believe anger is a wasted emotion, and I don’t like to waste emotions.\"" ));
        list.add(new data (R.drawable .angry,"\"Every time you get angry, you poison your own system\""));

        list.add(new data (R.drawable .angry, "\"He that will be angry for anything will be angry for nothing.\"" ));
        list.add(new data (R.drawable .angry,"\"When anger rises, think of the consequences\""));

        list.add(new data (R.drawable .angry, "\"If you are patient in one moment of anger, you will escape a hundred days of sorrow.\"" ));
        list.add(new data (R.drawable .angry," \"People won’t have time for you if you are always angry or complaining\""));

        list.add(new data (R.drawable .angry, "\"Keep your temper. A decision made in anger is never sound\"" ));
        list.add(new data (R.drawable .angry,"\"When angry, count to four; when very angry, swear.\""));

        list.add(new data (R.drawable .angry, "\"Anger’s not a good emotion\"" ));

        list.add(new data (R.drawable .angry," \"Expressing anger is a form of public littering.\""));

        list.add(new data (R.drawable .angry, " \"Anger is a momentary madness, so control your passion or it will control you\"" ));
        list.add(new data (R.drawable .angry,"\"Never go to bed angry, stay up and fight\""));

        list.add(new data (R.drawable .angry, "\"Man should forget his anger before he lies down to sleep.\"" ));
        list.add(new data (R.drawable .angry,"\"Anger is an expensive luxury in which only men of certain income can indulge\""));

        list.add(new data (R.drawable .angry, " \"I get angry about things, then go on and work.\"" ));
        list.add(new data (R.drawable .angry,"\"There’s nothing wrong with anger provided you use it constructively.\""));

        list.add(new data (R.drawable .angry, "\"For every minute you remain angry, you give up sixty seconds of peace of mind.\"" ));
        list.add(new data (R.drawable .angry," \"Anger is a wind which blows out the lamp of the mind.\""));

        list.add(new data (R.drawable .angry, "\"One of man’s greatest obligations is anger.\"" ));
        list.add(new data (R.drawable .angry,"\"Anger is a short madness\""));

        list.add(new data (R.drawable .angry, "\"Not the fastest horse can catch a word spoken in anger\"" ));
        list.add(new data (R.drawable .angry,"\"To be angry is to revenge the faults of others on ourselves.\""));

        list.add(new data (R.drawable .angry, "\"Anger begins with folly, and ends with repentance.\"" ));
        list.add(new data (R.drawable .angry,"\"Be modest, humble, simple. Control your anger.\""));

        list.add(new data (R.drawable .angry, "\"Anger is what makes a clear mind seem clouded\"" ));
        list.add(new data (R.drawable .angry,"\"Never do anything when you are in a temper, for you will do everything wrong\""));

        list.add(new data (R.drawable .angry, "\"Anger is often more hurtful than the injury that caused it\"" ));
        list.add(new data (R.drawable .angry,"\"Whatever is begun in anger ends in shame.\""));

        list.add(new data (R.drawable .angry, "\"A hand ready to hit, may cause you great trouble.\"" ));
        list.add(new data (R.drawable .angry,"\"A man in a passion, rides a mad horse\""));

        list.add(new data (R.drawable .angry, "\"Anger is one letter short of danger\"" ));
        list.add(new data (R.drawable .angry,"\"The greatest remedy for anger is delay.\""));

        list.add(new data (R.drawable .angry, "\"He who angers you conquers you\"" ));








        // list.add(new Data_show ( "" ));
    }
}
