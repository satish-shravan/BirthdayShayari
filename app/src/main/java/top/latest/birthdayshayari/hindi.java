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

public class hindi extends AppCompatActivity {

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
        setContentView ( R.layout.activity_hindi );

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



        list.add(new Data_show ( "लाख टके की बात \uD83D\uDC4C\n" +
                "\n" +
                "जो मुस्कुरा रहा है, उसे दर्द ने पाला होगा..\n" +
                "जो चल रहा है, उसके पाँव में छाला होगा..\n" +
                "बिना संघर्ष के इन्सान चमक नही सकता, यारों..\n" +
                "जो जलेगा उसी दिये में तो, उजाला होगा..!!" ));

        list.add(new Data_show ( "“अपने लक्ष्य को ऊँचा रखो और तब तक मत रुको जब तक आप इसे हासिल नहीं कर लेते है।”\n" +
                "\n" ));

        list.add(new Data_show ( "“जिनमें अकेले चलने का होंसला होता हैं, उनके पीछे एक दिन काफिला होता हैं।”" ));

        list.add(new Data_show ( "“जिंदगी में किसी से अपनी तुलना मत करो जैसे चांद और सूरज की तुलना किसी से नहीं की जा सकती क्योकि यह अपने समय पर ही चमकते है।”" ));

        list.add(new Data_show ( "“दुनियाँ में दो तरह के लोग होते है एक वो जो दुनियाँ के अनुसार खुद को बदल लेते है और दूसरे वो जो खुद के अनुसार दुनियाँ को बदल देते है।”" ));
        list.add(new Data_show ( "“आप हमेशा इतने छोटे बनिये की\n" +
                "हर व्यक्ति आपके साथ बैठ सके,\n" +
                "और आप इतने बड़े बनिये की\n" +
                "आप जब उठे तो कोई बैठा न रहे।”" ));


        list.add(new Data_show ( "“ये क्या सोचेंगे? वो क्या सोचेंगे? दुनिया क्या सोचेगी? इससे ऊपर उठकर कुछ सोच, जिन्दगीं सुकून का दूसरा नाम हो जाएगी”\n" +
                "\n" ));


        list.add(new Data_show ( "“यदि किसी काम को करने में डर लगे तो याद रखना यह संकेत है, कि आपका काम वाकई में बहादुरी से भरा हुआ है।”" ));


        list.add(new Data_show ( "“इतर से कपड़ों का महकाना कोई बड़ी बात नहीं है, मज़ा तो तब है जब आपके किरदार से खुशबू आये!!”" ));

        list.add(new Data_show ( "“सिर्फ मरी हुई मछली को पानी का बहाव चलाती है जिस मछली में जान होती है वह अपना रास्ता खुद बनाती है।”" ));

        list.add(new Data_show ( "“ज़िंदगी जीना आसान नहीं होता; बिना संघर्ष के कोई महान नहीं होता; जब तक न पड़े हथौड़े की चोट; पत्थर भी भगवान नहीं होता।”" ));

        list.add(new Data_show ( "“भागते रहो अपने लक्ष्य के पीछे, क्यूंकि आज नहीं तो और कभी, करेंगे लोग गौर कभी, लगे रहो बस रुकना मत, आयेगा तुम्हारा दौर कभी।” " ));

        list.add(new Data_show ( "“किसी के पैरों में गिरकर कामयाबी पाने से बेहतर है अपने पैरों पर चलकर कुछ बनने की ठान लो।”" ));
        list.add(new Data_show ( "“मेहनत इतनी खामोशी से करो कि सफलता शोर मचा दे।”" ));


        list.add(new Data_show ( "“समझदार इंसान वो नहीं होता जो ईंट का जवाब पत्\u200Dथर से देता है, समझदार इंसान वो होता है जो फेंकी हुई र्ईंट से आशियॉं बना लेता है।”" ));


        list.add(new Data_show ( "“जिससे कोई उम्मीद नही होती अक्सर वही लोग कमाल करते हैं!”" ));


        list.add(new Data_show ( "“मैदान में हारा हुआ इंसान,फिर से जीत सकता है, लेकिन मन से हारा हुआ इंसान, कभी नहीं जीत सकता!!”" ));


        list.add(new Data_show ( "“कम्फर्ट जोन से बाहर निकालिए, आप तभी आगे बढ़ सकते है जब आप कुछ नया आज़माने को तैयार है।”\n" +
                "\n" ));

        list.add(new Data_show ( "“उन पर ध्यान मत दीजिये जो आपकी पीठ पीछे बात करते है इसका सीधा सा अर्थ है आप उनसे दो कदम आगे है”" ));

        list.add(new Data_show ( "“जीवन मे सबसे बड़ी ख़ुशी उस काम को करनें में है, जिसे लोग कहते है कि आप नहीं कर सकते।”\n" +
                "\n" ));

