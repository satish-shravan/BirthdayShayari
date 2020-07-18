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

public class brother extends AppCompatActivity {

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
        setContentView ( R.layout.activity_brother );

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



        list.add(new data (R.drawable .brothers, "My brother is my only best friend. No one can replace him."));
        list.add(new data (R.drawable .brothers, "Sometimes being a brother is even better than being a superhero."));
        list.add(new data (R.drawable .brothers, "There’s no other love like the love for a brother. There’s no other love like the love from a brother."));
        list.add(new data (R.drawable .brothers, "Brothers are what best friends can never be."));
        list.add(new data (R.drawable .brothers,"What strange creatures brothers are!"));
        list.add(new data (R.drawable .brothers, "We came into the world like brother and brother; And now let’s go hand in hand, not one before another."));
        list.add(new data (R.drawable .brothers, "God blesses him who helps his brother."));
        list.add(new data (R.drawable .brothers, "Never make a companion equal to a brother."));
        list.add(new data (R.drawable .brothers, "I had a brother who was my saviour, made my childhood bearable."));
        list.add(new data (R.drawable .brothers, "Because brothers don’t let each other wander in the dark alone."));
        list.add(new data (R.drawable .brothers, "There is no buddy like a brother."));
        list.add(new data (R.drawable .brothers, "Who needs superheroes when you have a brother"));
        list.add(new data (R.drawable .brothers,"One can be a brother only in something. Where there is no tie that binds men, men are not united but merely lined up."));
        list.add(new data (R.drawable .brothers, "Happiness is having a younger brother who is taller than you."));
        list.add(new data (R.drawable .brothers,"The happiest days of my youth were when my brother and I would run through the woods and feel quite safe."));
        list.add(new data (R.drawable .brothers, "I smile because you’re my brother. I laugh because there’s nothing you can do about it!"));
        list.add(new data (R.drawable .brothers,"I love my brother. He is simply amazing and I just couldn’t imagine my life without him."));
        list.add(new data (R.drawable .brothers,"The greatest gift my parents ever gave me was my brother"));
        list.add(new data (R.drawable .brothers, "How do people make it through life without a brother?"));
        list.add(new data (R.drawable .brothers, "Brothers don’t necessarily have to say anything to each other – they can sit in a room and be together and just be completely comfortable with each other."));
        list.add(new data (R.drawable .brothers, "Brothers are playmates in the beginning and best friends for life."));
        list.add(new data (R.drawable .brothers, "Being sister and brother means being there for each other."));
        list.add(new data (R.drawable .brothers, "Sometimes we need someone to simply be there. Not to fix anything, or to do anything in particular, but just to let us feel that we are cared and supported."));
        list.add(new data (R.drawable .brothers, "Brotherhood means… I will always come for you no matter the cost."));
        String str2 = "The younger brother must help to pay for the pleasures of the elder.";
        list.add(new data (R.drawable .brothers, str2));
        list.add(new data (R.drawable .brothers, "A brother is someone who knows there’s something wrong even when you have the biggest smile on your face"));
        list.add(new data (R.drawable .brothers, "Of all the toys I have to play, I’d choose my brothers and day."));
        list.add(new data (R.drawable .brothers, "The highlight of my childhood was making my brother laugh so hard that food came out his nose."));
        list.add(new data (R.drawable .brothers,"Some people don’t believe in heroes. But they haven’t met my brother."));
        list.add(new data (R.drawable .brothers, "Brother – a person who is there when you need him; someone who picks you up when you fall; a person who sticks up for you when no one else will; a brother is always a friend"));
        list.add(new data (R.drawable .brothers, "Life is better with brothers!"));
        list.add(new data (R.drawable .brothers, "Brothers and sisters are as close as hands and feet."));
        list.add(new data (R.drawable .brothers, "When brothers agree, no fortress is so strong as their common life"));
        list.add(new data (R.drawable .brothers, "We have flown the air like birds and swum the sea like fishes, but have yet to learn the simple act of walking the earth like brothers"));
        list.add(new data (R.drawable .brothers, "There is a destiny which makes us brothers; none goes his way alone. All that we send into the lives of others comes back into our own"));
        list.add(new data (R.drawable .brothers, "Siblings: children of the same parents, each of whom is perfectly normal until they get together"));
        list.add(new data (R.drawable .brothers, "Be grateful when you older brothers growl you, and when they tell you what to do and. Beautiful they are just trying to fulfil their duty of protecting you."));
        String str3 = "Being his real brother I could feel I live in his shadows, but I never have and I do not now. I live in his glow.";
        list.add(new data (R.drawable .brothers, str3));
        list.add(new data (R.drawable .brothers,"A brother is a friend god gave you; a friend is a brother your heart chose for you."));
        list.add(new data (R.drawable .brothers, "There is no love like the love for a brother. There is no love like the love from a brother."));
        list.add(new data (R.drawable .brothers, "If I could pick the best brother, I would pick you!"));
        list.add(new data (R.drawable .brothers, "When you really care about someone, their mistakes never change our feelings because it its mind that gets angry but the heart still cares"));
        list.add(new data (R.drawable .brothers, "Brothers will you build forts? Shoot hoops? Teach me to skip rocks? Tell me stories in the dark? Always be my best friend."));
        list.add(new data (R.drawable .brothers, "I may fight with my siblings. But once you lay a finger on them, you’ll be facing me."));
        list.add(new data (R.drawable .brothers, "My brother is one of my true heroes. Steady and sober where I am impulsive and emotional."));
        list.add(new data (R.drawable .brothers, "I, who have no sisters or brothers, look with some degree of innocent envy on those who may be said to be born to friends."));
        list.add(new data (R.drawable .brothers, "A Brother may not be a Friend, but a Friend will always be a Brother."));
        list.add(new data (R.drawable .brothers, "Brothers and sisters peas in a pod, bumps on a log, bugs in a rug, birds of a feather, partners in crime, friends forever."));
        list.add(new data (R.drawable .brothers, "I have a wonderful relationship with my brother and sister; this makes me feel that I know always where I belong."));
        list.add(new data (R.drawable .brothers, "I can’t promise to solve all your problems but I can promise you won’t have to face them alone."));
        list.add(new data (R.drawable .brothers, "Sibling relationships outlast marriages, survive the death of parents, resurface after quarrels that would sink any friendship. They flourish in a thousand incarnations of closeness and distance, warmth, loyalty and distrust"));
        list.add(new data (R.drawable .brothers, "There is a little boy inside the man who is my brother… Oh, how I hated that little boy. And how I love him too."));
        list.add(new data (R.drawable .brothers, "I don’t believe an accident of birth makes people sisters or brothers. It makes them siblings, gives them mutuality of parentage. Sisterhood and brotherhood is a condition people have to work at."));
        list.add(new data (R.drawable .brothers, "It was nice growing up with someone like you – someone to lean on, someone to count on… someone to tell on!"));
        list.add(new data (R.drawable .brothers, "She had always wanted a brother. And she had one now. Sebastian. It was like always wanting a puppy and being a hellhound instead"));
        list.add(new data (R.drawable .brothers, str2));
        list.add(new data (R.drawable .brothers, "The highlight of my childhood was making my brother laugh so hard that food came out his nose"));
        list.add(new data (R.drawable .brothers, "I grew up with a younger brother, so I can get pretty rowdy."));






        // list.add(new Data_show ( "" ));
    }
}
