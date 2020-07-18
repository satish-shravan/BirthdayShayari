package top.latest.birthdayshayari;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RelativeLayout;

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

public class night extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    Adapter adapterRecyclerLinear;

    ArrayList<Data_show> list;

    RelativeLayout relativeLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_night);




        init_ads ();



        recyclerView = findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list = new ArrayList<Data_show> ();
        adapterRecyclerLinear = new Adapter ( this, list );
        recyclerView.setAdapter ( adapterRecyclerLinear );
      //  Toast.makeText ( this, "CLICK TO SHARE  :)", Toast.LENGTH_LONG ).show ();
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





        list.add(new Data_show ( "\uD83E\uDD8B\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83E\uDD8B\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83E\uDD8B\n" +
                "रात है काफी, ठंडी हवा चल रही है,\n" +
                "याद में आपकी किसी की मुस्कान खिल रही है,\uD83D\uDE0D\n" +
                "उनके सपनों की दुनिया में आप खो जाओ,❣\n" +
                "आंखे करो बंद और आराम से सो जाओ…\n" +
                "\n" +
                "गुड नाईट!!!\uD83D\uDE34\uD83D\uDE34\uD83D\uDE34...\n" +
                "\uD83E\uDD8B\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83E\uDD8B\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83E\uDD8B" ));


        list.add(new Data_show ( "\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39\n" +
                "सडक कितनी ही साफ हो,\n" +
                "“धूल” तो हो ही जाती है..\n" +
                "इंसान कितना भी अच्छा हो,\n" +
                "“भूल” तो हो ही जाती है..\n" +
                "“मैं अपनी ‘जिंदगी’ में हर किसी को\n" +
                "‘अहमियत’ देता हूँ क्योंकि,\n" +
                "जो ‘अच्छे’ होंगे वो ‘साथ’ देंगे…!\n" +
                "और जो ‘बुरे’ होंगे वो ‘सबक’ देंगे…!!\n" +
                "जिंदगी जीने के लिए सबक और साथ दोनों जरुरी होता है…\n" +
                "\n" +
                "Good Night!\uD83D\uDE34\n" +
                "\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39\uD83C\uDF40\uD83C\uDF40\uD83C\uDF39" ));


        list.add(new Data_show ( "\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\n" +
                "मिठी रातो में धीरे से आ जाती है एक परी,\n" +
                "कुछ खुशियों के सपने लाती है एक परी,\n" +
                "कहती है के सपनों के सागर में डुब जाओ,\n" +
                "भूल के अब सारे दर्द जल्दी सो जाओ…❣❣❣\n" +
                "\n" +
                "\uD83E\uDD8B *Good Night...!!!*\uD83E\uDD8B\n" +
                "\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99" ));


        list.add(new Data_show ( "❤\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D❤\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D❤\n" +
                "हर सपना कुछ पाने से पूरा नहीं होता,\n" +
                "कोई किसी के बिन अधूरा नहीं होता,\n" +
                "जो चाँद रोशन करता है रात भर सब को,\n" +
                "हर रात वो भी तो पूरा नहीं होता…\n" +
                "Good Night & Sweet Dreams!\n" +
                "❤\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D❤\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D❤" ));


        list.add(new Data_show ( "\uD83D\uDC99\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDC99\n" +
                "हो गयी अब तो Black Night,\n" +
                "अब बंद भी कर दो White White Light,\n" +
                "Sweet Sweet सपनो की पकड़ लो Flight,\n" +
                "Oh My Lovely Dear Good Night…\n" +
                "Sweet Dreams!\n" +
                "\uD83D\uDC99\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDE34\uD83D\uDC99\uD83D\uDC99" ));


        list.add(new Data_show ( "\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\n" +
                "जीवन के हर मोड पर सुनहरी यादों को रहने दो,\n" +
                "जुबां पर हर वक्त मिठास रहने दो,\n" +
                "यही अंदाज है जीने का,\n" +
                "ना रहो उदास और ना किसी को रहनो दो…\n" +
                "\n" +
                "शुभ रात्रि !!\uD83D\uDE34\uD83D\uDE34\n" +
                "\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E\uD83D\uDC9E" ));


        list.add(new Data_show ( "ये रात चांदनी लेकर आपके आँगन मे आये,\n" +
                "ये आसमान के सारे तारे लोरी गाकर आपको सुलाये,\n" +
                "आये आपको इतने प्यारे और मीठे सपने,\n" +
                "की आप सोते हुए भी सदा मुस्कुराये…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));

        list.add(new Data_show ( "हो चुकी है रात बहुत अब सो जाइये,\n" +
                "जो है दिल के करीब उसके खयालों मे खो जाइये,\n" +
                "कर रहा होगा कोई इंतजार आपका,\n" +
                "हकीकत मे ना सही ख्वाबों मे तो मिल आइये…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "हर रात हम तुम्हे याद करते किया है,\n" +
                "सितारों में तुम्हे देखा करते है,\n" +
                "लेकिन हमारे ख्वाबों में मत आना तुम,\n" +
                "क्योंकि हम भूत से डरा करते है…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( " \uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\n" +
                "ऐ हसीन चाँद मेरे दोस्त को एक तोहफा देना,\n" +
                "लाखो तारो की सजी महफ़िल संग रौशनी देना,\n" +
                "तुम छुपा लेना अँधेरे को ऐसे,\n" +
                "हर रात के बाद एक खूबसूरत सवेरा देना…\n" +
                "\uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( " \uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\n" +
                "चाँद ने चाँदनी को याद किया,\n" +
                "प्यार ने प्यार को याद किया,\n" +
                "लेकिन हमारे पास ना चाँद है ना प्यार,\n" +
                "इसलिए हमने चाँद जैसे दोस्त को याद किया…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( " \uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\n" +
                "तेरे बिना कैसे गुजरेंगी ये राते,\n" +
                "तन्हाई का गम कैसे सहेंगी ये राते,\n" +
                "बहुत लंबी है घड़िया इंतजार की,\n" +
                "करवट बदल-बदल कर कटेंगी ये राते…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( " \uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\n" +
                "रात खामोश है,\n" +
                "चाँद भी खामोश है,\n" +
                "पर दिल में शोर हो रहा है,\n" +
                "कहीं ऐसा तो नहीँ एक,\n" +
                "प्यारा सा दोस्त,\n" +
                "बिना गुड नाईट कहे सो रहा है…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( " \uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\n" +
                "शाम की शमा में एक तस्वीर नजर आती है,\n" +
                "तब है लबों से ये बात निकल आ जाती है,\n" +
                "कब होगी आप से दिल लगाकर बातें,\n" +
                "यही सोचकर हर रात गुजर जाती है…\n" +
                "\n" +
                "\uD83C\uDF37Good Night!\uD83C\uDF37\n" +
                "\n" +
                "\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83E\uDD8B" ));


        list.add(new Data_show ( "\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\n" +
                "आँखे भी मेरी पलकों से सवाल करती है,\n" +
                "हर वक्त आपको ही याद करती है,\n" +
                "जब तक न कह दे शुभ रात्रि आपको ज़ालिम,\n" +
                "सोने से भी इंकार करती है…\n" +
                "\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF31शुभ रात्री\uD83C\uDF31\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40" ));


        list.add(new Data_show ( "\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\n" +
                "मेरी हर रात में आपकी याद होती है,\n" +
                "चाँद तारों से रोज यही बात होती है,\n" +
                "मेरे ख़्वाबों में बिलकुल न आना आप,\n" +
                "क्योंकि डरावनी सूरत से हमारी नींद ख़राब होती है…\n" +
                "शुभ रात्रि!!!\n" +
                "\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96" ));


        list.add(new Data_show ( "☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘\n" +
                "ना दिल में आता हु,\n" +
                "ना दिमाग में आता हु,\n" +
                "अभी सोता हु,\n" +
                "कल फिर ऑनलाइन आता हु…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "रात का चाँद आसमान में निकल आया है,\n" +
                "साथ में तारों की बारात लाया है,\n" +
                "ज़रा आसमान की ओर देखो वो आपको,\n" +
                "मेरी ओर से गुड नाईट कहने आया है…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( " \uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "चाँद ने चाँदनी बिखेरी है,\n" +
                "तारों ने आसमान को सजाया है,\n" +
                "कहने को तुम्हें शुभ रात्रि,\n" +
                "देखो स्वर्ग से कोई फरिश्ता आया है…\n" +
                "\n" +
                "\uD83C\uDF3AGood Night!\uD83C\uDF3A\n" +
                "\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC9D\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC9D\n" +
                "\uD83C\uDF87\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83C\uDF87\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83C\uDF87\n" +
                "\n" +
                "इस प्यारी सी रात मे,\n" +
                "प्यारी सी नींद से पहले,\n" +
                "प्यारे से सपनों की आशा मे,\n" +
                "प्यारे से अपनों को मेरी तरफ से शुभ रात्रि…\n" +
                "\n" +
                "\uD83C\uDF87\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83C\uDF87\uD83C\uDF86\uD83C\uDF86\uD83C\uDF86\uD83C\uDF87\n" +
                "\uD83D\uDC9D\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC9D\uD83D\uDC96\uD83D\uDC96\uD83D\uDC96\uD83D\uDC9D" ));


        list.add(new Data_show ( "\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3A\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3C\n" +
                "हर कोई सो जाता है कल के लिए,\n" +
                "मगर ये नही सोचता की,\n" +
                "आज जिसका दिल दुखाया है,\n" +
                "वो सोया होगा या नही…\n" +
                "Gn...\n" +
                "\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3A\uD83C\uDF3C\uD83C\uDF3C\uD83C\uDF3C" ));


        list.add(new Data_show ( "\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\n" +
                "आँखे भी मेरी पलकों से सवाल करती है,\n" +
                "हर वक्त आपको ही याद करती है,\n" +
                "जब तक न कह दे शुभ रात्रि आपको ज़ालिम,\n" +
                "सोने से भी इंकार करती है…\n" +
                "\n" +
                "शुभ रात्रि!\uD83D\uDE34\uD83D\uDE34\uD83D\uDE34\n" +
                "\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C\uD83D\uDC9C" ));


        list.add(new Data_show ( "\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\n" +
                "हो मुबारक आपको यह सुहानी रात,\n" +
                "मिले ख्वाबो में भी खुदा का साथ,\n" +
                "खुले जब आपकी आँखे तो,\n" +
                "ढेरो खुशियां हो आपके साथ…\n" +
                "\n" +
                "शुभरात्रि!\uD83D\uDE34\uD83D\uDE34\uD83D\uDE34\n" +
                "\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99\uD83D\uDC97\uD83D\uDC97\uD83D\uDC99" ));


        list.add(new Data_show ( "☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘✍\uD83C\uDFFB☘\n" +
                "ना दिल में आता हु,\n" +
                "ना दिमाग में आता हु,\n" +
                "अभी सोता हु,\n" +
                "कल फिर ऑनलाइन आता हु…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "रात का चाँद आसमान में निकल आया है,\n" +
                "साथ में तारों की बारात लाया है,\n" +
                "ज़रा आसमान की ओर देखो वो आपको,\n" +
                "मेरी ओर से गुड नाईट कहने आया है…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "ये रात चांदनी लेकर आपके आँगन मे आये,\n" +
                "ये आसमान के सारे तारे लोरी गाकर आपको सुलाये,\n" +
                "आये आपको इतने प्यारे और मीठे सपने,\n" +
                "की आप सोते हुए भी सदा मुस्कुराये…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "हो चुकी है रात बहुत अब सो जाइये,\n" +
                "जो है दिल के करीब उसके खयालों मे खो जाइये,\n" +
                "कर रहा होगा कोई इंतजार आपका,\n" +
                "हकीकत मे ना सही ख्वाबों मे तो मिल आइये…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "हर रात हम तुम्हे याद करते किया है,\n" +
                "सितारों में तुम्हे देखा करते है,\n" +
                "लेकिन हमारे ख्वाबों में मत आना तुम,\n" +
                "क्योंकि हम भूत से डरा करते है…\n" +
                " \uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "ऐ हसीन चाँद मेरे दोस्त को एक तोहफा देना,\n" +
                "लाखो तारो की सजी महफ़िल संग रौशनी देना,\n" +
                "तुम छुपा लेना अँधेरे को ऐसे,\n" +
                "हर रात के बाद एक खूबसूरत सवेरा देना…\n" +
                "\uD83C\uDF3E\uD83C\uDF3E  *_G♡♡Đ night*\uD83C\uDF3E\uD83C\uDF3E" ));


        list.add(new Data_show ( "नींद की आँखों पे हो रही है Filding Tight,\n" +
                "इस Dark Sky में दिख रहे हैं तारे White,\n" +
                "अब बुझा के अपनी Light,\n" +
                "हम आपसे कहते है,\n" +
                "GOOD NIGHT & SWEET DREAMS!" ));


        list.add(new Data_show ( "सोती हुई आँखों को सलाम हमारा,\n" +
                "मीठे सुनहरे सपनों को आदाब हमारा,\n" +
                "दिल में रहे प्यार का अहसास सदा जिंदा,\n" +
                "आज की रात का ये ही पैगाम हमारा…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));

        list.add(new Data_show ( "रात को रात का तोहफा नहीं देते,\n" +
                "फूल को फूल का तोहफा नहीं देते,\n" +
                "देने को हम आपको चाँद भी दे सकते है,\n" +
                "लेकिन चाँद को चाँद का तोहफा नहीं देते…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "निकल आया चाँद बिखर गए सितारे,\n" +
                "सो गए पंछी सो गए नज़ारे,\n" +
                "खो जाओ तुम भी मीठे ख्वाबो में,\n" +
                "और देखो रात में सपने प्यारे प्यारे…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "बिंदास सोने का,\n" +
                "रापचिक सपने देखने का,\n" +
                "भूत को नहीं देखने का,\n" +
                "बोले तो… आईना नहीं देखने का,\n" +
                "और ब्लैंकेट ओढ़ के फुलटुस सो जाने का…\n" +
                "बोले तो गुड नाईट!\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "अंग्रेजी में, गुड नाईट”\n" +
                "हिंदी में, “शुभ रात्रि”\n" +
                "उर्दू में, “शब्बा खैर”\n" +
                "कन्नड़ में, “यारणदि ”\n" +
                "तेलगु में, “पादनकोपो”\n" +
                "और अपनी स्टाइल में:\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "“चल लुढ़क ले अब…”\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "मुझे रुला कर सोना..\n" +
                "तो तेरी आदत बन गई है,\n" +
                "जिस दिन मेरी आँख ना खुली..\n" +
                "तुझे निंद से नफरत हो जायेगी|\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "दिल की किताब में गुलाब उनका था,\n" +
                "रात की नींद में ख्वाब उनका था,\n" +
                "कितना प्यार करते हो जब हमने पूछा,\n" +
                "मर जायंगे तुम्हारे बिना ये जबाब उनका था.\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "रात गुमसुम हैं मगर चाँद खामोश नहीं,\n" +
                "कैसे कह दूँ फिर आज मुझे होश नहीं,\n" +
                "ऐसे डूबा तेरी आँखों के गहराई में आज,\n" +
                "हाथ में जाम हैं,मगर पिने का होश नहीं|\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "सितारों से भरी इस रात में,\n" +
                "जन्नत से भी खूबसूरत ख्वाब आपको आये,\n" +
                "इतनी हसीं हो आने वाली सुबह की,\n" +
                "मांगने से पहले ही आपकी हर मुराद पूरी हो जाये…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "जब शाम के बाद आ जाती है रात,\n" +
                "हर बात मे फिर समा जाती है तेरी याद,\n" +
                "बहुत तन्हा हो जाती है ये जिंदगी मेरी,\n" +
                "अगर नही मिलता आपका साथ…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "आपके इंतजार का दर्द तो हम चुपचाप सहते है,\n" +
                "क्योंकि आप ही हो जो हर पल हमारे दिल मे रहते हो,\n" +
                "ना जाने हमे नींद आएगी या नही,\n" +
                "मगर आप ठीक से सो सको इसलिए आपको शुभ रात्रि कहते है…\n" +
                "**Good Night** !" ));


        list.add(new Data_show ( "रात के अँधेरे मे भी आपके पास उजाला हो,\n" +
                "हर कोई आपका चाहने वाला हो,\n" +
                "वक्त गुजर जाए उनकी यादो के सहारे,\n" +
                "ऎसा कोई आपके सपनों को सजाने वाला हो…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "चाँद पर है लाईट,\n" +
                "बोले तो हो गई है नाईट,\n" +
                "तो बंद करने का ट्यूब लाईट,\n" +
                "और सो जाना Keep Quite…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "देखो फिर रात आ गयी,\n" +
                "तनहाइयो में वक़्त बिताने की बात आ गई,\n" +
                "हम तो यूँ ही बैठे थे,\n" +
                "सितारों की पनाह में,\n" +
                "चाँद को देखा तो आपकी याद आ गई…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "चाँद सितारे सब तुम्हारे लिए,\n" +
                "सपने मीठे-मीठे तुम्हारे लिए,\n" +
                "भूल न जाना तुम हमे,\n" +
                "इसलिए शुभ रात्री का पैगाम तुम्हारे लिए…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "सोते हुए को जगाएंगे हम,\n" +
                "आपकी नींद को चुराएंगे हम,\n" +
                "हर वक्त SMS करके सताएंगे हम,\n" +
                "आपको आएगा गुस्सा लेकीन,\n" +
                "उस गुस्से मे भी याद आएंगे हम…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "आज की रात आपके लिए खास हो,\n" +
                "हर वक़्त मच्छर आपके आस पास हो,\n" +
                "काट काट कर आपकी जान खाए,\n" +
                "भगवान करे सारी रात आपको नींद ना आए…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "चांदनी लेकर ये रात आपके आँगन मे आए,\n" +
                "आसमान के सारे तारे लोरी गाकर आपको सुलाए,\n" +
                "इतने प्यारे और मीठे हो सपने आपके,\n" +
                "की आप सोते हुए भी सदा मुस्कुराए…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "सोते हुए को जगाएंगे हम,\n" +
                "आप की नींदे चुराएंगे हम,\n" +
                "हर वक्त SMS करके सताएंगे हम,\n" +
                "आप को आएगा घुस्सा लेकीन,\n" +
                "उस घुस्से मे ही याद तो आएंगे हम…\n" +
                "**Good Night** !" ));


        list.add(new Data_show ( "चमकते चाँद को नींद आने लगी,\n" +
                "आपकी खुशी से दुनिया जगमगाने लगी,\n" +
                "देख के आपको हर कली गुनगुनाने लगी,\n" +
                "अब तो फेकते-फेकते मुझे भी नींद आने लगी…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "दिपक मे अगर नूर ना होता,\n" +
                "तनहा दिल ये मजबूर ना होता,\n" +
                "हम आपको गुड नाईट कहने आते,\n" +
                "अगर आपका घर इतना दूर ना होता…\n" +
                "**Good Night** & Have Sweet Dream !" ));


        list.add(new Data_show ( "सितारों को भेजा है आपको सुलाने के लिए,\n" +
                "चाँद आया है आपको लोरी सुनाने के लिए,\n" +
                "सो जाओ मीठे ख्वाबों मे आप,\n" +
                "सुबह सूरज को भेजेंगे आपको जगाने के लिए…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "प्यारी-प्यारी रात है, तारो की बारात है,\n" +
                "हवा थोडी कुल है, मौसम भी अनुकूल है,\n" +
                "लवली-लवली नाईट है, बस कहना गुड नाईट है…\n" +
                "So **Good Night** डिअर !" ));


        list.add(new Data_show ( "हम ना होते तो आप खो गए होते,\n" +
                "अपनी जिंदगी से रुसवा हो गए होते,\n" +
                "यह तो आपको **Good Night** कहने,\n" +
                "के लिए उठे है,\n" +
                "वरना हम तो अब तक सो रहे होते…\n" +
                " \uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "अभी तो रात बाकी है,\n" +
                "मेरे दिल की बात बाकी है,\n" +
                "जो मेरे दिल में छुपी है,\n" +
                "वो ज़ज्बात बाकी है,\n" +
                "जल्दी से सो जाना दोस्त,\n" +
                "आप की नींद बाकी है,\n" +
                "सुबह मिलते है,\n" +
                "कल की शुरुवात बाकी है…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "<> <> तकिया\n" +
                "!!====!! बेड\n" +
                ":??????:\n" +
                ":??????: चद्दर\n" +
                ":??????:\n" +
                "ये सब भेज दिया हे,\n" +
                "आराम से सो जाओ…\n" +
                ">GOOD_NIGHT<" ));


        list.add(new Data_show ( "    ‘.*__| |__* ‘ * . * .\n" +
                "   ‘*/_____/\\ *   .;’;’;.\n" +
                "*|,,|_@|_|__|,,,,,,)(,,,\n" +
                "तारों भरी रात आपसे कुछ कहना चाहती है..\n" +
                "पता है क्या??\n" +
                "**~**Good Night**~**" ));


        list.add(new Data_show ( "\\(‘_’)/\n" +
                "  ( )\n" +
                "दुनिया!!.वालों…\n" +
                "मैं आप सब को छोड़ के जा रहा हु…\n" +
                "“सोने”\n" +
                "(‘-’)\n" +
                "_/| |\\_\n" +
                "[]“””<”<”””[]" ));


        list.add(new Data_show ( "तमाम सबूतो और गवाहो को,\n" +
                "मद्दे नज़र रखते हुए ये अदालत,\n" +
                "इस SMS पढ़ने वाले को,\n" +
                "G@@D NIGHT विश कर के,\n" +
                "”रात भर” सोने कि सजा सुनाती है…\n" +
                "\uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));


        list.add(new Data_show ( "हम ना होते तो आप खो गए होते,\n" +
                "अपनी जिंदगी से रुसवा हो गए होते,\n" +
                "यह तो आपको **Good Night** कहने,\n" +
                "के लिए उठे है,\n" +
                "वरना हम तो अब तक सो रहे होते…\n" +
                " \uD83D\uDC90\uD83C\uDF39 *Good night* \uD83C\uDF39\uD83D\uDC90" ));



        //list.add(new Data_show ( "" ));

    }
}