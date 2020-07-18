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

public class program_quote extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    Adapter adapterRecyclerLinear;

    ArrayList<Data_show> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_program_quote );

        init_ads ();



        recyclerView = findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list = new ArrayList<Data_show> ();
        adapterRecyclerLinear = new Adapter ( this, list );
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




    private void linearList() {




        list.add(new Data_show ( "“Talk is cheap. Show me the code.”" ));


        list.add(new Data_show ( "“when you don't create things, you become defined by your tastes rather than ability. your tastes only narrow & exclude people. so create.”" ));


        list.add(new Data_show ( "“Programs must be written for people to read, and only incidentally for machines to execute.”" ));


        list.add(new Data_show ( "“Always code as if the guy who ends up maintaining your code will be a violent psychopath who knows where you live”" ));


        list.add(new Data_show ( "“Any fool can write code that a computer can understand. Good programmers write code that humans can understand.”" ));


        list.add(new Data_show ( "“I'm not a great programmer; I'm just a good programmer with great habits.”" ));


        list.add(new Data_show ( "“That's the thing about people who think they hate computers. What they really hate is lousy programmers.”" ));

        list.add(new Data_show ( "“Truth can only be found in one place: the code.”" ));


        list.add(new Data_show ( "“Give a man a program, frustrate him for a day.\n" +
                "Teach a man to program, frustrate him for a lifetime.”" ));


        list.add(new Data_show ( "“How you look at it is pretty much how you'll see it”" ));


        list.add(new Data_show ( "“You've baked a really lovely cake, but then you've used dog shit for frosting.”" ));


        list.add(new Data_show ( "“A language that doesn't affect the way you think about programming is not worth knowing.”" ));


        list.add(new Data_show ( "“The most disastrous thing that you can ever learn is your first programming language.”" ));


        list.add(new Data_show ( "\n" +
                "“Big Brother fills us all with the same crap. My guess is he was clever the same way everybody thinks they're clever. I tell her to type in 'password”" ));


        list.add(new Data_show ( "“Coding is Love & Coding is Life.”" ));


        list.add(new Data_show ( "\n" +
                "“Happiness should be a function without any parameters.”" ));



        list.add(new Data_show ( "“Coding like poetry should be short and concise.”" ));


        //list.add(new Data_show ( "" ));

    }
}