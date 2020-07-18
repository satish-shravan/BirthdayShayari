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

public class football extends AppCompatActivity {

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
        setContentView ( R.layout.activity_football );

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



        list.add(new data (R.drawable .football, "The only way to prove that you’re a good sport is to lose."));
        list.add(new data (R.drawable .football, "Only he who can see the invisible can do the impossible"));
        list.add(new data (R.drawable .football, "When you’re riding, only the race in which you’re riding is important"));
        list.add(new data (R.drawable .football, "Age is no barrier. It’s a limitation you put on your mind."));
        list.add(new data (R.drawable .football, "I always felt that my greatest asset was not my physical ability, it was my mental ability"));
        list.add(new data (R.drawable .football, "A trophy carries dust. Memories last forever"));
        list.add(new data (R.drawable .football, "Number one is just to gain a passion for running. To love the morning, to love the trail, to love the pace on the track. And if some kid gets really good at it, that’s cool too."));
        list.add(new data (R.drawable .football, "Most people give up just when they’re about to achieve success. They quit on the one yard line. They give up at the last minute of the game one foot from a winning touchdown."));
        list.add(new data (R.drawable .football,"You have to do something in your life that is honorable and not cowardly if you are to live in peace with yourself."));
        list.add(new data (R.drawable .football, "There may be people that have more talent than you, but theres no excuse for anyone to work harder than you do."));
        list.add(new data (R.drawable .football, "Baseball is the only field of endeavor where a man can succeed three times out of ten and be considered a good performer."));
        list.add(new data (R.drawable .football, "One man practicing sportsmanship is far better than 50 preaching it."));
        list.add(new data (R.drawable .football, "The five S’s of sports training are: stamina, speed, strength, skill, and spirit; but the greatest of these is spirit"));
        list.add(new data (R.drawable .football, "An athlete cannot run with money in his pockets. He must run with hope in his heart and dreams in his head."));
        list.add(new data (R.drawable .football, "Somewhere behind the athlete you’ve become and the hours of practice and the coaches who have pushed you is a little girl who fell in love with the game and never looked back… play for her."));
        list.add(new data (R.drawable .football, "When you’ve got something to prove, there’s nothing greater than a challenge."));
        list.add(new data (R.drawable .football, "Never give up, never give in, and when the upper hand is ours, may we have the ability to handle the win with the dignity that we absorbed the loss."));
        list.add(new data (R.drawable .football, "It’s not the will to win that matters—everyone has that. It’s the will to prepare to win that matters."));
        list.add(new data (R.drawable .football, "Persistence can change failure into extraordinary achievement."));
        list.add(new data (R.drawable .football, "I’ve learned that something constructive comes from every defeat."));
        list.add(new data (R.drawable .football,"Make sure your worst enemy doesn’t live between your own two ears."));
        list.add(new data (R.drawable .football, "Set your goals high, and don’t stop till you get there."));
        list.add(new data (R.drawable .football, "I became a good pitcher when I stopped trying to make them miss the ball and started trying to make them hit it"));
        list.add(new data (R.drawable .football, "If you can’t outplay them, outwork them."));
        list.add(new data (R.drawable .football,"People ask me what I do in winter when there’s no baseball. I’ll tell you what I do. I stare out the window and wait for spring."));
        list.add(new data (R.drawable .football,"Most people never run far enough on their first wind to find out they’ve got a second."));
        list.add(new data (R.drawable .football, "Do you know what my favorite part of the game is? The opportunity to play."));
        list.add(new data (R.drawable .football,"If at first you don’t succeed, you are running about average."));
        list.add(new data (R.drawable .football, "Continuous effort — not strength or intelligence — is the key to unlocking our potential."));
        list.add(new data (R.drawable .football, "Good is not good when better is expected."));
        list.add(new data (R.drawable .football, "The difference between the impossible and the possible lies in a person’s determination."));
        list.add(new data (R.drawable .football, "Champions keep playing until they get it right."));
        list.add(new data (R.drawable .football, "You were born to be a player. You were meant to be here. This moment is yours."));
        list.add(new data (R.drawable .football,"What you lack in talent can be made up with desire, hustle, and giving 110 percent all the time"));
        list.add(new data (R.drawable .football, "If you fail to prepare, you’re prepared to fail."));
        list.add(new data (R.drawable .football, "How you respond to the challenge in the second half will determine what you become after the game, whether you are a winner or a loser"));
        list.add(new data (R.drawable .football, "The principle is competing against yourself. It’s about self-improvement, about being better than you were the day before."));
        list.add(new data (R.drawable .football,"The road to Easy Street goes through the sewer."));
        list.add(new data (R.drawable .football,"You are never really playing an opponent. You are playing yourself, your own highest standards, and when you reach your limits, that is real joy"));
        list.add(new data (R.drawable .football, "What makes something special is not just what you have to gain, but what you feel there is to lose."));
        list.add(new data (R.drawable .football, "The more difficult the victory, the greater the happiness in winning."));
        list.add(new data (R.drawable .football, "One man can be a crucial ingredient on a team, but one man cannot make a team"));
        list.add(new data (R.drawable .football, "Nobody who ever gave his best regretted it."));





        // list.add(new Data_show ( "" ));
    }
}
