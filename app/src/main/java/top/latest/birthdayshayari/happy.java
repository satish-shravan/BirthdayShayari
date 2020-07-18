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

public class happy extends AppCompatActivity {

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
        setContentView ( R.layout.activity_happy );

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





        list.add(new data (R.drawable .happy, "Happiness is a direction, not a place."));
        list.add(new data (R.drawable .happy,"Folks are usually about as happy as they make their minds up to be."));
        list.add(new data (R.drawable .happy,"Be happy with what you have. Be excited about what you want."));
        list.add(new data (R.drawable .happy,"You will never be happy if you continue to search for what happiness consists of. You will never live if you are looking for the meaning of life"));
        list.add(new data (R.drawable .happy,"Only a life lived for others is a life worthwhile."));
        list.add(new data (R.drawable .happy, "Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful."));
        list.add(new data (R.drawable .happy, "I have only two kinds of days: happy and hysterically happy"));
        list.add(new data (R.drawable .happy, "People should find happiness in the little things, like family."));
        list.add(new data (R.drawable .happy, "If you want to be happy, set a goal that commands your thoughts, liberates your energy, and inspires your hopes"));
        list.add(new data (R.drawable .happy,"As people spin faster and faster in the pursuit of merely personal happiness, they become exhausted in the futile effort of chasing themselves"));
        list.add(new data (R.drawable .happy, "Whoever is happy will make others happy."));
        list.add(new data (R.drawable .happy,"Happiness depends upon ourselves"));
        list.add(new data (R.drawable .happy, "Happy girls are the prettiest"));
        list.add(new data (R.drawable .happy, "Learn to value yourself, which means: fight for your happiness."));
        list.add(new data (R.drawable .happy, "Family, friends, a good laugh and beautiful weather are the best cures"));
        list.add(new data (R.drawable .happy, "All happiness or unhappiness solely depends upon the quality of the object to which we are attached by love"));
        list.add(new data (R.drawable .happy, "Happiness consists more in conveniences of pleasure that occur everyday than in great pieces of good fortune that happen but seldom"));
        list.add(new data (R.drawable .happy, "A great obstacle to happiness is to expect too much happiness"));
        list.add(new data (R.drawable .happy, "To be without some of the things you want is an indispensable part of happiness"));
        list.add(new data (R.drawable .happy,"There is some kind of a sweet innocence in being human—in not having to be just happy or just sad—in the nature of being able to be both broken and whole, at the same time"));
        list.add(new data (R.drawable .happy,"The secret of happiness is freedom, the secret of freedom is courage."));
        list.add(new data (R.drawable .happy, "Happiness is a way station between too little and too much"));
        list.add(new data (R.drawable .happy, "It is not how much we have, but how much we enjoy, that makes happiness."));
        list.add(new data (R.drawable .happy,"There is no happiness like that of being loved by your fellow creatures, and feeling that your presence is an addition to their comfort."));
        list.add(new data (R.drawable .happy, "If you want happiness for an hour, take a nap. If you want happiness for a day, go fishing. If you want happiness for a year, inherit a fortune. If you want happiness for a lifetime, help someone else"));
        list.add(new data (R.drawable .happy,"The only way to find true happiness is to risk being completely cut open."));
        list.add(new data (R.drawable .happy,"Be happy. It’s one way of being wise."));
        list.add(new data (R.drawable .happy, "Nobody really cares if you’re miserable, so you might as well be happy"));
        list.add(new data (R.drawable .happy, "Happiness is not something ready made. It comes from your own actions."));
        list.add(new data (R.drawable .happy, "It isn’t what you have or who you are or where you are or what you are doing that makes you happy or unhappy. It is what you think about it"));
        list.add(new data (R.drawable .happy,"People are unhappy when they get something too easily. You have to sweat – that’s the only moral they know"));
        list.add(new data (R.drawable .happy,"We can’t control the world. We can only (barely) control our own reactions to it. Happiness is largely a choice, not a right or entitlement"));
        list.add(new data (R.drawable .happy, "I think the key to life is just being a happy person, and happiness will bring you success"));
        list.add(new data (R.drawable .happy, "Happiness is being content with what you have, living in freedom and liberty, having a good family life and good friends"));
        list.add(new data (R.drawable .happy, "Happiness is the interval between periods of unhappiness."));
        list.add(new data (R.drawable .happy, "The world is full of people looking for spectacular happiness while they snub contentment"));
        list.add(new data (R.drawable .happy,"Happiness grows at our own firesides, and is not to be picked in strangers’ gardens"));
        list.add(new data (R.drawable .happy, "Happiness is always the serendipitous result of looking for something else"));
        list.add(new data (R.drawable .happy,"Happiness is excitement that has found a settling down place. But there is always a little corner that keeps flapping around."));
        list.add(new data (R.drawable .happy, "If only we’d stop trying to be happy we could have a pretty good time."));
        list.add(new data (R.drawable .happy, "Happiness is not a goal; it is a by-product."));
        list.add(new data (R.drawable .happy, "The essence of philosophy is that a man should so live that his happiness shall depend as little as possible on external things"));
        list.add(new data (R.drawable .happy, "The search for happiness is one of the chief sources of unhappiness."));
        list.add(new data (R.drawable .happy, "Give a man health and a course to steer, and he’ll never stop to trouble about whether he’s happy or not."));
        list.add(new data (R.drawable .happy, "Happiness is having a large, loving, caring, close-knit family in another city."));
        list.add(new data (R.drawable .happy, "There is only one happiness in this life, to love and be loved."));
        list.add(new data (R.drawable .happy,"How simple it is to see that we can only be happy now, and there will never be a time when it is not now"));
        list.add(new data (R.drawable .happy, "Happiness is a by-product of an effort to make someone else happy"));
        list.add(new data (R.drawable .happy, "Now and then it’s good to pause in our pursuit of happiness and just be happy"));




        // list.add(new Data_show ( "" ));
    }
}
