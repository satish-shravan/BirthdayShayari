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

public class fitness extends AppCompatActivity {


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
        setContentView ( R.layout.activity_fitness);

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

        list.add(new data (R.drawable .fitness, "I hit the gym so I won’t have to hit you.\n"));
        list.add(new data (R.drawable .fitness, "I’m torn between cardio and pizza"));
        list.add(new data (R.drawable .fitness, "I ate healthy and exercised today. I better wake up skinny tomorrow."));
        list.add(new data (R.drawable .fitness,"I go to the gym because clearly my amazing personality deserves an awesome body to go with it.   "));
        list.add(new data (R.drawable .fitness, "I wear black in the gym because it’s like a funeral for my fat."));
        list.add(new data (R.drawable .fitness, "I workout to burn off the crazy."));
        list.add(new data (R.drawable .fitness,"The only running I do is running out of money!"));
        list.add(new data (R.drawable .fitness,"Okay, fine, I’ll run but I’m going to be complaining the whole time."));
        list.add(new data (R.drawable .fitness, "Hakuna Masquata—it means nice booty for the rest of your days."));
        list.add(new data (R.drawable .fitness, "No pain, no gain."));
        list.add(new data (R.drawable .fitness, "Winners train. Losers complain."));
        list.add(new data (R.drawable .fitness, "Eat big. Lift big. Get big."));
        list.add(new data (R.drawable .fitness, "Believe in yourself and you will be unstoppable."));
        list.add(new data (R.drawable .fitness, "Excuses don’t burn calories!"));
        list.add(new data (R.drawable .fitness, "Whenever my body shouts STOP, my mind screams NEVER!"));
        list.add(new data (R.drawable .fitness, "I’m not stopping until I’m proud of myself.\n"));
        list.add(new data (R.drawable .fitness, "On good days, work out. On bad days, work out harder.\n"));
        list.add(new data (R.drawable .fitness, "Exercise is a celebration of what your body can do, not a punishment for what you ate.\n"));
        list.add(new data (R.drawable .fitness, "In two weeks, you’ll feel it. In four weeks, you’ll see it. In eight weeks, you’ll hear it."));
        list.add(new data (R.drawable .fitness, "I want to see what happens if I don’t give up.\n"));
        list.add(new data (R.drawable .fitness, "There’s no secret formula. I lift heavy, work hard, and aim to be the best that I can be."));
        list.add(new data (R.drawable .fitness, "Don’t decrease the goal. Increase the effort!"));
        list.add(new data (R.drawable .fitness, "When it comes to fitness, never settle for less!"));
        list.add(new data (R.drawable .fitness, "I will sacrifice whatever is necessary to be the best."));
        list.add(new data (R.drawable .fitness,"You never know how strong you are until being strong is the only choice you have.\n"));
        list.add(new data (R.drawable .fitness, "Fitness is not about being better than someone. Fitness is about being better than the person you were yesterday."));
        list.add(new data (R.drawable .fitness, "A bad day can be made better by going to the gym."));
        list.add(new data (R.drawable .fitness, "A one-hour workout is 4% of your day. No excuses."));
        list.add(new data (R.drawable .fitness, "Always be a work in progress.\n"));
        list.add(new data (R.drawable .fitness,"Don’t tell anyone your plans. Instead, show them your results."));
        list.add(new data (R.drawable .fitness, "I did not wake up today just to be mediocre."));
        list.add(new data (R.drawable .fitness, "I think I feel in love with taking care of my body."));
        list.add(new data (R.drawable .fitness,"Work out. Eat well. Be patient. Your body will reward you."));
        list.add(new data (R.drawable .fitness,"Some people like going to the pub. I, on the other hand, enjoys going to the gym."));
        list.add(new data (R.drawable .fitness,"The body achieves what the mind believes."));
        String str2 = "I’m in a good place right now. Not emotionally, I’m just at the gym.";
        list.add(new data (R.drawable .fitness, str2));
        String str3 = "I believe in eating what I like and sweating it out in the gym.";
        list.add(new data (R.drawable .fitness,str3));
        String str4 = "The best activities for your health are pumping and humping.";
        list.add(new data (R.drawable .fitness, str4));
        list.add(new data (R.drawable .fitness, "You get what you work for, not what you wish for."));
        list.add(new data (R.drawable .fitness, "If you want to know the correct way to perform an exercise, the answer is: ‘Whatever hurts most!’"));
        list.add(new data (R.drawable .fitness, "This is how I make things happen."));
        list.add(new data (R.drawable .fitness, "Going to the gym is the best drug for me."));
        list.add(new data (R.drawable .fitness, "It’s a slow process, but quitting won’t speed it up."));
        list.add(new data (R.drawable .fitness, "Push yourself because no one else is going to do it for you."));
        list.add(new data (R.drawable .fitness, "Fitness isn’t just bout hitting the gym. It’s also about invigorating your inner happiness and improving your overall well-being."));
        list.add(new data (R.drawable .fitness, str4));
        list.add(new data (R.drawable .fitness, str3));
        list.add(new data (R.drawable .fitness, "Friends that sweat together, stay together."));
        list.add(new data (R.drawable .fitness, str2));
        list.add(new data (R.drawable .fitness, "Gym is my therapy."));
        list.add(new data (R.drawable .fitness,"Sweat. Smile. Repeat."));
        list.add(new data (R.drawable .fitness, "Sweat is Fat Crying"));
        list.add(new data (R.drawable .fitness, "Sore Today, Strong Tomorrow"));
        list.add(new data (R.drawable .fitness, "Make Sweat Your Best Accessory"));
        list.add(new data (R.drawable .fitness,"Stop Making Excuses"));
        list.add(new data (R.drawable .fitness,"Fit is Not a Destination"));
        list.add(new data (R.drawable .fitness, "Sweat Is Magic"));
        list.add(new data (R.drawable .fitness, "Kick Ass. Repeat."));






        // list.add(new Data_show ( "" ));
    }
}
