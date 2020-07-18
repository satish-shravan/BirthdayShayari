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

public class flirt extends AppCompatActivity {

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
        setContentView ( R.layout.activity_flirt );

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





        list.add(new data (R.drawable .flirt,"My love for you is like dividing by zero - it cannot be defined !"));
        list.add(new data (R.drawable .flirt, "I'm sorry I wasn't part of your past, can I make it up by being in your future?"));
        list.add(new data (R.drawable .flirt, "If I freeze, it's not a computer virus. I was just stunned by your beauty."));
        list.add(new data (R.drawable .flirt, "If I had a star for every time you brightened my day, I'd have a galaxy in my hand"));
        list.add(new data (R.drawable .flirt, "Are you made of copper and tellurium? Because you're CuTe !"));
        list.add(new data (R.drawable .flirt,"Forget hydrogen, you're my number one element."));
        list.add(new data (R.drawable .flirt, "You're so beautiful you made me forget my pick up line. !"));
        list.add(new data (R.drawable .flirt,"Do you believe in love at first sight or do i pass by you again. !"));
        list.add(new data (R.drawable .flirt, "Your smile must be a black hole, nothing can escape its pull. "));
        list.add(new data (R.drawable .flirt, "If you're hotter than me, then that means I'm cooler than you."));
        list.add(new data (R.drawable .flirt, "You're more special than relativity. !"));
        list.add(new data (R.drawable .flirt, "A girl in a restaurant asked me \"Are you single?\". I happily replied \"Yes\". She took away the extra chair in front of me"));
        list.add(new data (R.drawable .flirt, "My name is John but you can call me tonight."));
        list.add(new data (R.drawable .flirt, "What do you and your shower have in common? You both get wet when I turn you on."));
        list.add(new data (R.drawable .flirt, "Save your breath... You'll need it to blow up your date."));
        list.add(new data (R.drawable .flirt, "S.I.N.G.L.E...sexy! innocent! naughty! gorgeous! lustful! exciting!"));
        list.add(new data (R.drawable .flirt, "Are you the energizer bunny cause you just keep going and going through my mind."));
        list.add(new data (R.drawable .flirt, "I may not be the best-looking guy in here, but I'm the only one talking to you."));
        list.add(new data (R.drawable .flirt,"You still use Internet Explorer? You must like it nice and slow."));
        list.add(new data (R.drawable .flirt, "I'm new in town. Could you give me directions to your apartment?"));
        list.add(new data (R.drawable .flirt,"I'd like to think inside your box."));
        list.add(new data (R.drawable .flirt,"Wanna get together and test the spring potential of my mattress?"));
        list.add(new data (R.drawable .flirt,"I saw a woman wearing a sweat shirt with \"Guess\" on it ...so I said \"Implants?\""));
        list.add(new data (R.drawable .flirt, "Let's both be naughty this year and save Santa the trip."));
        list.add(new data (R.drawable .flirt,"Want to meet up so I can excite your natural frequency?"));
        list.add(new data (R.drawable .flirt, "You must be peanut butter because you're making my legs feel like jelly."));
        list.add(new data (R.drawable .flirt, "You must be a full moon, coz everytime you are around me, I turn into a beast."));
        list.add(new data (R.drawable .flirt,"Are your pants 50% off? Cuz they'll be 100% off in my room."));
        list.add(new data (R.drawable .flirt,"I fell in love at first sight. I should have looked twice."));
        String str2 = "What is live? Life is love. Whats love? Love is kissing. Whats kissing? Come here and I show you.";
        list.add(new data (R.drawable .flirt, str2));
        list.add(new data (R.drawable .flirt,"I flirted with disaster last night. Now disaster won't stop texting me."));
        list.add(new data (R.drawable .flirt, "I don't think it's rude to ask someone in an online dating site to send a picture posing with a copy of today's newspaper."));
        list.add(new data (R.drawable .flirt, "Do not walk behind me, for I may not lead. Do not walk ahead of me, for I may not follow. Do not walk beside me either. Just pretty much leave me the hell alone.\n"));
        list.add(new data (R.drawable .flirt,"I bet we can get into some serious Treble together."));
        list.add(new data (R.drawable .flirt, "Life's a jungle let's go to your place and fuck like animals!"));
        list.add(new data (R.drawable .flirt, "You smell like trash..... Can I take you out?"));
        list.add(new data (R.drawable .flirt, "What's your amplitude for charm-strange mixing?"));
        list.add(new data (R.drawable .flirt, "Why did the lady wear a helmet every time she ate? She was on a crash diet!"));
        list.add(new data (R.drawable .flirt, "A day without sunshine is like, well, night."));
        list.add(new data (R.drawable .flirt,"How about we do some peer-to-peer sharing? Your domain or mine?"));
        list.add(new data (R.drawable .flirt, "If you were a TSA agent, I would be happy to get a body scan."));
        list.add(new data (R.drawable .flirt,"Does this rag smell like chloroform to you?"));
        list.add(new data (R.drawable .flirt, "Looking at you is getting my dick harder than Chuck Norris !"));
        list.add(new data (R.drawable .flirt,"My favorite sexual position: The Chilean miner. That's where you go down on me and stay there till Christmas."));
        list.add(new data (R.drawable .flirt,"If I followed you home, would you keep me?"));
        list.add(new data (R.drawable .flirt, "Santa's lap isn't the only place wishes come true."));
        list.add(new data (R.drawable .flirt, "Do you wanna see a magic trick? Watch me pull something out of my pants!"));
        list.add(new data (R.drawable .flirt, "My love for you is like a fart. Everything about it is powered by my heart."));
        list.add(new data (R.drawable .flirt, "I think I've discovered my supersymmetric partner."));
        list.add(new data (R.drawable .flirt,"You are my methods. I am nothing without you."));
        list.add(new data (R.drawable .flirt,"Are you Greek (If No) are you sure cause you look like a goddess to me?"));
        list.add(new data (R.drawable .flirt, "Boy: Have u ever been fishing before Girl: Why? Boy: I think we should hook up!"));

        list.add(new data (R.drawable .flirt, "I can feel the gluons being exchanged between us."));
        list.add(new data (R.drawable .flirt, "She's single if her man can't beat you up."));
        list.add(new data (R.drawable .flirt,"Hey Cutie ever do it in a sleigh?"));
        list.add(new data (R.drawable .flirt, "If you were a basketball, could I drive you, and lay you up?"));
        String str4 = "Girl, if you were a camel, I'd hump you!";
        list.add(new data (R.drawable .flirt, str4));
        list.add(new data (R.drawable .flirt, "Why does a blonde wear green lipstick? Because red means Stop."));
        list.add(new data (R.drawable .flirt, "There's a easter parade in my pants...wanna go?"));
        list.add(new data (R.drawable .flirt, "If a dove is the bird of peace, then is a swallow the bird of love?"));

        // list.add(new Data_show ( "" ));
    }
}
