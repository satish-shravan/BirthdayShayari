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

public class motivation_insta extends AppCompatActivity {


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
        setContentView ( R.layout.activity_motivation_insta );



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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId () == android.R.id.home)
        {
            finish ();
            return  true;
        }
        return super.onOptionsItemSelected ( item );
    }



    private void linearList()
    {



        list.add(new data (R.drawable .motivation, "The Way Get Started Is To Quit Talking And Begin Doing."));
        list.add(new data (R.drawable .motivation, "The Pessimist Sees Difficulty In Every Opportunity. The Optimist Sees Opportunity In Every Difficulty."));
        list.add(new data (R.drawable .motivation, "Don’t Let Yesterday Take Up Too Much Of Today."));
        list.add(new data (R.drawable .motivation, "You Learn More From Failure Than From Success. Don’t Let It Stop You. Failure Builds Character."));
        list.add(new data (R.drawable .motivation, "It’s Not Whether You Get Knocked Down, It’s Whether You Get Up."));
        list.add(new data (R.drawable .motivation, "People Who Are Crazy Enough To Think They Can Change The World, Are The Ones Who Do."));
        list.add(new data (R.drawable .motivation, "Failure Will Never Overtake Me If My Determination To Succeed Is Strong Enough."));
        list.add(new data (R.drawable .motivation, "Entrepreneurs Are Great At Dealing With Uncertainty And Also Very Good At Minimizing Risk. That’s The Classic Entrepreneur."));
        list.add(new data (R.drawable .motivation, "We May Encounter Many Defeats But We Must Not Be Defeated."));
        list.add(new data (R.drawable .motivation, "Knowing Is Not Enough; We Must Apply. Wishing Is Not Enough; We Must Do."));
        list.add(new data (R.drawable .motivation, "Imagine Your Life Is Perfect In Every Respect; What Would It Look Like?"));
        list.add(new data (R.drawable .motivation,"We Generate Fears While We Sit. We Overcome Them By Action."));
        list.add(new data (R.drawable .motivation,"Whether You Think You Can Or Think You Can’t, You’re Right."));
        list.add(new data (R.drawable .motivation, "Security Is Mostly A Superstition. Life Is Either A Daring Adventure Or Nothing."));
        list.add(new data (R.drawable .motivation, "The Man Who Has Confidence In Himself Gains The Confidence Of Others."));
        list.add(new data (R.drawable .motivation, "The Only Limit To Our Realization Of Tomorrow Will Be Our Doubts Of Today."));
        list.add(new data (R.drawable .motivation, "Creativity Is Intelligence Having Fun."));
        list.add(new data (R.drawable .motivation, "What You Lack In Talent Can Be Made Up With Desire, Hustle And Giving 110% All The Time."));
        list.add(new data (R.drawable .motivation, "Do What You Can With All You Have, Wherever You Are."));
        list.add(new data (R.drawable .motivation, "Develop An ‘Attitude Of Gratitude’. Say Thank You To Everyone You Meet For Everything They Do For You."));
        list.add(new data (R.drawable .motivation, "You Are Never Too Old To Set Another Goal Or To Dream A New Dream."));
        list.add(new data (R.drawable .motivation, "To See What Is Right And Not Do It Is A Lack Of Courage."));
        list.add(new data (R.drawable .motivation,"Reading Is To The Mind, As Exercise Is To The Body."));
        list.add(new data (R.drawable .motivation, "Fake It Until You Make It! Act As If You Had All The Confidence You Require Until It Becomes Your Reality."));
        list.add(new data (R.drawable .motivation, "The Future Belongs To The Competent. Get Good, Get Better, Be The Best!"));
        list.add(new data (R.drawable .motivation, "For Every Reason It’s Not Possible, There Are Hundreds Of People Who Have Faced The Same Circumstances And Succeeded."));
        list.add(new data (R.drawable .motivation,"Things Work Out Best For Those Who Make The Best Of How Things Work Out."));
        list.add(new data (R.drawable .motivation, "A Room Without Books Is Like A Body Without A Soul."));
        list.add(new data (R.drawable .motivation, "I Think Goals Should Never Be Easy, They Should Force You To Work, Even If They Are Uncomfortable At The Time."));
        list.add(new data (R.drawable .motivation, "One Of The Lessons That I Grew Up With Was To Always Stay True To Yourself And Never Let What Somebody Else Says Distract You From Your Goals."));
        list.add(new data (R.drawable .motivation, "Today’s Accomplishments Were Yesterday’s Impossibilities."));
        list.add(new data (R.drawable .motivation, "The Only Way To Do Great Work Is To Love What You Do. If You Haven’t Found It Yet, Keep Looking. Don’t Settle."));
        list.add(new data (R.drawable .motivation, "You Don’t Have To Be Great To Start, But You Have To Start To Be Great."));
        list.add(new data (R.drawable .motivation, "A Clear Vision, Backed By Definite Plans, Gives You A Tremendous Feeling Of Confidence And Personal Power."));
        list.add(new data (R.drawable .motivation, "There Are No Limits To What You Can Accomplish, Except The Limits You Place On Your Own Thinking."));
        list.add(new data (R.drawable .motivation,"Integrity Is The Most Valuable And Respected Quality Of Leadership. Always Keep Your Word."));
        list.add(new data (R.drawable .motivation, "Leadership Is The Ability To Get Extraordinary Achievement From Ordinary People"));
        list.add(new data (R.drawable .motivation, "Leaders Set High Standards. Refuse To Tolerate Mediocrity Or Poor Performance"));
        list.add(new data (R.drawable .motivation, "Clarity Is The Key To Effective Leadership. What Are Your Goals?"));
        list.add(new data (R.drawable .motivation,"The Best Leaders Have A High Consideration Factor. They Really Care About Their People"));
        list.add(new data (R.drawable .motivation, "Leaders Think And Talk About The Solutions. Followers Think And Talk About The Problems"));
        list.add(new data (R.drawable .motivation,"The Key Responsibility Of Leadership Is To Think About The Future. No One Else Can Do It For You."));
        list.add(new data (R.drawable .motivation, "The Effective Leader Recognizes That They Are More Dependent On Their People Than They Are On Them. Walk Softly."));
        list.add(new data (R.drawable .motivation, "Leaders Never Use The Word Failure. They Look Upon Setbacks As Learning Experiences."));
        list.add(new data (R.drawable .motivation, "Practice Golden Rule Management In Everything You Do. Manage Others The Way You Would Like To Be Managed."));
        list.add(new data (R.drawable .motivation, "Superior Leaders Are Willing To Admit A Mistake And Cut Their Losses. Be Willing To Admit That You’ve Changed Your Mind. Don’t Persist When The Original Decision Turns Out To Be A Poor One."));
        list.add(new data (R.drawable .motivation, "Leaders Are Anticipatory Thinkers. They Consider All Consequences Of Their Behaviors Before They Act."));
        list.add(new data (R.drawable .motivation, "The True Test Of Leadership Is How Well You Function In A Crisis."));
        list.add(new data (R.drawable .motivation, "Leaders Concentrate Single-Mindedly On One Thing– The Most Important Thing, And They Stay At It Until It’s Complete."));
        list.add(new data (R.drawable .motivation,"The Three ‘C’s’ Of Leadership Are Consideration, Caring, And Courtesy. Be Polite To Everyone."));
        list.add(new data (R.drawable .motivation,"Respect Is The Key Determinant Of High-Performance Leadership. How Much People Respect You Determines How Well They Perform."));
        list.add(new data (R.drawable .motivation,"Leadership Is More Who You Are Than What You Do."));
        list.add(new data (R.drawable .motivation, "Entrepreneurial Leadership Requires The Ability To Move Quickly When Opportunity Presents Itself."));
        list.add(new data (R.drawable .motivation, "Leaders Are Innovative, Entrepreneurial, And Future-Oriented. They Focus On Getting The Job Done"));
        list.add(new data (R.drawable .motivation, "Leaders Are Never Satisfied; They Continually Strive To Be Better."));





        // list.add(new Data_show ( "" ));
    }
}
