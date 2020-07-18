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

public class trust extends AppCompatActivity {


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
        setContentView ( R.layout.activity_trust );



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





        list.add(new data (R.drawable .trust, "A single lie discovered is enough to create doubt in every truth expressed."));
        list.add(new data (R.drawable .trust,"Don’t trust the person who has broken faith once."));
        list.add(new data (R.drawable .trust, "Trust takes years to build, seconds to break, and forever to repair."));
        list.add(new data (R.drawable .trust,"How can people trust the harvest unless they see it sown?"));
        list.add(new data (R.drawable .trust, "“It was a mistake,” you said. But the cruel thing was, it felt like the mistake was mine, for trusting you."));
        list.add(new data (R.drawable .trust, "Trust starts with truth and ends with truth."));
        list.add(new data (R.drawable .trust,"Trust is built when someone is vulnerable and not taken advantage of."));
        list.add(new data (R.drawable .trust, "Trusting is hard. Knowing who to trust, even harder."));
        list.add(new data (R.drawable .trust, "Trust is like a mirror, you can fix it if it’s broken, but you can still see the crack in that mother f*cker’s reflection."));
        list.add(new data (R.drawable .trust, "After all, damn it, what does being in love mean if you can’t trust a person."));
        list.add(new data (R.drawable .trust, "I’m not upset that you lied to me, I’m upset that from now on I can’t believe you."));
        list.add(new data (R.drawable .trust, "Trust is the glue of life. It’s the most essential ingredient in effective communication. It’s the foundational principle that holds all relationships. "));
        list.add(new data (R.drawable .trust,"There are two reasons why we don’t trust people. First- we don’t know them. Second- we know them."));
        list.add(new data (R.drawable .trust, "If you give your trust to a person who does not deserve it, you actually give him the power to destroy you."));
        list.add(new data (R.drawable .trust, "I do not trust words. I even question actions. But I never doubt patterns."));
        list.add(new data (R.drawable .trust, "You may be deceived if you trust too much, but you will live in torment unless you trust enough."));
        list.add(new data (R.drawable .trust, "I’m a good enough person to forgive you, but not stupid enough to trust you again."));
        list.add(new data (R.drawable .trust, "Love all, trust a few"));
        list.add(new data (R.drawable .trust, "Trust, but verify."));
        list.add(new data (R.drawable .trust, "Never trust someone who lies to you. Never lie to someone who trusts you. "));
        list.add(new data (R.drawable .trust, "When you fully trust someone without any doubt, you finally get one of two results: a person for life or a lesson for life"));
        list.add(new data (R.drawable .trust, "Behind every untrusting girl is a boy who taught her to be that way…"));
        list.add(new data (R.drawable .trust, "Tell a lie once, and all your truths become questionable."));
        list.add(new data (R.drawable .trust, "The worst part about being lied to is knowing that you weren’t worth the truth."));
        list.add(new data (R.drawable .trust, "Trust is like an eraser; it gets smaller and smaller after every mistake."));
        list.add(new data (R.drawable .trust,"It takes two people to make a lie work: the person who tells it, and the one who believes it."));
        list.add(new data (R.drawable .trust, "Love is giving someone the power to destroy you, but trusting them not to."));
        list.add(new data (R.drawable .trust, "There are only two types of people that tell the truth, the drunk and the angry…"));
        list.add(new data (R.drawable .trust, "My love is unconditional. My trust and my respect are not."));
        list.add(new data (R.drawable .trust, "A liar will always be a liar. They will only get better at it."));
        list.add(new data (R.drawable .trust, "Stop asking me to trust you while I’m still coughing up water from the last time you let me drown."));
        list.add(new data (R.drawable .trust, "The Less You Trust, The Less You Get Hurt."));
        list.add(new data (R.drawable .trust, "When you start to wonder whether you can trust someone or not, that is when you already know you don’t"));
        list.add(new data (R.drawable .trust, "I never hide the truth; I just don’t tell them.\n"));
        list.add(new data (R.drawable .trust, "Don’t trust everything you see. Even salt looks like sugar."));
        list.add(new data (R.drawable .trust, "The fundamental glue that holds any relationship together… is trust."));
        list.add(new data (R.drawable .trust, "Trusting you is my decision. Proving me right is your choice."));
        list.add(new data (R.drawable .trust,"Trust is like a paper, once it’s crumpled it can’t be perfect again."));
        list.add(new data (R.drawable .trust, "Relationships are about trust. If you have to play detective, then it’s time to move on."));
        list.add(new data (R.drawable .trust, "The best proof of love is trust."));
        list.add(new data (R.drawable .trust, "Trust only Movement. Life happens at the level of events, not words."));
        list.add(new data (R.drawable .trust, "“I love you” is far different from “I trust you”"));
        list.add(new data (R.drawable .trust, "To be trusted is a greater compliment than to be loved."));
        list.add(new data (R.drawable .trust, "Never trust a man who speaks well of everybody."));
        list.add(new data (R.drawable .trust, "Don’t ever break someone’s trust. Once you do, then nobody wants to do business with you."));
        list.add(new data (R.drawable .trust, "Only trust thyself, and another shall not betray thee"));
        list.add(new data (R.drawable .trust, "Trust should be the basis for all our moral training"));
        list.add(new data (R.drawable .trust, "For every good reason there is to lie, there is a better reason to tell the truth."));
        list.add(new data (R.drawable .trust, "The trust of the innocent is the liar’s most useful tool."));
        list.add(new data (R.drawable .trust, "Most good relationships are built on mutual trust and respect."));
        list.add(new data (R.drawable .trust, "Love all, trust a few, do wrong to none."));
        list.add(new data (R.drawable .trust, "You may be deceived if you trust too much, but you will live in torment if you don’t trust enough."));
        list.add(new data (R.drawable .trust, "Trust and belief are two prime considerations. You must not allow yourself to be opinionated"));
        list.add(new data (R.drawable .trust, "Trust no friend without faults, and love a woman, but no angel."));
        list.add(new data (R.drawable .trust, "Never trust anything that can think for itself if you can’t see where it keeps its brain"));
        list.add(new data (R.drawable .trust, "Trust is like a mirror, you can fix it if it’s broken, but you can still see the crack in that mother fucker’s reflection."));
        list.add(new data (R.drawable .trust, "Never trust anyone completely but God. Love people, but put your full trust only in God."));




        // list.add(new Data_show ( "" ));
    }
}
