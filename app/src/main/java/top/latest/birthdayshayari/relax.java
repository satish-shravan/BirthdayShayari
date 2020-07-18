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

public class relax extends AppCompatActivity {
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
        setContentView ( R.layout.activity_relax );

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



        list.add(new data (R.drawable .relax, "Difficult roads often lead to beautiful destinations. The best is yet to come."));
        list.add(new data (R.drawable .relax, "Trust yourself. You've survived a lot, and you'll survive whatever is coming."));
        list.add(new data (R.drawable .relax, "Act the way that you want to feel."));
        list.add(new data (R.drawable .relax,"I promise you nothing is as chaotic as it seems. Nothing is worth diminishing your health. Nothing is worth poisoning yourself into stress, anxiety, and fear."));
        list.add(new data (R.drawable .relax,"There is more to life than increasing its speed"));
        String str2 = "Your mind will answer most questions if you learn to relax and wait for the answer.";
        list.add(new data (R.drawable .relax,str2));
        list.add(new data (R.drawable .relax, "Tension is who you think you should be. Relaxation is who you are"));
        list.add(new data (R.drawable .relax, "Keep walking through the storm. Your rainbow is waiting on the other side."));
        list.add(new data (R.drawable .relax, "Our anxiety does not come from thinking about the future, but from wanting to control it."));
        list.add(new data (R.drawable .relax, "Almost everything will work again if you unplug it for a few minutes...Including you."));
        String str3 = "The time to relax is when you don't have time for it.";
        list.add(new data (R.drawable .relax,str3));
        list.add(new data (R.drawable .relax, "Surrender to what is. Let go of what was. Have faith in what will be"));
        list.add(new data (R.drawable .relax, "Calm mind brings inner strength and self-confidence, so that's very important for good health."));
        list.add(new data (R.drawable .relax,"Slow down and everything you are chasing will come around and catch you"));
        list.add(new data (R.drawable .relax, "Your calm mind is the ultimate weapon against your challenges. So relax."));
        list.add(new data (R.drawable .relax, "Feelings come and go like clouds in a windy sky. Conscious breathing is my anchor"));
        list.add(new data (R.drawable .relax,"The mind should be allowed some relaxation, that it may return to its work all the better for the rest. "));
        list.add(new data (R.drawable .relax,"Relaxation means releasing all concern and tension and letting the natural order of life flow through one's being."));
        list.add(new data (R.drawable .relax, str2));
        list.add(new data (R.drawable .relax, "Sometimes the most productive thing you can do is relax."));
        list.add(new data (R.drawable .relax, str3));
        list.add(new data (R.drawable .relax, "Learn to relax. Your body is precious, as it houses your mind and spirit. Inner peace begins with a relaxed body. "));
        list.add(new data (R.drawable .relax,"Put duties aside at least an hour before bed and perform soothing, quiet activities that will help you relax."));
        list.add(new data (R.drawable .relax, "Tension is who you think you should be. Relaxation is who you are. "));
        list.add(new data (R.drawable .relax, "It is necessary to relax your muscles when you can. Relaxing your brain is fatal."));
        list.add(new data (R.drawable .relax, "Taking time out each day to relax and renew is essential to living well."));
        list.add(new data (R.drawable .relax, "No matter how much pressure you feel at work, if you could find ways to relax for at least five minutes every hour, you'd be more productive.     "));
        list.add(new data (R.drawable .relax, "To help have less stress, take time to relax.   "));
        list.add(new data (R.drawable .relax, "Take rest; a field that has rested gives a bountiful crop."));
        list.add(new data (R.drawable .relax, "It is requisite for the relaxation of the mind that we make use, from time to time, of playful deeds and jokes."));
        list.add(new data (R.drawable .relax, "He enjoys true leisure who has time to improve his soul's estate."));
        list.add(new data (R.drawable .relax,"Man is so made that he can only find relaxation from one kind of labor by taking up another."));
        list.add(new data (R.drawable .relax, "How beautiful it is to do nothing, and then to rest afterward."));
        list.add(new data (R.drawable .relax,"It's a good idea always to do something relaxing prior to making an important decision in your life."));
        list.add(new data (R.drawable .relax, "If you do what you love, it is the best way to relax.   "));
        list.add(new data (R.drawable .relax, "The ability to relax and be mindfully present in the moment comes naturally when we are grateful."));
        list.add(new data (R.drawable .relax, "What is the answer to this fatigue? Relax! Relax! Relax! Learn to relax while you are doing your work!"));





        // list.add(new Data_show ( "" ));
    }
}
