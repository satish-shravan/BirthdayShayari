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

public class days extends AppCompatActivity {

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
        setContentView ( R.layout.activity_days );

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



        list.add(new data (R.drawable .days, "Have a cool weekend"));
        list.add(new data (R.drawable .days, "Oversleep this weekend."));
        list.add(new data (R.drawable .days, "It’s the weekend. Enjoy it."));
        list.add(new data (R.drawable .days, "Monday. Nothing the beach can’t fix"));
        list.add(new data (R.drawable .days, "It’s the weekend, this is as dressed as I get"));
        list.add(new data (R.drawable .days, "I really need a day between Saturday and Sunday."));
        list.add(new data (R.drawable .days, "It’s Thursday. I can smell the weekend from here."));
        list.add(new data (R.drawable .days, "Weekend. Beast mode: OFF."));
        list.add(new data (R.drawable .days, "Wishing you a weekend full of love and laughter!"));
        list.add(new data (R.drawable .days, "No. I don’t want the weekend to be over"));
        list.add(new data (R.drawable .days, "Smile. It’s Saturday"));
        list.add(new data (R.drawable .days,"Tomorrow is Monday again."));
        list.add(new data (R.drawable .days, "Shortest horror story: Monday."));
        list.add(new data (R.drawable .days,"This is your Sunday evening reminder that you can handle whatever this week throws at you"));
        list.add(new data (R.drawable .days, "Ah, Sunday… A day of rest… Rest of the laundry, rest of the house and rest of all the other stuff I put off on Saturday!"));
        list.add(new data (R.drawable .days, "Better days are coming. They are called: Saturday and Sunday"));
        list.add(new data (R.drawable .days, "Today is Sunday. Share this and within 7 days you’ll get another Sunday. It really works. My friend ignored this message and he got a Monday within 24 hours."));
        String str2 = "Stay strong. Weekend is coming soon.";
        list.add(new data (R.drawable .days, str2));
        list.add(new data (R.drawable .days, "You know what I want to do? Wake up one weekend and not have to go anywhere and do nothing."));
        list.add(new data (R.drawable .days, "I’ve always loved the ‘Weekend Update’ people."));
        list.add(new data (R.drawable .days,"A wild and crazy weekend involves sitting on the front porch, smoking a cigar, reading a book"));
        list.add(new data (R.drawable .days,"Hands up if you’re ready to do something you’ll regret this weekend. Go forth! You have my blessing"));
        String str3 = "The weekends are too short for sleep!";
        list.add(new data (R.drawable .days, str3));
        list.add(new data (R.drawable .days, "Most people are in a factory from nine till five. Their job may be to turn out 263 little circles. At the end of the week they’re three short and somebody has a go at them. On Saturday afternoons they deserve something to go and shout about"));
        list.add(new data (R.drawable .days, "I always give 100% at work: 13% Monday, 22% Tuesday, 26% Wednesday, 35% Thursday, 4% Friday."));
        list.add(new data (R.drawable .days, "Music always sounds better on Friday."));
        list.add(new data (R.drawable .days, "In an ideal world, I’d spend every weekend at my home in Zermatt in Switzerland"));
        list.add(new data (R.drawable .days, "Sunday clears away the rust of the whole week."));
        list.add(new data (R.drawable .days, "The only reason why we ask other people how their weekend was is so we can tell them about our own weekend."));
        list.add(new data (R.drawable .days, "Always strive to excel, but only on weekends."));
        list.add(new data (R.drawable .days,"Friday. The golden child of the weekdays. The superhero of the workweek. The welcome wagon to the weekend. The famous F word we thank God for every week."));
        list.add(new data (R.drawable .days, "I hope our friendship will not end at the end of the week. See you on Monday!"));
        list.add(new data (R.drawable .days, "Music is the silence between the notes. Have a musical weekend!"));
        list.add(new data (R.drawable .days, "I have been known to hang out and party back in the day. I had a weekend that lasted a few years."));
        list.add(new data (R.drawable .days,"I’m usually up at 6 A.M., even on the weekend."));
        list.add(new data (R.drawable .days, "I work mostly during the week, and on the weekend I get to hang out with friends, so it balances out pretty well."));
        list.add(new data (R.drawable .days, "Life begins on Friday night."));
        list.add(new data (R.drawable .days, "Better days are headed your way. They are called Saturday and Sunday."));
        list.add(new data (R.drawable .days, str2));
        list.add(new data (R.drawable .days,"Sometimes the weekend gets hijacked by work, but as my mother would say, this is the right problem"));
        list.add(new data (R.drawable .days, str3));
        list.add(new data (R.drawable .days, "Youth is like a long weekend on a Friday night, while middle age is like a long weekend on a Monday afternoon."));
        list.add(new data (R.drawable .days, "Thank God it’s Friday, because the weekend has landed and it’s time to forget about work and tear it up!"));
        list.add(new data (R.drawable .days, "The rhythm of the weekend, with its birth, its planned gaieties, and its announced end, followed the rhythm of life and was a substitute for it."));
        list.add(new data (R.drawable .days, "When you’re young, you should live out every weekend. Even if you look like a scarecrow, you just gotta go"));
        list.add(new data (R.drawable .days, "Just leave all your worries and jump like a child on your weekends"));
        list.add(new data (R.drawable .days, "Weekends don’t pay as well as weekdays but at least there’s football"));
        list.add(new data (R.drawable .days, "It’s weekend. Take it slow and give your soul a chance to catch up with your body."));
        list.add(new data (R.drawable .days, "The weekend is like a superhero, flying and swooping in to save the rest of the week."));





        // list.add(new Data_show ( "" ));
    }
}
