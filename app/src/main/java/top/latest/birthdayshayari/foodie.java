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

public class foodie extends AppCompatActivity {


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
        setContentView ( R.layout.activity_foodie );

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



        list.add(new data (R.drawable .foodie, "The only thing I like better than talking about Food is eating."));
        list.add(new data (R.drawable .foodie, "If food were free, why work?"));
        list.add(new data (R.drawable .foodie, "Your diet is a bank account. Good food choices are good investments."));
        list.add(new data (R.drawable .foodie, "Food is for eating, and good food is to be enjoyed… I think food is, actually, very beautiful in itself"));
        list.add(new data (R.drawable .foodie, "I get way too much happiness from good food."));
        list.add(new data (R.drawable .foodie, "If you combine good flavors, food turns into an orchestra."));
        list.add(new data (R.drawable .foodie,"Food is really and truly the most effective medicine."));
        list.add(new data (R.drawable .foodie, "You know, food is such – it’s a hug for people."));
        list.add(new data (R.drawable .foodie, "The closest I’ve been to a diet this year is erasing food searches from my browser history."));
        list.add(new data (R.drawable .foodie, "My friends tell me that cooking is easy, but it’s not easier than not cooking."));
        list.add(new data (R.drawable .foodie,"There’s nothing more romantic than Italian food."));
        list.add(new data (R.drawable .foodie, "Every time you use the word ‘healthy,’ you lose. The key is to make yummy, delicious food that happens to be healthy."));
        list.add(new data (R.drawable .foodie, "I’m just someone who likes cooking and for whom sharing food is a form of expression."));
        list.add(new data (R.drawable .foodie, "I think about food literally all day every day. It’s a thing."));
        list.add(new data (R.drawable .foodie,"I think I was immediately fed, so food became a very important part of my life."));
        list.add(new data (R.drawable .foodie, "If I can, I love staying in pajamas all day and watching movies and eating good food."));
        list.add(new data (R.drawable .foodie, "I was always a junk food person, still am.\n"));
        list.add(new data (R.drawable .foodie, "I love pizza. I want to marry it, but it would just be to eat her family at the wedding."));
        String str2 = "If someone else is paying for it, food just tastes a lot better.\n";
        list.add(new data (R.drawable .foodie, str2));
        list.add(new data (R.drawable .foodie, "Eating good food is my favorite thing in the whole world. Nothing is more blissful."));
        list.add(new data (R.drawable .foodie, "Food is fuel\n"));
        list.add(new data (R.drawable .foodie, "Anything is good if it’s made of chocolate.\n"));
        list.add(new data (R.drawable .foodie, "I like food. I like eating. And I don’t want to deprive myself of good food.\n"));
        list.add(new data (R.drawable .foodie, "The only thing I like better than talking about food is eating.\n"));
        list.add(new data (R.drawable .foodie,"Everything you see I owe to spaghetti.\n"));
        list.add(new data (R.drawable .foodie, "Food is an important part of a balanced diet.\n"));
        list.add(new data (R.drawable .foodie, "I cook with wine. Sometimes I even add it to the food.\n"));
        list.add(new data (R.drawable .foodie, "Cauliflower is nothing but cabbage with a college education.\n"));
        list.add(new data (R.drawable .foodie, "If you’re afraid of butter use cream.\n"));
        String str3 = "Cooking is like love. It should be entered into with abandon or not at all.\n";
        list.add(new data (R.drawable .foodie, str3));
        String str4 = "Life is a combination of magic and pasta.\n";
        list.add(new data (R.drawable .foodie, str4));
        String str5 = "Promises and pie-crust are made to be broken.\n";
        list.add(new data (R.drawable .foodie, str5));
        list.add(new data (R.drawable .foodie, "Cheese – milk’s leap towards immortality.\n"));
        list.add(new data (R.drawable .foodie,"I like rice, rice is great if you’re hungry and want 2000 of something.\n"));
        list.add(new data (R.drawable .foodie,"Always serve too much hot fudge sauce on hot fudge sundaes. It makes people overjoyed and puts them in your debt."));
        list.add(new data (R.drawable .foodie, "We all eat, & it would be a sad waste of an opportunity to eat badly.\n"));
        list.add(new data (R.drawable .foodie, "First, we eat then we do everything else.\n"));
        list.add(new data (R.drawable .foodie,"A balanced diet is a cookie in each hand.\n"));
        list.add(new data (R.drawable .foodie,"People who love to eat always the best people.\n"));
        list.add(new data (R.drawable .foodie, "Food is our common ground, a universal experience.\n"));
        String str6 = "There is no sincere love than the love of food.\n";
        list.add(new data (R.drawable .foodie, str6));
        list.add(new data (R.drawable .foodie, "Let food be thy medicine and medicine be thy food.\n"));
        list.add(new data (R.drawable .foodie, "Good food is good mood.\n"));
        list.add(new data (R.drawable .foodie, "Ways to my heart: 1. Buy me food 2. Make me food 3. Be food\n"));
        list.add(new data (R.drawable .foodie, "You can’t live a full life on an empty stomach.\n"));
        list.add(new data (R.drawable .foodie, "Happiness is homemade.\n"));
        list.add(new data (R.drawable .foodie, str4));
        list.add(new data (R.drawable .foodie, str6));
        list.add(new data (R.drawable .foodie,"A taste of the food life.\n"));
        list.add(new data (R.drawable .foodie, "There is no sincerer love than the love of food.\n"));

        list.add(new data (R.drawable .foodie, "Your diet is a bank account. Good food choices are good investments.\n"));
        list.add(new data (R.drawable .foodie, "Count the memories not the calories.\n"));
        list.add(new data (R.drawable .foodie, "I’m on a seafood diet. I see food, I eat it.\n"));
        list.add(new data (R.drawable .foodie, "I’m soy into you.\n"));






        // list.add(new Data_show ( "" ));
    }
}
