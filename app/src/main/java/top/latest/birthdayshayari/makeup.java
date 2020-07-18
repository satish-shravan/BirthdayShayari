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

public class makeup extends AppCompatActivity {


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
        setContentView ( R.layout.activity_makeup );

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



        list.add(new data (R.drawable .makeup, "Me and My group of friends are the funniest humans I know."));
        list.add(new data (R.drawable .makeup, "Friends are recipe to life."));
        list.add(new data (R.drawable .makeup, "Friends make life memorable."));
        list.add(new data (R.drawable .makeup, "Memories keep a song in your heart. Memories keep a song in your heart."));
        list.add(new data (R.drawable .makeup, "F.R.I.E.N.D.S Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you.\n"));
        list.add(new data (R.drawable .makeup, "Best friends are meant to last forever."));
        list.add(new data (R.drawable .makeup, "We’re like the super friends. We’re a highly animated group."));
        list.add(new data (R.drawable .makeup, "Friendship is the only cement that will ever hold the world together."));
        list.add(new data (R.drawable .makeup, "A day spent with friends is always a day well spent"));
        list.add(new data (R.drawable .makeup, "WELCOME..Enter as guest and leave as friends.\n"));
        list.add(new data (R.drawable .makeup,"It’s the friends we meet along the way that help us appreciate the journey.\n"));
        list.add(new data (R.drawable .makeup,"Friends buy you a lunch. Best friends eat your lunch.\n"));
        list.add(new data (R.drawable .makeup,"Thank you for making me laugh.\n"));
        list.add(new data (R.drawable .makeup, "I Love The Nights I Can’t Remember With The Friends I’ll Never Forget.\n"));
        list.add(new data (R.drawable .makeup, "No man is a failure who has friends.\n"));
        list.add(new data (R.drawable .makeup, "I don’t know what’s tighter, our jeans or our friendship.\n"));
        list.add(new data (R.drawable .makeup, "I and my best friends can communicate just with…face expressions.\n"));
        list.add(new data (R.drawable .makeup,"Forever and Always.\n"));
        list.add(new data (R.drawable .makeup, "When a group of best friends meet..the humor is higher than comedy show.\n"));
        list.add(new data (R.drawable .makeup, "Do you remember the times we had? Let’s bring it back.\n"));
        list.add(new data (R.drawable .makeup, "We take photos as a return ticket to a moment otherwise gone.\n"));
        list.add(new data (R.drawable .makeup, "Best friends are the people you can do anything and nothing with and still have the best time.\n"));
        list.add(new data (R.drawable .makeup,"Truly great friends are hard to find, difficult to leave and impossible to forget.\n"));
        list.add(new data (R.drawable .makeup,"Years from now, I hope we are still in each other’s lives.\n"));
        list.add(new data (R.drawable .makeup,"Nobody really likes us except for us.\n"));
        list.add(new data (R.drawable .makeup, "True friends don’t judge each other. They judge other people..Together!\n"));
        list.add(new data (R.drawable .makeup, "I’m one of the girls that you would love to have in your group of friends.\n"));
        list.add(new data (R.drawable .makeup, "Love me now, hate me never, and best friends forever.\n"));
        list.add(new data (R.drawable .makeup, "One friend can change your whole life.\n"));
        list.add(new data (R.drawable .makeup, "Friendship isn’t a big thing it’s a million little things.\n"));
        list.add(new data (R.drawable .makeup,"True friendship is not being inseparable, it’s being separated and nothing changes.\n"));
        list.add(new data (R.drawable .makeup, "A sweet friendship refreshes the soul.\n"));
        list.add(new data (R.drawable .makeup, "A good friend knows all your stories. A best friend helped you write them.\n"));
        list.add(new data (R.drawable .makeup, "Life was meant for Best Friends and Good Adventures.\n"));
        list.add(new data (R.drawable .makeup,"I would rather walk with a friend in the dark, than alone in the light.\n"));
        list.add(new data (R.drawable .makeup, "Best Friends make good times better and hard times easier.\n"));
        list.add(new data (R.drawable .makeup, "With You, I forget all my problems. With You, Time Stands Still.\n"));
        list.add(new data (R.drawable .makeup, "A friend will always make you Smile, especially when you don’t want to..\n"));
        list.add(new data (R.drawable .makeup, "If you never had friends..you never lived life.\n"));
        list.add(new data (R.drawable .makeup,"Sometimes being with your best friend is all the therapy you need.\n"));
        list.add(new data (R.drawable .makeup, "Good friends are hard to find, harder to leave & impossible to forget.\n"));
        list.add(new data (R.drawable .makeup, "Friends are God’s way of looking after us.\n"));
        list.add(new data (R.drawable .makeup,"The only way to have a best friend is to be one.\n"));
        list.add(new data (R.drawable .makeup, "FRIENDS are the most important ingredient in the recipe of life.\n"));
        list.add(new data (R.drawable .makeup, "Side by side or miles apart, real friends are always close to the heart.\n"));
        list.add(new data (R.drawable .makeup, "Hard times will always reveal true friends.\n"));
        list.add(new data (R.drawable .makeup, "Besides chocolate, my friends are my favorite.\n"));
        list.add(new data (R.drawable .makeup, "Good friends show their love in times of trouble, not just in times of happiness.\n"));
        list.add(new data (R.drawable .makeup, "Friendship is a knot tied by angels hands.\n"));
        list.add(new data (R.drawable .makeup, "The road to a friend’s home is never long.\n"));
        list.add(new data (R.drawable .makeup, "No man is a failure who has group of friends.\n"));




        // list.add(new Data_show ( "" ));
    }
}
