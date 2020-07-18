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

public class motivation extends AppCompatActivity {

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
        setContentView ( R.layout.activity_motivation );

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

        list.add(new Data_show ( "T – This is an\n" +
                "O – Opportunity to\n" +
                "D – Do your tasks and\n" +
                "A – Accomplish work of\n" +
                "Y – Yesterday!" ));






        list.add(new Data_show ( " \"If you want to achieve greatness stop asking for permission.\"" ));


        list.add(new Data_show ( "\"Things work out best for those who make the best of how things work out.\"" ));








        list.add(new Data_show ( " \"If you do what you always did, you will get what you always got.\"" ));








        list.add(new Data_show ( "यदि आप सही है तो, आपको गुस्सा होने की जरूरत नहीं.\n" +
                "और यदि आप गलत है तो, आपको गुस्सा होने का कोई हक नहीं।" ));


        list.add(new Data_show ( "क्या हार में, क्या जीत में\n" +
                "किंचित नहीं भयभीत मैं\n" +
                "कर्तव्य पथ पर जो भी मिला\n" +
                "यह भी सही, वो भी सही\n" +
                "वरदान नहीं मांगूंगा\n" +
                "हो कुछ पर हार नहीं मानूंगा\n" +
                "\n" +
                "– अटल बिहारी वाजपेयी" ));


        list.add(new Data_show ( "आपकी किस्मत आपको मौका देगी,\n" +
                "मगर आपकी मेहनत सबको चौका देगी" ));


        list.add(new Data_show ( "ना संघर्ष, ना तकलीफ…\n" +
                "तो क्या मज़ा है जीने में\n" +
                "बड़े बड़े तूफ़ान थम जाते हैं\n" +
                "जब आग लगी हो सीने में !" ));

        list.add(new Data_show ( "\"Take up one idea. Make that one idea your life--think of it, dream of it, live on that idea. Let the brain, muscles, nerves, every part of your body, be full of that idea, and just leave every other idea alone. This is the way to success.\"" ));


        list.add(new Data_show ( "\"All our dreams can come true if we have the courage to pursue them.\"" ));

        list.add(new Data_show ( "\"Good things come to people who wait, but better things come to those who go out and get them.\"" ));


        list.add(new Data_show ( "खैरात में मिली हुई खुशी हमे पसंद नही है,\n" +
                "क्यूंकि हम गम में भी नवाब की तरह जीते है" ));


        list.add(new Data_show ( "लाख टके की बात \uD83D\uDC4C\n" +
                "\n" +
                "जो मुस्कुरा रहा है, उसे दर्द ने पाला होगा..\n" +
                "जो चल रहा है, उसके पाँव में छाला होगा..\n" +
                "बिना संघर्ष के इन्सान चमक नही सकता, यारों..\n" +
                "जो जलेगा उसी दिये में तो, उजाला होगा..!!" ));


        list.add(new Data_show ( "Gham na kar Zindagi bahut badi hai,\n" +
                "Chahat ki mehfil tere liye saji hai,\n" +
                "Bas ek bar muskura kar tho dekh,\n" +
                "Taqdeer khud tujhse milne bahar khadi hai." ));


        list.add(new Data_show ( "You can do nothing today and\n" +
                "have an uncertain tomorrow..\n" +
                "or you can do something good today\n" +
                "to shape a better and brighter tomorrow." ));


        list.add(new Data_show ( "Dushman ko hazaar mauke do,\n" +
                "Ki woh tumhara dost ban jaye.\n" +
                "Lekin dost ko ek bhi mauka mat do,\n" +
                "Ki woh tumhara dushman ban jaye." ));


        list.add(new Data_show ( "Na kisi se irsha,\n" +
                "Na kisi se koi hod,\n" +
                "Meri apni manzile,\n" +
                "Meri apni daud." ));


        list.add(new Data_show ( "Zindagi tasveer bhi Hai or taqdeer bhi hain,\n" +
                "Farak to bas rango ka hain,\n" +
                "Maanchahe rango se bane to tasveer,\n" +
                "Or aanjane rango se bane to taqdeer." ));


        list.add(new Data_show ( "Opportunities are Equal for all..\n" +
                "But\n" +
                "The Difference is that..\n" +
                "Positive person gives Results & Negative person gives Reasons n excuses.." ));

