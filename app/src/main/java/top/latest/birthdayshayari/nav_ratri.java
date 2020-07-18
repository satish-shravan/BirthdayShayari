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

public class nav_ratri extends AppCompatActivity {

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
        setContentView ( R.layout.activity_nav_ratri );

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


        list.add(new data (R.drawable .navratr, "A new day is here again;\nperfect and untainted\nMake the best of it,\nspreading joy and unconditional love throughout\nHappy Navratri"));
        list.add(new data (R.drawable .navratr, "Wishing you a very happy and vibrant New Year and auspicious Navratras."));
        list.add(new data (R.drawable .navratr, "May the nine divine days illuminate your life for ever\nHappy Navratra"));
        list.add(new data (R.drawable .navratr, "Blessings, greetings, sweet, joyful, loving energy to you all\nHappy Navratas"));
        list.add(new data (R.drawable .navratr, "Experience the mystical beauty and Divine wonders\nMay the Navratras bring delight to each moment of your life"));
        list.add(new data (R.drawable .navratr, "I bow to Adi-Shakti, the primal power\nI bow to the all-encompassing power\nI bow to the creative power\nI bow to the divine mother\nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "May the auspicious days of Vasant Navratri manifest energy (shakti), wealth (lakshmi), and knowledge (gyaan) into your life Happy Navratras!"));
        list.add(new data (R.drawable .navratr, "May the Goddess of cosmic powers bless all with Her divine benediction Happy Navratra!"));
        list.add(new data (R.drawable .navratr, "Chaitra Navratri marks the onset of the summer season let us celebrate Divine Mother representing ‘prakriti’ (nature) and welcome new beginnings and the New Year"));
        list.add(new data (R.drawable .navratr, "Celebrate the victory of good over evil experience the grace and energies of the Goddess Happy Navratri"));
        list.add(new data (R.drawable .navratr, "May this New Year be a happy mix of the flavours of life\nShubh Navratri"));
        list.add(new data (R.drawable .navratr,"hank you O Goddess Divine for sharing your love and radiance\nfor Life, flowing through us and around us\nHappy Navratri!\nMay each soul receive Her blessings as she comes riding her lion."));
        list.add(new data (R.drawable .navratr, "May Mother Divine illuminate all corners of our being until all is light.\nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "Celebrate the festivities of the New Year by welcoming the divine feminine energy\nMay all be blessed,\nHappy Navratri!"));
        list.add(new data (R.drawable .navratr,"Dispeller of delusion\nconqueror of fear\nO mother Divine\ncleanse the impurities of our mind and lead us to light\nWishing all an auspicious Navratri!"));
        list.add(new data (R.drawable .navratr,"Let’s join our hands in prayer\nand welcome the Divine mother\nMay we all be blessed with wisdom and strength\nShubh Navratras to all!"));
        list.add(new data (R.drawable .navratr, "May the choicest blessings of Maa Durga bring happiness, peace, and harmony to your life.\nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "May this Navratas bring you new beginnings and expanded potential!"));
        list.add(new data (R.drawable .navratr,"May the 9 avatars of Maa Durga bless you with 9 qualities –\npower, happiness, humanity, peace, knowledge, devotion, name, fame and health."));
        list.add(new data (R.drawable .navratr, "Wishing you fantastic nine nights of devotion, spirituality, and happiness. \nMay Maa shower her choicest blessings over you. \nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "May Maa light up the hope of happy times and your year become full of smiles. \nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "Cherishing new beginnings with the arrival of Maa Durga at home. \nHappy Navratri!"));
        list.add(new data (R.drawable .navratr, "Wishing you fantastic nine nights of devotion, spirituality, and happiness. May Maa shower her choicest blessings over you. Happy Navratri!"));
        list.add(new data (R.drawable .navratr,"Good fortune, Good health, Happy life, All these are my wishes for you on this Navratri! Have a great one!"));
        list.add(new data (R.drawable .navratr, "Let this divine occurrence bring smiles to our hearts and faces. May you have a blessed experience this Navratri. Best wishes!"));
        list.add(new data (R.drawable .navratr, "Sending my warm wishes for a Happy Navratri! May the day bring you good fortune and success. May Maa Durga bless you today and forever."));
        list.add(new data (R.drawable .navratr, "May this Navratri be as bright as ever and fulfill all your desires and wishes. Enjoy the season of mirth and love! Wishing you a very Joyous and Happy Navratri!"));
        list.add(new data (R.drawable .navratr,"May goddess Durga rid you of all the problems in life! This Navratri onwards, may there only happiness in your life. Wishing you a happy Navratri."));
        list.add(new data (R.drawable .navratr, "May Navratri bring good luck and good health to you! May the auspicious festival add more sparkle to your life as well as that of your loved ones!"));
        list.add(new data (R.drawable .navratr, "May this Navratri, light up for you. The hopes of Happy times, and dreams for a year full of smiles! Wish you Happy Navratri."));







        // list.add(new Data_show ( "" ));
    }
}
