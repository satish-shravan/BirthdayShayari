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

public class travel extends AppCompatActivity {


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
        setContentView ( R.layout.activity_travel );

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



        list.add(new data (R.drawable .travel, "The gladdest moment in human life is a departure into unknown lands."));
        list.add(new data (R.drawable .travel, "Be fearless in the pursuit of what sets your soul on fire."));
        list.add(new data (R.drawable .travel, "Travel makes one modest. You see what a tiny place you occupy in the world"));
        list.add(new data (R.drawable .travel, "Traveling – it leaves you speechless, then turns you into a storyteller."));
        list.add(new data (R.drawable .travel, "Better to see something once than hear about it a thousand times"));
        list.add(new data (R.drawable .travel, "Adventure may Hurt you but monotony will kill you"));
        list.add(new data (R.drawable .travel, "Don’t listen to what they say. Go see."));
        list.add(new data (R.drawable .travel,"All you need to know is that it’s possible"));
        list.add(new data (R.drawable .travel, "To Travel is to Live"));
        list.add(new data (R.drawable .travel, "The journey not the arrival matters."));
        list.add(new data (R.drawable .travel, "Life is short and the world is wide"));
        list.add(new data (R.drawable .travel,"Dare to live the life you’ve always wanted"));
        list.add(new data (R.drawable .travel, "Travel and change of place impart new vigor to the mind"));
        list.add(new data (R.drawable .travel,"He who would travel happily must travel light"));
        list.add(new data (R.drawable .travel, "And then there is the most dangerous risk of all — the risk of spending your life not doing what you want on the bet you can buy yourself the freedom to do it later."));
        list.add(new data (R.drawable .travel, "No one realizes how beautiful it is to travel until he comes home and rests his head on his old, familiar pillow"));
        list.add(new data (R.drawable .travel, "Our battered suitcases were piled on the sidewalk again; we had longer ways to go. But no matter, the road is life."));
        list.add(new data (R.drawable .travel, "One’s destination is never a place, but a new way of seeing things."));
        list.add(new data (R.drawable .travel, "Not all those who wander are lost"));
        list.add(new data (R.drawable .travel, "All journeys have secret destinations of which the traveler is unaware"));
        list.add(new data (R.drawable .travel, "Travel makes a wise man better but a fool worse."));
        list.add(new data (R.drawable .travel, "The world is a book and those who do not travel read only one page."));
        list.add(new data (R.drawable .travel,"One’s destination is never a place, but a new way of seeing things"));
        list.add(new data (R.drawable .travel, "If you reject the food, ignore the customs, fear the religion and avoid the people, you might better stay home."));
        list.add(new data (R.drawable .travel, "Go, fly, roam, travel, voyage, explore, journey, discover, adventure."));
        list.add(new data (R.drawable .travel,"Our happiest moments as tourists always seem to come when we stumble upon one thing while in pursuit of something else."));
        String str2 = "Do not follow where the path may lead. Go instead where there is no path and leave a trail";
        list.add(new data (R.drawable .travel,str2));
        list.add(new data (R.drawable .travel, "Traveling is a brutality. It forces you to trust strangers and to lose sight of all that familiar comforts of home and friends. You are constantly off balance. Nothing is yours except the essential things. -air, sleep, dreams, the sea, the sky. -all things tending towards the eternal or what we imagine of it."));
        list.add(new data (R.drawable .travel, "Every man can transform the world from one of monotony and drabness to one of excitement and adventure."));
        list.add(new data (R.drawable .travel, "What you’ve done becomes the judge of what you’re going to do — especially in other people’s minds.  When you’re traveling, you are what you are right there and then.  People don’t have your past to hold against you.  No yesterdays on the road."));
        list.add(new data (R.drawable .travel, "We travel, some of us forever, to seek other states, other lives, other souls."));
        list.add(new data (R.drawable .travel, "A good traveler has no fixed plans and is not intent on arriving."));
        list.add(new data (R.drawable .travel, "Life is a journey. Make the best of it"));
        list.add(new data (R.drawable .travel, "We live in a wonderful world that is full of beauty, charm, and adventure. There is no end to the adventures we can have if only we seek them with our eyes open."));
        list.add(new data (R.drawable .travel,"I have found out that there ain’t no surer way to find out whether you like people or hate them than to travel with them."));
        list.add(new data (R.drawable .travel, "Travel is the only thing you buy that makes you richer"));
        list.add(new data (R.drawable .travel, "A journey is best measured in friends, rather than miles."));
        list.add(new data (R.drawable .travel, "Man cannot discover new oceans unless he has the courage to lose sight of the shore."));
        list.add(new data (R.drawable .travel, "Like all great travelers, I have seen more than I remember, and remember more than I have seen"));
        list.add(new data (R.drawable .travel, "Hope is the only thing stronger than fear."));
        list.add(new data (R.drawable .travel, "Because in the end, you won’t remember the time you spent working in the office or mowing your lawn. Climb that goddamn mountain"));
        list.add(new data (R.drawable .travel, "To travel is to discover that everyone is wrong about other countries."));
        list.add(new data (R.drawable .travel,"Blessed are the curious for they will have adventures."));
        list.add(new data (R.drawable .travel,"Remember that happiness is a way of travel – not a destination."));
        list.add(new data (R.drawable .travel,"You can shake the sand from your shoes, but it will never leave your soul."));
        list.add(new data (R.drawable .travel, "The biggest adventure you can ever take is to live the life of your dreams."));
        list.add(new data (R.drawable .travel, "Once in a while it really hits people that they don’t have to experience the world in the way they have been told to."));
        list.add(new data (R.drawable .travel, "Twenty years from now you will be more disappointed by the things that you didn’t do than by the ones you did do. So throw off the bowlines. Sail away from the safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover."));
        list.add(new data (R.drawable .travel, "Take only memories, leave only footprints."));
        list.add(new data (R.drawable .travel, "I’m in love with cities I’ve never been to and people I’ve never met."));
        list.add(new data (R.drawable .travel, "Oh the places you’ll go."));
        list.add(new data (R.drawable .travel, "Wherever you go, go with all your heart!"));
        list.add(new data (R.drawable .travel, "Don’t call it a dream…call it a plan"));
        list.add(new data (R.drawable .travel, "A great way to learn about your country is to leave it."));
        list.add(new data (R.drawable .travel, "Then I realized adventures are the best way to learn"));
        list.add(new data (R.drawable .travel, "It is not down in any map; true places never are."));
       list.add(new data (R.drawable .travel, "You don’t have to be rich to travel well. "));
        list.add(new data (R.drawable .travel,"I love the feeling of being anonymous in a city I’ve never been before."));
        list.add(new data (R.drawable .travel, "Own only what you can always carry with you: known languages, known countries, known people. Let your memory be your travel bag"));
        list.add(new data (R.drawable .travel,"Once a year, go someplace you’ve never been before"));
        list.add(new data (R.drawable .travel, "When preparing to travel, lay out all your clothes and all your money. Then take half the clothes and twice the money"));
        list.add(new data (R.drawable .travel, "Travel is never a matter of money but of courage"));
        list.add(new data (R.drawable .travel, "The goal is to die with memories not dreams"));
        list.add(new data (R.drawable .travel, "Two roads diverged in a wood and I – I took the one less traveled by"));
        list.add(new data (R.drawable .travel, "There was nowhere to go but everywhere, so just keep on rolling under the stars"));
        list.add(new data (R.drawable .travel, "Live your life by a compass, not a clock."));
        list.add(new data (R.drawable .travel, "With the right mindset and spirit, only the sky is the limit"));
        list.add(new data (R.drawable .travel, "Everything you do is based on the choices you make"));
        list.add(new data (R.drawable .travel, "There’s no way I was born to just pay bills and die"));
        list.add(new data (R.drawable .travel, "Tourists don’t know where they’ve been, travelers don’t know where they’re going."));
        list.add(new data (R.drawable .travel, "I am not the same, having seen the moon shine on the other side of the world."));






        // list.add(new Data_show ( "" ));
    }
}