        list.add(new Data_show ( "\"Trust because you are willing to accept the risk, not because it's safe or certain.\" " ));


        list.add(new Data_show ( " \"To live a creative life, we must lose our fear of being wrong.\"" ));


        list.add(new Data_show ( "\"If you are not willing to risk the usual you will have to settle for the ordinary.\"" ));


        list.add(new Data_show ( "Use your eyes to see the needs,\n" +
                "and use your talents to meet them." ));


        list.add(new Data_show ( "Martin Luther king said\n" +
                "\n" +
                "If u cant Fly.. Run,\n" +
                "If u cant Run.. Walk,\n" +
                "If u cant Walk.. Crawl,\n" +
                "But Keep Moving." ));


        list.add(new Data_show ( "Smooth roads never make good drivers..\n" +
                "Smooth sea never make good sailors..\n" +
                "Clear skies never make good pilots..\n" +
                "Problem free life never makes a strong and good person..\n" +
                "Have a tough, but winning day ahead..\n" +
                "Be strong enough to accept the challenges of life.. \uD83D\uDE42" ));


        list.add(new Data_show ( "People will hate you,\n" +
                "Rate you,\n" +
                "Shake you,\n" +
                "And break you.\n" +
                "But..\n" +
                "How strong you stand is what makes you..!!" ));


        list.add(new Data_show ( "Hawa Mein Taash Ka Ghar Nahi Bante,\n" +
                "Rone Se Bigda Muqadar Nahi Bante,\n" +
                "Duniya Jitne Ka Hosla Rakh -e- Dost,\n" +
                "Ek Jeet Se Koi Sikandar Nahi Bante." ));


        list.add(new Data_show ( "Mushkilo Se Bhag Jana Asan Hota Hai,\n" +
                "Har Pehlu Zindagi Ka Imthian Hota Hai,\n" +
                "Darne Walo Ko Milta Nahi Kuch Zindagi Me,\n" +
                "Ladne Walo K Kadmo Me Jahan Hota Hai." ));


        list.add(new Data_show ( "Haskar jeena dastur hai jindagi ka,\n" +
                "Ek yahi kissa mashur hai jindagi ka,\n" +
                "Beete hue pal kabhi laut kar nahi aate,\n" +
                "Yahi sabse badha kasur hai jindagi ka." ));


        list.add(new Data_show ( "Jeet ki khatir bas junoon chahiye,\n" +
                "Jisme Ubaal ho aisa khoon chahiye,\n" +
                "Yeh asmaan bhi aayega zameen par,\n" +
                "Bas iraadon me jeet ki goonj chahiye." ));


        list.add(new Data_show ( "Whenever you get Pains in your life.\n" +
                "Just think about the fullform of Pains.\n" +
                "‘Positive Attitude In Negative situation’\n" +
                "Follow it & your Life will change.." ));




        list.add(new Data_show ( "\"Success is walking from failure to failure with no loss of enthusiasm.\"" ));


        list.add(new Data_show ( " \"Just when the caterpillar thought the world was ending, he turned into a butterfly.\"" ));


        list.add(new Data_show ( "\"Successful entrepreneurs are givers and not takers of positive energy.\"" ));


        list.add(new Data_show ( " \"Whenever you see a successful person you only see the public glories, never the private sacrifices to reach them.\"" ));


        list.add(new Data_show ( " \"Opportunities don't happen, you create them.\"" ));





        list.add(new Data_show ( "\"All progress takes place outside the comfort zone.\"" ));


        list.add(new Data_show ( "Hope is one of the greatest gift\n" +
                "to all of us because its that magic\n" +
                "which inspires us to keep\n" +
                "trying\n" +
                "learning\n" +
                "loving\n" +
                "&\n" +
                "living." ));






        list.add(new Data_show ( " \"Try not to become a person of success, but rather try to become a person of value.\"" ));


        list.add(new Data_show ( "\"Great minds discuss ideas; average minds discuss events; small minds discuss people.\"" ));


        list.add(new Data_show ( " \"I have not failed. I've just found 10,000 ways that won't work.\"" ));


        list.add(new Data_show ( "\"If you don't value your time, neither will others. Stop giving away your time and talents--start charging for it.\"" ));




        //list.add(new Data_show ( "" ));

    }
}
