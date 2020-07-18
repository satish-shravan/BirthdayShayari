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

public class beard extends AppCompatActivity {


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
        setContentView ( R.layout.activity_beard );


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

        list.add(new data (R.drawable .beard,"\"Growing a beard is a habit most natural, scriptural, manly and beneficial.\\n\""));

        list.add(new data (R.drawable .beard, "With great Beard comes great responsibility!"));
        list.add(new data (R.drawable .beard, "If your dad doesn’t have a beard, you’ve got two Mums.\n"));
        list.add(new data (R.drawable .beard,"A man without beard is like lion without mane.\n"));
        list.add(new data (R.drawable .beard, "It’s not a beard, I’ve trained to sit very still.\n"));
        String str4 = "A beard is a gift you give your face.\n";
        list.add(new data (R.drawable .beard, str4));
        list.add(new data (R.drawable .beard, "When a bearded man is around I can’t keep Calm.\n"));
        list.add(new data (R.drawable .beard, "I don’t have many hobbies, but my beard collects bras.\n"));
        list.add(new data (R.drawable .beard, "Man who have beard look Beardsome…!\n"));
        String str5 = "Any man can start a beard… A true man never finishes one.\n";
        list.add(new data (R.drawable .beard, str5));
        list.add(new data (R.drawable .beard, "The world is full of boys, be a man of beard.\n"));
        list.add(new data (R.drawable .beard, "Love your beard.. it will love u back.\n"));
        list.add(new data (R.drawable .beard, "He who sacrifices his beard for a woman deserves neither.\n"));
        list.add(new data (R.drawable .beard, "I don’t work out much But my beard lifts skirts.\n"));
        String str6 = "Guys wear a suit to look important, I grew a beard.\n";
        list.add(new data (R.drawable .beard, str6));
        list.add(new data (R.drawable .beard, "Beard under construction.\n"));
        list.add(new data (R.drawable .beard,"Shave off your beard and wear a dress you would be a great female impersonator\n"));
        list.add(new data (R.drawable .beard, "The beard tells the world that you spend more time.. in Morning Prayer than morning primping.\n"));
        list.add(new data (R.drawable .beard, "Our character tells the world you are a real man.. Your beard is mostly the exclamation point.\n"));
        list.add(new data (R.drawable .beard, "The beard signifies the courageous. The beard distinguishes… the grown men. The earnest. The active. The vigorous.\n"));
        list.add(new data (R.drawable .beard, "Beards makes a Guy Hotter.\n"));
        String str7 = "Don’t be jealous, it’s my beard!\n";
        list.add(new data (R.drawable .beard, str7));
        list.add(new data (R.drawable .beard, "True Love story is like a beard of men. It never ends, it only grows..!!\n"));
        list.add(new data (R.drawable .beard, "What are you so defensive? I’m not saying your clean shaven face makes you less of a man. You just look like less of a man.\n"));
        list.add(new data (R.drawable .beard,"Kissing a man with a beard is a lot like going to a picnic… You don’t mind going through a little brush to get there.\n"));
        list.add(new data (R.drawable .beard, "Sometimes I think about shaving, but then I think, ‘NAH. I like my legs the way they are’.\n"));
        list.add(new data (R.drawable .beard, "The beard isn’t novel, it’s natural. But your continued efforts to maintain a boyish look by shaving your face, is truly a peculiar habit.\n"));
        list.add(new data (R.drawable .beard, "A man who can grow a beard is the kind of man you want to be with because a man who has patience to grow a beard has the patience to deal with your shit.\n"));
        list.add(new data (R.drawable .beard, "The Men without Beard is like a Lion without hair.!!\n"));
        list.add(new data (R.drawable .beard, "I totally understand. A beard would not compliment the feminine look you’re going for. KEEP SHAVING.\n"));
        list.add(new data (R.drawable .beard, str4));
        list.add(new data (R.drawable .beard, "A man without beard is like lion without mane\n"));
        list.add(new data (R.drawable .beard, "Everytime a Man shaves, an Angel looses it’s wings.\n"));
        list.add(new data (R.drawable .beard, "Some fathers teach their sons to shave.. others teach them to be men.\n"));
        list.add(new data (R.drawable .beard, "Man without a Beard is like a cup of a Tea without sugar\n"));
        list.add(new data (R.drawable .beard, "The only reason to shave your beard is the joy of growing it again.\n"));
        list.add(new data (R.drawable .beard, str5));
        list.add(new data (R.drawable .beard, str6));
        list.add(new data (R.drawable .beard, "Extremely Busy with my Beard.\n"));
        list.add(new data (R.drawable .beard, str7));
        list.add(new data (R.drawable .beard, "Keep calm and grow longgg beard.\n"));
        list.add(new data (R.drawable .beard, "Beard guy,” Excuse me miss…My eyes are up here.”\n"));
        list.add(new data (R.drawable .beard, "I know you are looking at my beard.\n"));
        list.add(new data (R.drawable .beard, "You call it facial hair, I call it awesomeness escaping through my face.\n"));
        list.add(new data (R.drawable .beard, "Men don’t cry, they water their beard !\n"));
        list.add(new data (R.drawable .beard,"Time is measured in days, weeks and beards.\n"));
        list.add(new data (R.drawable .beard, "If u don’t like my beard…..then leave me baby.\n"));
        list.add(new data (R.drawable .beard, "I grew my beard out a little bit just to show that, indeed, I am a man.\n"));
        list.add(new data (R.drawable .beard, "I’m Sorry; I can’t hear you over my awesome beard.\n"));
        list.add(new data (R.drawable .beard, "Beard makes ugly men handsome since the beginning of time.\n"));
        list.add(new data (R.drawable .beard, "You don’t know the power of the beard.\n"));
        list.add(new data (R.drawable .beard, "A decent moustache can intimidate a man, while a great moustache can frighten an army."));
        list.add(new data (R.drawable .beard, "Not for a moment, beautiful aged Walt Whitman, have I failed to see your beard full of butterflies"));
        list.add(new data (R.drawable .beard, "You know what I like about a beard? You can always look contemplative"));
        list.add(new data (R.drawable .beard,"If you want to grow a beard like mine, the only thing I can tell you is that you have to have patience. You just have to let it grow. "));
        list.add(new data (R.drawable .beard, "t’s good to have beardless friends. When you go out, people will assume you are their leader"));






        // list.add(new Data_show ( "" ));
    }
}
