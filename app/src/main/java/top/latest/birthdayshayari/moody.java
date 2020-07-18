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

public class moody extends AppCompatActivity {

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
        setContentView ( R.layout.activity_moody);

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

        list.add(new data (R.drawable .thanksgiving, "We may not have it all together, but together, we have it all."));
        list.add(new data (R.drawable .thanksgiving, "Gobble ‘til you wobble *insert turkey emoticon*"));
        list.add(new data (R.drawable .thanksgiving,"Thanksgiving: Bringing out the best in family dysfunction since 1863."));
        list.add(new data (R.drawable .thanksgiving,"Oh my gourd, I’m stuffed"));
        list.add(new data (R.drawable .thanksgiving, "Thankful, blessed, and mashed potato obsessed"));
        list.add(new data (R.drawable .thanksgiving, "It’s not too much food. This is what we’ve been training for our whole lives. This is our destiny; this is our finest hour."));
        list.add(new data (R.drawable .thanksgiving, "When turkeys get into a fight, they get the stuffing knocked out of them!"));
        list.add(new data (R.drawable .thanksgiving, "It’s not happy people who are thankful; it’s thankful people who are happy."));
        list.add(new data (R.drawable .thanksgiving, "There is always something to be thankful for. Like wine. And pie. And more wine."));
        list.add(new data (R.drawable .thanksgiving,"This wine pairs well with a crazy family."));
        list.add(new data (R.drawable .thanksgiving,"You can tell you ate too much for Thanksgiving when you have to let your bathrobe out."));
        list.add(new data (R.drawable .thanksgiving, "The difference between chickens and turkeys? Chickens celebrate Thanksgiving."));
        list.add(new data (R.drawable .thanksgiving, "No one has ever become poor by giving"));
        list.add(new data (R.drawable .thanksgiving, "I’m thankful for elastic waistbands"));
        list.add(new data (R.drawable .thanksgiving, "After a good dinner, one can forgive anybody, even one’s own relations."));
        list.add(new data (R.drawable .thanksgiving, "Stuffed with stuffing."));
        list.add(new data (R.drawable .thanksgiving,"Not a good day to be my pants."));
        list.add(new data (R.drawable .thanksgiving, "This stuffing is the tur-key to my heart."));
        list.add(new data (R.drawable .thanksgiving, "Now all you have to do is worry about where you’re parents are going to stay and who is going to carve the turkey. Good luck!"));
        list.add(new data (R.drawable .thanksgiving, "Thankful for the human stomach’s capacity to expand."));
        list.add(new data (R.drawable .thanksgiving, "If you are really thankful, what do you do? You share."));
        list.add(new data (R.drawable .thanksgiving, "We offered the turkey some dinner, but he was already stuffed."));
        list.add(new data (R.drawable .thanksgiving, "I came in like a butterball."));
        list.add(new data (R.drawable .thanksgiving, "“I’m grateful for what I am and have. My thanksgiving is perpetual."));
        list.add(new data (R.drawable .thanksgiving, "Happy Thanksgiving, may your hearts be as full as your plates today!"));
        list.add(new data (R.drawable .thanksgiving, "Family and turkey and football—oh my!"));
        list.add(new data (R.drawable .thanksgiving, "Small seeds of gratitude will produce a harvest of hope."));
        list.add(new data (R.drawable .thanksgiving, "“Thanksgiving is a word of ACTION"));
        list.add(new data (R.drawable .thanksgiving, "What did the turkey say to the hunter? Quack, quack, quack."));
        list.add(new data (R.drawable .thanksgiving, "Leftovers are for quitters"));
        list.add(new data (R.drawable .thanksgiving, "Smir-key, Per-ky, Quir-key Turkey."));
        list.add(new data (R.drawable .thanksgiving, "What if, today, we were grateful for everything?"));
        list.add(new data (R.drawable .thanksgiving, "Here’s to family, food, and awkwardly avoiding politics at the dinner table"));
        list.add(new data (R.drawable .thanksgiving, "Give thanks for unknown blessings already on their way."));
        list.add(new data (R.drawable .thanksgiving, "Celebrating Thanksgiving with my favorite turkeys!"));
        list.add(new data (R.drawable .thanksgiving, "My gobble-let overfloweth."));
        list.add(new data (R.drawable .thanksgiving, "I’m all about that baste."));
        list.add(new data (R.drawable .thanksgiving, "Clear plates, full stomachs, can’t lose."));
        list.add(new data (R.drawable .thanksgiving, "I come from a family where gravy is a beverage."));
        list.add(new data (R.drawable .thanksgiving, "Eat, drink, and wear stretchy pants."));
        list.add(new data (R.drawable .thanksgiving, "The thankful receiver bears a bountiful harvest."));
        list.add(new data (R.drawable .thanksgiving, "Giving thanks for the simple things in life"));
        list.add(new data (R.drawable .thanksgiving, "Vegetables are a must on a diet. I suggest carrot cake, zucchini bread, and pumpkin pie"));
        list.add(new data (R.drawable .thanksgiving,"Gratitude is the best attitude."));
        list.add(new data (R.drawable .thanksgiving, "The tur-key to a successful Thanksgiving is family, friends, and eating stuffing till you’re stuffed."));
        list.add(new data (R.drawable .thanksgiving, "The secret of having it all is knowing you already do."));
        list.add(new data (R.drawable .thanksgiving, "Thankful. Grateful. Blessed"));






        // list.add(new Data_show ( "" ));
    }
}
