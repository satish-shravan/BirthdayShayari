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

public class alone extends AppCompatActivity {



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
        setContentView ( R.layout.activity_alone );

       // init_ads();

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


    private void linearList()
    {

        list.add(new data (R.drawable .alone,"And in the end all I learned was how to be strong… Alone"));

        list.add(new data (R.drawable .alone, "It’s easy to stand with the crowd it takes courage to stand alone" ));

        list.add(new data (R.drawable .alone, "I used to think the worst thing in life was to end up all alone, it’s not. The worst thing in life is to end up with people that make you feel all alone." ));
        list.add(new data (R.drawable .alone, "Sometimes, you need to be alone. Not to be lonely, but to enjoy your free time being yourself." ));
        list.add(new data (R.drawable .alone, "\"Standing alone is better than standing with people who don’t value you\"" ));
        list.add(new data (R.drawable .alone, "\"You may feel lost and alone. But God knows where you are and has a good plan for your future.\"" ));
        list.add(new data (R.drawable .alone, "\"Standing alone doesn’t mean I am alone. It means I’m strong enough to handle things all by myself.\"" ));


        list.add(new data (R.drawable .alone, "\"Sometimes life is too hard to be alone and sometimes life is too good to be alone.\"" ));
        list.add(new data (R.drawable .alone, "\"Never say you are alone for you are not alone, your God and your genius is within.\"" ));
        list.add(new data (R.drawable .alone, "\"I’m falling apart right in front of your eyes but you don’t even see me.\"" ));
        list.add(new data (R.drawable .alone, "\"No, I may not be physically alone. But mentally there is no one insight\"" ));


        list.add(new data (R.drawable .alone, "\"Leave me alone. I’m sick of your games. Stop it. Don’t mess with me anymore.\"" ));
        list.add(new data (R.drawable .alone, "\"You can’t be strong all the time. Sometimes you just need to be alone and let your tears out.\"" ));
        list.add(new data (R.drawable .alone, "\"You cannot be lonely if you like the person you are alone with.\"" ));
        list.add(new data (R.drawable .alone, "\"To be alone is to be different and to be different is to be alone.\"" ));


        list.add(new data (R.drawable .alone, "\"And then I think that maybe I was designed to be alone.\"" ));
        list.add(new data (R.drawable .alone, "\"Sometimes I just want to disappear and see if anyone would miss me\"" ));
        list.add(new data (R.drawable .alone, "\"When everything is lonely I can be my best friend\"" ));
        list.add(new data (R.drawable .alone, "\"Some steps need to be taken alone. It’s the only way to really figure out where you need to go and who you need to be.\"" ));


        list.add ( new data ( R.drawable.alone,"\"Lonely is not being alone, it’s the feeling that no one cares.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"I want to sleep until I feel better.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"Being alone is more painful than getting Hurt.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"I like to be alone. But I hate being lonely.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"You’re not dead, but not alive either. You’re just a ghost with a beating heart.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"Sometimes you just need a break. In a beautiful place. Alone. To figure everything out." ) );
        list.add ( new data ( R.drawable.alone,"\"Sometimes it’s better to be alone. Nobody can Hurt you\"" ) );
        list.add ( new data ( R.drawable.alone,"\"I want someone to be afraid of losing me. No one has and I don’t think no one ever will.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"She was drowning but nobody saw her struggle.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"If you could read my mind, you’d be in tears.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"That feeling when you’re not necessarily sad, but you just feel really empty.\"" ) );
        list.add ( new data ( R.drawable.alone,"\"Learn to be alone and to like it. There is nothing more empowering or freeing than learning to like your own company.\"" ) );

        list.add ( new data ( R.drawable.alone,"\"Hello, darkness, my old friend. I have to talk with you, again.\"" ) );

        list.add ( new data ( R.drawable.alone,"\"Loneliness is sad, aloneness is blissful.\"" ) );


        list.add ( new data ( R.drawable.alone,"\"Walking with a friend in the dark is better than walking alone in the light.\"" ) );



        list.add ( new data ( R.drawable.alone,"\"That feeling when you don’t even know what the fuck you’re feeling.\"" ) );



        list.add ( new data ( R.drawable.alone,"\"You keep a lot to yourself because it’s difficult to find people who understand.\"" ) );



        list.add ( new data ( R.drawable.alone,"\"The eternal quest of the individual human being is to shatter his loneliness.\"" ) );



        list.add ( new data ( R.drawable.alone,"\"I restore myself when I’m alone.\"" ) );



        list.add ( new data ( R.drawable.alone,"\"Being alone with your feelings is the worst because you have nowhere to run. They’re here, dancing in your mind and all you can do is handle.\"" ) );


        list.add ( new data ( R.drawable.alone,"\"One travels more usefully when alone, because he reflects more.\"" ) );


        // list.add(new Data_show ( "" ));
    }


}
