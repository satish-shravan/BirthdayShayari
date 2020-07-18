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

public class nature extends AppCompatActivity {

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
        setContentView ( R.layout.activity_nature );

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



        list.add(new data (R.drawable .nature,"Nature always wears the colors of the spirit"));
        list.add(new data (R.drawable .nature, "The Earth has music for those who listen."));
        list.add(new data (R.drawable .nature, "Look deep into nature and then you will understand everything better"));
        list.add(new data (R.drawable .nature, "To walk in nature is to witness a thousand miracles."));
        list.add(new data (R.drawable .nature, "The Earth laughs in flowers."));
        list.add(new data (R.drawable .nature, "Nature is the art of God."));
        list.add(new data (R.drawable .nature, "Lightning is incredible"));
        list.add(new data (R.drawable .nature,"Joy in looking and comprehending is nature’s most beautiful gift"));
        list.add(new data (R.drawable .nature,"Taking pictures is savoring life intensely, every hundredth of a second "));
        list.add(new data (R.drawable .nature, "How glorious a greeting the sun gives the mountains!"));
        list.add(new data (R.drawable .nature, "The shoreline at sunset is simply….beautiful."));
        list.add(new data (R.drawable .nature, "Just living is not enough…One must have sunshine, freedom and a little flower."));
        list.add(new data (R.drawable .nature, "Keep your love of nature, for that, is the true way to understand art more and more."));
        list.add(new data (R.drawable .nature,"Landscape photography is the supreme test of the photographer – and often the supreme disappointment"));
        list.add(new data (R.drawable .nature, "The bird is powered by its own life and by its motivation."));
        list.add(new data (R.drawable .nature, "Every sunset brings the promise of a new dawn"));
        list.add(new data (R.drawable .nature, "Colors are the smiles of nature"));
        list.add(new data (R.drawable .nature, "Nature never goes out of style"));
        list.add(new data (R.drawable .nature, "One touch of nature makes the whole world kin."));
        list.add(new data (R.drawable .nature,"Every flower is a soul blossoming in nature."));
        list.add(new data (R.drawable .nature, "When it Rains, Look for Rainbows. When it’s Dark, Look for Stars."));
        list.add(new data (R.drawable .nature,"Spring is nature’s way of saying, ‘Let’s party!’."));
        list.add(new data (R.drawable .nature, "Autumn, the year’s last loveliest smile."));
        list.add(new data (R.drawable .nature, "Autumn is a second spring when every leaf is a flower."));
        list.add(new data (R.drawable .nature, "Sunset is still my favorite color, and rainbow is second"));
        list.add(new data (R.drawable .nature, "Study nature, love nature, stay close to nature. It will never fail you."));
        list.add(new data (R.drawable .nature, "In the depth of winter, I finally learned that there was in me an invincible summer."));
        list.add(new data (R.drawable .nature, "Try to be a rainbow in someone’s cloud."));
        list.add(new data (R.drawable .nature, "Peace is seeing the sunrise or a sunset and knowing who to thank."));
        list.add(new data (R.drawable .nature, "In every walk with nature, one receives far more than he seeks."));
        list.add(new data (R.drawable .nature, "It always rains the hardest on people who deserves the sun."));
        list.add(new data (R.drawable .nature, "The mountains are calling and I must go"));
        list.add(new data (R.drawable .nature, "The sound of rain needs no translation."));
        list.add(new data (R.drawable .nature, "If sky is the limit, then go there."));
        list.add(new data (R.drawable .nature, "Every mountain top is within reach if you just keep climbing."));

        list.add(new data (R.drawable .nature,  "On the top of mountains & beneath the stars."));
        list.add(new data (R.drawable .nature,  "The sky is the daily bread of the eyes"));
        list.add(new data (R.drawable .nature,  "Difficult roads often lead to beautiful destinations"));
        list.add(new data (R.drawable .nature,  "If you truly love nature, you will find beauty everywhere."));
        list.add(new data (R.drawable .nature, "Beautiful things don’t ask for attention"));
        list.add(new data (R.drawable .nature, "Get lost in the forest & Don’t find a way back"));
        list.add(new data (R.drawable .nature,  "Nature does not hurry, yet everything is accomplished."));
        list.add(new data (R.drawable .nature,  "Smell the sea, and feel the sky. Let your soul and spirit fly"));
        list.add(new data (R.drawable .nature,  "Life is either a great adventure or nothing."));
        list.add(new data (R.drawable .nature,  "Aim for the moon, if you miss you may hit a star."));
        list.add(new data (R.drawable .nature,  "The tree that is beside the running water is fresher and gives more fruit"));
        list.add(new data (R.drawable .nature,  "High Tides Good Vibes."));
        list.add(new data (R.drawable .nature,  "Good vibes happen on the tides."));
        list.add(new data (R.drawable .nature, "Happiness is..good book and a beach"));
        list.add(new data (R.drawable .nature,  "All I need are palm trees and a cool breeze"));
        list.add(new data (R.drawable .nature,  "B.E.A.C.H – Best Escape Anyone Can Have!"));
        list.add(new data (R.drawable .nature,  "There’s no place like the Beach"));
        list.add(new data (R.drawable .nature,  "A walk on the beach in priceless"));
        list.add(new data (R.drawable .nature,  "The tans will fade, but the memories will last forever"));







        // list.add(new Data_show ( "" ));
    }
}
