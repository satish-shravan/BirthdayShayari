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

public class friend extends AppCompatActivity {

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
        setContentView ( R.layout.activity_friend );


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

        list.add(new Data_show ( "नोट इकट्ठे करने के बजाय दोस्त इकट्ठे किए हैं हमने,\n" +
                "इसलिए आज पुराने भी चल रहे हैं!" ));

        list.add(new Data_show ( "आज यारो ने हँसा दिया,गम ए उल्फत भुला दिया,मैंने लेटा जो आके दीवान पे,यादों ने फिर जगा दिया.." ));


        list.add(new Data_show ( "आज मेरा दोस्त मुझसे रूठा हैमेरे सब्र का बाँध भी अब टूटा हैवो मुझे मिला ही कब था इस जमाने मेंजो मैं ये सोंचता हूँ की वो मुझसे छूटा है" ));


        list.add(new Data_show ( "आज मेरा दोस्त मुझसे रूठा हैमेरे सब्र का बाँध भी अब टूटा हैवो मुझे मिला ही कब था इस जमाने मेंजो मैं ये सोंचता हूँ की वो मुझसे छूटा है" ));



        list.add(new Data_show ( "आज गुमनाम ही सही पर शायद,एक दिन हमारा भी एक नाम होगा,इसी उम्मीद में रोज ये जिंदगी जीते है,चल ना यार आज थोड़ी थोड़ी पीते है .." ));



        list.add(new Data_show ( "अभी सूरज नहीं डूबा जरा सी शाम होने दो;मैं खुद लौट जाऊंगा मुझे नाकाम तो होने दो;मुझे बदनाम करने का बहाना ढूंढ़ता है जमाना;मैं खुद हो जाऊंगा बदनाम पहले मेरा नाम तो होने दो।" ));



        list.add(new Data_show ( "अब हमे कभी तेरा दीदार नसीब ना होगा,दोसती का रिशता कभी करीब ना होगा,करोध मे पैदा की हमने जो गलतफहमियां,शायद हमसे बडा कोई बदनसीब ना होगा.." ));


        list.add(new Data_show ( "अब हमे कभी तेरा दीदार नसीब ना होगा,दोसती का रिशता कभी करीब ना होगा,करोध मे पैदा की हमने जो गलतफहमियां,शायद हमसे बडा कोई बदनसीब ना होगा.." ));


        list.add(new Data_show ( "अपनी वो मुलाकात कुछ अधुरी सी लगी,पास होके भी थोडी दूरी सी लगी,होठो पे हसी आंखो मे मजबूरी सी लगी,ज़िन्दगी मे पहेली बार किसी की दोस्ती इतनी ज़रूरी लगी.." ));


        list.add(new Data_show ( "अपनी ज़िंदगी के कुछ अलग ही उसूल हैं,\n" +
                "दोस्ती की खातिर हमें काँटे भी क़बूल हैं,\n" +
                "हँस कर चल देंगे काँच के टुकड़ों पर भी,\n" +
                "अगर दोस्त कहे यह दोस्ती में बिछाये फूल हैं।" ));


        list.add(new Data_show ( "अगर वो खुश है देखकर आँसू मेरी आँखोँ मे,तो रब की कसम हम मुस्कुराना छोड़ देँगे,तड़पते रहेँगे उसे देखने को,लेकिन उसकी तरफ नज़रेँ उठाना छोड़ देँगे.." ));


        list.add(new Data_show ( "इश्क ओर दोस्ती मेरे दो जहान है,इश्क मेरी रुह, तो दोस्ती मेरा ईमान है,इश्क पर तो फिदा करदु अपनी पुरी जिंदगी,पर दोस्ती पर, मेरा इश्क भी कुर्बान है.." ));

        list.add(new Data_show ( "आँसू तेरा गिरे तो आँखें मेरी हो,दिल तेरा धड़के तो धड़कन मेरी हो,भगवान करे हमारी दोस्ती इतनी गहरी हो कीनौकरी तुम करो और सैलरी मेरी हो!." ));


        list.add(new Data_show ( "“A real friend is one who walks in when the rest of the world walks out.”" ));

        list.add(new Data_show ( "“If you live to be 100, I hope I live to be 100 minus 1 day, so I never have to live without you.”" ));

        list.add(new Data_show ( "“I like to listen. I have learned a great deal from listening carefully. Most people never listen.”" ));


        list.add(new Data_show ( "“Friendship is born at that moment when one person says to another, ‘What! You too? I thought I was the only one.”" ));


        list.add(new Data_show ( "“True friendship comes when the silence between two people is comfortable.”" ));

