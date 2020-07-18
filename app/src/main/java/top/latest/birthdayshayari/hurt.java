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

public class hurt extends AppCompatActivity {

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
        setContentView ( R.layout.activity_hurt );

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


        list.add(new data (R.drawable .hurt,"Truth is everybody is going to Hurt you: you just gotta find the ones worth suffering for."));
        list.add(new data (R.drawable .hurt, "Nobody can Hurt me without my permission."));
        list.add(new data (R.drawable .hurt, "It doesn't Hurt to feel sad from time to time"));
        list.add(new data (R.drawable .hurt, "If you're in trouble, or Hurt or need -- go to the poor people. They're the only ones that'll help -- the only ones."));
        list.add(new data (R.drawable .hurt, "If someone really wants to Hurt you, they'll find a way whatever. I don't want to live my life worrying about it. "));
        list.add(new data (R.drawable .hurt, "The reason it hurts so much to separate is because our souls are connected."));
        list.add(new data (R.drawable .hurt, "I have learned now that while those who speak about one's miseries usually Hurt, those who keep silence Hurt more."));
        list.add(new data (R.drawable .hurt, "Just because one person's problem is less traumatic than another's doesn't mean they're required to Hurt less"));
        list.add(new data (R.drawable .hurt, "I still own my heart, which I know because it hurts so much."));
        list.add(new data (R.drawable .hurt, "Those who really love you don't mean to Hurt you and if they do, you can't see it in their eyes but it hurts them too."));
        list.add(new data (R.drawable .hurt, "It is when we Hurt that we learn."));
        list.add(new data (R.drawable .hurt, "When someone stabs you it's not your fault that you feel pain."));
        list.add(new data (R.drawable .hurt, "It hurts to have someone in your heart that you can't have in your arms."));
        list.add(new data (R.drawable .hurt, "It hurts too much so I don't want to talk about it. "));
        list.add(new data (R.drawable .hurt, "The surest way to Hurt yourself is to give up on love, just because it didn't work out the first time."));
        list.add(new data (R.drawable .hurt, "No matter how beautiful a lie is, in the end it hurts even more than the truth would have done."));
        list.add(new data (R.drawable .hurt, "It's a lot easier to be angry at someone than it is to tell them you're Hurt."));
        list.add(new data (R.drawable .hurt, "Just because somebody is strong enough to handle pain doesn't mean they deserve it."));
        list.add(new data (R.drawable .hurt, "You don't get to choose if you get Hurt in this world. But you do have some say in who hurts you."));
        list.add(new data (R.drawable .hurt, "That old saying, how you always Hurt the one you love, well, it works both ways."));
        list.add(new data (R.drawable .hurt, "A word that has been said may be unsaid--it is but air. But when a deed is done, it cannot be undone, nor can our thoughts reach out to all the mischiefs that may follow."));
        list.add(new data (R.drawable .hurt, "Two barrels of tears will not heal a bruise."));
        list.add(new data (R.drawable .hurt, "A torn jacket is soon mended, but hard words bruise the heart of a child."));
        list.add(new data (R.drawable .hurt, "Do you know the feeling, when your heart is so Hurt, that you could feel the blood dripping?"));
        list.add(new data (R.drawable .hurt, "Forget what Hurt you in the past, but never forget what it taught you."));
        list.add(new data (R.drawable .hurt, "No man can think clearly when his fists are clenched."));
        list.add(new data (R.drawable .hurt, "He who is or has been deeply Hurt has a RIGHT to be sure he is LOVED."));
        list.add(new data (R.drawable .hurt, "There were things I wanted to tell him. But I knew they would Hurt him. So I buried them, and let them Hurt me. "));
        list.add(new data (R.drawable .hurt, "What hurts us is what heals us."));
        list.add(new data (R.drawable .hurt, "Sometimes, being Hurt too many times, doesn't make you stronger, it destroy who you were, who you wanted to be and makes who you are today."));
        list.add(new data (R.drawable .hurt, "As one grows weaker one is less susceptible to suffering. There is less Hurt because there is less to Hurt. "));
        list.add(new data (R.drawable .hurt, "When a girl gives up, it's not because she doesn't love you. But she's tired of getting Hurt and feels like you'll never care."));
        list.add(new data (R.drawable .hurt,"Pain is always emotional. Fear and depression keep constant company with chronic hurting."));
        list.add(new data (R.drawable .hurt,"I can feel the Hurt. There's something good about it. Mostly it makes me stop remembering."));
        list.add(new data (R.drawable .hurt, "Being Hurt by someone you truly care about leaves a hole in you heart that only love can fill."));
        list.add(new data (R.drawable .hurt, "We are more often frightened than Hurt; and we suffer more from imagination than from reality."));
        list.add(new data (R.drawable .hurt,"Don't hold to anger, Hurt or pain. They steal your energy and keep you from love"));
        list.add(new data (R.drawable .hurt, "When you can't remember why you're Hurt, that's when you're healed."));
        list.add(new data (R.drawable .hurt, "Being Hurt is something you can't stop from happening, but being miserable is always your choice"));
        list.add(new data (R.drawable .hurt, "Dont chase after the people that Hurt you, replace them with people that care"));
        list.add(new data (R.drawable .hurt, "Sometimes even stuff you expect to happen can still Hurt."));
        list.add(new data (R.drawable .hurt, "Some people use their own Hurt as an excuse for hurting others"));
        list.add(new data (R.drawable .hurt, "Sometimes pain and Hurt are good things because it means you strived for something in your life."));
        list.add(new data (R.drawable .hurt,"Being brokenhearted is like having broken ribs. On the outside it looks like nothing's wrong, but every breath hurts."));
        list.add(new data (R.drawable .hurt,"Pain can be endured and defeated only if it is embraced. Denied or feared, it grows."));






        // list.add(new Data_show ( "" ));
    }
}
