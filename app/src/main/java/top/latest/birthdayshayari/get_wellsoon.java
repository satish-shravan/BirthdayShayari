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

public class get_wellsoon extends AppCompatActivity {

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
        setContentView ( R.layout.activity_get_wellsoon );


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




        list.add(new data (R.drawable .getwellsoon, "I wish you well a hundred times a day…. In my heart."));
        list.add(new data (R.drawable .getwellsoon, "I’m really sorry to hear of your illness. We’re all thinking of you during this time and hope your recovery is a speedy one."));
        list.add(new data (R.drawable .getwellsoon, "While you rest and recover, I’ll be next to you praying and hoping for a smooth and quick recovery."));
        list.add(new data (R.drawable .getwellsoon, "Wishing you all the best with your recovery. May you use this restful time to recharge and energize. All the best"));
        list.add(new data (R.drawable .getwellsoon, "Sending you tons of well wishes for your fast recovery."));
        list.add(new data (R.drawable .getwellsoon, " Sending you well wishes for your quick recovery and good health."));
        list.add(new data (R.drawable .getwellsoon, "Get well soon and together, we shall continue to find happiness in our friendship."));
        list.add(new data (R.drawable .getwellsoon, "Dear friend, get well soon and rock your life!"));
        list.add(new data (R.drawable .getwellsoon, "The most important thing in illness is never to lose heart. Our prayers are with you. Get Well Soon."));
        list.add(new data (R.drawable .getwellsoon, "Thinking of you lots and hoping for your speedy recovery."));
        list.add(new data (R.drawable .getwellsoon, "With good wishes and prayers that you get well soon."));
        list.add(new data (R.drawable .getwellsoon, "Don’t worry; we’re here to stand alongside you as you work to recapture your good health."));
        list.add(new data (R.drawable .getwellsoon, "Get ready; it’s time for you to get well soon."));
        list.add(new data (R.drawable .getwellsoon, "I wish I was a magician so I could make you fit and healthy with the wave of a wand!"));
        list.add(new data (R.drawable .getwellsoon, "I will stand beside you forevermore, wishing you good health and a fast recovery."));
        list.add(new data (R.drawable .getwellsoon, "Feel better fast, so I can see you again soon! I miss you so much!"));
        list.add(new data (R.drawable .getwellsoon, "I pray God heals you quickly with His miraculously healing hands."));
        list.add(new data (R.drawable .getwellsoon, "Sending all good wishes to my friend. Here’s hoping you’ll get well very soon"));
        list.add(new data (R.drawable .getwellsoon,"I heard you were in pain. Well, don’t focus on it. LOL, as I mention it. No, really think good thoughts. I love ya! Get well soon!"));
        list.add(new data (R.drawable .getwellsoon, "I pray every inch of your body feels better soon! I miss your face!"));
        list.add(new data (R.drawable .getwellsoon, "Remember just take it one day at a time, and in no time you will be completely healthy and smiling."));
        list.add(new data (R.drawable .getwellsoon, "I hope this get well wish brings a smile to your face. You are too beautiful to be feeling down."));
        list.add(new data (R.drawable .getwellsoon, "Do what the doctor says and feel better soon! I long to see you again."));
        list.add(new data (R.drawable .getwellsoon,"Get Well Soon Messages for Mom, Dad, Brother or Sister"));
        list.add(new data (R.drawable .getwellsoon, "May good health envelop you, spurring a quick recovery."));
        list.add(new data (R.drawable .getwellsoon,"Get well soon so you can resume bringing brightness and delight to our life!"));
        list.add(new data (R.drawable .getwellsoon, "I will continue praying for your good health and a speedy recovery."));
        list.add(new data (R.drawable .getwellsoon, "I pray for my dear friend’s fast recovery and future good health."));
        list.add(new data (R.drawable .getwellsoon, "Get well soon, my dearest friend, as I always want to see you fit and fine."));
        list.add(new data (R.drawable .getwellsoon, "Sending good vibes to you, my dear friend, to help fight your sickness. I hope you get well soon"));
        list.add(new data (R.drawable .getwellsoon,"People here are missing you so much. We specifically miss your kindness and humor. Please recover quickly from your illness. We are praying for you day and night friend."));
        list.add(new data (R.drawable .getwellsoon, "I am sorry to hear that you were taken to hospital last night. Let me convey my best wishes and quick recovery from your illness soonest possible my friend."));
        list.add(new data (R.drawable .getwellsoon, "Get well soon so you can once again experience all the fun and delight that life has to offer!"));
        list.add(new data (R.drawable .getwellsoon,"Best wishes. I hope that you’re back in the swing very soon."));
        list.add(new data (R.drawable .getwellsoon,"Sending you well wishes for your quick recovery and good health."));
        list.add(new data (R.drawable .getwellsoon, "I heard that you are in the hospital. I hope they release you soon because we need you more than they do!"));
        list.add(new data (R.drawable .getwellsoon, "The little flowers are rising and blooming; it’s the world’s way of saying, “get well soon."));
        list.add(new data (R.drawable .getwellsoon, "May your recovery be a short but restful one. We’re all thinking of you during this time and we hope you’re back on your feet soon."));
        list.add(new data (R.drawable .getwellsoon,"Our thoughts and prayers are with you as we wish for a complete and restful recovery. Looking forward to catching up with you again soon."));
        list.add(new data (R.drawable .getwellsoon, "Recover well, to be strong and sound. Rest well, to walk on the path to good health."));
        list.add(new data (R.drawable .getwellsoon,"Hurry up and get the heck out of there!"));
        list.add(new data (R.drawable .getwellsoon, "If these flowers were wishes, then my wish for you is to get well soon."));
        list.add(new data (R.drawable .getwellsoon, "I reckon being ill as one of the great pleasures of life, provided one is not too ill and is not obliged to work till one is better."));
        list.add(new data (R.drawable .getwellsoon, "Get-well cards have become so humorous that if you don’t get sick you’re missing half the fun."));
        list.add(new data (R.drawable .getwellsoon, "Physical ills are the taxes laid upon this wretched life; some are taxed higher, and some lower, but all pay something."));
        list.add(new data (R.drawable .getwellsoon, "Sometimes I get the feeling the aspirin companies are sponsoring my headaches."));
        list.add(new data (R.drawable .getwellsoon, "When an illness knocks you on your ass, you should stay down and relax for a while before trying to get back up."));




        // list.add(new Data_show ( "" ));
    }
}