        list.add(new Data_show ( "“Sweet is the memory of distant friends! Like the mellow rays of the departing sun, it falls tenderly, yet sadly, on the heart.”" ));

        list.add(new Data_show ( "“There’s not a word yet for old friends who’ve just met.”" ));


        list.add(new Data_show ( "“Don’t make friends who are comfortable to be with. Make friends who will force you to lever yourself up.”" ));


        list.add(new Data_show ( "“You can make more friends in two months by becoming interested in other people than you can in two years by trying to get other people interested in you.”" ));



        list.add(new Data_show ( "“A friend is someone who understands your past, believes in your future, and accepts you just the way you are.”" ));



        list.add(new Data_show ( "“Ultimately the bond of all companionship, whether in marriage or in friendship, is conversation.”" ));



        list.add(new Data_show ( "“What you do not want done to yourself, do not do to others.”" ));


        list.add(new Data_show ( "“A true friend never gets in your way unless you happen to be going down.”" ));


        list.add(new Data_show ( "“I don’t need a friend who changes when I change and who nods when I nod; my shadow does that much better.”" ));


        list.add(new Data_show ( "“Friends are those rare people who ask how we are and then wait to hear the answer.”" ));


        list.add(new Data_show ( "वो अच्छा है तो अच्छा है,वो बुरा है तो भी अच्छा है,\n" +
                "दोस्ती के मिजाज़ में, यारों के ऐब नहीं देखे जाते।" ));


        list.add(new Data_show ( "सारे दोस्त एक जैसे नहीं होते,\n" +
                "कुछ हमारे होकर भी हमारे नहीं होते,\n" +
                "आपसे दोस्ती करने के बाद महसूस हुआ,\n" +
                "कौन कहता है 'तारे ज़मीं पर' नहीं होते।\n" +
                "\n" ));

        list.add(new Data_show ( "हक़ीकत मोहब्बत की जुदाई होती है,\n" +
                "कभी-कभी प्यार में बेवफाई होती है,\n" +
                "हमारे तरफ हाथ बढ़ाकर तो देखो,\n" +
                "दोस्ती में कितनी सच्चाई होती है।" ));


        list.add(new Data_show ( "नाजुक सा दिल कभी भूल से ना टूटे,\n" +
                "छोटी छोटी बातों से आप ना रूठे,\n" +
                "थोड़ी सी भी फ़िक्र है अगर आपको हमारी,\n" +
                "तो कोशिश करना की ये दोस्ती कभी ना टूटे।" ));

        list.add(new Data_show ( "दोस्ती हर चेहरे की मुस्कान होती है,\n" +
                "दोस्ती ही सुख-दुःख की पहचान होती है,\n" +
                "कोई रूठ भी जाये तो दिल पे मत लेना,\n" +
                "क्योंकि दोस्ती जरा सी नादान होती है।" ));

        list.add(new Data_show ( "ज़िन्दगी गुज़र जाए पर दोस्ती कम ना हों।\n" +
                "याद हमें रखना चाहें पास हम ना हों।\n" +
                "कयामत तक चकता रहे ये प्यारा सा सफर।\n" +
                "दुआ करे कि कभी ये रिश्ता खतम ना हो।" ));


        list.add(new Data_show ( "Zindagi Guzar Jaye Par Dosti Kam Na Ho.\n" +
                "Yaad Hame Rakhna Chahe Pas Ham Na Ho.\n" +
                "Kayamat Tak Chalta Rhe Ye Pyara Sa Safar.\n" +
                "Dua Kre Ki Kabhi Ye Rishta Khatam Na Ho." ));


        list.add(new Data_show ( "तारों में अकेले चांद जगमगाता है।\n" +
                "मुश्किलों में अकेले इंसान डगमगाता है।\n" +
                "काटों से मत घबराना मेरे दोस्त।\n" +
                "क्योंकि काटों में भी गुलाब मुस्कुराता है।" ));



        list.add(new Data_show ( "Taaron Me Akele Chand Jagmagata Hai.\n" +
                "Mushkilo Me Akele Insaan Dagmagata Hai.\n" +
                "Kato Se Mat Ghabrana Mere Dost.\n" +
                "Kyuki Kayi Me Bhi Gulab Muskurata Hai.\n" ));

        list.add(new Data_show ( "कभी रात में तारे गिन के देखना।\n" +
                "जितने तुम गिन पाए उतना तुम हमको याद करते हो।\n" +
                "ओर जितने तारे बच जाए उतना हम तुमको याद करते है।" ));


