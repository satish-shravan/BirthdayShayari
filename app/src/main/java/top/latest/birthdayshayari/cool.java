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

public class cool extends AppCompatActivity {


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
        setContentView ( R.layout.activity_cool );

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

        list.add(new data (R.drawable .cool,"\"Life goes on, with or without you.\\n\""));


        list.add(new data (R.drawable .cool, "5’2 my height but my attitude 6’1\n"));
        list.add(new data (R.drawable .cool, "Don’t Study me. You won’t Graduate!\n"));
        list.add(new data (R.drawable .cool, "If you’re honestly happy, fuck what people think.\n"));
        list.add(new data (R.drawable .cool, "Being pissed off gets old. I’m just at a whole new ‘fuck it’ level.\n"));
        list.add(new data (R.drawable .cool, "her attitude savage but her heart is gold.\n"));
        list.add(new data (R.drawable .cool, "Own what’s yours, or else others will try to.\n"));
        list.add(new data (R.drawable .cool, "Don’t mistake my kindness for weakness, bitch.\n"));
        list.add(new data (R.drawable .cool, "You couldn’t handle me even if I came with instructions.\n"));
        list.add(new data (R.drawable .cool,"Forgive, yes. Forget, never.\n"));
        list.add(new data (R.drawable .cool, "There’s a hole in my heart where you use to be.\n"));
        list.add(new data (R.drawable .cool, "I don’t need any part-time people in my life.\n"));
        list.add(new data (R.drawable .cool, "Exhale the bullshit.\n"));
        list.add(new data (R.drawable .cool,"I got it from my mama.\n"));
        list.add(new data (R.drawable .cool, "Thick thighs and pretty eyes.\n"));
        list.add(new data (R.drawable .cool, "Be a Warrior, not a Worrier.\n"));
        list.add(new data (R.drawable .cool, "Go wild for a while.\n"));
        list.add(new data (R.drawable .cool, "Rolling with the homies.\n"));
        list.add(new data (R.drawable .cool, "When you are Downie, eat a brownie.\n"));
        list.add(new data (R.drawable .cool, "All we have is NOW.\n"));
        list.add(new data (R.drawable .cool, "We got that Friday feeling.\n"));
        list.add(new data (R.drawable .cool, "Catch flights, not Feelings.\n"));
        list.add(new data (R.drawable .cool, "Disappointed but not surprised.\n"));
        list.add(new data (R.drawable .cool, "How I feel when there is no Coffee. DEPRESSO!\n"));
        list.add(new data (R.drawable .cool, "50% Savage. 50% Sweetness.\n"));
        list.add(new data (R.drawable .cool, "You can’t do epic shit with basic people.\n"));
        list.add(new data (R.drawable .cool, "I myself never feel that I’m sexy. If people call me cute, I am happier.\n"));
        list.add(new data (R.drawable .cool, "It is not how much we have, but how much we enjoy, that makes happiness.\n"));
        list.add(new data (R.drawable .cool, "The most important thing is to enjoy your life – to be happy – it’s all that matters.\n"));
        list.add(new data (R.drawable .cool,"Life is not a problem to be solved, but a reality to be experienced.\n"));
        list.add(new data (R.drawable .cool, "I love those who can smile in trouble, who can gather strength from distress, and grow brave by reflection. ‘Tis the business of little minds to shrink, but they whose heart is firm, and whose conscience approves their conduct, will pursue their principles unto death.\n"));
        list.add(new data (R.drawable .cool, "It had long since come to my attention that people of accomplishment rarely sat back and let things happen to them. They went out and happened to things.\n"));
        list.add(new data (R.drawable .cool, "Love can be unselfish, in the sense of being benevolent and generous, without being selfless.\n"));
        list.add(new data (R.drawable .cool,"When I feel a little down, I put on my favorite high heels and dance\n"));
        list.add(new data (R.drawable .cool, "Women drivers rev my engine.\n"));
        list.add(new data (R.drawable .cool, "Watch more sunsets than Netflix.\n"));
        list.add(new data (R.drawable .cool,"Hey, I just met you, this is crazy.\n"));
        list.add(new data (R.drawable .cool, "At least this balloon is attracted to me!\n"));
        list.add(new data (R.drawable .cool, "I must destroy you with hugs and kisses\n"));
        list.add(new data (R.drawable .cool, "Stop looking for happiness in the same place you just lost it.\n"));
        list.add(new data (R.drawable .cool, "Keep smiling because life is a beautiful thing and there’s so much to smile about.\n"));
        list.add(new data (R.drawable .cool, "No one is you. That’s your power!\n "));
        list.add(new data (R.drawable .cool, "Got my coffee and donut.\n"));
        list.add(new data (R.drawable .cool, "Escape the ordinary.\n"));
        list.add(new data (R.drawable .cool, "Proof that I can do selfies better than you\n"));
        list.add(new data (R.drawable .cool, "When your mom lectures you about how you need to lose weight for an hour and you’re like ‘shit I don’t care I have got a skinny mirror to make me look good’!\n"));
        list.add(new data (R.drawable .cool, "A friend will always make you Smile, especially when you don’t want to…\n"));
        list.add(new data (R.drawable .cool, "Life is like a balloon..If you never let go, you will not know how high can you rise.\n"));
        list.add(new data (R.drawable .cool, "Sometimes life can surprise you with a happy coincidence.\n"));
        list.add(new data (R.drawable .cool, "This is to the Echos of our laughter. The looks That we Share. The never-ending gossips. and the Sudden amazing getaways. This is to our Past And This is to Our Future. This is to our Friendship that will Never Fade.\n"));
        list.add(new data (R.drawable .cool, "Always classy, never trashy, and a little bit sassy.\n"));
        list.add(new data (R.drawable .cool, "With You, I forget all my problems. With You, Time Stands Still.\n"));
        list.add(new data (R.drawable .cool, "If you are Mine, You are Mine. I don’t like Sharing.\n"));
        list.add(new data (R.drawable .cool, "When I fell for you, I fell Hard\n"));
        list.add(new data (R.drawable .cool,"Good Times + Crazy Friends = Great Memories!\n"));
        list.add(new data (R.drawable .cool, "Sometimes, being with your bff is all the therapy you need!\n"));
        list.add(new data (R.drawable .cool, "I don’t need your approval to be me.\n"));
        list.add(new data (R.drawable .cool, "I was both loved and hated for being upfront. But I was just being myself.\n"));




        // list.add(new Data_show ( "" ));
    }
}
