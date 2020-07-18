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

public class time extends AppCompatActivity {


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
        setContentView ( R.layout.activity_time );

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




        list.add(new data (R.drawable .time, "Life, if well lived, is long enough."));
        list.add(new data (R.drawable .time, "The two most powerful warriors are patience and time."));
        list.add(new data (R.drawable .time, "The present time has one advantage over every other – it is our own. "));
        list.add(new data (R.drawable .time, "Time flies over us, but leaves its shadow behind"));
        list.add(new data (R.drawable .time, "Life isn’t a matter of milestones, but of moments."));
        list.add(new data (R.drawable .time, "Every second is of infinite value"));
        list.add(new data (R.drawable .time, "The future has a way of arriving unannounced."));
        list.add(new data (R.drawable .time,"Whether it’s the best of times or the worst of times, it’s the only time we’ve got."));
        list.add(new data (R.drawable .time, "You will never find time for anything. If you want time you must make it."));
        list.add(new data (R.drawable .time, "Enjoy yourself. It’s later than you think"));
        list.add(new data (R.drawable .time,"Time you enjoy wasting is not wasted time"));
        list.add(new data (R.drawable .time,"Don’t wait. The time will never be just right"));
        list.add(new data (R.drawable .time, "How we spend our days, is, of course, how we spend our lives"));
        list.add(new data (R.drawable .time, "A man who dares to waste one hour of time has not discovered the value of life"));
        list.add(new data (R.drawable .time, "Your time is limited, so don’t waste it living someone else’s life"));
        list.add(new data (R.drawable .time,"Waste no more time arguing about what a good person should be. Be one"));
        list.add(new data (R.drawable .time, "To live is so startling it leaves little time for anything else"));
        list.add(new data (R.drawable .time,"It is not that we have a short time to live, but that we waste a lot of it. "));
        list.add(new data (R.drawable .time, "We should always allow some time to elapse, for time discloses the truth."));
        list.add(new data (R.drawable .time, "The whole future lies in uncertainty: live immediately."));
        list.add(new data (R.drawable .time, "As if you could kill time without injuring eternity."));
        list.add(new data (R.drawable .time, "We feast on time as time feasts on us"));
        list.add(new data (R.drawable .time, "Do we need more time? Or do we need to be more disciplined with the time we have?"));
        list.add(new data (R.drawable .time,"People often complain about lack of time when lack of direction is the real problem."));
        list.add(new data (R.drawable .time, "Until you value yourself, you won’t value your time. Until you value your time, you will not do anything with it"));
        list.add(new data (R.drawable .time, "I recommend you take care of the minutes and the hours will take care of themselves"));
        list.add(new data (R.drawable .time, "Time is what we want most, but what we use worst"));
        list.add(new data (R.drawable .time, "Ordinary people think merely of spending time, great people think of using it"));
        list.add(new data (R.drawable .time, "The more your know yourself, the more you understand life, the more you value your time"));
        list.add(new data (R.drawable .time, "Dost thou love life? Then do not squander time, for that is the stuff life is made of"));
        list.add(new data (R.drawable .time, "Shard by shard we are released from the tyranny of so-called time. "));
        list.add(new data (R.drawable .time, "We go back and forth between being time’s master and its victim. "));
        list.add(new data (R.drawable .time, "Your time is your life. That is why the greatest gift you can give someone is your time"));
        list.add(new data (R.drawable .time, "Lack of time is actually lack of priorities"));
        list.add(new data (R.drawable .time, "Nature does not hurry, yet everything is accomplished."));
        list.add(new data (R.drawable .time, "Time is the devourer of everything."));
        list.add(new data (R.drawable .time, "The only reason for time is so that everything doesn’t happen at once. "));
        list.add(new data (R.drawable .time, "Life is long enough, and a sufficiently generous amount has been given to us for the highest achievements if it were all well invested"));
        list.add(new data (R.drawable .time, "You can have it all. Just not all at once."));
        list.add(new data (R.drawable .time, "The time is always right to do what is right"));
        list.add(new data (R.drawable .time, "Lost time is never found again."));
        list.add(new data (R.drawable .time, "You may delay, but time will not."));
        list.add(new data (R.drawable .time, "Never leave ’till tomorrow which you can do today"));
        list.add(new data (R.drawable .time,"Truth alone will endure, all the rest will be swept away before the tide of time"));
        list.add(new data (R.drawable .time, "It is looking at things for a long time that ripens you and gives you a deeper meaning"));




        // list.add(new Data_show ( "" ));
    }
}
