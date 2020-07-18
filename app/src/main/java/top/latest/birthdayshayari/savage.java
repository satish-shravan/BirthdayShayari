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

public class savage extends AppCompatActivity {

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
        setContentView ( R.layout.activity_savage );

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




        list.add(new data (R.drawable .savage, "My mascara is too expensive to cry over stupid boys like you."));
        list.add(new data (R.drawable .savage, "Don’t stand so close to the heart. Plastic melts"));
        list.add(new data (R.drawable .savage, "If you can’t handle me at my worst, you don’t deserve me at my best."));
        list.add(new data (R.drawable .savage,"It is totally wastage of my mascara to cry over guys like you"));
        list.add(new data (R.drawable .savage, "Don’t mistake my kindness for weakness."));
        list.add(new data (R.drawable .savage,"Don’t test me. I have screenshots."));
        list.add(new data (R.drawable .savage, "It’s not necessary for everyone to like me. Not everyone matters!"));
        list.add(new data (R.drawable .savage, "It’s with you or without you but life goes on."));
        list.add(new data (R.drawable .savage, "Life goes on, with or without you."));
        String str2 = "Proof that I can do selfies better than you.";
        list.add(new data (R.drawable .savage, str2));
        list.add(new data (R.drawable .savage, "What’s a queen without her king? Well, historically speaking, more powerful."));
        list.add(new data (R.drawable .savage, "Too blessed to be stressed."));
        list.add(new data (R.drawable .savage,"It’s hard to do epic stuff with basic people like you." ));
        list.add(new data (R.drawable .savage, "I’m just at a whole new ‘fuck it’ level."));
        list.add(new data (R.drawable .savage, "My mascaras too expensive to cry over stupid boys like you."));
        list.add(new data (R.drawable .savage, "Did you fall from heaven? Because so did Satan."));
        list.add(new data (R.drawable .savage, "I’m cool. PS: You’re not."));
        list.add(new data (R.drawable .savage, "Here is a proof that my selfies are better than you."));
        list.add(new data (R.drawable .savage, "You cant do epic shit with basic people."));
        list.add(new data (R.drawable .savage, "50% Savage, 50% Sweetheart."));
        list.add(new data (R.drawable .savage,"It’s okay if you don’t like me. Not everyone has good taste."));
        list.add(new data (R.drawable .savage, "I would make a sandwich for guys like you."));
        list.add(new data (R.drawable .savage,"Don’t mistake my kindness for weakness, bitch."));
        list.add(new data (R.drawable .savage,"I’m not always sarcastic — sometimes I’m sleeping."));
        list.add(new data (R.drawable .savage, "I’m a scuba diver in a sea of idiots."));
        list.add(new data (R.drawable .savage, "You are the puzzle piece to my Lego house. Basically, useless."));
        list.add(new data (R.drawable .savage, "Beauty attracts the eye, but personality captures the heart."));
        list.add(new data (R.drawable .savage, "I believe in karma very much but if karma does not hit you, I will."));
        list.add(new data (R.drawable .savage, "I am Fiji water. You are toilet water."));
        list.add(new data (R.drawable .savage, "Just wing it. Life, eyeliner, everything."));
        list.add(new data (R.drawable .savage, "My phone battery lasts longer than your relationships."));
        list.add(new data (R.drawable .savage, "My heels are higher than most people’s standards."));
        list.add(new data (R.drawable .savage, "I love that pleasant sound which you make when you shut up."));
        list.add(new data (R.drawable .savage, str2));
        list.add(new data (R.drawable .savage, "I’ve always loved the idea of not being what people expect me to be."));
        list.add(new data (R.drawable .savage,"You look like something I drew with my left hand."));
        list.add(new data (R.drawable .savage, "Treat me like an option, and I’ll dump you like a choice."));
        list.add(new data (R.drawable .savage, "Drop top. All I do is eat non Stop."));
        list.add(new data (R.drawable .savage,"Karma is somewhat busy with sharpening her nails, finishing and her drink, and after that, she is coming after you."));
        list.add(new data (R.drawable .savage, "Her attitude is savage, but her heart is gold"));
        list.add(new data (R.drawable .savage, "Maybe you should eat some makeup so you can be pretty on the inside, too."));
        list.add(new data (R.drawable .savage,"When I get up in the morning, even the Satan cries."));
        list.add(new data (R.drawable .savage, "sometimes you gotta be a beauty and a beast."));
        list.add(new data (R.drawable .savage, "Some people always deserve to get a hi-five right on their face."));
        list.add(new data (R.drawable .savage, "I know I’m a handful, but that’s why you got two hands."));
        list.add(new data (R.drawable .savage, "Cancel my subscription because I’m done with your issues."));
        list.add(new data (R.drawable .savage, "You cannot expect the world to be fair to you if you are fair. Would you expect a lion not to eat just because you didn’t eat him"));
        list.add(new data (R.drawable .savage, "Be a little more you, and a lot less them."));
        list.add(new data (R.drawable .savage, "Ever seen queens competing with hoes? No, because queens never consider hoes as their completion."));
        list.add(new data (R.drawable .savage,"Your the type of boy id make a sandwich for."));
        list.add(new data (R.drawable .savage, "The uglier the Snapchat, the closer the friendship."));
        list.add(new data (R.drawable .savage,"Honey, even raccoons have standards."));
        list.add(new data (R.drawable .savage,"You were my cup of tea but I drink champagne now."));
        list.add(new data (R.drawable .savage, "Even my middle finger is bigger than your heart."));
        list.add(new data (R.drawable .savage, "If Karma doesn’t hit you, l gladly will."));
        list.add(new data (R.drawable .savage, "We will be the old ladies causing trouble in the nursing homes."));
        list.add(new data (R.drawable .savage, "Is your trashcan jealous of the garbage that comes out of your mouth?"));
        list.add(new data (R.drawable .savage, "Catch flights, not feelings."));
        list.add(new data (R.drawable .savage, "Remember to shine like the sunshine because the sun does not give a damn even if you go blind."));
        list.add(new data (R.drawable .savage,"You will find an odd combination of really sweet and don’t mess with me in me."));





        // list.add(new Data_show ( "" ));
    }
}
