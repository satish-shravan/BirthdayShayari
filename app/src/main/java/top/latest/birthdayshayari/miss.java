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

public class miss extends AppCompatActivity {


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
        setContentView ( R.layout.activity_miss );


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



        list.add(new data (R.drawable .miss, "Missing someone and not being able to see them is the worst feeling ever"));
        list.add(new data (R.drawable .miss, "Someone asked me if I missed you. I didn’t answer. I just closed my eyes and walked away and whispered ‘so much’."));
        list.add(new data (R.drawable .miss, "I miss you. Not in some cheesy “Let’s hold hands and be together forever kind of way”. I just miss you, plain and simple. I miss your presence in my life. I miss you always being there for me. I miss you best friend."));
        list.add(new data (R.drawable .miss, "In French, you don’t really say “I miss you”, you say “Tu me manques” which means “You are missing from me."));
        list.add(new data (R.drawable .miss, "I keep myself busy with the things I do but every time I pause, I still think of you."));
        list.add(new data (R.drawable .miss, "Missing someone is your heart’s way of reminding you that you love them."));
        list.add(new data (R.drawable .miss, "I miss you like an idiot misses the point."));
        list.add(new data (R.drawable .miss, "Have you ever missed someone so much you feel physically sick?"));
        list.add(new data (R.drawable .miss, "I only miss you when I’m breathing."));
        list.add(new data (R.drawable .miss, "The hardest thing is not talking to someone you used to talk every day."));
        list.add(new data (R.drawable .miss, "My memory loves you; it asks about you all the time."));
        list.add(new data (R.drawable .miss, "I miss the fun we used to have together"));
        list.add(new data (R.drawable .miss, "I wish you were here to tell me that everything is gonna be okay."));
        list.add(new data (R.drawable .miss,"When I close my eyes, I see you. When I open my eyes, I miss you."));
        list.add(new data (R.drawable .miss,"I wish you missed me like I miss you"));
        list.add(new data (R.drawable .miss, "Every piece of me aches for you."));
        list.add(new data (R.drawable .miss, "I wish we could be together right now."));
        list.add(new data (R.drawable .miss, "I miss how close we were."));
        list.add(new data (R.drawable .miss, "Thinking of you every; second, minute, hour, day, is medication to my illness of missing you."));
        list.add(new data (R.drawable .miss,"I did three things today – miss you, miss you, and miss you."));
        list.add(new data (R.drawable .miss, "When you miss someone….it’s weird…your body doesn’t function normally..as it should. Because I miss you, and my heart…it’s not steady…my soul it sings numb. Fingers are cold…like you…your soul."));
        list.add(new data (R.drawable .miss, "My heart never knew loneliness until you went away. I’m missing you"));
        list.add(new data (R.drawable .miss, "Sometimes I wish that I could have said I love you one more time before you left from my life. I really miss you!"));
        list.add(new data (R.drawable .miss, "Life is so short, so fast the lone hours fly, We ought to be together, you and I."));
        list.add(new data (R.drawable .miss,"I wish I were kissing you instead of missing you."));
        list.add(new data (R.drawable .miss, "I miss our conversations. I miss how we used to talk every minute of every day and How I was able to tell you everything that was on my mind"));
        list.add(new data (R.drawable .miss, "I miss you. A little too much, a little too often, and a little bit more every day."));
        list.add(new data (R.drawable .miss, "I miss you. I might not always show it, might not always tell people, but on the inside I miss you like crazy."));
        list.add(new data (R.drawable .miss, "If you wanna know how much I miss you, try to catch rain drops, the ones you catch is how much you miss me, & the other you miss is how much I miss you!"));
        list.add(new data (R.drawable .miss, "Without you here, the sun forgets to shine."));
        list.add(new data (R.drawable .miss, "Some mornings still feel like the night before. I’m just waiting for the days I don’t miss you anymore"));
        list.add(new data (R.drawable .miss, "What is the opposite of two? A lonely me, a lonely you"));
        list.add(new data (R.drawable .miss,"Sometimes, when one person is missing, the whole world seems depopulated"));
        list.add(new data (R.drawable .miss, "A thousand words couldn’t bring you back… I know this because I tried, neither could a thousand tears… I know this because I cried, you left behind a broken heart and happy memories too…but I never wanted memories…I only wanted you."));
        list.add(new data (R.drawable .miss,"When you are missing someone, time seems to move slower, and when I’m falling in love with someone, time seems to be moving faster."));
        list.add(new data (R.drawable .miss,"When I text you it means I’m MISSING you. When I don’t it means I’m WAITING for you to miss me. If only you knew."));
        list.add(new data (R.drawable .miss, "I pretend to ignore you, but I really just miss you."));
        list.add(new data (R.drawable .miss, "I feel bad when you miss me, I feel sad when you don’t."));
        list.add(new data (R.drawable .miss, "I have a brain to think of you. Eyes to look at you. Heart to love you. Hands to comfort you. Toes to walk with you. Mouth to say I miss you and feet to kick you, if you don’t miss me too"));
        list.add(new data (R.drawable .miss, "They say that time heals all wounds but all it’s done so far is give me more time to think about how much I miss you."));
        list.add(new data (R.drawable .miss, "Missing someone hurts, but what hurts even more is knowing that you’re the reason that they’re gone"));
        list.add(new data (R.drawable .miss, "The silence isn’t so bad, till I look at my hands and feel sad. Because the spaces between my fingers are right where yours fit perfectly"));
        list.add(new data (R.drawable .miss, "I miss you like the sun misses the flowers, like the sun misses the flowers in the depths of winter, instead of beauty to direct it’s light to, the heart hardens like the frozen world which your absence has banished me to."));
        list.add(new data (R.drawable .miss, "Everyday, I fight the urge to text you or call you, telling myself that if you wanted to talk to me, you would."));
        list.add(new data (R.drawable .miss, "Can miles truly separate you from friends…. If you want to be with someone you love, aren’t you already there?"));
        list.add(new data (R.drawable .miss, "Forever is a long time; but i wouldn’t mind spending it by your side."));
        String str2 = "Love is missing someone whenever you’re apart, but somehow feeling warm inside because you’re close in heart.";
        list.add(new data (R.drawable .miss, str2));
        list.add(new data (R.drawable .miss, "When I tell you that I’ll miss you, it doesn’t mean I’ll never get over you. It just means I wish I didn’t have to."));
        list.add(new data (R.drawable .miss,"I miss you a little, I guess you could say, a little too much, a little too often and a little more each day"));
        list.add(new data (R.drawable .miss, "I don’t know when i lost my mind, maybe when i made you mine, I don’t know when i lost my mind, maybe it was every time that you said. I miss you. I Am Going To Miss You"));
        list.add(new data (R.drawable .miss,"I miss you but I’m trying not to care. I love you, but I’m trying not to show. I want you, but what can I do when you are not even mine?"));
        list.add(new data (R.drawable .miss, "Missing someone is a part of loving them. If you’re never apart, you’ll never really know how strong your love is"));






        // list.add(new Data_show ( "" ));
    }
}
