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

public class shy extends AppCompatActivity {


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
        setContentView ( R.layout.activity_shy );
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



        list.add(new data (R.drawable .shy, "I'm so shy now I wear sunglasses everywhere I go.  "));
        list.add(new data (R.drawable .shy, "Nothing is as irritating to a shy man as a confident girl."));
        list.add(new data (R.drawable .shy, "There is a certain delightful sort of hope which the introvert can receive only by having company over...the hope that they will leave soon."));
        list.add(new data (R.drawable .shy, "I have reason to be shy. I’ve been Hurt plenty."));
        list.add(new data (R.drawable .shy, "A shy failure is nobler than an immodest success."));
        list.add(new data (R.drawable .shy, "I've gotten better at not making people feel uncomfortable with my shyness."));
        list.add(new data (R.drawable .shy, "The shell must break before the bird can fly."));
        list.add(new data (R.drawable .shy, "Humility is so shy. If you begin talking about it, it leaves."));
        list.add(new data (R.drawable .shy, "Shyness has a strange element of narcissism, a belief that how we look, how we perform, is truly important to other people."));
        list.add(new data (R.drawable .shy, "When a shy person smiles, it’s like the sun coming out."));
        list.add(new data (R.drawable .shy, "My feelings are too loud for words and too shy for the world."));
        String str2 = "There is nothing that makes us feel more lonely than our shyness.";
        list.add(new data (R.drawable .shy, str2));
        list.add(new data (R.drawable .shy, "The introvert's anthem for not wanting to hang out is 'It's not you; it's me."));
        list.add(new data (R.drawable .shy,"The shy man does have some slight revenge upon society for the torture it inflicts upon him."));
        list.add(new data (R.drawable .shy, "Timidity is the silent acceptance of bondage."));
        list.add(new data (R.drawable .shy,"Everyone is shy it is the inborn modesty that makes us able to live in harmony with other creatures and our fellows. Achievement comes not by denying shyness but, occasionally, by setting it aside and letting pride and perspiration come first."));
        list.add(new data (R.drawable .shy, "Social taboos are shy like virtue; once lost, there is no remedy."));
        list.add(new data (R.drawable .shy, "It is only through timidity that states are lost."));
        list.add(new data (R.drawable .shy, "One is always half mad when one is shy of people."));
        list.add(new data (R.drawable .shy, "Shyness is just egotism out of its depth."));
        list.add(new data (R.drawable .shy, "A shy face is better than a forward heart."));
        list.add(new data (R.drawable .shy, "There is safety in reserve, but no attraction. One cannot love a reserved person."));
        list.add(new data (R.drawable .shy, "The way you overcome shyness is to become so wrapped up in something that you forget to be afraid."));
        list.add(new data (R.drawable .shy,"Maybe shy is when you're lonely and you don't think anybody can help you."));
        list.add(new data (R.drawable .shy, "I live in a shell, so I can't blame people when they don't want to crack me. But people like you are the reason I left the nest."));
        list.add(new data (R.drawable .shy,"That awkward moment when you don’t want to come out of your room because there are strangers in your house."));
        list.add(new data (R.drawable .shy, "People think I’m quiet because I have nothing to say or because of my shyness. Truth is I just keep my thoughts, opinions to myself in case no one will care about what I have to say."));
        list.add(new data (R.drawable .shy, "It’s a shame when the things that are on your mind and in your heart never reach your lips."));
        list.add(new data (R.drawable .shy, "I’m a very simple person who hides thousands of feelings behind a smile."));
        list.add(new data (R.drawable .shy, "Sometimes the people you think don’t want to talk to you, are the ones waiting for you to talk to them."));
        list.add(new data (R.drawable .shy, "That awkward moment when you’re left alone with someone you just met."));
        list.add(new data (R.drawable .shy, "Nothing is more cute than a shy guy trying to tell you that he loves you."));
        list.add(new data (R.drawable .shy,"My shyness has ruined so many opportunities."));
        list.add(new data (R.drawable .shy, "When I’m alone, I think of so many things to say to you, but when I have a chance to tell you, I go speechless."));
        list.add(new data (R.drawable .shy, "Sometimes quiet people really do have a lot to say, they’re just being careful about who they open up to…"));
        list.add(new data (R.drawable .shy, "I pretended to look around, but I was actually looking at you."));
        list.add(new data (R.drawable .shy, "A woman’s best jewellery is her shyness."));
        list.add(new data (R.drawable .shy,"If I have a crush on you, I’ll be shy as hell! I swear won’t even look at you."));
        list.add(new data (R.drawable .shy, "I wish I was better at telling people how I really feel."));
        list.add(new data (R.drawable .shy, "Why do people feel comfortable texting you things they would never have the guts to say to your face?"));
        list.add(new data (R.drawable .shy, "I’m not open to many people. I’m usually quiet and I don’t really like attention. So if I like you enough to show you the real me, you must be very special."));
        list.add(new data (R.drawable .shy, "I like parties, but I’m shy, and I often find myself standing around, feeling awkward."));
        list.add(new data (R.drawable .shy,"I am extremely shy. I am not happy in crowds of people."));
        list.add(new data (R.drawable .shy, "The fact of the matter is that most actors are shy people."));
        list.add(new data (R.drawable .shy, "I do not say what I feel, and people often take that for shyness, even kindness."));
        list.add(new data (R.drawable .shy, "The way you overcome shyness is to become so wrapped up in something that you forget to be afraid"));
        list.add(new data (R.drawable .shy,"I’ve gotten better at not making people feel uncomfortable with my shyness."));
        list.add(new data (R.drawable .shy, "You know what my greatest personal stumbling block is? My shyness."));






        // list.add(new Data_show ( "" ));
    }
}
