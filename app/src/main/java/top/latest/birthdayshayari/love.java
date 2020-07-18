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

public class love extends AppCompatActivity {

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
        setContentView ( R.layout.activity_love );



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
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId () == android.R.id.home)
        {
            finish ();
            return  true;
        }
        return super.onOptionsItemSelected ( item );
    }



    private void linearList()
    {

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "एक पल की ये बात नहीं,\n" +
                "दो पल का ये साथ नहीं,\n" +
                "कहने को तो जिन्दगी जन्नत से प्यारी है,\n" +
                "पर वो साथ ही क्या जिसमे तेरा हाथ नहीं.\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "गिले शिकवे दिलसे न लगा लेना.\n" +
                "कभी रूठ जाऊ तो मना लेना.\n" +
                "कल का क्या पता हम हो नहो.\n" +
                "इसलिए जब भी मिलू.\n" +
                "प्यार से मेरा हाथ थाम लेना.❤️\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "सुन पगली मेरी यही ख़्वाहिश है,\n" +
                "हर पल हम साथ हो,\n" +
                "मेरे हाथो में तेरा हाथ हो,\n" +
                "जहाँ भी देखें एक साथ देखें,\n" +
                "तुम मेरी नज़र से देखो और मैं तुम्हारी नज़र से.\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "तेरे सीने से लग कर तेरी आरज़ू बन जाऊँ,\n" +
                "तेरी सांसों से मिलकर तेरी खुशबू बन जाऊँ,\n" +
                "फासले न रहें कोई हम दोनों के दरम्यान,\n" +
                "मैं, मैं न रहूँ… बस तू ही तू बन जाऊँ।\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "किसी को चाहो तो इस अंदाज़ से चाहो,\n" +
                "कि वो तुम्हे मिले या ना मिले,\n" +
                "मगर उसे जब भी प्यार मिले,\n" +
                "तो तुम याद आओ.\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "मेरी यादो मे तुम हो, या मुझ मे ही तुम हो…\n" +
                "मेरे खयालो मे तुम हो, या मेरा खयाल ही तुम हो…\n" +
                "दिल मेरा धडक के पूछे, बार बार एक ही बात…\n" +
                "मेरी जान मे तुम हो, या मेरी जान ही तुम हो…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "रिश्ता वो नहीं होता जो दुनिया को दिखाया जाता है!\n" +
                "रिश्ता वह होता है,जिसे दिल से निभाया जाता है!!\n" +
                "अपना कहने से कोई अपना नहीं होता,\n" +
                "अपना वो होता है जिसे दिल से अपनाया जाता है!!!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "शान से हम तेरे दिल में रहेंगे,\n" +
                "तेरी मोहब्बत पे जान निसार करेंगे,\n" +
                "देख के जलेगी हमे दुनियाँ सारी,\n" +
                "इस कदर बे-पनाह प्यार तुझे करेंगे." ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "दिल को तेरी ही तमन्ना,\n" +
                "दिल को है तुझसे ही प्यार,\n" +
                "चाहे तू आये या न आये,\n" +
                "हम करेंगे इंतजार…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "ये लकीरें, ये नसीब, ये किस्मत\n" +
                "सब फ़रेब के आईनें हैं…\n" +
                "हाथों में तेरा हाथ होने से ही\n" +
                "मुकम्मल ज़िंदगी के मायने हैं…\n" +
                "\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "अपनी सांसों में महकता पाया है तुझे,\n" +
                "हर ख्वाब मे बुलाया है तुझे,\n" +
                "क्यू न करे याद तुझ को\n" +
                "जब खुदा ने हमारे लिए बनाया है तुझे.\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "हम वो नही जो तुम्हे गम में छोड़ देंगे ,\n" +
                "हम वो नही जो तुजसे नाता तोड़ देंगे ,\n" +
                "हम वो हे जो तुम्हारी साँसे रुके तो ,\n" +
                "अपनी साँसे छोड़ देंगे…।।\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "ये वादा है तुमसे वो दिन भी मैं लाऊँगा,\n" +
                "जब तुम ख़ुद कहोगी,\n" +
                "मुझे दुनिया की परवाह नहीं।\n" +
                "मैं बस तुम्हारी होना चाहती हूँ।\n" +
                "मैं बस तुम्हारी हूँ।\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "ना चाँद की चाहत\n" +
                "ना तारों की फ़रमाईश\n" +
                "हर जन्म तू मिले\n" +
                "बस यही मेरी ख्वाईश!! ❤\n" +
                "\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "पता है तुम्हारी और हमारी\n" +
                "मुस्कान में फ़र्क क्या है?\n" +
                "तुम खुश हो कर मुस्कुराते हो,\n" +
                "हम तुम्हे खुश देख के मुस्कुराते हैं..\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "तुम दूर रहो या पास,\n" +
                "बस अपनी सलामती बताया करो..\n" +
                "जब भी नजरे ढूंढे तुम्हे,\n" +
                "तुम Online आ जाया करो!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "आँखों के इशारे समझ नहीं पाते,\n" +
                "होठों से दिल की बात कह नहीं पाते,\n" +
                "अपनी बेबसी हम किस तरह कहें,\n" +
                "कोई है जिसके बिना हम रह नहीं पाते…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "जब खामोश आँखों से बात होती है,\n" +
                "ऐसे ही मोहब्बत की शुरुआत होती है,\n" +
                "तुम्हारे ही ख्यालों में खोये रहते हैं,\n" +
                "पता नहीं कब दिन कब रात होती है…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "वो रूठकर बोला,\n" +
                "तुम्हे सारी शिकायते हमसे ही क्यों है,\n" +
                "हमने भी सर झुकाकर बोल दिया की,\n" +
                "हमें सारी उम्मीदे भी तो तुमसे ही है…!!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "किसी को अपनी पसंद बनाना,\n" +
                "कोई बड़ी बात नहीं..\n" +
                "पर किसी की पसंद\n" +
                "बन जाना बहुत बड़ी\n" +
                "बात है..!!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "मेरी हर खता पर नाराज़ न होना,\n" +
                "अपनी प्यारी सी मुस्कान कभी न खोना,\n" +
                "सुकून मिलता है देखकर आपकी मुस्कराहट को,\n" +
                "मुझे मौत भी आये तो भी मत रोना…!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "सुन पगली तेरा दिल भी धडकेगा,\n" +
                "तेरी आँख भी फड़केगी,\n" +
                "अपनी ऐसी आदत डालूँगा के,\n" +
                "हर पल मुझसे मिलने के लिए तडपेगी…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "समेट लो इन नाजुक पलों को,\n" +
                "न जाने ये लम्हे कल हो ना हो,\n" +
                "चाहे हो भी ये लम्हे,\n" +
                "क्या मालूम शामिल उन पलों में हम हो ना हो…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "हर शाम से तेरा इजहार किया करते है,\n" +
                "हर ख्वाब मे तेरा दिदार किया करते है,\n" +
                "दिवाने ही तो है हम तेरे,\n" +
                "जो हर वक्त तेरे मिलने का इंतजार किया करते है…\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));


        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "ढलती शाम का खुला एहसास है ,\n" +
                "मेरे दिल में तेरी जगह कुछ खास है ,\n" +
                "तू नहीं है यहाँ मालूम है मुझे ...\n" +
                "पर दिल ये कहता है तू यहीं मेरे पास है\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "\n" +
                "मुस्कान तेरे होठों से कही जाए न,\n" +
                "आंसू तेरी पलकों पे कही आए न,\n" +
                "पूरा हो तेरा हर खवाब,\n" +
                "और जो पूरा न हो वो खवाब कभी आए न !!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "मेरा दिल धडकता है सिर्फ तुम्हारे लिए,\n" +
                "मेरा दिल तडफता है सिर्फ तुम्हारे लिए,\n" +
                "ना जाने मै क्यो डरता हूँ आपसे,\n" +
                "अपने प्यार का इज़हार करने के लिए !!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "हर खामोशी को इकरार नही कहते,\n" +
                "हर नाकामी को हार नही कहते,\n" +
                "क्या हुआ अगर हम आपके नही हो सकते,\n" +
                "सिर्फ पा लेने को प्यार नही कहते !!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\n" +
                "समझा दो अपनी यादो को,\n" +
                "वो बीन बुलाये पास आया करती है,\n" +
                "आप तो दूर रहकर सताते हो मगर,\n" +
                "वो पास आकर रुलाया करती है !!\n" +
                "\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D\uD83D\uDC9D" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "खुशबू तेरी प्यार की मुझे महका जाती है,\n" +
                "तेरी हर बात मुझे बहका जाती है,\n" +
                "साँस तो बहुत देर लेती है आने में,\n" +
                "हर साँस से पहले तेरी याद आ जाती है।\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "She -तुम रात को कब सोते हो?\n" +
                "Me -तेरे सोने के बाद!\n" +
                "She -मेरे सोने के बाद क्युं?\n" +
                "Me -क्युंकि फिर मेरे पास जागने की कोई वजह नहीं होती!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "जब रात को आपकी याद आती है\n" +
                "\n" +
                "सितारों में आपकी तस्वीर नज़र आती है\n" +
                "\n" +
                "खोजती है निग़ाहें उस चेहरे को\n" +
                "\n" +
                "याद में जिसकी सुबह हो जाती है !!!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "हर मुलाकात को याद हम करतें हैं,\n" +
                "कभी चाहत कभी जुदाई कि आह भरते है,\n" +
                "यूं तो रोज़ तुम से सपनो मे बात करते हैं पर,\n" +
                "फिर से अगली मुलाकात का इन्तज़ार करते है!!\n" +
                "\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "दिल में हो आप तो कोई और ख़ास कैसे होगा,\n" +
                "\n" +
                "यादों में आपके सिवा कोई पास कैसे होगा,\n" +
                "\n" +
                "हिचकियां केहती है आप याद करते हो…\n" +
                "\n" +
                "पर बोलोगे नहीं तो हमें अहसास कैसे होगा...!!!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "“जाम पे जाम पीने से क्या फायदा,\n" +
                "शाम को पी सुबह उतर जाएगी,\n" +
                "अरे दो बूंद मेरे प्यार की पीले,\n" +
                "जिन्दगी सारी नशेमे गुज़र जाएगी”\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "आँखों के इशारे समझ नहीं पाते,\n" +
                "होठों से दिल की बात कह नहीं पाते,\n" +
                "अपनी बेबसी हम किस तरह कहें,\n" +
                "कोई है जिसके बिना हम रह नहीं पाते…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "जब खामोश आँखों से बात होती है,\n" +
                "ऐसे ही मोहब्बत की शुरुआत होती है,\n" +
                "तुम्हारे ही ख्यालों में खोये रहते हैं,\n" +
                "पता नहीं कब दिन कब रात होती है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "भूल से कोई भूल हुई तो भूल समझ\n" +
                "कर भूल जाना.\n" +
                ";\n" +
                ";\n" +
                ";\n" +
                ";\n" +
                ";\n" +
                "अरे भूलना सिर्फ भूल को, भूल से भी\n" +
                "हमें न भूलना….!!!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "लबो से चाहत की खुशबू चुराने दो\n" +
                "बहुत हो गया सितम, अब तो पास आने दो\n" +
                "\n" +
                "ना करना जुबां से इज़हार मोहब्बत का…\n" +
                "बस इशारो से ही राज़-ए-दिल की बात बताने दो\n" +
                "\n" +
                "हो मेहबूब तुम्हारे जैसा हसीन तो मुमकिन हैं\n" +
                "देख कर तुमको निगाहो में खुमार भर जाने दो\n" +
                "\n" +
                "है गुज़ारिश नहीं संभालता ये इश्क़ हमसे\n" +
                "अब तो टूट कर बाहो में बिखर जाने दो\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "दर्द की जब कभी इन्तहा होती हैं\n" +
                "दवा की जरुरत फिर कहाँ होती हैं\n" +
                "तन्हाई, बेचैनी और बस कुछ आहें\n" +
                "इनमे पल कर ही मोहब्बत जवां होती हैं\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "कागज़ पे हमने ज़िन्दगी लिख दी,\n" +
                "अशकों से सींच कर खुशी लिख दी,\n" +
                "दर्द जब हमने उबारा लफज़ो पे,\n" +
                "लोगो ने कहा वाह क्या गज़ल लिख द ी!!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "उलफत का अकसर यही दस्तूर होता है,\n" +
                "जिसे चाहो वही दूर होता है.\n" +
                "दिल टुट कर बिखरते हैं इस कदर,\n" +
                "जैसे कोई काँच का खिलोना चूर चूर होता है !!\n" +
                "\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "नज़र ने नज़र से मुलाक़ात कर ली,\n" +
                "रहे दोनों खामोश पर बात करली,\n" +
                "मोहब्बत की फिजा को जब खुश पाया,\n" +
                "इन आंखों ने रो रो के बरसात कर ली !!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तेरी हर अदा मोहब्बत सी लगती है,\n" +
                "एक पल की जुदाई मुद्दत सी लगती है,\n" +
                "पहले नही सोचा था अब सोचने लगे है हम,\n" +
                "जिंदगी के हर लम्हों में तेरी ज़रूरत सी लगती है\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "ज़िन्दगी में ना ज़ाने कौनसी बात “आख़री” होगी,\n" +
                "ना ज़ाने कौनसी रात “आख़री” होगी..\n" +
                "मिलते, जुलते, बातें करते रहो यार एक दूसरे से,\n" +
                "ना जाने कौनसी “मुलाक़ात” आख़री होगी..\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तुम्हारे नाम को होंठों पर सजाया है मैंने, तुम्हारी रूह को अपने दिल में बसाया है मैंने,\n" +
                "\n" +
                "दुनिया आपको ढूंढते ढूंढते हो जायेगी पागल, दिल के ऐसे कोने में छुपाया है मैंने.|\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "एक आरज़ू सी दिल में अक्सर छुपाये फिरता हूँ,\n" +
                "प्यार करता हूँ तुझसे पर कहने से डरता हूँ,\n" +
                "कही नाराज़ न हो जाओ मेरी गुस्ताखी से तुम,\n" +
                "इसलिए खामोश रहके भी तेरी धडकनों को सुना करता हूँ …!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "कभी कोई अपना अनजान हो जाता है,\n" +
                "कभी किसी अनजान से प्यार हो जाता है,\n" +
                "ये जरुरी नही की जो ख़ुशी दे उसी से प्यार हो,\n" +
                "दिल तोड़ने वालो से भी प्यार हो जाता है|\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "मुझे बहुत पसंद है जब मैं,\n" +
                "अचानक तुम्हे देखता हूँ,\n" +
                "और पाता हूँ की तुम मुझे,\n" +
                "पहले से ही देख रही थी…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "GF/BF ऐसे हो जो,\n" +
                "बिझी होने पर भी कहे,\n" +
                "बेबी, मैं आपके लिए\n" +
                "हमेशा फ्री हूँ…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "शान से हम तेरे दिल में रहेंगे,\n" +
                "तेरी मोहब्बत पे जान निसार करेंगे,\n" +
                "देख के जलेगी हमें दुनिया सारी,\n" +
                "इस कदर बेपनाह तुझे प्यार करेंगे…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "साँस लेने से भी तेरी याद आती है,\n" +
                "हर साँस में तेरी खुशबू बस जाती है,\n" +
                "कैसे कहु की साँस से मैं जिन्दा हूँ,\n" +
                "जब की साँस से पहले तेरी याद आती है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तेरी हर अदा मोहब्बत सी लगती है,\n" +
                "एक पल की जुदाई मुद्दत सी लगती है,\n" +
                "पहले नही सोचा था अब सोचने लगे है हम,\n" +
                "जिंदगी के हर लम्हों में तेरी ज़रूरत सी लगती है\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "नाम आपका पल पल लेता है कोई,\n" +
                "याद आपको हर पल करता है कोई,\n" +
                "अहसास तो शायद आपको भी है,\n" +
                "की दूर रहकर भी आपसे बेपनाह मोहब्बत करता कोई…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "आँखों की गहराई को समझ नहीं सकते,\n" +
                "होठों से कुछ कह नहीं सकते,\n" +
                "कैसे बया करे हम आपको यह दिल का हाल की,\n" +
                "तुम्ही हो जिसके बगैर हम रह नहीं सकते…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "फूलों सा खूबसूरत चेहरा हैं आपका,\n" +
                "हर दिल दिवाना है आपका,\n" +
                "लोग कहते है चाँद का टुकडा है आप,\n" +
                "लेकिन हम कहते है चाँद टुकडा है आपका…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तेरे होठों पे हो बस मुस्कान,\n" +
                "ऐसा में कुछ आज करू,\n" +
                "ना होने दू कभी मोहब्बत कम,\n" +
                "इतना जी भर कर तुझे प्यार करू…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "किसी को अपना बनाना हुनर ही सही,\n" +
                "लेकिन किसी का बन के रहना,\n" +
                "“कमाल” होता है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "हमने ये तो नहीं कहा की,\n" +
                "उनके लिए कोई दुआ ना मांगे..\n" +
                "बस इतना कहते है की,\n" +
                "दुआ में कोई उन को ना मांगे…!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "कुदरत के करिश्मे मे अगर रात न होती,\n" +
                "तो ख्वाब मे भी आप से मुलाक़ात न होती,\n" +
                "कमबख्त ये दिल है हर दर्द की वजह,\n" +
                "ये दिल न होता तो कोई बात न होती…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "मेरी दीवानगी की कोई हद नही,\n" +
                "तेरी सूरत के सिवा कुछ याद नही,\n" +
                "में हुँ फूल तेरे गुलशन का,\n" +
                "तेरे सिवा मुझपे किसी का हक नही…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "शायर तो हम है शायरी बना देंगे;\n" +
                "आपको शायरी मे क़ैद कर लेंगे;\n" +
                "कभी सुनाओ हमें अपनी आवाज़;\n" +
                "आपकी आवाज़ को हम ग़ज़ल बना देंगे।\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "जिसको हम पा सके वो जनाब हो आप,\n" +
                "मेरी जिंदगी का पहला ख्वाब हो आप,\n" +
                "लोग चाहे कुछ भी कहे आपको,\n" +
                "लेकिन मेरे लिए सुन्दर सा गुलाब हो आप…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तेरे चेहरे में मेरा नूर होगा,\n" +
                "फिर तू कभी ना मुझसे दूर होगा,\n" +
                "सोच क्या ख़ुशी मिलेगी जान मुझे उस पल,\n" +
                "जिस पल मेरी मांग में तेरे नाम का सिंदूर होगा…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "जिनकी मोहब्बत सच्ची होती है,\n" +
                "उनके नसीब में\n" +
                "दर्द ही लिखा होता है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "बहुत मजबूर हो जाता है इंसान,\n" +
                "जब वो,\n" +
                "किसी का हो भी नहीं सकता,\n" +
                "और उसे खो भी नहीं सकता…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "बताओ फिर उसे क्यों नहीं\n" +
                "मेहसूस होती बेचैनियां मेरी,\n" +
                "जो अक्सर कहती है,\n" +
                "“बहुत अच्छे से जानती हूँ मैं तुम्हे”…!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "जो वक्त के साथ बदल जाये वो यार कैसा,\n" +
                "जो ज़िन्दगी भर साथ न दे वो हमसफ़र कैसा,\n" +
                "अक्सर लोग प्यार में कसमे खाते है,\n" +
                "जो कसमों का मोहताज हो वो प्यार कैसा…?\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "कभी लगा वह हमें सता रहे है,\n" +
                "कभी लगा के वह करीब आ रहे है,\n" +
                "कुछ लोग होते है आँसुओ की तरह,\n" +
                "पता ही नहीँ लगता,\n" +
                "साथ दे रहे है या छोड़ के जा रहे है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "तेरा साथ ना छूटे बस दुआ है मेरी,\n" +
                "तेरा ख़याल ना छूटे बस दुआ है मेरी,\n" +
                "रूठे चाहे रब मेरा मुझसे,\n" +
                "मेरा प्यार ना रूठे बस दुआ है मेरी…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "वो आपका पलके झुका के मुस्कुराना;\n" +
                "वो आपका नजरें झुका के शर्मना\n" +
                "वैसे आपको पता है या नहीं हमें पता नहीं;\n" +
                "पर इस दिल को मिल गया है उसका नज़राना।\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "❤ ❤ ❤ ❤ ❤ ❤ ❤\n" +
                "ये पुष्प का भी क्या खिलना, परगें भी बिखरने लगी,\n" +
                "हॉं, ख़ता भी हैं क्या भँवरों की, काँटे खूब चुभने लगे,\n" +
                "पालव की हिफ़ाज़त हटगई, वजूद पूछते हो ग़ैरों से !\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "मेरे \u202A\u200Eमरने\u202C के बाद तुझपे एक इलज़ाम\u202C होगा..!!\n" +
                "कफ़न उठा के देखना,,,ज़ालिम\u202C दिल पे बस तेरा ही \u202A\u200Eनाम\u202C होगा…!!.\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "तकदीर लिखने वाले एक एहसान लिख दे\n" +
                "मेरी मोहब्बत की तकदीर में मुस्कान लिख दे\n" +
                "ना मिले जिंदगी में कभी भी दर्द उसको\n" +
                "चाहे उसकी किस्मत में मेरी जान लिख दे\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "सपनो की दुनिया में हम खोते चले गए\n" +
                "होश में थे मगर मदहोश होते चले गए\n" +
                "जाने क्या बात थी उनकी आवाज़ में\n" +
                "न चाहते हुए भी उनके होते चले गए .\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "\" डर लगता है उसके तस्वीर की\n" +
                "तारीफ करने में,\n" +
                "जमाना\n" +
                "पूछ ना बैठे...\n" +
                "ये तेरी कौन लगती है?\"\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "न कम हम थे और न कम वो थे\n" +
                "पर किसी ने प्यार में आबाद कर दी जिंदगी\n" +
                "और किसी ने बर्बाद कर दी जिंदगी।\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "खो जाते है,\n" +
                "एक पल की दुरी मे रो जाते है,\n" +
                "कोई हमें इतना बता दो की, हम ही ऐसे है,\n" +
                "या प्यार करने के बाद सब ऐसे हो जाते…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "कहना बहुत कुछ है,\n" +
                "अलफाज भी जरा से कम है,\n" +
                "खामोश सी तुम हो,\n" +
                "गुमसुम से हम है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "मेरे प्यार की वो इन्तेहा पूछते है,\n" +
                "दिल में है कितनी जगह पूछते है,\n" +
                "चाहते है हम उन्हें खुद से ज्यादा,\n" +
                "इस चाहत की भी वो वजह पूछते है…!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));


        list.add(new Data_show ( "ज़िन्दगी भी कितनी अजीब है…\n" +
                "मुस्कुराओ तो लोग जलते है,\n" +
                "तनहा रहो तो सवाल करते है…!!\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "ज़िन्दगी बहुत छोटी है,\n" +
                "इसलिए उस इंसान के साथ\n" +
                "ज्यादा वक्त बिताओ,\n" +
                "जो आपको हर वक्त ख़ुशी और\n" +
                "प्यार देना चाहता हो…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "किसी का ये सोचकर साथ मत छोड़ना की,\n" +
                "उसके पास कुछ नहीं तुम्हे देने के लिए…\n" +
                "\n" +
                "बस ये सोचकर साथ निभाना की,\n" +
                "उसके पास कुछ नहीं तुम्हारे सिवाय खोने के लिए…\n" +
                "आखिर कैसे छोड़ दू,\n" +
                "तुझसे मोहब्बत करना…\n" +
                "तू किस्मत में ना सही,\n" +
                "दिल में तो है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "जब आपका सबसे करीबी\n" +
                "व्यक्ति आप पर गुस्सा करना\n" +
                "छोड़ दे तो समझ ले की,\n" +
                "आप उसे खो चुके है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "दिल में हमने तुम्हारे प्यार\n" +
                "की दास्तान लिखी है,\n" +
                "ना थोड़ी ना तमाम लिखी है,\n" +
                "कभी हमारे लिये भी दुआ\n" +
                "कर लिया करो सनम,\n" +
                "हमने तो हर एक सांस\n" +
                "तुम्हारे नाम लिखी है !\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "इश्क मे मौत से डरता कौन है,\n" +
                "प्यार तो हो जाता है करता कौन है,\n" +
                "आपके लिए तो पूरी दुनिया है कुर्बान,\n" +
                "और आप कहते हो की आपकी फिकर करता कौन है…\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));

        list.add(new Data_show ( "सोचा रहा हूँ की मोहहब्बत के इस दिन पर क्या तोहफा दूँ मेरे यार को\u2028कीमत जो समझो तो बेमोल है ना समझो तो दिल मेरा बेकार है .....\n" +
                "❤ ❤ ❤ ❤ ❤ ❤ ❤" ));



        //list.add(new Data_show ( "" ));






    }
}


