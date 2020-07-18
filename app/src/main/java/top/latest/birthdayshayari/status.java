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

public class status extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;

    private RecyclerView recyclerView;
    private  RecyclerView.LayoutManager layoutManager;

    Adapter adapterRecyclerLinear;

    ArrayList<Data_show> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_status );

            init_ads ();





        recyclerView=findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager=  new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list= new ArrayList<Data_show> (  );
        adapterRecyclerLinear = new Adapter ( this,list);
        recyclerView.setAdapter ( adapterRecyclerLinear );
       // Toast.makeText ( this,"CLICK TO SHARE  :)",Toast.LENGTH_LONG ).show ();
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

        list.add(new Data_show ( "मैडम – एग्जाम आने वाले हैं\n" +
                "आज हम इंग्लिश पढ़ेंगे\n" +
                "\n" +
                "बच्चे – ओके मैडम\n" +
                "\n" +
                "मैडम – A से Apple\n" +
                "और बताओ A से ?\n" +
                "\n" +
                "बंटी– A से मुझे ना देखो\n" +
                "सीने से लगा लूँगा :) \uD83D\uDE09\n" +
                "\n" +
                "गेट आउट :p\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – बेटा तुम्हारे घर में सबसे\n" +
                "\n" +
                "छोटा कौन है?\n" +
                "\n" +
                "बच्चा – मेरे पापा,\n" +
                "\n" +
                "टीचर हैरान होकर बोला –\n" +
                "\n" +
                "बेटा वो कैसे?\n" +
                "\n" +
                "बच्चा – क्यूंकि वो अभी तक मम्मी के साथ सोते हैं :) :)\n" +
                "\n" +
                "टीचर बेहोश :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "एक सुन्दर लड़की पढाई में कमजोर थी\n" +
                "\n" +
                "हमेशा दोस्तों के साथ मस्ती करती रहती थी\n" +
                "\n" +
                "टीचर – तुम्हारे गणित में इतने कम नम्बर क्यों आये ?\n" +
                "\n" +
                "लड़की – आई नहीं थी ना उस दिन\n" +
                "\n" +
                "टीचर – क्या तुम पेपर वाले दिन आई ही नहीं थी ?\n" +
                "\n" +
                "लड़की –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "नहीं , वो मेरी बगल वाली लड़की नहीं आई थी :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "मैडम – बताओ बच्चों वास्कोडिगामा भारत कब आया ?\n" +
                "\n" +
                "बंटी–जी सर्दियों में आया था\n" +
                "\n" +
                "मैडम – पागल है क्या ? तुझसे किसने कहा ?\n" +
                "\n" +
                "बंटी– मैडम आपकी कसम…\n" +
                "\n" +
                "मैंने किताब में फोटो देखी थी\n" +
                "उसने कोट पहन रखा था :) :)" ));

        list.add(new Data_show ( "टीचर – आज मैं तुमको Noun पढ़ाऊंगी\n" +
                "\n" +
                "टीचर – पप्पू तू खड़ा हो\n" +
                "\n" +
                "बंटी–जी मैडम\n" +
                "\n" +
                "टीचर – लड़की सबसे हंस के बात करती है\n" +
                "इसमें लड़की क्या है ?\n" +
                "\n" +
                "बंटी– जी लड़की बिगड़ी हुई है\n" +
                "सेटिंग करना चाहती है :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – कल तुम स्कूल\n" +
                "क्यों नहीं आयी थी ?\n" +
                "\n" +
                "लड़की – सॉरी मैम\n" +
                "हमारी BMW आयी नहीं थी\n" +
                "\n" +
                "टीचर – तुम्हारे घर BMW है ?\n" +
                "\n" +
                "लड़की – हां BMW मतलब\n" +
                "“बर्तन मांझने वाली”\n" +
                "\n" +
                "वो कल आयी नहीं थी :) \uD83D\uDE09\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "मास्टर – कमीनों पढाई शुरू कर दो\n" +
                "पेपर आने वाले हैं\n" +
                "\n" +
                "बंटी– मैं तो खूब पढाई करता हूँ\n" +
                "कुछ भी पूछ लो\n" +
                "\n" +
                "मास्टर – बता ताजमहल किसने बनाया\n" +
                "\n" +
                "बंटी– मिस्त्री ने\n" +
                "\n" +
                "मास्टर – अबे गधे मतलब किसने बनवाया\n" +
                "\n" +
                "बंटी– ठेकेदार ने बनवाया होगा :) \uD83D\uDE09\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – 2 दिन से स्कूल क्यों नहीं आया था\n" +
                "\n" +
                "बंटी– सर कल मेरे घर में पूजा थी\n" +
                "\n" +
                "टीचर – अच्छा और परसों\n" +
                "\n" +
                "बंटी– परसों मेरे घर प्रिया थी :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – इस sentense को\n" +
                "\n" +
                "इंग्लिश में translate करो ,,\n" +
                "\n" +
                "“बसंत ने मुझे मुक्का मारा ”\n" +
                "\n" +
                "बच्चा – बसंत पंचमी\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "एक बस का ऐक्सिडन्ट हो गया!\n" +
                "बंता (चिल्लाते हुए): ओह! मेरा हाथ कट गया!\n" +
                "संता: चुप रहो, उस आदमी को देखो, उसका गला कट गया है वो फिर भी चिल्ला नहीं रहा!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: तू जहाँ जहाँ चलेगा मेरा साया साथ होगा.. मेरा साया.. मेरा साया;\n" +
                "बंता: मुझे पहले से ही शक था कि तू भूतनी है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "डॉक्टर: तुम्हारा पति सिर्फ 24 घंटे का मेहमान है;\n" +
                "जीतो: कोई बात नहीं डॉक्टर साहब... जहाँ 24 साल काट लिए वहां 24 घंटे और सही!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: दूल्हे को घोड़ी पर क्यों बिठाया जाता है, दुल्हन को क्यों नहीं?\n" +
                "संता: घोड़ी पर बिठा कर दूल्हे को भागने का आखिरी मौका दिया जाता है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: जल्दी घर आया और उसने अपनी बीवी के साथ किसी और आदमी को बैठा देखा\n" +
                "जीतो: आज तुम जल्दी क्यों आ गए?\n" +
                "संता: ये कौन है!\n" +
                "जीतो: बात बदलने की कोशिश मत करो!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\n" +
                "किसी अस्पताल में एक मरीज और नर्स..\n" +
                "मरीज- पानी चाहिए\n" +
                "नर्स - प्यास लगी है क्या?\n" +
                "\n" +
                "मरीज (चिढ़ कर ) - नहीं गला चेक करना है\n" +
                "कहीं लीक तो नहीं कर रहा है!!!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "एक पत्नी के सुविचार:\n" +
                "\n" +
                "काश तुम अदरक होते…\n" +
                "कसम से, जी भर के कूटती !!\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\n" +
                "\n" +
                "\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06\uD83D\uDE06" ));

        list.add(new Data_show ( "Group कीसी का भी हो !!\n" +
                "पर घमाका हमारा ही होगा !!!\n" +
                "\n" +
                "हम आज भी अपने हुनर मे दम रखते है,\n" +
                "होश उड़ जाते है लोगो के, जब .. whatsapp में कदम रखते है\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "हम तो ऐसे ही उदास बैठे बैठे\n" +
                "पानी में पत्थर फेंक रहे थे...\n" +
                "अचानक एक मेंढक पानी से निकला...\n" +
                "\n" +
                "और बोला...... तू पानी में तो आ\n" +
                "साले बताता हु तुझे\n" +
                "अपनी वाली के चक्कर में तूने\n" +
                "मेरी वाली का सर फोड़ दिया ...!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "कोई दोस्त हो तुम जैसा;कोई चाहने वाला हो तुम जैसा;कोई दिल से प्यारा हो तुम जैसा;........पता नहीं क्यों सब मुझे यही कहते रहते हैं।\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "बंता: यार मुझे सुबह सुबह साँस लेने में मुश्किल होती है!\n" +
                "संता: मुश्किल तो होगी ही क्योंकि सुबह सुबह बाबा राम देव के भगत सारी आक्सीजन जो खींच लेते है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: मैं तो अपने सारे दोस्तों को भूल गया था! पर एक फिल्म देखी तो सब याद आ गये!\n" +
                "बंता: कौन सी फिल्म?\n" +
                "संता; कमीने!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: मैंने आपको ख़त लिखा था फिर भी आप शादी में क्यों नहीं आये?\n" +
                "बंता: मुझे ख़त नहीं मिला!\n" +
                "संता: तो मैंने लिखा तो था कि ख़त मिले या न मिले आना ज़रूर!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता और बंता की खूब पिटाई हुई! पता है क्यों?\n" +
                "क्योंकि दोनों जन्मदिन की पार्टी में बिना बुलाये चले गए थे और वहां खाना खाते हुए बोल रहे थे हम तो लड़के वालों की तरफ से है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता को पूरी रात मच्छरों ने बहुत परेशान किया!\n" +
                "संता की खोपड़ी घूमी और उसने ज़हर पी लिया और बोला अब काटो सालों सब मरोगे!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));


        list.add(new Data_show ( "संता: आज मुझे एक मैसेज आया और उसके बाद मेरा फोन बंद हो गया!\n" +
                "बंता: ऐसा क्या मैसेज आया?\n" +
                "संता: बैटरी लो!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00\n" +
                "पापा:पप्पू बेटा, मैथ्स में जीरो नंबर क्यों आये है?\n" +
                "पप्पू: स्कूल नही आने के कारण.\n" +
                "पापा: क्यों तुम मैथ्स वाले पेपर के दिन नही गये थे?\n" +
                "पप्पू: मैं नही, मेरे बगल वाला लड़का नही आया था ना..\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\uD83D\uDE07\n" +
                "एक बन्दा जो इलेक्शन मे किस्मत आजमा रहा था उसे सिर्फ तीन वोट मिले।\n" +
                "\n" +
                "अब उसने सरकार से जेड प्लस की सुरक्षा मागने लगा ,\n" +
                "\n" +
                "जिले के डी एम साहब ने समझाते हुए कहा “आप को सिर्फ तीन वोट मिले है फिर आप को जेड प्लस कैसे दी जा सकती है”\n" +
                "\n" +
                "वह आदमी बोला “जिस शहर मे लोग मेरे इतने खिलाफ हो तो मुझे सुरक्षा मिलनी ही चाहिए।”\n" +
                "\uD83D\uDE09\uD83D\uDE09\uD83D\uDE09\uD83D\uDE09\uD83E\uDD23\uD83E\uDD23" ));

        list.add(new Data_show ( "पुलिस ट्रेनिंग के दौरान , अफसर  \uD83D\uDC68\uD83C\uDFFB\u200D✈ ने पूछा : ‘ये हाथ में क्या है ?’\n" +
                "\n" +
                "सुरेश : “सर , बन्दूक है …!”\n" +
                "\n" +
                "अफसर \uD83D\uDE0E: “ये बन्दूक नहीं ! तुम्हारी इज़्ज़त है , शान है , ये तुम्हारी माँ है माँ . !!”\n" +
                "\n" +
                "फिर अफसर ने दूसरे सिपाही रमेश से पूछा : “ये हाथ में क्या है ?”\n" +
                "\n" +
                "रमेश \uD83D\uDE0F: “सर , ये सुरेश की माँ है , उसकी इज़्ज़त है , उसकी शान है और हमारी मौसी है मौसी ..!\uD83D\uDE01\n" +
                "\n" +
                "सर बेहोश\uD83E\uDD15\n" +
                "\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23\uD83E\uDD23" ));

        list.add(new Data_show ( "दुनिया में तीन लोग बहुत प्यारे और अच्छे हैं…!!\n" +
                "\n" +
                "एक.. मैं…!!\n" +
                "\n" +
                "दुसरा.. मेरे माता पिता की संतान…यानि के मैं…!!\n" +
                "\n" +
                "और तीसरा….. आपका दोस्त…यानि के फिर मैं…!!\n" +
                "\n" +
                "जलो मत .. हौसला रखो..\n" +
                "आप भी तो इतने प्यारे और अच्छे इंसान के दोस्त हो……\n" +
                "यानि के फिर मैं..!!\n" +
                "\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F\uD83D\uDE0F" ));

        list.add(new Data_show ( "बेटा -: पापा आप CA कैसे बने ??\n" +
                "\n" +
                "पापा-: बेटा, उसके लिये बहूत दिमाग की ज़रूरत पड़ती हैं ओर बहुत मेहनत से पढाई करनी होती है…!!!\n" +
                "\n" +
                "बेटा-: हां, जानता हूं, इसीलिये ही तो पूछ रहा हूँ\n" +
                "कि\n" +
                "आप CA कैसे बने …???\n" +
                "\n" +
                "पापा \uD83E\uDD22\uD83E\uDD22- दे थप्पड़…\n" +
                "\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D" ));

        list.add(new Data_show ( "टीचर केमिस्ट्री पढ़ा रही थी ,\n" +
                "\n" +
                "टीचर – पानी का फार्मूला बताओ\n" +
                "\n" +
                "पप्पू – H2O + MgCl2 + CaSO4 + AlCl3 + NaOH + KOH + HNO3 + HCl + CO2\n" +
                "\n" +
                "टीचर – (गुस्से में )गलत है ये ,\n" +
                "\n" +
                "पप्पू – मैडम ये नाले का पानी है\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – 15 फलों के नाम बताओ ,\n" +
                "\n" +
                "पप्पू – सेब\n" +
                "\n" +
                "टीचर – शाबाश\n" +
                "\n" +
                "पप्पू – संतरा\n" +
                "\n" +
                "टीचर – गुड\n" +
                "\n" +
                "पप्पू – आम\n" +
                "\n" +
                "टीचर – वेरी गुड और पर ये तो 3 हैं बाकि 12 ??\n" +
                "\n" +
                "पप्पू – 1 दर्जन केले\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "भला हो \"फेसबुक\"और whatsapp का\n" +
                "वरना ना जाने कितने \"शायर\"\n" +
                "\"आज\"\n" +
                "भी \"ट्रक\" और \"टेम्पो\" के पीछे\n" +
                "\"शायरी\" लिखते लिखते \"दम\" तोड़ देत\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "पप्पू को गणित बिलकुल समझ में नहीं आता था\n" +
                "\n" +
                "मास्टर – कल सवाल हल करके लाएगा,\n" +
                "\n" +
                "पप्पू – जी मास्टर जी\n" +
                "\n" +
                "मास्टर – अगर कल काम करके नहीं लाया तो\n" +
                "मैं मुर्गा बनाऊंगा\n" +
                "\n" +
                "पप्पू मास्टर का भी बाप निकला, पप्पू बोला –\n" +
                "\n" +
                "मुर्ग़ा तो मैं खाता ही नहीं, पनीर आलू बना लेना……..\n" +
                "फिर दे थप्पड़, दे थप्पड़ :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00\n" +
                "साइंस की टीचर क्लास में पढ़ा रही थी,\n" +
                "\n" +
                "जिन्दा रहने के लिए क्या क्या चीजें जरुरी हैं\n" +
                "\n" +
                "टीचर ने पप्पू से कहा –\n" +
                "तू बता जिन्दा रहने के लिए क्या क्या चीजें जरुरी हैं\n" +
                "\n" +
                "पप्पू – नहीं पता मैडम\n" +
                "\n" +
                "टीचर – अरे जो आता है वही बता\n" +
                "\n" +
                "पप्पू – जिन्दा रहने के लिए तेरी कसम\n" +
                "एक मुलाकात जरुरी है सनम ,,\n" +
                "\n" +
                "टीचर – आजा बाहर बन जा मुर्गा :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00\n" +
                "स्कूल में भयंकर आग लग गयी,\n" +
                "\n" +
                "बच्चे – मजे आ गए\n" +
                "अब कल से स्कूल नहीं आना पड़ेगा :)\n" +
                "\n" +
                "टीचर पप्पू से – बेटा तुम इतने दुखी क्यों हो ?\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "सर मैं सोच रहा हूँ\n" +
                "आप जिन्दा कैसे बच गए :) :)\n" +
                "टीचर बेहोश :( :(\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00\n" +
                "पप्पू का आज फ़ाइनल एग्जाम था,\n" +
                "\n" +
                "पप्पू को पेपर में एक भी सवाल का जवाब नहीं आता था,\n" +
                "\n" +
                "पप्पू नालायक खाली कॉपी ही छोड़ आया,\n" +
                "\n" +
                "जब पप्पू रूम से निकला,\n" +
                "\n" +
                "टीचर एकदम गुस्से में – क्यों बे नालायक,\n" +
                "कुछ करके भी आया है,\n" +
                "या ऐसे ही आ गया,\n" +
                "\n" +
                "पप्पू – जी सर, ब्रेकफास्ट करके आया हूँ, और आप :) :)\n" +
                "टीचर बेहोश :(\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00\n" +
                "टीचर – दोस्ती प्यार से बढ़कर होती है\n" +
                "\n" +
                "पप्पू – मतलब दोस्तों के साथ ज्यादा नजदीकी रखनी चाहिए\n" +
                "\n" +
                "टीचर – हाँ, अब बताओ अगर तुम्हारा दोस्त और\n" +
                "तुम्हारी गर्लफ्रेंड नदी में एक साथ डूब रहे हों\n" +
                "तो किसे बचाओगे?\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "दोनों को डूब जाने दूँगा,\n" +
                "साले एक साथ कर क्या रहे थे :) :)\n" +
                "टीचर बेहोश :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "पप्पू रो रहा था\n" +
                "\n" +
                "मम्मी – क्या हुआ क्यों जानवरों की तरह रो रहा है\n" +
                "\n" +
                "पप्पू – मुझे स्कूल से निकाल दिया\n" +
                "\n" +
                "मम्मी – क्यों तूने जरूर किसी की बैंड बजाई होगी\n" +
                "\n" +
                "पप्पू – नहीं मैंने तो मच्छर मारा था बस\n" +
                "\n" +
                "मम्मी – बस एक मच्छर मारने पे ही स्कूल से निकाल दिया\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "वो मच्छर मैडम के गाल पर बैठा ना ना :) :)\n" +
                "मम्मी बेहोश :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "मैथ की टीचर बच्चों को पढ़ा रही थी\n" +
                "\n" +
                "टीचर – पप्पू कुर्सी पे खड़ा हो जा\n" +
                "\n" +
                "पप्पू – लो हो गया कुर्सी पे खड़ा मैम\n" +
                "\n" +
                "टीचर – एक टोकरी में अगर 5 आम हैं\n" +
                "और 2 आम सड़ गए तो अब कितने आम बचे ?\n" +
                "\n" +
                "पप्पू – 5\n" +
                "\n" +
                "टीचर – कैसे ?\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "जो आम सड़ गए वो भी आम ही तो रहेंगे\n" +
                "सड़ने के बाद केले थोड़े ना बन जायेंगे :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "मैडम बच्चों से – जो बच्चा मेरे सवाल का जवाब देगा\n" +
                "उसे मैं घर जाने दूँगी\n" +
                "\n" +
                "पप्पू ने तुरंत अपना बैग खिड़की के बाहर फेंक दिया\n" +
                "\n" +
                "मैडम – ये बैग किसने फेंका ?\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "मैंने :)\n" +
                "और अब मैं घर जा रहा हूँ :)\n" +
                "टीचर बेहोश :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर क्लास में डंडा लेकर आये\n" +
                "\n" +
                "टीचर – पप्पू तो लड़कियों को बहुत तंग करता है\n" +
                "\n" +
                "पप्पू – किसने बोला सर ?\n" +
                "\n" +
                "टीचर – बता ऐसा कौन सा काम है जो\n" +
                "लड़के कर सकते हैं लेकिन लड़कियां नहीं ?\n" +
                "\n" +
                "पप्पू – लड़की कभी पोस्टमैन नहीं बन सकती\n" +
                "\n" +
                "टीचर – ऐसा क्यों ?\n" +
                "\n" +
                "पप्पू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "क्योंकि वो तो एक डिलीवरी में ही\n" +
                "9 महीने लगा देती है :) :)\n" +
                "टीचर बेहोश :(\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता प्लेटफॉर्म से रेल की पटरी पर कूद गया!\n" +
                "बंता: मरने का इरादा है क्या?\n" +
                "संता: मरोगे तो तुम तुमने सुना नहीं ट्रेन प्लेटफॉर्म पर आ रही है!\n" +
                "@@@\n" +
                "टीचर: पप्पू तुम कॉलेज किसलिये आते हो?\n" +
                "पप्पू: विद्या पाने के लिये.\n" +
                "टीचर: तो अब सो क्यों रहे हो?\n" +
                "पप्पू: क्योंकि आज विद्या नही आई है सर.\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर क्लास में गणित पढ़ा रहा था\n" +
                "\n" +
                "टीचर – बोर्ड में 55 लिखो,\n" +
                "\n" +
                "student – सर कैसे लिखते हैं\n" +
                "\n" +
                "टीचर – 5 लिखे फिर उसके साइड में एक और 5 लिख\n" +
                "\n" +
                "student– ने बोर्ड में 5 लिखा और रुक गया\n" +
                "\n" +
                "टीचर – अबे क्या हुआ रुक क्यों गया\n" +
                "\n" +
                "student– सर दूसरा 5 किस साइड लिखूं समझ नही आ रहा :) :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "Valentine Day वाले दिन स्कूल में,\n" +
                "\n" +
                "टीचर – बंटू तुम उदास क्यों बैठे हो?\n" +
                "\n" +
                "बंटू- स्कूल में वैलेंटाइन वाले दिन भी छुट्टी नहीं की :(\n" +
                "\n" +
                "टीचर – अच्छा अगर तुमको 2 लड़कियाँ प्रपोज करें\n" +
                "तो तुम किससे शादी करोगे?\n" +
                "\n" +
                "बंटू –\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "दोनों में कुश्ती करा दूंगा जो हारी उससे शादी करूंगा\n" +
                "क्यूंकि शादी के बाद वो मुझे कम पीटेगी :) \uD83D\uDE09\n" +
                "टीचर बेहोश :)\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "टीचर – “ख़ुशी का ठिकाना ना रहा”\n" +
                "इस मुहावरे का क्या मतलब है ?\n" +
                "\n" +
                "पप्पू – ख़ुशी घर वालों से छिपकर\n" +
                "रोजाना अपने बॉयफ्रेंड से मिलने जाती थी\n" +
                "\n" +
                "एक दिन उसके पापा ने बॉयफ्रेंड के साथ देख लिया\n" +
                "और ख़ुशी को घर से निकाल दिया\n" +
                "\n" +
                "अब बेचारी “ख़ुशी का ठिकाना ना रहा” :) \uD83D\uDE09\n" +
                "\n" +
                "टीचर बेहोश :(\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: उठो जी, अलमारी के पास चोर खड़ा है;\n" +
                "बंता: उसके पास हथियार हुआ तो?\n" +
                "प्रीतो: ओह हो घबराओ मत! आपका तो इंश्योरेंस है, पर जेवरात का नहीं!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: उठो जी, अलमारी के पास चोर खड़ा है;\n" +
                "बंता: उसके पास हथियार हुआ तो?\n" +
                "प्रीतो: ओह हो घबराओ मत! आपका तो इंश्योरेंस है, पर जेवरात का नहीं!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "जीतो: भूकंप आया है और मकान भी हिल रहा है, गिर जायेगा तो?\n" +
                "संता: गिरता है तो गिरने दो, कौन सा हमारा मकान है, हम तो किरायेदार है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "जीतो: देख लेना तुम्हें नरक में भी जगह नहीं मिलेगी!\n" +
                "संता: अच्छा है, मैं भी हर जगह तुम्हारे साथ नहीं जाना चाहता!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: तेरा भाई आजकल क्या कर रहा है?\n" +
                "बंता: एक दुकान खोली थी, पर अब जेल में है!\n" +
                "संता: वो क्यों?\n" +
                "बंता: दुकान हथोड़े से खोली थी!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: आपका कुत्ता तो शेर जैसा दिखता है, क्या खिलाते हो?\n" +
                "बंता: ये कमीना शेर ही है, प्यार-व्यार के चक्कर में पड़ के शक्ल कुत्ते जैसी हो गयी है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता बैंक में पैसे जमा कराने गया!\n" +
                "कैशियर: ये नोट फटा हुआ है, दूसरा दो!\n" +
                "संता: मैं अपने अकाउंट में जमा कर रहा हूँ, फटा हुआ कराऊं या नया, तेरा क्या?\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता दारु पी रहा था!\n" +
                "जीतो: क्या तुम मेरे लिये यह दारु नहीं छोड़ सकते?\n" +
                "संता: पर तुम तो दारु पीती नहीं हो!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: जब भी मैं अच्छे कपड़े पहन के जाता हूँ तो सब्जीवाला सब्जी महंगी देता है और वैसे सस्ती!\n" +
                "जीतो: कल से कटोरा ले के जाना!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: अगर मुझे कुछ हो गया तो क्या आप तुरंत दूसरी शादी कर लोगे?\n" +
                "बंता: कम से कम 2-3 महीने तो रुकना पड़ेगा, वरना पड़ोसी क्या कहेंगे?\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));


        list.add(new Data_show ( "प्रीतो: अपने बालो को तो देखो, जैसे घास उगी हो!\n" +
                "बंता: तभी तो मैं सोच रहा था कि मेरे पास भैंस क्यों खड़ी है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता और बंता खाना बना रहे थे!\n" +
                "संता: यार यहाँ पर नमक नहीं है, क्या करू?\n" +
                "बंता: तू एक काम कर मेरा टूथपेस्ट डाल ले, इसमें नमक है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता हर रविवार को होली खेलता!\n" +
                "जीतो: तुम हर रविवार को होली क्यों खेलते हो?\n" +
                "संता: क्योंकि रविवार को होली-डे होता है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता की लोटरी में पैरिस का टूर निकला, उसने अपनी पत्नी को कॉल की और बोला, \"शोना, मेरे साथ पैरिस चलोगी?\"\n" +
                "जीतो (ख़ुशी से): हाँ हाँ बिलकुल, पर आप बोल कौन रहे हैं?\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: मेरी बीवी बहुत खर्चीली है, रोज़ 5000 मांगती है!\n" +
                "दोस्त: इतने पैसे का वो करती क्या है?\n" +
                "संता: क्या पता, मैंने कभी दिए नहीं!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: बंता, देख क्या मस्त आइटम है!\n" +
                "बंता: अरे मस्त से याद आया, भाभी कैसी है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "प्रीतो: तुम्हे नहीं लगता कि ज़रा सी समझदारी से लाखों तलाक के मामले रोके जा सकते है!\n" +
                "बंता: ज़रा सी समझदारी से शादियाँ भी तो रोकी जा सकती है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));


        list.add(new Data_show ( "जीतो: चलो न, आज हम बाहर चलते हैं और कार मैं ड्राइव करुँगी!\n" +
                "संता: इसका मतलब हम जायेंगे कार में और आएंगे अख़बार में!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));










        list.add(new Data_show ( "जीतो: आपकी ब्लू शर्ट मुझसे जल गयी!\n" +
                "संता: मेरे पास वैसी एक और शर्ट है!\n" +
                "जीतो: मैंने उसमे से कपड़ा काट के पहले वाले में लगा दिया है!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "जीतो: तुमने अपनी ज़िन्दगी में किया ही क्या है?\n" +
                "संता: मैंने अपना जीवन खुद बनाया है!\n" +
                "जीतो: लो, और मैं अब तक ईश्वर को दोष दे रही थी!\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));

        list.add(new Data_show ( "संता: जानू मैं तुम्हें सुबह से शाम तक, शाम से सुबह तक प्यार करूँगा!\n" +
                "जीतो: जानू फिर मैं पोट्टी करने कब जाऊँगी?\n" +
                "\uD83D\uDE00\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE02\uD83D\uDE02\uD83D\uDE02\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE1D\uD83D\uDE00" ));



        //list.add(new Data_show ( "" ));






    }
}
