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

public class shopping extends AppCompatActivity {


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
        setContentView ( R.layout.activity_shopping );

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





        list.add(new data (R.drawable .shopping, "Whoever said that money can’t buy happiness simply didn’t know where to go shopping."));
        list.add(new data (R.drawable .shopping, "Shopping is my cardio."));
        list.add(new data (R.drawable .shopping, "Treat yo’ self"));
        list.add(new data (R.drawable .shopping, "Happiness is not in money, but in shopping."));
        list.add(new data (R.drawable .shopping, "I always say shopping is cheaper than a psychiatrist."));
        list.add(new data (R.drawable .shopping, "Shopping is better than sex. If you’re not satisfied after shopping, you can make an exchange for something you really like."));
        list.add(new data (R.drawable .shopping,"Anyone who lives within their means suffers from a lack of imagination"));
        list.add(new data (R.drawable .shopping, "I love shopping. There is a little bit of magic found in buying something new. It is instant gratification, a quick fix."));
        list.add(new data (R.drawable .shopping, "Buy what you don’t have yet or what you really want, which can be mixed with what you already own. Buy only because something excites you, not just for the simple act of shopping."));
        list.add(new data (R.drawable .shopping, "Once again, we come to the Holiday Season, a deeply religious time that each of us observes, in his own way, by going to the mall of his choice."));
        list.add(new data (R.drawable .shopping, "I shop, therefore I am."));
        list.add(new data (R.drawable .shopping, "You can always find something you want."));
        list.add(new data (R.drawable .shopping, "Style Strategy is about shopping smart, staying chic, and making it all last. It’s about showing women how to shop for value without compromising style."));
        list.add(new data (R.drawable .shopping, "A bargain ain't a bargain unless it's something you need."));
        list.add(new data (R.drawable .shopping, "I rationalize shop. I buy a dress because I need change for gum"));
        list.add(new data (R.drawable .shopping, "I love vintage shopping, I think it's really fun. And I love the feeling of finding the most amazing piece for less."));
        list.add(new data (R.drawable .shopping, "I hate last-minute shopping, it's always unsuccessful."));
        list.add(new data (R.drawable .shopping, "The odds of going to the store for a loaf of bread and coming out with only a loaf of bread are three billion to one."));
        list.add(new data (R.drawable .shopping, "I could lie and pretend that I hunt and camp, but that wouldn’t be me. Clothes? Shopping? That’s stuff I like!"));
        list.add(new data (R.drawable .shopping, "When women are depressed, they eat or go shopping. Men invade another country. It’s a whole different way of thinking."));
        list.add(new data (R.drawable .shopping, "The quickest way to know a woman is to go shopping with her."));
        list.add(new data (R.drawable .shopping, "Recreational shopping is the shortest distance between two points: you and broke. "));
        list.add(new data (R.drawable .shopping, "We used to build civilizations. Now we build shopping malls."));
        list.add(new data (R.drawable .shopping, "I went to a general store but they wouldn't let me buy anything specific."));
        list.add(new data (R.drawable .shopping,"Whoever said money can't buy happiness simply didn't know where to go shopping."));
        list.add(new data (R.drawable .shopping, "I don't shop because I need something, I just shop for shopping's sake."));
        list.add(new data (R.drawable .shopping, "Women usually love what they buy, yet hate two-thirds of what is in their closets."));
        list.add(new data (R.drawable .shopping, "I'm shopping around for something to do that no one will like"));
        list.add(new data (R.drawable .shopping, "Always be polite to possible murderers: that was the twenty-four-hour-shopping philosophy.   "));
        list.add(new data (R.drawable .shopping, "I love shopping. There is a little bit of magic found in buying something new. It is instant gratification, a quick fix"));
        list.add(new data (R.drawable .shopping, "Only one shopping day left 'til tomorrow"));
        list.add(new data (R.drawable .shopping, "It's shop o'clock somewhere!"));
        list.add(new data (R.drawable .shopping,"Nothing haunts us like the things we didn't buy."));
        list.add(new data (R.drawable .shopping, "It's an \"add to cart\" kind of day!"));
        list.add(new data (R.drawable .shopping, "Shortest horror story every told: sold out."));
        list.add(new data (R.drawable .shopping, "Life is too short to wear boring clothes"));
        list.add(new data (R.drawable .shopping, "I wish retail therapy was covered by my health insurance."));
        list.add(new data (R.drawable .shopping, "Buy now or cry later."));
        list.add(new data (R.drawable .shopping, "Me, every morning: I really need some new clothes."));
        list.add(new data (R.drawable .shopping, "Shopping is always a good idea."));
        list.add(new data (R.drawable .shopping, "Life is short. Buy the dress."));
        list.add(new data (R.drawable .shopping, "I could give up shopping, but I'm not quitter."));
        list.add(new data (R.drawable .shopping, "Work hard so you can shop harder."));
        list.add(new data (R.drawable .shopping, "Born to shop. Forced to work."));
        list.add(new data (R.drawable .shopping, "Just let me shop and no one gets Hurt."));
        list.add(new data (R.drawable .shopping, "I'm nicer when I like my outfit."));
        list.add(new data (R.drawable .shopping, "If you can't stop thinking about it, then buy it."));
        list.add(new data (R.drawable .shopping, "It's all about good friends and good shopping."));
        list.add(new data (R.drawable .shopping, "Shopping is an art and I'm an artist."));
        list.add(new data (R.drawable .shopping, "My favorite words: It's on sale."));
        list.add(new data (R.drawable .shopping, "If you love it, buy it (otherwise someone else will)."));
        list.add(new data (R.drawable .shopping, "Cinderella is proof that new shoes can change your life."));
        list.add(new data (R.drawable .shopping,"I like my money where I can see it: hanging in my closet."));
        list.add(new data (R.drawable .shopping, "To shop or not to shop, what a silly question."));
        list.add(new data (R.drawable .shopping, "I may be a beginner at some things, but I’m a black belt in shopping.\n"));
        list.add(new data (R.drawable .shopping, "Whoever said money can’t buy happiness clearly didn’t know where to shop\n"));
        list.add(new data (R.drawable .shopping,"When in doubt, go shopping\n"));
        list.add(new data (R.drawable .shopping, "Shopping is always a good idea\n"));
        String str2 = "Fashion is what you buy, style is what you do with it.\n";
        list.add(new data (R.drawable .shopping, str2));
        list.add(new data (R.drawable .shopping, "When the going gets tough, the touch go shopping\n"));
        list.add(new data (R.drawable .shopping, "Born to shop. Forced to work.\n"));
        list.add(new data (R.drawable .shopping, "The bags under my eyes are designer\n"));
        list.add(new data (R.drawable .shopping, "Shortest horror story ever: sold out\n"));
        list.add(new data (R.drawable .shopping, "It’s an “add to cart” kind of day.\n"));
        list.add(new data (R.drawable .shopping, "Shopping is the best medicine\n"));
        list.add(new data (R.drawable .shopping, str2));
        list.add(new data (R.drawable .shopping, "It's called 'the mall' because instead of going to one store, I go to them all."));
        list.add(new data (R.drawable .shopping, "If I bought it on sale, I actually MADE money."));
        list.add(new data (R.drawable .shopping, "Life is short. Buy it all"));
        list.add(new data (R.drawable .shopping, "Sometimes, all you need is a new perspective."));
        list.add(new data (R.drawable .shopping, "I can't think without my glasses."));
        list.add(new data (R.drawable .shopping, "I actually wear glasses because I need them to see."));
        list.add(new data (R.drawable .shopping, "When you change the way you look at things, the things you look at change"));
        list.add(new data (R.drawable .shopping, "If you wind up facing some enemies on your adventure, you're probably heading the right way."));




        // list.add(new Data_show ( "" ));
    }
}
