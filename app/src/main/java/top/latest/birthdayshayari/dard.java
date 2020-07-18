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

public class dard extends AppCompatActivity {

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
        setContentView ( R.layout.activity_dard );

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



    private void linearList()
    {

        list.add(new Data_show ( "दिल को ऐसा दर्द मिला जिसकी दवा नहीं,\n" +
                "फिर भी खुश हूँ मुझे उस से कोई शिकवा नहीं,\n" +
                "और कितने अश्क बहाऊँ अब उस के लिए,\n" +
                "जिसको खुदा ने मेरी किस्मत में लिखा ही नहीं।" ));

        list.add(new Data_show ( "उसकी हँसी में छुपे दर्द को महसूस तो कर,\n" +
                "वो तो यूँही हँस हँस के खुद को सजा देता है।" ));


        list.add(new Data_show ( "ये सुना है कि हिज्र में मेरे आपने मुस्कुराना छोड़ दिया\n" +
                "ये तो ऐसा है जैसे मछली ने सर्दियों में नहाना छोड़ दिया" ));


        list.add(new Data_show ( "Meri Zindagi Ghamon Se Ho Gayi Hai Taar\n" +
                "Khushiyan Bhi Mere Kareeb Nahi Aaati\n" +
                "Zamane Bhar Ka Zeher Pee Liya Humne\n" +
                "Jaan Hai Ki Kambhaqt Nikal Nahi Jaati." ));



        list.add(new Data_show ( "शीशा तो टूट कर, अपनी कशिश बता देता है,\n" +
                "दर्द तो उस पत्थर का हैं, जो टुटने के काबिल भी नही।" ));



        list.add(new Data_show ( "सिर्फ हम ही जानते हैं इस दिल की बेकरारी,\n" +
                "हमें जीने के लिए तुम्हारी जरुरत है\n" +
                "सांसों की नहीं." ));



        list.add(new Data_show ( "आज भी मेरे बदन से आती है तेरे ही सांसों की महक,\n" +
                "तेरे बाद किसी को सीने से लगाया नहीं हमने!!" ));


        list.add(new Data_show ( "जिद में आकर उनसे ताल्लुक तोड़ लिया हमने,\n" +
                "अब सुकून उनको नहीं और बेकरार हम भी हैं।" ));


        list.add(new Data_show ( "अल्फाज़ तो बहुत है मोहब्बत को जताने के लिए !\n" +
                "जो मेरी खामुशी नहीं समझ सका\n" +
                "वो मेरी मोहब्बत क्या समझे गा !" ));


        list.add(new Data_show ( "सोचा था आज तेरे सिवा कुछ और सोचुँ !\n" +
                "अभी तक इस सोच में हुँ कि और क्या सोचुँ !!" ));


        list.add(new Data_show ( "माना मौसम भी बदलते है मगर धीरे – धीरे ….\n" +
                "तेरे बदलने की रफ़्तार से तो हवाएं भी हैरान है …" ));


        list.add(new Data_show ( "अब न करूंगा अपने दर्द को बयाँ\n" +
                "जब दर्द सहना मुझको ही है\n" +
                "तो तमाशा क्यों करना" ));

        list.add(new Data_show ( "वो मिली भी तो क्या मिली\n" +
                "बन के बेवफा मिली,\n" +
                "इतने तो मेरे गुनाह ना थे\n" +
                "जितनी मुझे सजा मिली।" ));


        list.add(new Data_show ( "कौन कहता है नफ़रतों में दर्द है मोहसिन,\n" +
                "कुछ मोहब्बतें भी बड़ी दर्द नाक होती है।" ));

        list.add(new Data_show ( "तुम्हें लगता होगा न .. कि कितना बुरा हूं मैं ..\n" +
                "लगने की बात है … मुझे तो खुदा लगे थे तुम .." ));

        list.add(new Data_show ( "ऐ मेरे पाँव के छालो… जरा लहू उगलो,\n" +
                "सिरफिरे मुझसे सफ़र के निशान माँगेंगे।" ));


        list.add(new Data_show ( "जिन जख्मो से खून नहीं निकलता समझ लेना\n" +
                "वो ज़ख्म किसी अपने ने ही दिया है।" ));


        list.add(new Data_show ( "क्यों बहाने करते हो मुझसे रूठ जाने के\n" +
                "साफ़ साफ़ कह देते दिल में जगह नहीं है हमारे लिए" ));

        list.add(new Data_show ( "वो मिली भी तो क्या मिली बन के बेवफा मिली,\n" +
                "इतने तो मेरे गुनाह ना थे जितनी मुझे सजा मिली।" ));

        list.add(new Data_show ( "मैंने तुझे उस वक़्त चाहा\n" +
                "जब तेरा कोई नहीं था और\n" +
                "तूने मुझे उस वक़्त छोड़ा\n" +
                "जब तेरे सिवा मेरा कोई न था" ));


        list.add(new Data_show ( "सिर्फ हम ही जानते हैं इस दिल की बेकरारी,\n" +
                "हमें जीने के लिए तुम्हारी जरुरत है\n" +
                "सांसों की नहीं." ));


        list.add(new Data_show ( "आज भी मेरे बदन से आती है तेरे ही सांसों की महक,\n" +
                "तेरे बाद किसी को सीने से लगाया नहीं हमने!!" ));



        list.add(new Data_show ( "होता होगा तुम्हारी दुनियाँ में गहरा समंदर।\n" +
                "हमारे यहाँ इश्क़ से गहरा कुछ भी नहीं।।" ));



        list.add(new Data_show ( "तू किसी और के लिए होगा समंदर-ऐ-इश्क़।\n" +
                "हम तो रोज़ तेरे साहिल से\n" +
                "प्यासे गुज़र जाते हैं।।" ));



        list.add(new Data_show ( "नादानी की हद है जरा देखो तो उन्हें,\n" +
                "मुझे खो कर वो मेरे जैसा ढूढ़ रहे हैं।" ));


        list.add(new Data_show ( "चोट दिल पे थी\n" +
                "मोहब्बत ऐसी थी कि उनको बता न सके,\n" +
                "चोट दिल पे थी इसलिए दिखा न सके,\n" +
                "हम चाहते तो नही थे उनसे दूर होना,\n" +
                "मगर दूरी इतनी थी उसे हम मिटा न सके।" ));


        list.add(new Data_show ( "आंखों के रास्ते दिल में उतर कर नही देखा,\n" +
                "तूने मेरे सीने में अपनी यादों का घर नही देखा,\n" +
                "तेरे इश्क की वहशत ने पागल बना दिया है मुझे,\n" +
                "तेरी गलियों की खाक के सिवा मैंने कुछ नही देखा!" ));


        list.add(new Data_show ( "फासले तो बढ़ा रहे हो मगर इतना याद रखना\n" +
                "के मोहब्बत बार बार इंसान पर मेहरबान नहीं होती" ));


        list.add(new Data_show ( "Dilon ki baat bhale hi karta ho zamana\n" +
                ".\n" +
                "Magar muhabbat aaj bhi chehre se hi hoti hai..!" ));


        list.add(new Data_show ( "तेरी धड़कन ही ज़िंदगी का किस्सा है मेरा,\n" +
                "तू ज़िंदगी का एक अहम् हिस्सा है मेरा..\n" +
                "मेरी मोहब्बत तुझसे, सिर्फ़ लफ्जों की नहीं है,\n" +
                "तेरी रूह से रूह तक का रिश्ता है मेरा..!!" ));

        list.add(new Data_show ( "लगे है फोन जबसे\u200B \u200Bतार भी नहीं आते\u200B\u200B,\n" +
                "\u200Bबूढी आँखों के अब मददगार भी नहीं आते\u200B\u200B,\n" +
                "\u200B\u200Bगए है जबसे शहर में कमाने को लड़के\u200B\u200B,\n" +
                "\u200B\u200Bहमारे गाँव में त्यौहार भी नहीं आते।" ));


        list.add(new Data_show ( "न दिल में बसाकर भुलाया करते हैं,\n" +
                "ना हँसकर रुलाया करते हैं,\n" +
                "कभी महसूस कर के देख लेना,\n" +
                "हम जैसे तोह दिल से रिश्ते निभाया करते है." ));

        list.add(new Data_show ( "तेरे मेरे रिश्ते को क्या नाम दूँ,\n" +
                "यह नाम दूँ या वह नाम दूँ,\n" +
                "इस दुनिया की भीड़ मैं नाम हो जाते है बदनाम,\n" +
                "क्यों न अपने रिश्ते को बेनाम ही रहने दूँ." ));

        list.add(new Data_show ( "जिस दिन बंद कर ली हमने आंखें,\n" +
                "कई आँखों से उस दिन आंसु बरसेंगे,\n" +
                "जो कहते हैं के बहुत तंग करते है हम,\n" +
                "वही हमारी एक शरारत को तरसेंगे" ));


        list.add(new Data_show ( "यादों मैं हमारी वो भी खोये होंगे,\n" +
                "खुली आँखों से कभी वो भी सोए होंगे,\n" +
                "माना हँसना है अदा ग़म छुपाने की,\n" +
                "पर हँसते-हस्ते कभी वो भी रोए होंगे." ));


        list.add(new Data_show ( "बीते पल वापस ला नहीं सकते,\n" +
                "सूखे फूल वापस खिला नहीं सकते,\n" +
                "कभी कभी लगता है आप हमें भूल गए,\n" +
                "पर दिल कहता है कि आप हमें भुला नही सकते." ));



        list.add(new Data_show ( "तुम बिन ज़िंदगी सूनी सी लगती है,\n" +
                "हर पल अधूरी सी लगती है,\n" +
                "अब तो इन साँसों को अपनी साँसों से जोड़ दे,\n" +
                "क्योंकि अब यह ज़िंदगी कुछ पल की मेहमान सी लगती है" ));

        list.add(new Data_show ( "दर्द से हाथ न मिलाते तो और क्या करते,\n" +
                "गम के आंसू न बहते तो और क्या करते,\n" +
                "उसने मांगी थी हमसे रौशनी की दुआ,\n" +
                "हम खुद को न जलाते तो और क्या करते!" ));


        list.add(new Data_show ( "हकीकत जान लो जुदा होने से पहले,\n" +
                "मेरी सुन लो अपनी सुनाने से पहले,\n" +
                "ये सोच लेना भूलने से पहले,\n" +
                "बहुत रोई हैं ये आँखें मुस्कुराने से पहले." ));


        list.add(new Data_show ( "तोड़ दो न वो क़सम जो खाई है,\n" +
                "कभी कभी याद करलेने मैं क्या बुराई है,\n" +
                "याद आप को किये बिना रहा भी तो नहीं जाता,\n" +
                "दिल में जगा अपने ऐसी जो बनाई है." ));



        list.add(new Data_show ( "बहुत चाहा उसको जिसे हम पा न सके,\n" +
                "ख्यालों में किसी और को ला न सके.\n" +
                "उसको देख के आंसू तो पोंछ लिए,\n" +
                "लेकिन किसी और को देख के मुस्कुरा न सके." ));



        list.add(new Data_show ( "फर्क होता है खुदा और फ़क़ीर में,\n" +
                "फर्क होता है किस्मत और लकीर में..\n" +
                "अगर कुछ चाहो और न मिले तो समझ लेना..\n" +
                "कि कुछ और अच्छा लिखा है तक़दीर में।" ));



        list.add(new Data_show ( "उल्फत का अक्सर यही दस्तूर होता है,\n" +
                "जिसे चाहो वही अपने से दूर होता है,\n" +
                "दिल टूटकर बिखरता है इस कदर,\n" +
                "जैसे कोई कांच का खिलौना चूर-चूर होता है!" ));


        list.add(new Data_show ( "पलकों को कभी हमने भिगोए ही नहीं,\n" +
                "वो सोचते हैं की हम कभी रोये ही नहीं,\n" +
                "वो पूछते हैं कि ख्वाबो में किसे देखते हो,\n" +
                "और हम हैं की उनकी यादो में सोए ही नहीं!" ));


        list.add(new Data_show ( "नफरत को हम प्यार देते है,\n" +
                "प्यार पे खुशियाँ वार देते है,\n" +
                "बहुत सोच समझकर हमसे कोई वादा करना..\n" +
                "ऐ-दोस्त.. हम वादे पर जिदंगी गुजार देते है\uFEFF!!" ));


        list.add(new Data_show ( "तेरे दिल के करीब आना चाहता हूँ मैं,\n" +
                "तुझको नहीं और अब खोना चाहता हूँ मैं,\n" +
                "अकेले इस तनहाई का दर्द बर्दाश्त नहीं होता,\n" +
                "तू एक बार आजा तुझसे लिपट कर रोना चाहता हूँ मैं" ));


        list.add(new Data_show ( "एक दिन जब हम दुनिया से चले जायेंगे,\n" +
                "मत सोचना आपको भूल जायेंगे,\n" +
                "बस एक बार आसमान की तरफ़ देख लेना,\n" +
                "मेरे आँसू बारिश बनके बरस जायेंगे." ));


        list.add(new Data_show ( "सुकून अपने दिलका मैंने खो दिया,\n" +
                "खुद को तन्हाई के समंदर मे डुबो दिया,\n" +
                "जो थी मेरे कभी मुस्कराने की वजह,\n" +
                "आज उसकी कमी ने मेरी पलकों को भिगो दिया." ));

        list.add(new Data_show ( "कितना लुत्फ ले रहे हैं लोग मेरे दर्द-ओ-ग़म का…\n" +
                "ऐ इश्क देख तूने तो मेरा तमाशा ही बना दिया ।" ));



        list.add(new Data_show ( "ज़िन्दगी देने वाले यूँ मरता छोड़ गए,\n" +
                "अपनापन जताने वाले यूँ तनहा छोड़ गए,\n" +
                "जब पड़ी जरुरत हमें अपने हमसफ़र की,\n" +
                "तो साथ चलने वाले अपना रास्ता मोड़ गए." ));

        list.add(new Data_show ( "हो सके तो पहचान लो\n" +
                "मेरे दर्द का सबब मेरी नज़र से\n" +
                "ऐ दोस्तों\n" +
                "मै ज़ुबान से कहूंगा…\n" +
                "तो कुछ लोग रुसवा हो जायेंगे।" ));

        list.add(new Data_show ( "ज़िन्दगी सिर्फ मोहब्बत नहीं कुछ और भी है,\n" +
                "ज़ुल्फ़-ओ-रुखसार की जन्नत नहीं कुछ और भी है,\n" +
                "भूख और प्यास की मारी हुई इस दुनिया में,\n" +
                "इश्क ही इक हकीकत नहीं कुछ और भी है।" ));


        list.add(new Data_show ( "ज़ख्म सब भर गए बस एक चुभन बाकी है,\n" +
                "हाथ में तेरे भी पत्थर था हजारों की तरह,\n" +
                "पास रहकर भी कभी एक नहीं हो सकते,\n" +
                "कितने मजबूर हैं दरिया के किनारों की तरह।" ));


        list.add(new Data_show ( "एक हसरत थी कि उनके दिल में पनाह मिलेगी,\n" +
                "क्या पता था उनसे मोहब्बत की सज़ा मिलेगी,\n" +
                "न अपनों ने समझा न गैरों ने जाना,\n" +
                "क्या पता था मेरी तक़दीर ही मुझे बेवफा मिलेगी।" ));



        // list.add(new Data_show ( "" ));
    }
}
