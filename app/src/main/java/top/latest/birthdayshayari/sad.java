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

public class sad extends AppCompatActivity {
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
        setContentView ( R.layout.activity_sad );

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





        list.add(new data (R.drawable .sad, "I guess broken pieces of glass Hurt one badly and so does broken pieces of human heart."));
        list.add(new data (R.drawable .sad,"World’s may say that it’s over but somewhere in the heart, a feeling called love was still there."));
        list.add(new data (R.drawable .sad, "And in the end, it’s not the people you miss. It’s the memories."));
        list.add(new data (R.drawable .sad, "I can unfriend you, unfollow you, but how can I Unlove you?"));
        list.add(new data (R.drawable .sad, "Winter ended with hopes and then with the autumn, even my hope shed like leaves."));
        list.add(new data (R.drawable .sad, "If I die today, host my funeral with smiles. With my hearts having slivers all around, they might Hurt if you’d come closer."));
        list.add(new data (R.drawable .sad, "The person who cried like hell when my eyes dropped tears has changed a lot."));
        list.add(new data (R.drawable .sad, "A crumbled piece of paper cannot be fixed to become a fine one and so does a broken relationship."));
        list.add(new data (R.drawable .sad, "It’s better to break up when the sweet love turns into poison"));
        list.add(new data (R.drawable .sad, "Even though you were standing beside me, you were never there for me."));
        list.add(new data (R.drawable .sad, "If you left me without any reason, don’t back with an excuse."));
        list.add(new data (R.drawable .sad, "Sometimes it’s better to be alone, so nobody can Hurt you."));
        list.add(new data (R.drawable .sad, "If my Absence doesn’t affect you then my presence has no meaning."));
        list.add(new data (R.drawable .sad, "Don’t leave me alone because I never wanna leave you."));
        list.add(new data (R.drawable .sad, "Nowadays, forever ends when you find someone better."));
        list.add(new data (R.drawable .sad, "There were days when she burnt herself for the sake of fake people and then one day you turned her heart into ashes."));
        list.add(new data (R.drawable .sad, "Sometimes treating some people like stair steps is a way to move on."));
        list.add(new data (R.drawable .sad, "I really don’t regret that I fall for you, because still, I love you."));
        list.add(new data (R.drawable .sad, "The worst missing is missing your old self."));
        list.add(new data (R.drawable .sad,"A lot of you cared, just not enough."));
        list.add(new data (R.drawable .sad, "Breathing is hard. When you cry so much, it makes you realize that breathing is hard"));
        list.add(new data (R.drawable .sad, "Grief is not as heavy as guilt, but it takes more away from you."));
        list.add(new data (R.drawable .sad,"As the light begins to intensify, so does my misery, and I wonder how it is possible to Hurt so much when nothing is wrong."));
        list.add(new data (R.drawable .sad,"Nobody said it’d be easy, they just promised it would be worth it."));
        list.add(new data (R.drawable .sad,"Hugs and kisses are not enough if you don’t have the feeling of love and respect."));
        list.add(new data (R.drawable .sad, "Just because I let you don’t mean I wanted to."));
        list.add(new data (R.drawable .sad,"Somewhere in my heart, I have a hope that everything would be fine one day."));
        list.add(new data (R.drawable .sad, "Sorry is never good enough."));
        list.add(new data (R.drawable .sad,"It’s hard to forget and I regret all my mistakes."));
        list.add(new data (R.drawable .sad, "Everything was just like a fairy tale until you pushed me out of your world."));
        list.add(new data (R.drawable .sad, "What do you do when the only one who can make you stop crying is the one who is making you cry?"));
        list.add(new data (R.drawable .sad, "It hurts the most when the person who made you feel so special yesterday makes you feel so unwanted today."));
        list.add(new data (R.drawable .sad, "Sometimes you just need to erase the messages, delete the number, and move on."));
        list.add(new data (R.drawable .sad, "You made me cry, you told me lies, but I can’t stand to say goodbye."));
        list.add(new data (R.drawable .sad,"The saddest thing in the world is loving someone who used to love you."));
        list.add(new data (R.drawable .sad, "So it’s true when all is said and done, grief is the price we pay for love."));
        list.add(new data (R.drawable .sad, "You won’t ever understand that how much it hurts to let you go."));
        list.add(new data (R.drawable .sad, "I never knew that you could give my place to someone else so soon."));
        list.add(new data (R.drawable .sad,"I loved you so much but I forgot loving you so much is going to Hurt me only."));
        list.add(new data (R.drawable .sad, "It’s sad when you realize you aren’t as important to someone as you thought you were"));
        list.add(new data (R.drawable .sad,"What do you do when the only one who can make you stop crying is the one who made you cry?"));
        list.add(new data (R.drawable .sad, "When you are happy, you enjoy the music. But, when you are sad you understand the lyrics."));
        list.add(new data (R.drawable .sad, "All my dreams were shattered after we broke up."));
        list.add(new data (R.drawable .sad, "If you are not ready to change, you are not ready to love."));
        list.add(new data (R.drawable .sad, "When you gave up on me, I gave up on me too."));
        list.add(new data (R.drawable .sad, "Ignore me. I don’t care. I’m used to it anyways. I’m invisible."));
        list.add(new data (R.drawable .sad,"I’m afraid of being forgotten. Because it seems everyone I get close to, ends up forgetting me."));
        list.add(new data (R.drawable .sad, "You were the sunshine of my life. But I guess an eclipse came in between."));




        // list.add(new Data_show ( "" ));
    }
}
