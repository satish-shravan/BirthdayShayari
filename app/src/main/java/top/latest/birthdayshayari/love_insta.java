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

public class love_insta extends AppCompatActivity {

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
        setContentView ( R.layout.activity_love_insta );

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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId () == android.R.id.home)
        {
            finish ();
            return  true;
        }
        return super.onOptionsItemSelected ( item );
    }



    private void linearList()
    {



        list.add(new data (R.drawable .love, "I have never felt love before I met you and now I do not know what to do without you here."));
        list.add(new data (R.drawable .love, "Stay beside me until the end of time and let us prove to the world that true love still exists."));
        list.add(new data (R.drawable .love, "If you tell me you love me, I will do the same and I will show you just how much my love is."));
        list.add(new data (R.drawable .love, "What is the best measure of love but to withstand the test of time that no one else had done?"));
        list.add(new data (R.drawable .love, "Love truly makes a fool even out of the smartest people in the world, love is their weakness.\n\n"));
        list.add(new data (R.drawable .love, "I love you so much that I am willing to sacrifice all that I have if it means you will be happy.\n\n"));
        list.add(new data (R.drawable .love, "Love truly makes a fool even out of the smartest people in the world, love is their weakness."));
        list.add(new data (R.drawable .love,"I love you so much that I am willing to sacrifice all that I have if it means you will be happy."));
        list.add(new data (R.drawable .love, "No matter what happens, I will be here for you until the end of it, that is how much I love you."));
        list.add(new data (R.drawable .love, "I can always love another but I can’t give the same love I give to the one I truly love. Just like the old saying, true love comes once in a lifetime."));
        list.add(new data (R.drawable .love, "Wait for a kind of love that will surely last. Love that is pure and real. But take note that it is not easy to find. Only those who persevere will receive it."));
        list.add(new data (R.drawable .love, "Past love teaches us many life lessons. It is designed to make us stronger and smart in the future. Learn to become better and even lovable this time by using not only your heart but also your mind."));
        list.add(new data (R.drawable .love, "Young love sometimes ends up in parting ways. Why? Because it takes two mature people to build a strong foundation. If one lacks understanding about what real love is, then it will end up in a failed relationship."));
        list.add(new data (R.drawable .love, "Every love story does not have the same ending. Some are happy, some are not. It just a matter of time to find the right person for you. Never give up on chasing your own happy ending."));
        list.add(new data (R.drawable .love, "No one in this world can ever escape the power of love, it is so powerful that it affects all."));
        list.add(new data (R.drawable .love, "Love means defying all the obstacles and taking all the risks just to be with one person."));
        list.add(new data (R.drawable .love, "Sometimes, the only thing that keeps a marriage together is the love between two people."));
        list.add(new data (R.drawable .love,  "Even when the world tells me it is wrong to love you, I will, because that is what I mean when I told you that I will love you until the very end."));
        list.add(new data (R.drawable .love, "I think that when you tell a person you love her, you are giving her the chance to break you."));
        list.add(new data (R.drawable .love,  "Truly, love is the most dangerous thing in this world, it breaks people and it crushes them."));
        list.add(new data (R.drawable .love,  "I believe the saying that too much love can kill because love is a playful emotion, indeed."));
        list.add(new data (R.drawable .love, "There is no better proof of love than standing in front of someone and showing your soul."));
        list.add(new data (R.drawable .love, "Love will defy all odds if it is true, it will withstand all the test and it will survive it for sure."));
        list.add(new data (R.drawable .love, "When love is young, it is so sweet and fresh but when it grows old, it grows bitter as well."));
        list.add(new data (R.drawable .love, "You need to make sure that the person you will marry is the person that you truly love."));
        list.add(new data (R.drawable .love, "When you find that person you do not get tired of seeing every day, think about marrying her."));
        list.add(new data (R.drawable .love, "Love is one of theWhen someone’s smile warms your heart, it may be because that you love that person. best things to have in this world; it will keep you happy without reason."));
        list.add(new data (R.drawable .love, "The best time to fall in love with someone is now; tell him what you feel even if you get Hurt."));
        list.add(new data (R.drawable .love, "Getting Hurt is part of the process of loving someone, happiness always come with a price."));
        list.add(new data (R.drawable .love, "I think that love may be one of the few things that keep the world spinning around its axis."));
        list.add(new data (R.drawable .love, "The Lord’s love is so great that He was willing to give us everything if only we ask Him."));
        list.add(new data (R.drawable .love,"Love makes people believe again and have faith in something that are invisible to the eyes."));
        list.add(new data (R.drawable .love, "I think that a person who can be faithful to the Lord will be a good lover, loyal and faithful."));
        list.add(new data (R.drawable .love,"Indeed, one of the best things in this world is to be loved by someone that you love as well."));
        list.add(new data (R.drawable .love, "No person is too old or too young to fall in love, for anyone has the right to feel that way."));
        list.add(new data (R.drawable .love, "You would never know what real pain is until the day you finally fall in love with a boy."));
        list.add(new data (R.drawable .love, "When you fall in love, you will finally be able to relate to all those stupid love quotes."));
        list.add(new data (R.drawable .love, "Dear girl, I hope that one day, when you fall in love, you do not give all that you have."));
        list.add(new data (R.drawable .love, "One day, when you are old enough to be in love, you will experience how delightful it is."));
        list.add(new data (R.drawable .love, "You can tell obviously if your friend is in love. Just listen to every story she has, it is all about the same person."));
        list.add(new data (R.drawable .love, "If there’s someone I cannot live without, that would be you. My heart belongs to you and yours to mine. I would die without you."));
        list.add(new data (R.drawable .love, "Love enables us to forgive. No matter how big the sin he has for you, if you love that person you will choose to forgive. Why? Because real love doesn’t keep records of wrong."));
        list.add(new data (R.drawable .love, "Love gives us many chances. If other relationship failed, then try another one. Keep trying until you find the right one"));
        list.add(new data (R.drawable .love, "The moment you fall for someone, everything that you are is no longer yours."));
        list.add(new data (R.drawable .love, "I hate the fact that people change when they fall in love with someone, they become selfish."));
        list.add(new data (R.drawable .love, "Finally, you fell for someone but sadly, he is not the one meant for you and that is sad."));






        // list.add(new Data_show ( "" ));
    }
}