        list.add(new Data_show ( "Kabhi Raat Me Taare Gin Ke Dekhna.\n" +
                "Jitna Tum Gin Paay Utna Tum Hamko Yaad Karte Ho.\n" +
                "Or Jitne Taare Bach jaay Utna Ham Tumko Yaad Karte Hai." ));


        list.add(new Data_show ( "हर नमी में तेरी कमी तो रहेगी।\n" +
                "आँखे कुछ नम तो रहेगी।\n" +
                "ज़िन्दगी को हम कितना भी सवांरेगे\n" +
                "हमेंशा आप जैसे दोस्त की कमी रहेगी ।" ));



        list.add(new Data_show ( "Har Nami Mai Teri Kami To Rahegi.\n" +
                "Akhen Kuch Nam To Rahegi.\n" +
                "Zindagi Ko Ham Kitna Bhi Saware.\n" +
                "Hamesha Aap Jese Dost Ki Kami Rahegi.\n" ));



        list.add(new Data_show ( "आकाश के तारों में खो गया है एक तारा।\n" +
                "लगता है प्यार उन तारों में एक सितारा।\n" +
                "जो दोस्त इस समय पढ़ रहा है messenge हमारा।" ));



        list.add(new Data_show ( "दोस्त का प्यार दुआ से कम नही होता।\n" +
                "दोस्त दूर हो फिर भी कोई गम नही होता।\n" +
                "प्यार में अक्सर कम हो जाती है दोस्ती ।\n" +
                "पर दोस्ती में प्यार कभी कम नही होता।" ));


        list.add(new Data_show ( "हमनें कहा ऐ बारिश ज़रा थम के बरस।\n" +
                "जब मेरा दोस्त आ जाये तो जम के बरस।\n" +
                "पहले ना बरस की वो आ ना सके।\n" +
                "उसके आने के बाद इतना बरस की वो जा ना सके।\n" +
                "\n" +
                " \n" ));


        list.add(new Data_show ( "एक प्यारी सी सुबह बोली उठ के देख क्या नज़ारा है।\n" +
                "मैने कहा रुक पहले messenge भेजनें दे उसको जो इस सुबह से भी प्यारा है।" ));


        list.add(new Data_show ( "जिसे दिल की कलम ओर मोहब्बत की इंक कहते है।\n" +
                "जिसे लमहों की किताब ओर यादों का कवर कहते है।\n" +
                "यही वो सब्जेक्ट है जिसे friendship कहते है।\n" +
                " " ));


        list.add(new Data_show ( "अगर आपकी पलखो पे ख़्वाब रख जाएं कोई ।\n" +
                "अगर आपकी सांसो पे नाम लिख जाएं कोई ।\n" +
                "इस लिए ये वादा करो भूलोगे नही हमे ।\n" +
                "अगर हमसे भी प्यारा दोस्त मिल जाएं कोई ।\n" +
                " " ));


        list.add(new Data_show ( "काश दिल की आवाज़ में इतना असर हो जाए।\n" +
                "की हम जैसे याद करे उसको खबर हो जाए।\n" +
                "रब से यही दुआ है हमारी ।\n" +
                "की जिसे आप चाहे वो आपका हमसफ़र हो जाए।" ));

        list.add(new Data_show ( "ज़िन्दगी रहे ना रहे दोस्ती रहेगी।\n" +
                "पास रहो या दूर रहो यादे रहेगी।\n" +
                "अपनी ज़िंदगी मे हमेशा हँसते रहना।\n" +
                "क्योंकि तेरी हँसी में एक मुस्कान मेरी भी रहेगी।" ));


        list.add(new Data_show ( "कोई कहता है दोस्ती नाश बन जाती है ।\n" +
                "कोई कहता है दोस्ती सज़ा बन जाती है।\n" +
                "पर हम कहते है आपसे ।\n" +
                "दोस्ती अगर सच्चे दिल से करो।\n" +
                "तो दोस्ती ही जीने की वजह बन जाती है।" ));

        list.add(new Data_show ( "दिल से निकली बात दिल को छू जाती है।\n" +
                "ये अक्सर अनोखी बात रह जाती है।\n" +
                "कुछ लोग दोस्ती के मायने बदल देते है।\n" +
                "पर किसी की दोस्ती से दुनिया बदल जाती है।" ));

        list.add(new Data_show ( "ज़िक्र हुआ जब खुदा की रहमत का।\n" +
                "हमने खुद की खुशनसीब पाया।\n" +
                "तमन्ना थी एक प्यारे से दोस्त की।\n" +
                "खुदा खुद दोस्त बन के चला आया।\n" +
                " " ));


