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

public class life extends AppCompatActivity {


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
        setContentView ( R.layout.activity_life );

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




        list.add(new data (R.drawable .life, "Love yourself first and everything else falls into line. You really have to love yourself to get anything done in this world"));
        list.add(new data (R.drawable .life, "The most important thing in life is to learn how to give out love, and to let it come in."));
        list.add(new data (R.drawable .life, "I love you not because of who you are, but because of who I am when I am with you."));
        list.add(new data (R.drawable .life,"If I know what love is, it is because of you."));
        list.add(new data (R.drawable .life, "Love is a friendship set to music"));
        list.add(new data (R.drawable .life, "We are shaped and fashioned by what we love."));
        list.add(new data (R.drawable .life, "When we are in love we seem to ourselves quite different from what we were before."));
        list.add(new data (R.drawable .life, "The way to love anything is to realize that it may be lost."));
        list.add(new data (R.drawable .life, "Don’t brood. Get on with living and loving. You don’t have forever."));
        list.add(new data (R.drawable .life, "Your task is not to seek for love, but merely to seek and find all the barriers within yourself that you have built against it."));
        list.add(new data (R.drawable .life, "Love is of all passions the strongest, for it attacks simultaneously the head, the heart and the senses."));
        list.add(new data (R.drawable .life, "You know it’s love when all you want is that person to be happy, even if you’re not part of their happiness"));
        list.add(new data (R.drawable .life, "At the touch of love everyone becomes a poet."));
        list.add(new data (R.drawable .life, "If I had a flower for every time I thought of you… I could walk through my garden forever."));
        list.add(new data (R.drawable .life, "The best and most beautiful things in this world cannot be seen or even heard, but must be felt with the heart."));
        list.add(new data (R.drawable .life, "Keep love in your heart. A life without it is like a sunless garden when the flowers are dead."));
        list.add(new data (R.drawable .life, "The only thing we never get enough of is love; and the only thing we never give enough of is love."));
        list.add(new data (R.drawable .life,"If you would be loved, love, and be loveable."));
        list.add(new data (R.drawable .life, "Love does not dominate; it cultivates."));
        list.add(new data (R.drawable .life, "I have decided to stick with love. Hate is too great a burden to bear."));
        list.add(new data (R.drawable .life, "We are most alive when we’re in love."));
        list.add(new data (R.drawable .life, "The love we give away is the only love we keep."));
        list.add(new data (R.drawable .life, "The giving of love is an education in itself."));
        list.add(new data (R.drawable .life, "The more one judges, the less one loves."));
        list.add(new data (R.drawable .life, "A kiss is a lovely trick designed by nature to stop speech when words become superfluous."));
        list.add(new data (R.drawable .life, "Being deeply loved by someone gives you strength, while loving someone deeply gives you courage."));
        list.add(new data (R.drawable .life, "Every person has to love at least one bad partner in their lives to be truly thankful for the right one."));
        list.add(new data (R.drawable .life, "Love is what you’ve been through with somebody."));
        list.add(new data (R.drawable .life, "The best proof of love is trust."));
        list.add(new data (R.drawable .life, "For small creatures such as we the vastness is bearable only through love."));
        list.add(new data (R.drawable .life, "Fortune and love favor the brave."));
        list.add(new data (R.drawable .life, "Love is not only something you feel, it is something you do"));
        list.add(new data (R.drawable .life, "Loving people live in a loving world. Hostile people live in a hostile world. Same world."));
        list.add(new data (R.drawable .life, "Very little is needed to make a happy life; it is all within yourself, in your way of thinking."));
        list.add(new data (R.drawable .life,"Believe that life is worth living and your belief will help create the fact."));
        String str2 = "I think being in love with life is a key to eternal youth.";
        list.add(new data (R.drawable .life, str2));
        list.add(new data (R.drawable .life, "Find ecstasy in life; the mere sense of living is joy enough."));
        list.add(new data (R.drawable .life, "There is only one happiness in this life, to love and be loved."));
        list.add(new data (R.drawable .life, "Because of your smile, you make life more beautiful"));
        list.add(new data (R.drawable .life,"The biggest adventure you can take is to live the life of your dreams."));
        list.add(new data (R.drawable .life, "For every minute you are angry you lose sixty seconds of happiness."));
        list.add(new data (R.drawable .life,"Folks are usually about as happy as they make their minds up to be."));
        list.add(new data (R.drawable .life,"When one door of happiness closes, another opens; but often we look so long at the closed door that we do not see the one which has been opened for us."));
        list.add(new data (R.drawable .life, "Challenges are what make life interesting and overcoming them is what makes life meaningful."));
        list.add(new data (R.drawable .life, "Remember that the happiest people are not those getting more, but those giving more."));
        list.add(new data (R.drawable .life, "To live is the rarest thing in the world. Most people exist, that is all."));
        list.add(new data (R.drawable .life, "The trick in life is learning how to deal with it."));
        list.add(new data (R.drawable .life, "Life is 10% what happens to you and 90% how you react to it."));
        list.add(new data (R.drawable .life, "You know you’re in love when you can’t fall asleep because reality is finally better than your dreams."));
        list.add(new data (R.drawable .life, "Life can only be understood backwards; but it must be lived forwards."));
        list.add(new data (R.drawable .life, "Life is really simple, but we insist on making it complicated."));
        list.add(new data (R.drawable .life, str2));
        list.add(new data (R.drawable .life, "A man who dares to waste one hour of time has not discovered the value of life."));
        list.add(new data (R.drawable .life, "One day your life will flash before your eyes. Make sure it’s worth watching."));
        list.add(new data (R.drawable .life, "Accept responsibility for your life. Know that it is you who will get you where you want to go, no one else."));
        list.add(new data (R.drawable .life, "When I hear somebody sigh, ‘Life is hard,’ I am always tempted to ask, ‘Compared to what?’"));




        // list.add(new Data_show ( "" ));
    }
}
