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

public class sleepy extends AppCompatActivity {


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
        setContentView ( R.layout.activity_sleepy );

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





        list.add(new data (R.drawable .sleepy, "Sleep is the golden chain that ties health and our bodies together."));
        list.add(new data (R.drawable .sleepy, "Sleep is the best meditation"));
        list.add(new data (R.drawable .sleepy, "Man should forget his anger before he lies down to sleep"));
        list.add(new data (R.drawable .sleepy, "Your future depends on your dreams, so go to sleep"));
        list.add(new data (R.drawable .sleepy, "A well spent day brings happy sleep"));
        list.add(new data (R.drawable .sleepy, "The best bridge between despair and hope is a good night’s sleep"));
        list.add(new data (R.drawable .sleepy,"It is a common experience that a problem difficult at night is resolved in the morning after the committee of sleep has worked on it"));
        list.add(new data (R.drawable .sleepy, "No day is so bad it can’t be fixed with a nap."));
        list.add(new data (R.drawable .sleepy, "True silence is the rest of the mind, and is to the spirit what sleep is to the body, nourishment and refreshment."));
        list.add(new data (R.drawable .sleepy, "There is more refreshment and stimulation in a nap, even of the briefest, than in all the alcohol ever distilled."));
        list.add(new data (R.drawable .sleepy, "There is a time for many words, and there is also a time for sleep"));
        list.add(new data (R.drawable .sleepy, "The minute anyone’s getting anxious I say, ‘You must eat and you must sleep.’ They’re the two vital elements for a healthy life."));
        list.add(new data (R.drawable .sleepy,"A good laugh and a long sleep are the best cures in the doctor’s book"));
        list.add(new data (R.drawable .sleepy,"Fatigue is the best pillow."));
        list.add(new data (R.drawable .sleepy, "Many things — such as loving, going to sleep, or behaving unaffectedly — are done worst when we try hardest to do them"));
        list.add(new data (R.drawable .sleepy, "Anyone can escape into sleep. We are all geniuses when we dream, the butcher’s the poet’s equal there"));
        list.add(new data (R.drawable .sleepy, "Even a soul submerged in sleep is hard at work and helps make something of the world"));
        list.add(new data (R.drawable .sleepy, "Early to bed and early to rise makes a man healthy, wealthy, and wise"));
        list.add(new data (R.drawable .sleepy, "End the day with gratitude. There is someone, somewhere that has less than you."));
        list.add(new data (R.drawable .sleepy, "Happiness consists of getting enough sleep. Just that, nothing more"));
        list.add(new data (R.drawable .sleepy,"There are twelve hours in the day, and above fifty in the night."));
        list.add(new data (R.drawable .sleepy, "A ruffled mind makes a restless pillow."));
        list.add(new data (R.drawable .sleepy, "If a man had as many ideas during the day as he does when he has insomnia, he’d make a fortune"));
        list.add(new data (R.drawable .sleepy, "The only time I have problems is when I sleep"));
        list.add(new data (R.drawable .sleepy, "The worst thing in the world is to try to sleep and not to"));
        list.add(new data (R.drawable .sleepy,"Not being able to sleep is terrible. You have the misery of having partied all night… without the satisfaction."));
        list.add(new data (R.drawable .sleepy, "The last refuge of the insomniac is a sense of superiority to the sleeping world"));
        list.add(new data (R.drawable .sleepy, "If you can’t sleep, then get up and do something instead of lying there worrying. It’s the worry that gets you, not the lack of sleep."));
        list.add(new data (R.drawable .sleepy, "Don’t fight with the pillow, but lay down your head, and kick every worriment out of the bed"));
        list.add(new data (R.drawable .sleepy, "Insomnia is a glamorous term for thoughts you forgot to have in the day"));
        list.add(new data (R.drawable .sleepy, "I love sleep. My life has a tendency to fall apart when I’m awake, you know?"));
        list.add(new data (R.drawable .sleepy, "Laugh and the world laughs with you, snore and you sleep alone"));
        list.add(new data (R.drawable .sleepy, "A kid will run any errand for you if you ask at bedtime"));
        list.add(new data (R.drawable .sleepy,"A day without a nap is like a cupcake without frosting"));
        list.add(new data (R.drawable .sleepy, "Without enough sleep, we all become tall two-year-olds"));
        list.add(new data (R.drawable .sleepy, "The amount of sleep required by the average person is five minutes more"));
        list.add(new data (R.drawable .sleepy, "If you’re going to do something tonight that you’ll be sorry for tomorrow morning, sleep late."));
        list.add(new data (R.drawable .sleepy, "There is no sunrise so beautiful that it is worth waking me up to see it."));
        list.add(new data (R.drawable .sleepy, "Some people talk in their sleep. Lecturers talk while other people sleep"));
        list.add(new data (R.drawable .sleepy,"The best cure for insomnia is to get a lot of sleep"));
        list.add(new data (R.drawable .sleepy, "Dreaming permits each and every one of us to be quietly and safely insane every night."));
        list.add(new data (R.drawable .sleepy,"No wonder Sleeping Beauty looked so good...she took long naps, never got old, and didn’t have to do anything but snore to get her Prince Charming"));
        list.add(new data (R.drawable .sleepy, "I think sleeping was my problem in school. If school had started at four in the afternoon, I’d be a college graduate today."));
        list.add(new data (R.drawable .sleepy, "Never under any circumstances take a sleeping pill and a laxative on the same night"));
        list.add(new data (R.drawable .sleepy, "Once you wake up and smell the coffee, it’s hard to go back to sleep"));
        list.add(new data (R.drawable .sleepy,"My biggest parenting conundrum: Why is it so hard to put someone who is already sleepy to sleep"));
        list.add(new data (R.drawable .sleepy, "Never go to bed mad. Stay up and fight."));
        list.add(new data (R.drawable .sleepy, "I came from a big family. As a matter of fact, I never got to sleep alone until I was married"));




        // list.add(new Data_show ( "" ));
    }
}