        list.add(new Data_show ( "ये दिन यू ही गुज़र जायँगे।\n" +
                "हम दोस्त एक दिन बिछड़ जायँगे।\n" +
                "आप नाराज़ ना होना मेरी शरारत से।\n" +
                "एक दिन ये पल याद आयगे।" ));


        list.add(new Data_show ( "ज़िन्दगी आपकी फूलों की तरह मुस्कुराए।\n" +
                "गम की हवा आपको छू भी ना पाय।\n" +
                "यूँ तो लाख आय मौसम पतझड़ के।\n" +
                "आपकी खुशी का एक फूल भी ना मुरझाये।" ));


        list.add(new Data_show ( "रात में जब आपकी याद आती है।\n" +
                "सितारों में आपकी तस्वीर नज़र आती है।\n" +
                "खोजती है आँखे उन चेहरो को।\n" +
                "जिनकी याद में सुबह हो जाती है।" ));

        list.add(new Data_show ( "रातें गुमनाम होती है।\n" +
                "दिन किसी के नाम होता है।\n" +
                "हम ज़िन्दगी कुछ इस तरह से जीते है।\n" +
                "की हर लमहा सिर्फ दोस्त के नाम होता है।\n" +
                " " ));


        list.add(new Data_show ( "दोस्ती एक रिश्ता है जो निभाए वो फरिश्ता है।\n" +
                "दोस्ती सच्ची प्रीत है जुदाई जिसकी रीत है।\n" +
                "जुदा होके भी ना भूले यही दोस्ती की जीत है।" ));


        list.add(new Data_show ( "दोस्त के लिए दोस्ती की सौगात होगी।\n" +
                "नये लोग होंगे नई बात होगी।\n" +
                "हम हर हाल में मुस्कुराते रहेगे।\n" +
                "अपनी दोस्ती अगर यूंही साथ होगी।" ));



        list.add(new Data_show ( "मुरझाए फूल को खुश्बू देना कोई आपसे सीखे।\n" +
                "रूठे हुए को मनाना कोई आपसे सीखे।\n" +
                "दोस्त बनाना तो हर कोई जानता है।\n" +
                "दोस्ती निभाना कोई आपसे सीखे।" ));



        list.add(new Data_show ( "तेरी दोस्ती को पलकों पर सजायगें ।\n" +
                "जब तक ज़िन्दगी है साथ निभायेगें।\n" +
                "देने को तो कुछ नही हमारे पास।\n" +
                "पर तेरी खुशी माँगने खुदा के पास जरुर जायँगे।" ));



        list.add(new Data_show ( "तेरा रिश्ता इस तरह निभायेगें।\n" +
                "तुम रोज़ खफा होना हम रोज़ मनाएंगे ।\n" +
                "पर मनाने से मान जाना।\n" +
                "वरना ये भीगी पलखे लेके हम कहा जायँगे।" ));


        list.add(new Data_show ( "वख्त के लमहे परिंदे बन के उड़ जायँगे।\n" +
                "पर यादों के निशान छोड़ जायँगे।\n" +
                "दोस्त बन कर हम दोस्ती निभायेगें।\n" +
                "पर आपके जैसा दोस्त कहा से पाएंगे।" ));


        list.add(new Data_show ( "खुश्बू में भी एहसास होता है।\n" +
                "प्यार का रिश्ता ख़ास होता है।\n" +
                "हर बात जुबां से कहना मुम्किन नही।\n" +
                "इस लिए दोस्ती का दूसरा नाम विशवास होता है।" ));


        list.add(new Data_show ( "उगता हुआ सूरत रोशनी दे आपको।\n" +
                "खिला हुआ फ़ूल खुश्बू दे आपको।\n" +
                "हम तो खुशी देने के काबिल नहीं।\n" +
                "देने वाला हज़ार खुशियां दे आपको।\n" +
                " " ));


        list.add(new Data_show ( "दिल मे तुम्हारे अपनी कमी छोड़ जाएंगे।\n" +
                "आँखों मे इंतेज़ार की लकीर छोड़ जाएंगे।\n" +
                "याद रखना ढूंढ़ते रहोगे हमे।\n" +
                "दोस्ती की ऐसी कहानी छोड़ जाएंगे।" ));


        list.add(new Data_show ( "Aaj Dil Puch Betha Apni Hi Tasveer Se.\n" +
                "Tune Kya Paya He Takdeer Se.\n" +
                "Teri Tasveer Dil Me Basa Kar.\n" +
                "Mene Ye Pyara Sa Dost Paya He Duniya Ki Bheed Se.\n" ));







        // list.add(new Data_show ( "" ));
    }
}
