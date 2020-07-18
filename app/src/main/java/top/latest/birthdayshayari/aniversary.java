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

public class aniversary extends AppCompatActivity {

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
        setContentView ( R.layout.activity_aniversary );

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

        list.add(new data (R.drawable .anniversary,"Our anniversary is just a momentary celebration, but our marriage is a timeless one."));

        list.add(new data (R.drawable .anniversary, "You are the finest, loveliest, tenderest, and most beautiful person I have ever known and even that is an understatement."));
        list.add(new data (R.drawable .anniversary, "For it was not into my ear you whispered, but into my heart. It was not my lips you kissed, but my soul"));
        list.add(new data (R.drawable .anniversary,"I wish there was a word more than ‘love’ itself to convey what I feel for you."));
        list.add(new data (R.drawable .anniversary, "The minute I heard my first love story I started looking for you, not knowing how blind that was. Lovers don’t finally meet somewhere. They’re in each other all along."));
        list.add(new data (R.drawable .anniversary, "orever is a measure of time used by people who share an ordinary love. Our extraordinary love is immeasurable ... for us, forever just won’t do."));
        list.add(new data (R.drawable .anniversary,"Happy Anniversary to the person I want beside me every night for the rest of forever."));

        list.add(new data (R.drawable .anniversary, "Being with you under the same roof is the happiest period of my life"));
        list.add(new data (R.drawable .anniversary,"We are two souls with a single mission."));
        list.add(new data (R.drawable .anniversary, "It’s the day I was married to the sweetest, most beautiful person in the world."));
        list.add(new data (R.drawable .anniversary, "Yes, it was love at first sight. I feel that after all these years, I have finally found my soul mate."));
        list.add(new data (R.drawable .anniversary, "Grow old with me; the best is yet to be."));
        list.add(new data (R.drawable .anniversary,"You don’t need to promise me the moon and the stars. Just promise me you will stand under them with me forever."));
        list.add(new data (R.drawable .anniversary, "He makes me melt like a popsicle on the Fourth of July"));
        list.add(new data (R.drawable .anniversary, "You were made perfectly to be loved – and surely I have loved you, in the idea of you, my whole life long."));
        list.add(new data (R.drawable .anniversary, "Because of you, I laugh a little harder, cry a little less, and smile a lot more."));
        list.add(new data (R.drawable .anniversary,"And in the middle of my chaos, there was you!"));
        list.add(new data (R.drawable .anniversary, "As we grow older together, As we continue to change with age, There is one thing that will never change… I will always keep falling in love with you."));
        list.add(new data (R.drawable .anniversary, "I knew I loved you when ‘home’ suddenly went from a place to a person."));
        list.add(new data (R.drawable .anniversary,"Thank you for staying even if you had reason to leave. Thank you for making it easier when life gets hard."));
        list.add(new data (R.drawable .anniversary, "We’re gonna have to work at this every day, but I want to do that because I want you"));
        list.add(new data (R.drawable .anniversary, "For the two of us, home isn’t a place. It is a person. And we are finally home."));
        list.add(new data (R.drawable .anniversary, "When I first met you, I honestly didn’t know you were gonna be this important to me."));
        list.add(new data (R.drawable .anniversary, "I just want you to know, that when I picture myself happy, it’s with you"));
        list.add(new data (R.drawable .anniversary, "I never want to stop making memories with you."));
        list.add(new data (R.drawable .anniversary, "In you, I’ve found the love of my life and my closest, truest friend."));
        list.add(new data (R.drawable .anniversary, "The best thing to hold onto in life is each other."));
        list.add(new data (R.drawable .anniversary, "I’m one lucky wife in this world who is blessed with such a loving and responsible husband."));
        list.add(new data (R.drawable .anniversary, "Love grows more tremendously full, swift, poignant, as the years, multiply."));
        list.add(new data (R.drawable .anniversary, "I’m thankful to God for sending you in my life. I’m thankful to you for holding my hands forever. Forever sounds nice next to you.swear I couldn’t love you more than I do right now, and yet I know I will tomorrow."));
        list.add(new data (R.drawable .anniversary, "No matter how much time goes by I’ll never forget the first time you looked at me and how I fell in love."));
        list.add(new data (R.drawable .anniversary, "He had beautiful eyes, the kind you could get lost in, and I guess I did."));
        list.add(new data (R.drawable .anniversary,"Because of you, I laugh a little harder, cry a little less, and smile a lot more"));
        list.add(new data (R.drawable .anniversary, "You know you are in love when you don’t want to fall asleep because reality is finally better than your dreams."));
        list.add(new data (R.drawable .anniversary, "Forever is a long time, but I wouldn’t mind spending it by your side"));
        list.add(new data (R.drawable .anniversary, "The secret of a happy marriage is finding the right person. You know they’re right if you love to be with them all the time."));
        list.add(new data (R.drawable .anniversary, "A successful marriage requires falling in love many times, always with the same person."));
        list.add(new data (R.drawable .anniversary, "Love grows more tremendously full, swift, poignant, as the years multiply."));
        list.add(new data (R.drawable .anniversary, "I'm in love with you, and I'm not in the business of denying myself the simple pleasure of saying true things."));
        list.add(new data (R.drawable .anniversary, "I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more."));
        list.add(new data (R.drawable .anniversary,"Marriage is not just spiritual communion, it is also remembering to take out the trash."));
        list.add(new data (R.drawable .anniversary, "It's so great to find that one special person you want to annoy for the rest of your life."));
        list.add(new data (R.drawable .anniversary, "A wedding band is the smallest handcuff ever made, I’m glad I chose my cellmate wisely."));
        list.add(new data (R.drawable .anniversary, "A marriage anniversary is the celebration of love, trust, partnership, tolerance and tenacity. The order varies for any given year."));
        list.add(new data (R.drawable .anniversary, "For marriage to be a success, every woman and every man should have her and his own bathroom. The end."));
        list.add(new data (R.drawable .anniversary, "Life is a journey, and love is what makes that journey worthwhile."));
        list.add(new data (R.drawable .anniversary, "I love you - I am at rest with you - I have come home."));
        list.add(new data (R.drawable .anniversary, "There is no more lovely, friendly and charming relationship, communion or company than a good marriage."));
        list.add(new data (R.drawable .anniversary, "Chains do not hold a marriage together. It is threads, hundreds of tiny threads, which sew people together through the years."));
        list.add(new data (R.drawable .anniversary, "The couples that are ‘meant to be’ are the ones who go through everything that is meant to tear them apart and come out even stronger than they were before.\" Unknown"));
        list.add(new data (R.drawable .anniversary, "I love you, and I will love you until I die, and if there's a life after that, I'll love you then."));
        list.add(new data (R.drawable .anniversary, "I never loved you any more than I do, right this second. And I’ll never love you any less than I do, right this second."));
        list.add(new data (R.drawable .anniversary,"Better than I was, more than I am. And all this happened by taking your hand."));
        list.add(new data (R.drawable .anniversary, "Meeting you was fate, becoming your friend was a choice, but falling in love with you I had no control over."));






        // list.add(new Data_show ( "" ));
    }
}
