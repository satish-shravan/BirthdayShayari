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

public class romantic extends AppCompatActivity {

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
        setContentView ( R.layout.activity_romantic );
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



        list.add(new data (R.drawable .romantic,"A flower cannot blossom without sunshine, and man cannot live without love."));
        list.add(new data (R.drawable .romantic, "I seem to have loved you in numberless forms, numberless times, in life after life, in age after age forever."));
        list.add(new data (R.drawable .romantic,"To be your friend was all I ever wanted; to be your lover was all I ever dreamed."));
        list.add(new data (R.drawable .romantic, "My love for you has no depth, its boundaries are ever-expanding."));
        list.add(new data (R.drawable .romantic, "I love you without knowing how, or when, or from where. I love you simply, without problems or pride."));
        list.add(new data (R.drawable .romantic, "I love you as one loves certain dark things, secretly, between the shadow and the soul."));
        list.add(new data (R.drawable .romantic, "If I had to choose between breathing and loving you I would use my last breath to tell you I love you."));
        list.add(new data (R.drawable .romantic, "You’re always the first and the last thing on this heart of mine. No matter where I go, or what I do, I’m thinking of you."));
        list.add(new data (R.drawable .romantic,"I don’t wanna close my eyes, I don’t wanna fall asleep, cuz I’d miss you babe and I don’t wanna miss a thing."));
        list.add(new data (R.drawable .romantic, "My love for you is past the mind, beyond my heart, and into my soul."));
        list.add(new data (R.drawable .romantic, "Each day I love you more, today more than yesterday and less than tomorrow."));
        list.add(new data (R.drawable .romantic, "In short I will part with anything for you, but you."));
        list.add(new data (R.drawable .romantic, "You’re nothing short of my everything."));
        list.add(new data (R.drawable .romantic,"My heart is and always will be yours."));
        list.add(new data (R.drawable .romantic, "Your love shines in my heart as sun that shines upon the earth."));
        list.add(new data (R.drawable .romantic, "Love understands love; it needs no talk."));
        list.add(new data (R.drawable .romantic,"Love brings to life whatever is dead around us."));
        list.add(new data (R.drawable .romantic, "In your smile I see something more beautiful than the stars."));
        list.add(new data (R.drawable .romantic, "You are my heart, my life, my entire existence."));
        list.add(new data (R.drawable .romantic, "It was a million tiny little things that, when you added them all up, they meant we were supposed to be together… and I knew it."));
        list.add(new data (R.drawable .romantic, "The best love is the kind that awakens the soul; that makes us reach for more, that plants the fire in our hearts and brings peace to our minds."));
        list.add(new data (R.drawable .romantic, "To love is nothing. To be loved is something. But to love and be loved, that’s everything"));
        list.add(new data (R.drawable .romantic, "I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow"));
        list.add(new data (R.drawable .romantic, "I would rather spend one lifetime with you, than face all the ages of this world alone."));
        list.add(new data (R.drawable .romantic,"I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more"));
        list.add(new data (R.drawable .romantic, "Whatever our souls are made of, his and mine are the same"));
        list.add(new data (R.drawable .romantic, "You know you’re in love when you can’t fall asleep because reality is finally better than your dreams"));
        list.add(new data (R.drawable .romantic, "We loved with a love that was more than love"));
        list.add(new data (R.drawable .romantic,"There is always some madness in love. But there is also always some reason in madness."));
        list.add(new data (R.drawable .romantic, "Love is friendship that has caught fire."));
        list.add(new data (R.drawable .romantic, "Sometimes the heart sees what is invisible to the eye."));
        list.add(new data (R.drawable .romantic, "Let us always meet each other with smile, for the smile is the beginning of love."));
        list.add(new data (R.drawable .romantic, "Immature love says: ‘I love you because I need you.’ Mature love says ‘I need you because I love you."));
        list.add(new data (R.drawable .romantic, "The best thing to hold onto in life is each other."));
        list.add(new data (R.drawable .romantic, "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage."));
        list.add(new data (R.drawable .romantic, "To love and be loved is to feel the sun from both sides."));
        list.add(new data (R.drawable .romantic, "Where there is love there is life."));
        list.add(new data (R.drawable .romantic, "Love doesn’t make the world go ’round. Love is what makes the ride worthwhile."));
        list.add(new data (R.drawable .romantic, "As soon go kindle fire with snow, as seek to quench the fire of love with words"));
        list.add(new data (R.drawable .romantic, "If you wish to be loved, show more of your faults than your virtues."));
        list.add(new data (R.drawable .romantic, "A kiss is a lovely trick designed by nature to stop speech when words become superfluous."));
        list.add(new data (R.drawable .romantic,"Love is an irresistible desire to be irresistibly desired"));
        list.add(new data (R.drawable .romantic, "Love is the wisdom of the fool and the folly of the wise"));
        list.add(new data (R.drawable .romantic, "He’s more myself than I am."));
        list.add(new data (R.drawable .romantic, "The most powerful weapon on earth is the human soul on fire"));
        list.add(new data (R.drawable .romantic, "Love is when he gives you a piece of your soul, that you never knew was missing"));
        list.add(new data (R.drawable .romantic, "I love that feeling of being in love, the effect of having butterflies when you wake up in the morning. That is special."));
        list.add(new data (R.drawable .romantic, "Love is the flower you’ve got to let grow."));
        list.add(new data (R.drawable .romantic, "The hunger for love is much more difficult to remove than the hunger for bread."));
        list.add(new data (R.drawable .romantic,"A woman knows the face of the man she loves as a sailor knows the open sea."));
        list.add(new data (R.drawable .romantic,"Love knows not distance; it hath no continent; its eyes are for the stars."));
        list.add(new data (R.drawable .romantic, "Love does not begin and end the way we seem to think it does. Love is a battle, love is a war; love is a growing up."));
        list.add(new data (R.drawable .romantic,"There is no remedy for love but to love more."));
        list.add(new data (R.drawable .romantic, "The art of love is largely the art of persistence"));
        list.add(new data (R.drawable .romantic, "If you find someone you love in your life, then hang on to that love."));





        // list.add(new Data_show ( "" ));
    }
}