        list.add(new Data_show ( "“जिस व्यक्ति ने कभी गलती नहीं की उसने कभी कुछ नया करने की कोशिश नहीं की।”\n" +
                "\n" ));
        list.add(new Data_show ( "“अच्छे के साथ अच्छा बनें बुरे के साथ बुरा नहीं क्योंकि हीरे को हीरे से तराशा तो जा सकता है पर कीचड़ से कीचड़ साफ़ नहीं हो सकता है.”" ));


        list.add(new Data_show ( "“पतझड़ हुए बिना पेड़ पर नए पत्ते नहीं आते ठीक उसी तरह परेशानी और कठिनाई सहे बिना इंसान के अच्छे दिन नहीं आते।”" ));


        list.add(new Data_show ( "“कुछ अलग करना है, तो भीड़ से हट कर चलो, भीड़ साहस तो देती है, पर पहचान छिन लेती है।”" ));


        list.add(new Data_show ( "“ज़िन्दगी में अगर बुरा वक़्त नहीं आता तो अपनों में छुपे हुए गैर और गैरों में छुपे हुए अपनों का कभी पता न चलता।”" ));


        list.add(new Data_show ( "“बुरी आदतें अगर वक्त पर नहीं बदली जाए तो वह आदतें आपका वक्त बदल देती हैं|”\n" +
                "\n" ));

        list.add(new Data_show ( "“सफल लोग कोई और नहीं होते वो बस कड़ी मेहनत करना जानते हैं|”\n" +
                "\n" ));

        list.add(new Data_show ( "“खुद को एक सोने के सिक्के जैसा बनाइये, जो कि अगर नाली में भी गिर जाए तो भी उसकी क़ीमत कम नहीं होती है।”" ));

        list.add(new Data_show ( "“असफलता और सफलता दोनों ही अवस्थाओं में लोग तुम्हारी बातें करेंगे, सफल होने पर प्रेरणा के रूप में और असफल होने पर सीख के रूप में ।”" ));
        list.add(new Data_show ( "“अपनों पर भी उतना ही विश्वास रखो जितना दवाइयों पर रखते होबेशक थोड़े कड़वे होंगे पर आपके फ़ायदे के लिए होंगे।”" ));


        list.add(new Data_show ( "“अगर आप रेत पर अपने कदमो के निशान छोड़ना चाहते है तो .. एक ही उपाय है – अपने कदम पीछे मत खिचिए”\n" +
                "\n" ));


        list.add(new Data_show ( "“जो मनुष्य अपने क्रोध ख़ुद के ऊपर झेल जाता है वो दूसरों के क्रोध से बच जाता है”\n" +
                "\n" ));


        list.add(new Data_show ( "“अगर लोग आप पर पत्थर फेंके तो आप उस पत्थर को मील का पत्थर बना दीजिए।”\n" +
                "\n" ));


        list.add(new Data_show ( "“उन्नति की क्षमता रखने वालों पर समय-समय पर आपत्ति आती है।”" ));


        list.add(new Data_show ( "“तहज़ीब सीखा दी मुझे एक छोटे से मकान नेे दरवाज़े पर लिखा था थोड़ा झुककर चलिये।”\n" +
                "\n" ));


        list.add(new Data_show ( "“सच्चाई और अच्छाई की तलाश में पूरी दुनियाँ घूम ले, अगर वो हमारे अंदर नही है तो कहीं नहीं है।”\n" +
                "\n" ));


        list.add(new Data_show ( "“अगर आप 1000 बार भी असफ़ल हुए है तो एक बार और प्रयास करें।”\n" +
                "\n" +
                " " ));

        list.add(new Data_show ( "“अगर आप 1000 बार भी असफ़ल हुए है तो एक बार और प्रयास करें।”\n" +
                "\n" +
                " " ));


        list.add(new Data_show ( "“एक सफल व्यक्ति हमेशा कुछ अच्छा हासिल करने के लिए प्रेरित होता है ना कि किसी को पराजित करने के लिए।”\n" +
                "\n" ));


        list.add(new Data_show ( "“सारी दुनियाँ कहती है कि हार मान लो लेकिन दिल कहता है कि एक बार और कोशिश करो, तुम ये जरूर कर सकते हो”\n" +
                "\n"
        ));


        list.add(new Data_show ( "“हम कई बार असफ़ल हो सकते है लेकिन हार नहीं सकते।”" ));

        list.add(new Data_show ( "“एक हारा हुआ ईन्सान, हारने के बाद भी स्माईल करे तो, जितने वाला अपनी जीत की खुशी खो देता है।”" ));


        list.add(new Data_show ( "“लोग जो अपनी जिन्दगी का नियंत्रण अपने हाथो में नहीं लेते उनका नियंत्रण समय के हाथो में चला जाता है”― Kiran Bedi" ));


        list.add(new Data_show ( "“जितना कठिन संघर्ष होगा जीत उतनी ही शानदार होगी।”" ));


        list.add(new Data_show ( "“जहां आप की अहमियत समझी ना जाए वहां जाना बंद कर दो चाहे वह किसी का घर हो या किसी का दिल।”\n" +
                "\n" ));


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



        //list.add(new Data_show ( "" ));













    }
}
