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
public class birthday extends AppCompatActivity {


    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;


    private RecyclerView recyclerView,horizontal_recycler;
    private  RecyclerView.LayoutManager layoutManager;

    Adapter adapterRecyclerLinear;

    ArrayList<Data_show> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_birthday );


        init_ads ();



        recyclerView=findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager=  new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list= new ArrayList<Data_show> (  );
        adapterRecyclerLinear = new Adapter ( this,list);
        recyclerView.setAdapter ( adapterRecyclerLinear );
      //  Toast.makeText ( this,"CLICK TO SHARE  :)",Toast.LENGTH_LONG ).show ();
        linearList();



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


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "खुशी से बीते हर दिन,\n" +
                "हर रात सुहानी हो,\n" +
                "जिस तरफ आपके कदम पडे,\n" +
                "वह फूलों की बरसात हो…\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "आसमान की बुलंदियों पर नाम हो आपका,\n" +
                "चाँद की धरती पर मुकाम हो आपका,\n" +
                "हम तो रहते है छोटी सी दुनिया में,\n" +
                "पर खुदा करे सारा जहाँ हो आपका.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "दुआ मिले बन्दों से खुशियां मिले जग से,\n" +
                "साथ मिले अपनों से रेहमत मिले रब से,\n" +
                "ज़िन्दगी में आप को बे पनाह प्यार मिले,\n" +
                "खुश रहे आप दुनिया में ज्यादा सुब से.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "खुदा बुरी नज़र से बचाए आप को,\n" +
                "चाँद सितारों से सजाए आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी मे इतना हँसाए आप को.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "जन्मदिन के ये ख़ास लम्हें मुबारक,\n" +
                "आँखों में बसे नए ख्वाब मुबारक,\n" +
                "जिंदगी जो लेकर आई है आपके लिए आज..\n" +
                "वो तमाम खुशियों की हंसीं सौगात मुबारक!!!\n" +
                "Happy Birthday\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "बुलंद रहे सदा आपके सितारे\n" +
                "टलती रहें आपकी सारी बलाएं यही दुआ हमारी.\n" +
                "आपको जन्मदिन की\n" +
                "हार्दिक शुभकामनाएँ.\n" +
                "\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "चाँद से प्यारी चाँदनी,\n" +
                "चाँदनी से भी प्यारी रात,\n" +
                "रात से प्यारी ज़िन्दगी,\n" +
                "और ज़िन्दगी से भी प्यारे आप,\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\n" +
                "बार बार यह दिन आये,\n" +
                "बार बार यह दिल गाये,\n" +
                "तू जिए हजारों साल,\n" +
                "यह मेरी है आरज़ू,\n" +
                "हॅप्पी बर्थडे टु यू\n" +
                "शोना…\n" +
                "हॅप्पी बर्थडे टु यू !!!\uD83C\uDF82\n" +
                "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39" ));



        list.add(new Data_show ( "\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\n" +
                "यही दुआ करता हु खुदा से,\n" +
                "आपकी ज़िन्दगी में कोई गम न हो,\n" +
                "जन्मदिन पर मिले हज़ारो खुशियां,\n" +
                "चाहे उनमे शामिल हम न हो…\n" +
                "Happy Birthday!\n" +
                "\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90" ));



        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "Happy Birthday!!!\n" +
                "हो पुरी दिल की ख्वाहिश आपकी,\n" +
                "और मिले खुशियों का जहा आपको,\n" +
                "जब कभी आप माँगे आसमान का एक तारा,\n" +
                "तो भगवान दे दे सारा आसमा आपको…\n" +
                "\n" +
                "जन्मदिन की बधाई हो!\n" +
                "GBU...!!!\uD83D\uDE0A\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF1F\uD83C\uDF1F\uD83C\uDF1F\uD83C\uDF1F\uD83C\uDF1F\uD83C\uDF6C\uD83C\uDF6C" ));



        list.add(new Data_show ( "\uD83C\uDF69\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDF69\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDF69\n" +
                "जिस दिन आप ज़मी पर आये ये आसमाँ भी खूब रोया था,\n" +
                "आखिर उसके आँसू थमते भी कैसे,\n" +
                "उसने अपना सबसे प्यारा तारा जो खोया था,\n" +
                "हैप्पी बर्थडे!!\uD83D\uDCA5\uD83C\uDF6D\uD83C\uDF6D\uD83C\uDF82\uD83C\uDF6D\uD83C\uDF6D\n" +
                "\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDFF5" ));


        list.add(new Data_show ( "\uD83D\uDC99\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC99\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC99\n" +
                "हम आप के दिल ❤ मैं रहते है,\n" +
                "इसलिए हर दर्द सहते है,\n" +
                "कोई हम से पहले विश ना कर दे आपको,\n" +
                "इसलिए एडवांस मे हैप्पी बर्थडे \uD83C\uDF82 कहते है…\n" +
                "\n" +
                "Many many happy returns of the day\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF6D\uD83C\uDF6D\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF61\uD83C\uDF61\uD83C\uDF6B\uD83C\uDF6B\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF70\uD83C\uDF70GBU\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83C\uDF6B\uD83C\uDF6B\uD83C\uDF7F\n" +
                "\n" +
                "\uD83D\uDC99\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC99\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC99" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDFF5\uD83C\uDF3A\n" +
                "चाँद से प्यारी चाँदनी,\n" +
                "चाँदनी से भी प्यारी रात,\n" +
                "रात से प्यारी ज़िन्दगी,\n" +
                "और ज़िन्दगी से भी प्यारे आप,\n" +
                "हैप्पी बर्थडे…\uD83C\uDF82\uD83C\uDF6B\uD83D\uDCA5\uD83C\uDF61\uD83C\uDF6D\uD83C\uDF70\uD83C\uDF7F\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\n" +
                "\n" +
                "\uD83C\uDFF5\uD83C\uDF3A     " ));


        list.add(new Data_show ( "\uD83C\uDFF5\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83C\uDFF5\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83C\uDFF5\n" +
                "आसमान का चाँद तेरी बाहो में हो,\n" +
                "तू जो चाहे वो तेरी राहों में हो,\n" +
                "हर वो ख्वाब हो पूरा जो तेरी आँखों में हो,\n" +
                "खुश किस्मती की हर लकीर तेरी हाथों में हो…\n" +
                "\n" +
                "HaPpY BiRtHdAy\uD83C\uDF82\uD83C\uDF82\uD83D\uDC90\uD83D\uDE18\n" +
                "\uD83C\uDFF5\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83C\uDFF5\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83C\uDFF5" ));


        list.add(new Data_show ( "\uD83E\uDD8B\uD83D\uDC99\uD83D\uDC99\uD83D\uDC99\uD83E\uDD8B\uD83D\uDC99\uD83D\uDC99\uD83D\uDC99\uD83E\uDD8B\n" +
                "सूरज रोशनी लेकर आया\n" +
                "और चिड़ियों ने गाना गाया\n" +
                "फूलों ने हंस-हंसकर बोला\n" +
                "मुबारक हो तुम्हारा जनम दिन आया !\n" +
                "\uD83D\uDCA5\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF6D\uD83C\uDF6D\uD83C\uDF6D\uD83C\uDF62\uD83C\uDF62\uD83C\uDF69\uD83C\uDF69\uD83C\uDF69many many happy returns of the day\uD83C\uDF82\uD83C\uDF82\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF70\uD83C\uDF70\uD83C\uDF70\uD83C\uDF70\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\n" +
                "\uD83E\uDD8B\uD83D\uDC99\uD83D\uDC99\uD83D\uDC99\uD83E\uDD8B\uD83D\uDC99\uD83D\uDC99\uD83D\uDC99\uD83E\uDD8B" ));


        list.add(new Data_show ( "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\n" +
                "हर राह आसान हो,\n" +
                "हर राह पे खुशियाँ हो,\n" +
                "हर दिन खुबसूरत हो,\n" +
                "यही हर दिन मेरी दुआ हो,\n" +
                "ऎसा तुम्हारा हर जन्मदिन हो !!!\n" +
                "\uD83C\uDF61\uD83C\uDF62\uD83C\uDF6D\uD83C\uDF82\uD83C\uDF6D\uD83C\uDF62\uD83C\uDF61\uD83C\uDF6C\uD83C\uDF6C\n" +
                "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39" ));




        list.add(new Data_show ( "\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\n" +
                "खुशी से बीते हर दिन,\n" +
                "हर रात सुहानी हो,\n" +
                "जिस तरफ आपके कदम पडे,\n" +
                "वह फूलों की बरसात हो…\n" +
                "हैप्पी बर्थडे !\uD83D\uDE18\uD83D\uDE18\uD83D\uDE18\n" +
                "\n" +
                "Have a great day\uD83D\uDC99\n" +
                "\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38" ));

        list.add(new Data_show ( "\uD83C\uDFF5\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83C\uDFF5\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83C\uDFF5\n" +
                "हर दिन से प्यारा लगता है हमें ये ख़ास दिन,\n" +
                "हम जिसे बिताना नहीं चाहते आप बिन,\n" +
                "वैसे तो दिल देता है सदा ही दुआ आपको,\n" +
                "फिर भी कहते है मुबारक हो\n" +
                "जन्मदिन आपको…\n" +
                "\uD83E\uDD8B\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83E\uDD8B\uD83C\uDF82\n" +
                "\uD83C\uDFF5\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83C\uDF82\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83C\uDFF5" ));


        list.add(new Data_show ( "\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\n" +
                "Birthday है आपका,\n" +
                "देते हैं हम यह दुआ,\n" +
                "एक बार जो मिल जाएं हम,\n" +
                "होंगे ना कभी जुदा,\n" +
                "जान लूटा देंगे तुझपे,\n" +
                "है यह अपना इरादा,\n" +
                "साथ देंगे जीवनभर का,\n" +
                "है यह हमारा वादा…\n" +
                "\n" +
                "Many many happy returns of the day\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\n" +
                "\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF38" ));

        list.add(new Data_show ( "\uD83C\uDFF5\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\n" +
                "तमन्नाओं से भरी हो जिंदगी,\n" +
                "ख्वाहिशो से भरा हो हर पल,\n" +
                "दामन भी छोटा लगने लगे,\n" +
                "इतनी खुशिया दे आपको आनेवाला कल…\n" +
                "Happy Birthday Friend!\n" +
                "\uD83C\uDFF5\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5" ));

        list.add(new Data_show ( "\uD83E\uDD8B\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83E\uDD8B\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83E\uDD8B\n" +
                "इस अदा का क्या जवाब दू,\n" +
                "अपने दोस्त को क्या उपहार दू,\n" +
                "कोई अच्छासा फूल होता तो माली से मंगवाता,\n" +
                "लेकिन जो खुद गुलाब हे उसको क्या गुलाब दू…\n" +
                "जन्मदिन मुबारक हो…\uD83C\uDF82\uD83C\uDF82\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF7F❤\uD83C\uDF7F\uD83C\uDF61\uD83C\uDF61\uD83C\uDF6C\uD83C\uDF62\uD83C\uDF62\uD83C\uDF6D\uD83C\uDF6B\uD83C\uDF70\uD83C\uDF6B\uD83C\uDF62\uD83C\uDF61\uD83C\uDF6B\uD83C\uDF6D\uD83C\uDF62\uD83C\uDF6D\uD83C\uDF70\uD83C\uDF7F\uD83D\uDCA5\uD83C\uDF61\uD83C\uDF6D\uD83C\uDF6C\uD83C\uDF69\n" +
                "\uD83E\uDD8B\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83E\uDD8B\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83E\uDD8B" ));

        list.add(new Data_show ( "\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\n" +
                "उस दिन खुदा ने भी जशन मनाया होगा,\n" +
                "जिस दिन आपको अपने हाथो से बनाया होगा,\n" +
                "उसने भी बहाये होंगे आंसू,\n" +
                "जिस दिन आपको यहाँ भेज के, खुद को अकेला पाया होगा…\n" +
                "Happy Birthday!\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\n" +
                "\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38" ));

        list.add(new Data_show ( "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\n" +
                "मुस्कान आपके होंठो से कभी जाये नहीं,\n" +
                "आंसू आपके पलकों पे कभी आये नहीं,\n" +
                "पूरा हो आपका हर ख्वाब,\n" +
                "और जो पूरा न हो वो ख्वाब कभी आये नहीं…\n" +
                "Happy Birthday…\uD83C\uDF82\uD83C\uDF82\uD83D\uDC90\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF6B\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF70\uD83C\uDF70\uD83C\uDF62\uD83C\uDF62\uD83C\uDF6D\uD83C\uDF6D\uD83C\uDF61\uD83C\uDF61\uD83C\uDF82\uD83C\uDF82\n" +
                "\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39\uD83C\uDF37\uD83C\uDF37\uD83C\uDF37\uD83C\uDF39" ));

        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "गुल को गुलशन मुबारक,\n" +
                "शायर को शायरी मुबारक,\n" +
                "चाँद को चांदनी मुबारक,\n" +
                "आशिक़ को उसकी मेहबूबा मुबारक,\n" +
                "हमारी तरफ से आप को जन्मदिन मुबारक…\n" +
                "Happy birthday to you...\uD83C\uDF82\uD83C\uDF82\uD83C\uDF7F\uD83C\uDF38\uD83C\uDF38\uD83C\uDF70\uD83D\uDCA5\uD83C\uDF69\uD83C\uDFF5\uD83C\uDF6C❤\uD83C\uDF6B\uD83D\uDC90\uD83D\uDC9E\uD83C\uDF6C\uD83C\uDF38\uD83C\uDF38\uD83C\uDF61\uD83C\uDF6D\uD83C\uDF82\uD83C\uDF82\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A" ));

        list.add(new Data_show ( "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\n" +
                "हर लम्हा आपके होठों पे मुस्कान रहे,\n" +
                "हर गम से आप अंजान रहें,\n" +
                "जिसके साथ महक उठे आपकी ज़िंदगी,\n" +
                "हमेशा आपके पास वह इंसान रहे…\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "हस्ते रहे आप करोड़ों के बिच ।\n" +
                "खिलते रहे आप लाखों के बिच ।।\n" +
                "रोशन रहे आप हज़ारों के बिच ।\n" +
                "जैसे रहता है आसमान सूरज के बिच ।।\n" +
                "जन्म दिन की शुभ कामनाये..\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "ख्वाहिशों के समंदर के सब मोती तेरे नसीब हो;\n" +
                "तेरे चाहने वाले हमसफ़र तेरे हरदम करीब हों,\n" +
                "कुछ यूँ उतरे तेरे लिए रहमतों का मौसम,\n" +
                "कि तेरी हर दुआ, हर ख्वाहिश कबूल हो।\n" +
                "जन्मदिन की बधाई!\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "ज़िंदगी की कुछ खास दुआए लेलो हमसे\n" +
                "जन्मदिन पर कुछ नजराने ले लो हमसे\n" +
                "भर दे रंग जो तेरे जीवन के पलो में…..\n" +
                "आज वो हसी मुबारक बाद ले लो हमसे\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "जीवन के रास्ते हमेशा गुलज़ार रहें;\n" +
                "चेहरे पर आपके सदा ही मुस्कान रहे;\n" +
                "देता है दिल यह दुआ आपको;\n" +
                "ज़िन्दगी में हर दिन खुशियों की बहार रहे।\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "जीवन के रास्ते हमेशा गुलज़ार रहें;\n" +
                "चेहरे पर आपके सदा ही मुस्कान रहे;\n" +
                "देता है दिल यह दुआ आपको;\n" +
                "ज़िन्दगी में हर दिन खुशियों की बहार रहे।\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "सूरज रोशनी लेकर आया\n" +
                "और चिड़ियों ने गाना गाया\n" +
                "फूलों ने हंस-हंसकर बोला\n" +
                "मुबारक हो तुम्हारा जनम दिन आया !\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "हर राह आसान हो,\n" +
                "हर राह पे खुशियाँ हो,\n" +
                "हर दिन खुबसूरत हो,\n" +
                "यही हर दिन मेरी दुआ हो,\n" +
                "ऎसा तुम्हारा हर जन्मदिन हो !!!\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "हर दिन से प्यारा लगता है हमें ये\n" +
                "ख़ास दिन,\n" +
                ".\n" +
                "हम जिसे बिताना नहीं चाहते आप बिन,\n" +
                ".\n" +
                "वैसे तो दिल देता है सदा ही दुआ आपको,\n" +
                ".\n" +
                "फिर भी कहते है मुबारक हो\n" +
                "जन्मदिन आपको….\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));

        list.add(new Data_show ( "\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDCA5\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83D\uDCA5\uD83E\uDD8B\uD83E\uDD8B\n" +
                "Birthday है आपका,\n" +
                "देते हैं हम यह दुआ,\n" +
                "\n" +
                "एक बार जो मिल जाएं हम,\n" +
                "होंगे ना कभी जुदा,\n" +
                "\n" +
                "जान लूटा देंगे तुझपे,\n" +
                "है यह अपना इरादा,\n" +
                "\n" +
                "साथ देंगे जीवनभर का,\n" +
                "है यह हमारा वादा…\n" +
                "Happy B’day To You !!!\n" +
                "\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDCA5\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83D\uDCA5\uD83E\uDD8B\uD83E\uDD8B" ));

        list.add(new Data_show ( "\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDCA5\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83D\uDCA5\uD83E\uDD8B\uD83E\uDD8B\n" +
                "बार बार यह दिन आये,\n" +
                "बार बार यह दिल गाये,\n" +
                "तू जिए हज़ारो साल,\n" +
                "यह है मेरी आरज़ू,\n" +
                "हैप्पी बर्थडे टु यू !!\n" +
                "\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDCA5\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83D\uDCA5\uD83E\uDD8B\uD83E\uDD8B" ));

        list.add(new Data_show ( "यही दुआ करता हु खुदा से,\n" +
                "आपकी ज़िन्दगी में कोई गम न हो,\n" +
                "जन्मदिन पर मिले हज़ारो खुशियां,\n" +
                "चाहे उनमे शामिल हम न हो…\n" +
                "Happy B’day To You !!!" ));

        list.add(new Data_show ( "तमन्नाओं से भरी हो जिंदगी,\n" +
                "ख्वाहिशो से भरा हो हर पल,\n" +
                "दामन भी छोटा लगने लगे,\n" +
                "इतनी खुशिया दे आपको आनेवाला कल…\n" +
                "Happy B’day To You !!!" ));


        list.add(new Data_show ( "तुम्हारी इस अदा पे क्या जवाब दूँ,\n" +
                "अपने यार को क्या तोहफा दूँ,\n" +
                "कोई अच्छा सा फूल होता तो मंगवाता माली से,\n" +
                "जो खुद गुलाब है उसको क्या गुलाब दूँ.\n" +
                "Happy B’day To You !!!" ));

        list.add(new Data_show ( "Yahi dua karta hu khuda se,\n" +
                "aapki zindigi mein koi Gam na ho,\n" +
                "Janamdin per mile hazaro khusiyan,\n" +
                "chahe unme shaamil hum na ho....\n" +
                "Happy Birthday.\uD83C\uDF82\uD83D\uDC90\uD83C\uDF6B\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDFF5\uD83C\uDF69\uD83D\uDCA5\uD83D\uDCA5\uD83C\uDF70\uD83C\uDF7F\uD83C\uDF7F\uD83C\uDF6B\uD83C\uDF6B\n" +
                "\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C\uD83D\uDC93\uD83D\uDC93\uD83D\uDC93\uD83D\uDC9C" ));


        list.add(new Data_show ( "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\n" +
                "B4 1 Day,\n" +
                "B4 2 Night,\n" +
                "B4 2 Sunsets,\n" +
                "B4 msg charges high,\n" +
                "B4 network jam,\n" +
                "B4 someone wishes U,\n" +
                "I wishe U In advance\n" +
                "A VERY HAPPY BIRTHDAY\n" +
                "God Bless U.....!!!!\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "Wish you a many many happy returns of the day.\n" +
                "May God bless you with health,\n" +
                "wealth and prosperity in your life\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "यही दुआ करता हूँ खुद से,\n" +
                "आपकी जिंदिगी में कोई गम न हो,\n" +
                "जन्मदिन पर मिले हज़ारो खुशियां,\n" +
                "चाहे उनमें शामिल हम न हो.\n" +
                "HAPPY BIRTHDAY\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "हमारी तो दुआ है, कोई गिला नहीं,\n" +
                "वो गुलाब जो आज तक खिला नहीं,\n" +
                "आज के दिन आपको वो सब कुछ मिले,\n" +
                "जो आज तक किसी को कभी मिला नहीं.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "फूलों ने अमृत का जाम भेजा है,\n" +
                "तारों ने गगन से सलाम भेजा है,\n" +
                "खुशियों भरी हो जिंदगी आपकी,\n" +
                "यहे दिल से हमने पैगाम भेजा है.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "उगता हुआ सूरज दुआ दे आपको,\n" +
                "खिलता हुआ फूल खुशबु दे आपको,\n" +
                "हम तो कुछ देने के काबिल नहीं है,\n" +
                "देने वाला हज़ार खुशिया दे आपको.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "आसमान की बुलंदियों पर नाम हो आपका,\n" +
                "चाँद की धरती पर मुकाम हो आपका,\n" +
                "हम तो रहते है छोटी सी दुनिया में,\n" +
                "पर खुदा करे सारा जहाँ हो आपका.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "दुआ मिले बन्दों से खुशियां मिले जग से,\n" +
                "साथ मिले अपनों से रेहमत मिले रब से,\n" +
                "ज़िन्दगी में आप को बे पनाह प्यार मिले,\n" +
                "खुश रहे आप दुनिया में ज्यादा सुब से.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "खुदा बुरी नज़र से बचाए आप को,\n" +
                "चाँद सितारों से सजाए आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी मे इतना हँसाए आप को.\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "जन्मदिन के ये ख़ास लम्हें मुबारक,\n" +
                "आँखों में बसे नए ख्वाब मुबारक,\n" +
                "जिंदगी जो लेकर आई है आपके लिए आज..\n" +
                "वो तमाम खुशियों की हंसीं सौगात मुबारक!!!\n" +
                "Happy Birthday\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "स्वर्गलोक से इंद्रदेव,\n" +
                "वैकुण्ठ से विष्णुजी,\n" +
                "कैलाश से महादेव,\n" +
                "ब्रह्मलोक से ब्रम्हाजी,\n" +
                "और पृथ्वीलोक से रोहन,\n" +
                "आपको जन्मदिन के लिए शुभकामना देते है…\n" +
                "HAPPY BIRTHDAY TO YOU\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "जिस दिन आप ज़मी पर आये ये आसमाँ भी खूब रोया था,\n" +
                "आखिर उसके आँसू थमते भी कैसे,\n" +
                "उसने अपना सबसे प्यारा तारा जो खोया था,\n" +
                "हैप्पी बर्थडे!!\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "हम आप के दिल मैं रहते है,\n" +
                "इसलिए हर दर्द सहते है,\n" +
                "कोई हम से पहले विश ना कर दे आपको,\n" +
                "इसलिए एडवांस मे हैप्पी बर्थडे कहते है…\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "इस अदा का क्या जवाब दू,\n" +
                "अपने दोस्त को क्या उपहार दू,\n" +
                "कोई अच्छासा फूल होता तो माली से मंगवाता,\n" +
                "लेकिन जो खुद गुलाब हे उसको क्या गुलाब दू…\n" +
                "जन्मदिन मुबारक हो…\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));


        list.add(new Data_show ( "उस दिन खुदा ने भी जशन मनाया होगा,\n" +
                "जिस दिन आपको अपने हाथो से बनाया होगा,\n" +
                "उसने भी बहाये होंगे आंसू,\n" +
                "जिस दिन आपको यहाँ भेज के, खुद को अकेला पाया होगा…\n" +
                "Happy Birthday!\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "मुस्कान आपके होंठो से कभी जाये नहीं,\n" +
                "आंसू आपके पलकों पे कभी आये नहीं,\n" +
                "पूरा हो आपका हर ख्वाब,\n" +
                "और जो पूरा न हो वो ख्वाब कभी आये नहीं…\n" +
                "Happy Birthday\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "गुल को गुलशन मुबारक,\n" +
                "शायर को शायरी मुबारक,\n" +
                "चाँद को चांदनी मुबारक,\n" +
                "आशिक़ को उसकी मेहबूबा मुबारक,\n" +
                "हमारी तरफ से आप को जन्मदिन मुबारक…\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        list.add(new Data_show ( "हर लम्हा आपके होठों पे मुस्कान रहे,\n" +
                "हर गम से आप अंजान रहें,\n" +
                "जिसके साथ महक उठे आपकी ज़िंदगी,\n" +
                "हमेशा आपके पास वह इंसान रहे…\n" +
                "Happy Birthday.\n" +
                "\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF82\uD83C\uDF82\uD83C\uDF82\uD83C\uDF6C\uD83C\uDF6C\uD83C\uDF6C" ));

        //list.add(new Data_show ( "" ));




    }
}
