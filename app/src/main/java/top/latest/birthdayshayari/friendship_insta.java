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

public class friendship_insta extends AppCompatActivity {


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
        setContentView ( R.layout.activity_friendship_insta );

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
        list.add(new data (R.drawable .friendship,"F.R.I.E.N.D.S: Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you."));

        list.add(new data (R.drawable .friendship,"Friends ‘till the end."));

        list.add(new data (R.drawable .friendship,"A true friend is one soul in two bodies."));

        list.add(new data (R.drawable .friendship,"Your vibe attracts your trib"));

        list.add(new data (R.drawable .friendship,"Friends don’t let friends do silly things alone."));

        list.add(new data (R.drawable .friendship,"I’ll even send you the photos I look bad in."));

        list.add(new data (R.drawable .friendship,"Besides chocolate, you’re my favorite."));

        list.add(new data (R.drawable .friendship,"Love is beautiful, friendship is better"));

        list.add(new data (R.drawable .friendship,"Every girl needs a boy best friend."));

        list.add(new data (R.drawable .friendship,"No friendship is an accident."));

        list.add(new data (R.drawable .friendship,"I love my crazy best friends."));

        list.add(new data (R.drawable .friendship,"Life is better with true friends."));

        list.add(new data (R.drawable .friendship,"Friends become our chosen family!"));

        list.add(new data (R.drawable .friendship,"Live for the moments you can’t put in words."));

        list.add(new data (R.drawable .friendship,"Good Times + Crazy Friends = Great Memories!"));

        list.add(new data (R.drawable .friendship,"Life was meant for best friends and good adventures!"));

        list.add(new data (R.drawable .friendship,"I don’t know what I did to deserve a best friend like you."));

        list.add(new data (R.drawable .friendship,"Forever and Always."));

        list.add(new data (R.drawable .friendship,"You are my sunshine on a rainy day."));

        list.add(new data (R.drawable .friendship,"Life’s too short and so are we."));

        list.add(new data (R.drawable .friendship,"On our worst behavior."));

        list.add(new data (R.drawable .friendship,"Let’s wander."));

        list.add(new data (R.drawable .friendship,"Friends who slay together, stay together."));

        list.add(new data (R.drawable .friendship,"When I say I won’t tell anyone, my best friend doesn’t count."));

        list.add(new data (R.drawable .friendship,"You are my best friend because I wouldn’t dare be this weird with anyone else."));

        list.add(new data (R.drawable .friendship,"A girl can survive without a boyfriend, but she can’t survive without a best friend."));

        list.add(new data (R.drawable .friendship,"One friend can change your whole life. I know (name) did."));

        list.add(new data (R.drawable .friendship,"Best friends believe in you when you don’t believe in yourself."));

        list.add(new data (R.drawable .friendship,"Sometimes being with your best friend is all the therapy you need."));

        list.add(new data (R.drawable .friendship,"Nothing could ever replace my best friend."));

        list.add(new data (R.drawable .friendship,"True friendship is not about being inseparable—it is being separated and finding nothing changes."));

        list.add(new data (R.drawable .friendship,"Time and good friends are two things that become more valuable the older you get."));

        list.add(new data (R.drawable .friendship,"Friends until the very end—and then some."));

        list.add(new data (R.drawable .friendship,"“Friendship is born at that moment when one person says to another: ‘What! You too? I thought I was the only one.” "));

        list.add(new data (R.drawable .friendship,"“A man’s friendships are one of the best measures of his worth.”"));

        list.add(new data (R.drawable .friendship,"“Let there be no purpose in friendship save the deepening of the spirit.” "));

        list.add(new data (R.drawable .friendship,"F.R.I.E.N.D.S: Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you."));






        // list.add(new Data_show ( "" ));
    }
}
