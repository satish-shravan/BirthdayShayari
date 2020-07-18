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

public class morning extends AppCompatActivity {

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
        setContentView ( R.layout.activity_morning);


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



        list.add(new Data_show ( "❤\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90❤\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90❤\n" +
                "एक ताज़गी, एक एहसास..\n" +
                "एक खूबसूरती, एक आस..\n" +
                "एक आस्था, एक विश्वास..\n" +
                "यही है एक अच्छे दिन की शुरुवात…\n" +
                "\n" +
                "Good Morning!\uD83E\uDD8B\n" +
                "❤\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90❤\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90❤" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "हो सकता है हर दिन अच्छा ना हो,\n" +
                "लेकिन हर दिन में कुछ न कुछ अच्छा होता है…\n" +
                "\n" +
                "Good Morning! Have A Nice Day!\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\n" +
                "सुप्रभात, आज की मंगल कामना।\n" +
                "“जीवन की प्रतिकूल परिस्थितियों में भी मुस्कान के साथ,\n" +
                "आप इसी तरह उन्नति के पथ पर आगे बढ़ते रहें।\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\n" +
                "जब आसमान की ऊँचाई छूनी हो,\n" +
                "हर रोज सुबह बुजुर्गो के पैर छु के घर से निकलो,\n" +
                "कही ना कही मंजिल मिल ही जानी हे.\n" +
                "   \uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\n" +
                "हर सुबह मंज़िलो का रास्ता नज़दीक हो जाता हैं,\n" +
                "जब हम अपनो का आशीर्वाद और,\n" +
                "प्यार साथ में लेकर निकलते हैं.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\uD83C\uDF38\uD83C\uDF38\uD83C\uDF38\uD83C\uDF3A\n" +
                "सफेद चादर सी झिलमिल धूप,\n" +
                "शीतल सुहानी हवा,\n" +
                "पीली-पीली सरसो खिली,\n" +
                "घोल हवा संग रंग,\n" +
                "मोहक मादक रंगीन मदमस्त.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "नमस्कार !\n" +
                "ये हमारी “सूर्य उदय” SMS सेवा है,\n" +
                "इस में हम सोये हुए “आलसी लोगों” को जगाते है,\n" +
                "और बाद में “GOOD MORNING” बोल कर\n" +
                ".\n" +
                "खुद सो जाते है\n" +
                "Good Morning Friend….\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A" ));

        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "सूरज निकलने का वक्त हो गया,\n" +
                "फूल खिलने का वक्त हो गया,\n" +
                "मीठी नींद से जागो मेरे दोस्त,\n" +
                "सपने हकीकत में लाने का वक्त हो गया !!\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "✍\n" +
                "\"मंनुष्य कितना भी गोरा क्यों ना हो\n" +
                "परंतु\n" +
                "उसकी परछाई सदैव काली होती है...!!\n" +
                "\"मैं श्रेष्ठ हूँ\"  यह आत्मविश्वास है\n" +
                "लेकिन\n" +
                "\"सिर्फ मैं ही श्रेष्ठ हूँ\"  यह अहंकार है...\"\n" +
                "\"इच्छा पूरी नहीं होती तो क्रोध बढ़ता है, और इच्छा पूरी होती है तो लोभ बढ़ता है। इसलिये जीवन की हर स्थिति में धैर्य बनाये रखना ही श्रेष्ठता है |\n" +
                "*\uD83C\uDF34 ❤❤\uD83C\uDF34\n" +
                ".     \uD83C\uDF3A\uD83C\uDF42\uD83D\uDC90\uD83C\uDF3B\n" +
                "\n" +
                "आपका दिन शुभ हो\n" +
                ".       Very Sweet\n" +
                "Good Morning\n" +
                "\uD83D\uDE4F\uD83D\uDE4F" ));


        list.add(new Data_show ( "\uD83D\uDC4C\uD83D\uDC4C\uD83D\uDC4C\uD83D\uDC4C\uD83C\uDF39\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF40\uD83C\uDF40\uD83C\uDF3A\n" +
                "गुजरी हुई जिंदगी को\n" +
                "कभी याद ना कर\n" +
                "तकदीर में जो लिखा है\n" +
                "उसकी फरियाद ना कर जो होगा वो होकर रहेगा\n" +
                "तु कल की फिकर में\n" +
                "अपनी आज की हंसी बर्बाद ना कर.\n" +
                "हंस मरते हुए भी गाता है और\n" +
                "मोर नाचते हुए भी रोता है.\n" +
                "ये जिंदगी का फंडा है\n" +
                "दुखो वाली रात नींद नहीं आती\n" +
                "\" और \" खुशी वाली रात कौन सोता है\n" +
                "\uD83D\uDE4F *Good Morning*\uD83C\uDF39" ));


        list.add(new Data_show ( "\uD83C\uDF3A \"भरोसा जितना कीमती होता है...!\n" +
                "धोखा उतना ही महंगा हो जाता है\n" +
                "फूल कितना भी सुन्दर *हो*\uD83C\uDF37\n" +
                "\uD83C\uDF38 तारीफ खुशबू से होती है\n" +
                "इंसान कितना भी बड़ा हो\n" +
                "कद्र उसके गुणों से होता है\"..                                            \n" +
                "\uD83D\uDE42  Good morning  \uD83D\uDE42" ));


        list.add(new Data_show ( "\uD83C\uDF43\"सफलता\" की पोशाक\n" +
                "कभी तैयार नहीं मिलती\n" +
                "इसे बनाने के लिए\n" +
                "\"मेहनत\" का हुनर चाहिए.!\n" +
                "\n" +
                "✍\uD83C\uDFFB\"अच्छे\" और \"सच्चे\" रिश्ते\n" +
                "न तो \"खरीदे\" जा सकते हैं,\n" +
                "न ही \"उधार\" लिऐ जा सकते हैं\n" +
                "\n" +
                "इसलिए\n" +
                "\n" +
                "उन लोगों को जरूर \"महत्व\" दें\n" +
                "जो \"आपको\" महत्व देते हैं...\n" +
                "\n" +
                "\uD83C\uDF39\uD83C\uDF39 सुप्रभात  \uD83C\uDF39\uD83C\uDF39" ));


        list.add(new Data_show ( "\uD83C\uDF43\"सफलता\" की पोशाक\n" +
                "कभी तैयार नहीं मिलती\n" +
                "इसे बनाने के लिए\n" +
                "\"मेहनत\" का हुनर चाहिए.!\n" +
                "\n" +
                "✍\uD83C\uDFFB\"अच्छे\" और \"सच्चे\" रिश्ते\n" +
                "न तो \"खरीदे\" जा सकते हैं,\n" +
                "न ही \"उधार\" लिऐ जा सकते हैं\n" +
                "\n" +
                "इसलिए\n" +
                "\n" +
                "उन लोगों को जरूर \"महत्व\" दें\n" +
                "जो \"आपको\" महत्व देते हैं...\n" +
                "\n" +
                "\uD83C\uDF39\uD83C\uDF39 सुप्रभात  \uD83C\uDF39\uD83C\uDF39" ));


        list.add(new Data_show ( "\uD83C\uDF3F \uD83C\uDF3A\uD83D\uDC49सुंदर सुबह का \uD83D\uDC48\uD83C\uDF3A\uD83C\uDF3F\n" +
                "मीठा  मीठा\n" +
                "\uD83C\uDF3F\uD83C\uDF3A\uD83D\uDC49नमस्कार..\uD83D\uDC48\uD83C\uDF3A\uD83C\uDF3F\n" +
                "\n" +
                "ना घुमने के लिये कार चाहिए ,\n" +
                "ना गले के लिए हार चाहिए ,\n" +
                "\n" +
                "\" भगवद् गीता मे श्री कृष्णा ने बहुत बड़ी बात कही है \" !!!\n" +
                "\n" +
                "जीवन के उद्धार के लिए केवल मित्र , प्रेम और परिवार चाहिए..... \uD83D\uDE0A                \n" +
                "\uD83C\uDF3F\uD83C\uDF3AGood morning \uD83C\uDF3A\uD83C\uDF3F\n" +
                "\uD83D\uDE4F\uD83D\uDE0A शुभ सुप्रभात \uD83D\uDE0A\uD83D\uDE4F" ));


        list.add(new Data_show ( "\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "\uD83C\uDF3B\uD83C\uDF3B\uD83C\uDF3B\uD83C\uDF3B\uD83C\uDF3B\n" +
                "नेक लोगों की संगत से\n" +
                "हमेशा भलाई ही मिलती हे,\n" +
                "क्योंकि....\n" +
                "हवा जब फूलो से गुज़रती हे,\n" +
                "तो वो भी खुश्बुदार हो जाती हे.\n" +
                "\uD83C\uDF1Eशुभ प्रभात\uD83C\uDF1E\n" +
                "\uD83C\uDF41*good morning*\uD83C\uDF41\n" +
                "\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\uD83D\uDC90\n" +
                "\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F\uD83D\uDE4F" ));


        list.add(new Data_show ( ".•*\"\"*•.¸\n" +
                "\uD83C\uDF3E\uD83C\uDF39\uD83C\uDF3E\n" +
                "\uD83D\uDC93दिल \uD83D\uDC93ने कहा की\n" +
                "कोई याद कर रहा है\n" +
                "मैने सोचा \uD83D\uDC9Eदिल\uD83D\uDC93\n" +
                "मजाक कर रहा है\n" +
                "फिर जब आई हिचकी\n" +
                "तो ख्याल आया\n" +
                "की कोई अपना ही\n" +
                "मेसेज का इंतजार\n" +
                "कर रहा है ।।\n" +
                "\n" +
                "\uD83D\uDC96\uD83C\uDF39गुड मार्निंग \uD83C\uDF39\uD83D\uDC96\n" +
                "\n" +
                "¸.•*\"\"*•.¸\n" +
                "\uD83C\uDF3E\uD83C\uDF39\uD83C\uDF3E" ));


        list.add(new Data_show ( "✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB✍\uD83C\uDFFB\n" +
                "\n" +
                "भरोसा खुद पर रखो\n" +
                "तो ताकत बन जाती है\n" +
                "और दूसरों पर रखो तो\n" +
                "कमजोरी बन जाती है…!\n" +
                "आप कब सही थे...\n" +
                "इसे कोई याद नहीं रखता।\n" +
                "लेकिन आप कब गलत थे...\n" +
                "इसे सब याद रखते हैं।\n" +
                "\n" +
                "पृथ्वी पर कोई भी व्यक्ति ऐसा नहीं है\"\n" +
                "\"जिसको समस्या न हो\"\n" +
                "\"और\"\n" +
                "\"पृथ्वी पर कोई समस्या ऐसी नहीं है\"\n" +
                "\"जिसका कोई समाधान न हो...\n" +
                "\n" +
                "मंजिल  चाहें  कितनी भी  ऊँची  क्यों न हो,  रास्ते  हमेशा  पैरों  के  नीचे  ही  होते है।\n" +
                "\n" +
                "\uD83D\uDC9EGood Morning\uD83D\uDC9E. " ));


        list.add(new Data_show ( "           \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "         \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "   \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "   \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "   \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "      \uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\uD83C\uDF39\n" +
                "         \uD83C\uDF3F\uD83C\uDF39\uD83C\uDF39\uD83C\uDF3F\n" +
                "              \uD83C\uDF3F\uD83C\uDF3F\n" +
                "                 \uD83C\uDF3F                     \uD83C\uDF3F\n" +
                "                  \uD83C\uDF3F               \uD83C\uDF3F\uD83C\uDF3F\n" +
                "                 \uD83C\uDF3F           \uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\n" +
                "                \uD83C\uDF3F      \uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\n" +
                "               \uD83C\uDF3F    \uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\n" +
                "              \uD83C\uDF3F \uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\n" +
                "               \uD83C\uDF3F \uD83C\uDF3F\uD83C\uDF3F\uD83C\uDF3F\n" +
                "                 \uD83C\uDF3F\n" +
                "                  \uD83C\uDF3F\n" +
                "                   \uD83C\uDF3F\n" +
                "                    \uD83C\uDF3F\n" +
                "                    \uD83C\uDF3F\n" +
                "                  \uD83C\uDF3F\n" +
                "✨ ┣━┫α ρ ρ у\n" +
                "              ℳỖŘŇĮŇĞ ✨\n" +
                "\n" +
                "\uD83D\uDC9D ये सुबह जितनी खूबसूरत है,\n" +
                "उतना ही खूबसूरत आपका हर एक पल हो,\n" +
                "जितनी भी खुशियाँ  आपके पास आज हैं,\n" +
                "उससे भी ज्यादा कल हों। \uD83D\uDC9D\uD83D\uDC90\uD83C\uDF39\uD83D\uDC90\uD83C\uDF39\uD83D\uDC90\uD83C\uDF39\uD83D\uDC90\uD83C\uDF39\uD83C\uDF39\n" +
                "             *\uD83D\uDE0A*\uD83D\uDC90\n" +
                "       \uD83C\uDF37Good Morning\uD83C\uDF37" ));


        list.add(new Data_show ( "\uD83C\uDF3A Good Morning \uD83C\uDF3A\n" +
                "〰〰〰〰〰〰〰〰〰\n" +
                "\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\n" +
                "रिश्ते प्यार और मित्रता\n" +
                "हर जगह पाए जाते है,\n" +
                "परन्तु यह ठहरते वही है\n" +
                "जहा पर इन्हे आदर मिलता है..\n" +
                "कई बार तबियत दवा लेने से नहीं,\n" +
                "हाल पूछने से भी ठीक हो जाती है…\n" +
                "कैसे हो आप?\n" +
                "सुप्रभात!\n" +
                "\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\uD83C\uDF86\uD83C\uDF86\uD83D\uDC96\n" +
                "〰〰〰〰〰〰〰〰〰\n" +
                "\uD83C\uDF3A Have a nice day! \uD83C\uDF3A\n" +
                "◾▪▪▪◾▪▪▪◾" ));


        list.add(new Data_show ( "☘☘☘☘☘☘☘☘☘\n" +
                "\uD83C\uDF39\uD83D\uDCA5\uD83C\uDF39\uD83D\uDCA5\uD83C\uDF39\uD83D\uDCA5\uD83C\uDF39\uD83D\uDCA5\uD83C\uDF39\n" +
                "जैसे चाँद का काम है,\n" +
                "रात भर रौशनी देना..\n" +
                "तारो का काम है,\n" +
                "सारी रात चमकते रहना..\n" +
                "दिल का काम है,\n" +
                "अपनों की याद में धड़कना..\n" +
                "वैसे ही हमारा काम है,\n" +
                "हर सुबह आप की खुशियों\n" +
                "के लिए दुआ करना…\n" +
                "सुप्रभात!\n" +
                "Good Morning!\n" +
                "\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF40\uD83C\uDF37\uD83C\uDF40\uD83C\uDF3A\uD83C\uDF3C\uD83C\uDF3C\n" +
                "\uD83D\uDCA5\uD83D\uDE4F\uD83C\uDFFC\uD83C\uDF1Eसुप्रभात\uD83C\uDF1E\uD83D\uDE4F\uD83C\uDFFC\uD83D\uDCA5" ));


        list.add(new Data_show ( "\uD83D\uDD2E\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDD2E\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDD2E\n" +
                "〰〰〰〰〰〰〰〰〰\n" +
                "आज प्यारी सी सुबह बोली: उठ देख क्या नजारा है,\n" +
                "मैने कहा: रुक पहले उसे SMS भेज दू,\n" +
                "जो इस सुबह से भी प्यारा है…\n" +
                "\n" +
                "◾▪▪◾▪▪◾\n" +
                "◾▪गुड मॉर्निंग!▪◾\n" +
                "◾▪▪◾▪▪◾\n" +
                "〰〰〰〰〰〰〰〰〰\n" +
                "\uD83D\uDD2E\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDD2E\uD83E\uDD8B\uD83E\uDD8B\uD83E\uDD8B\uD83D\uDD2E" ));


        list.add(new Data_show ( "\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\n" +
                "सुबह की प्यारी रौनक तो देखो,\n" +
                "इन आखों मे बसी आपकी तस्वीर तो देखो,\n" +
                "हमने आपको प्यारा सा गुड मॉर्निंग किया है,\n" +
                "एक बार उठ कर मोबाइल तो देखो…\n" +
                "Good Morning!\n" +
                "\n" +
                "\uD83C\uDF3A\uD83C\uDF3Aशुभ प्रभात!\uD83C\uDF3A\uD83C\uDF3A\n" +
                "\n" +
                "\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A\uD83C\uDF3A" ));


        list.add(new Data_show ( "\uD83D\uDC9C\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC9C\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC9C\n" +
                "हम ना होते तो आप खो गए होते,\n" +
                "अपनी जिंदगी से रुसवा हो गए होते,\n" +
                "यह तो आपको GOOD MORNING कहने,\n" +
                "के लिए उठे है,\n" +
                "वरना हम तो अब तक सो रहे होते…\n" +
                "\n" +
                "\uD83D\uDC9C\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC9C\uD83D\uDC97\uD83D\uDC97\uD83D\uDC97\uD83D\uDC9C" ));


        list.add(new Data_show ( "नमस्कार !\n" +
                "ये हमारी “सूर्य उदय” SMS सेवा है,\n" +
                "इस में हम सोये हुए “आलसी लोगों” को जगाते है,\n" +
                "और बाद में “GOOD MORNING” बोल कर\n" +
                ".\n" +
                "खुद सो जाते है\n" +
                "Good Morning Friend…." ));


        list.add(new Data_show ( "सूरज निकलने का वक्त हो गया,\n" +
                "फूल खिलने का वक्त हो गया,\n" +
                "मीठी नींद से जागो मेरे दोस्त,\n" +
                "सपने हकीकत में लाने का वक्त हो गया !!\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सुरज तु उनको मेरा पैगाम देना,\n" +
                "खुशी का दिन और हँसी की शाम देना,\n" +
                "जब वो पढे प्यार से मेरे इस पैगाम को,\n" +
                "तो उनके चेहरे पे प्यारी सी मुस्कान देना…\n" +
                "Shubh Prabhat !" ));


        list.add(new Data_show ( "आसमान मे सुरज निकल आया है,\n" +
                "फिजाओं मे एक नया रंग छाया है,\n" +
                "जरा मुस्कुरा दो, ना यु खामोश रहो,\n" +
                "आपकी मुस्कान को देखने ही तो,\n" +
                "ये हसीन सवेरा आया है…\n" +
                "Good Morning !" ));


        list.add(new Data_show ( "आज प्यारी सी सुबह बोली: उठ देख क्या नजारा है,\n" +
                "मैने कहा: रुक पहले उसे SMS भेज दू,\n" +
                "जो इस सुबह से भी प्यारा है…\n" +
                "Good Morning !" ));


        list.add(new Data_show ( "एक संदेश आपके दिन को,\n" +
                "शुरुआत करने के लिए,\n" +
                "एक प्रार्थना आपके,\n" +
                "आशीर्वाद के लिए,\n" +
                "एक पल आपके सुप्रभात के लिए,\n" +
                "आपका दिन मंगलमय हो.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "ज़िन्दगी को “आसान” नहीं,\n" +
                "बस खुद को “मजबूत” बनाना पड़ता है,\n" +
                "उत्तम समय कभी नहीं आता,\n" +
                "समय को उत्तम बनाना पड़ता है,\n" +
                "सुप्रभात आपका दिन शुभ और मंगलमय रहे.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "फूलो की तरह खिलते रहो,\n" +
                "सूरज की तरह चमकते रहो,\n" +
                "और सारा दिन आप हँसते रहो.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "किसी ने मुझे कहा की,\n" +
                "तुम हर रोज सुबह सुप्रभात,\n" +
                "करके सबको याद करते हो,\n" +
                "तो क्या वो भी तुम्हे याद करते है,\n" +
                "मेंने कहा मुझे रिश्ता निभाना है,\n" +
                "मुकाबला नहीं करना.\n" +
                "मेहकते फूलो की ख़स्बो,\n" +
                "लहराती फ़िज़ों का आनंद,\n" +
                "उड़ते पंछी का होसला,\n" +
                "आज के सुबह तुम देख लो.\n" +
                "सुप्रभात.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "आज के दिन ज़िंदगी के प्रति वफ़ादार रहना,\n" +
                "और निसंकोच सब को दिल से प्रेम करना,\n" +
                "आपको बहुत आगे ले जाएगी.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "फूलो की तरह मुस्कुराते रहिये.\n" +
                "भंवरों की तरह गुनगुनाते रहिये.\n" +
                "चुप रहने से रिश्ते भी उदास हो जाते है.\n" +
                "कुछ उनकी सुनिये कुछ अपनी सुनाते रहिये.\n" +
                "भूल जाइये शिकवे शिकायतों के पलों को.\n" +
                "और छोटी छोटी खुशियों के मोती लुटाते रहिये.\n" +
                "आज का दिन मंगलमय हो।\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "मन में हमेशा अच्छे विचार और,\n" +
                "अच्छे अहसासों को ही जगह दीजिए,\n" +
                "ताकि दिमाग में सदा पॉजिटिव,\n" +
                "तरंगों का उदय हो.\n" +
                "सुप्रभात शुभ दिन हो.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "हर दिन आती है नयी ओर सुहानी सुबह,\n" +
                "झूमता है दिल और गाता है गाना,\n" +
                "खुशी के इस दिन पर तुम बस मुस्कुराना,\n" +
                "और अपने आने वाले कल के लिए सपने सजाना.\n" +
                "           \uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "इस नयी सुबह से हमें कुछ सीखना हैं,\n" +
                "आज हमारे अपनो को एक ही धागे में हमारे साथ बूँदना हैं,\n" +
                "और जीवन को सफल बनाना हैं, सुप्रभात,\n" +
                "आप सभी मित्रो को नमस्कार,\n" +
                "आज का दिन आप सभी के लिए स्फूर्ति और प्रसन्नता से भरा रहे.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "Wow Today,\n" +
                "Love, Smile,\n" +
                "Luck, Kindness,\n" +
                "Courage, Success in Life,\n" +
                "is available as a,\n" +
                "catalyst for your,\n" +
                "Transformations.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "हर सुबह अपने बड़ों का,\n" +
                "आशीर्वाद, प्रेम और स्नेह,\n" +
                "का उपहार पाने वाले का,\n" +
                "दिन हमेशा सफल होता हैं. ??\n" +
                "सूरज कोई उम्मीद रखे बिना रोशन करता है,\n" +
                "और खुद जलता रहता है इसलिए हमारा फ़र्ज़ है,\n" +
                "कि हम भी सूरज की तरह दुसरों की ज़िन्दगी रोशन करें.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सुप्रभात, आज की मंगल कामना।\n" +
                "“जीवन की प्रतिकूल परिस्थितियों में भी मुस्कान के साथ,\n" +
                "आप इसी तरह उन्नति के पथ पर आगे बढ़ते रहें।\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "जब आसमान की ऊँचाई छूनी हो,\n" +
                "हर रोज सुबह बुजुर्गो के पैर छु के घर से निकलो,\n" +
                "कही ना कही मंजिल मिल ही जानी हे.\n" +
                "   \uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "हर सुबह मंज़िलो का रास्ता नज़दीक हो जाता हैं,\n" +
                "जब हम अपनो का आशीर्वाद और,\n" +
                "प्यार साथ में लेकर निकलते हैं.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सफेद चादर सी झिलमिल धूप,\n" +
                "शीतल सुहानी हवा,\n" +
                "पीली-पीली सरसो खिली,\n" +
                "घोल हवा संग रंग,\n" +
                "मोहक मादक रंगीन मदमस्त.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "हमेशा शब्द ऐसे बोलो की आपकी ज़ुबान से निकल कर ,\n" +
                "किसे के दिल मे समा जाए,\n" +
                "ऐसे नही की आपकी ज़ुबान से निकल कर ,\n" +
                "किसी का दिल दुखा जाए.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "जब भी आप निराशा से घिर जाओ,\n" +
                "उस वक़्त एक बार उन क्षणों को याद् करो जब,\n" +
                "आप बहुत खुश थे तब आपके चेहरे,\n" +
                "पर भी मुस्कान आएगी और मन में भी.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सारे संसार की ख़ुशियाँ आपकी झोली में आ जाए,\n" +
                "यही शुभकामनाओं सहित सुबह का नमस्कार.\n" +
                "किसी के चेहरे की मुस्कराहट की वजह तो बनो,\n" +
                "ख़ुशी ही नही सुकून भी मिलेगा.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "आपका और हमारा हर दिन शुभ हो – प्रतिदिन ,\n" +
                "प्रतिपल प्रभु की कृपा बनी रहे और जीवन सार्थक हो जाये.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "  मन में हमेशा अच्छे विचार और,\n" +
                "अच्छे अहसासों को ही जगह दीजिए,\n" +
                "ताकि दिमाग में सदा पॉजिटिव तरंगों का उदय हो.\n" +
                "प्यार, सहास, और उल्हास से इस नयें दिन की शुरुआत कीजिये,\n" +
                "और अपने जीवन में आज सफलता को छू लीजिये.\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "देर मैंने ही लगाई पहेचानने में ऐ “भगवान”\n" +
                "वरना तूने जो दिया उसका तो कोई हिसाब ही नहीं,\n" +
                "जैसे जैसे में सर को झूकाता चला गया,\n" +
                "वैसे वैसे तू मुझे उठाता चला गया…\n" +
                "With Pray… Good Morning…" ));

        list.add(new Data_show ( "सुबह सुबह सूरज का साथ हो,\n" +
                "गुन गुनाते पंछी की आवाज हो,\n" +
                "हाथ में कोफी और यादों में कोई खास हो,\n" +
                "उस सुबह की पहेली याद आप हो,\n" +
                "Have a Nice Day…\n" +
                "Good Morning…" ));


        list.add(new Data_show ( "पानी की बुँदे फूलों को भिगा रही है,\n" +
                "ठंडी लहरे एक ताजगी जगा रही है,\n" +
                "हो जाओ आप भी इसमे शामिल,\n" +
                "एक प्यारी सी सुबह आपको जगा रही है…" ));


        list.add(new Data_show ( "ताजी हवा मे फूलों की महक हो,\n" +
                "पहली किरण मे चिडियों की चहक हो,\n" +
                "जब भी खोलो तुम अपनी पलके,\n" +
                "उन पलकों मे सिर्फ खुशियों की झलक हो…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "जन्नत की महलों में हो महल आपका,\n" +
                "ख्वाबो की वादी में हो शहर आपका,\n" +
                "सितारो के आंगन में हो घर आपका,\n" +
                "दुआ है सबसे खूबसूरत हो हर दिन आपका…\n" +
                "Good Day!\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "दिन है सुहाना आज पहली तारीख है..\n" +
                "खुश है झमाना आज पहली तारीख है..\n" +
                "मीठा है खाना आज पहली तारीख है..\n" +
                "करो ना बहाना आज पहली तारीख है..\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "कलियों के खिलने के साथ,\n" +
                "एक प्यारे एहसास के साथ,\n" +
                "एक नए विश्वास के साथ,\n" +
                "आपका दिन शुरू हो एक मिठी मुस्कान के साथ…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सुख भी बहोत है,\n" +
                "परेशानियाँ भी बहोत है,\n" +
                "जिंदगी में लाभ है तो\n" +
                "हानियाँ भी बहोत है…\n" +
                "क्या हुआ जो “भगवान” ने थो़ड़े ग़म दे दिये,\n" +
                "उसकी हम पर\n" +
                "“महेरबानियाँ” भी बहोत है…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सुबह की प्यारी किरन बोली मुझसे,\n" +
                "उठकर बाहर देखों कितना हसीन “नाजारा” है,\n" +
                "मैंने कहा रूक, पहेले उसे तो SMS कर लूँ\n" +
                "जो इस सुबह से भी ज्यादा “प्यारा” है…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सूरज निकल रहा है पूरब से,\n" +
                "दिन शुरू हुआ आपकी याद से,\n" +
                "कहना चाहते है हम आपको दिल से,\n" +
                "आपका दिन अच्छा जाये इस SMS से…\n" +
                "Good Morning… Have a Nice Day…" ));


        list.add(new Data_show ( "प्यारी सी मीठी सी नींद के बाद,\n" +
                "रात के कुछ लम्हो के बाद,\n" +
                "सुबह के नए सुनहरे सपनों के साथ,\n" +
                "दुनिया मे कुछ अपनों के साथ,\n" +
                "आपको प्यारा सा शुभ प्रभात…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "सुबह की प्यारी रौनक तो देखो,\n" +
                "इन आखों मे बसी आपकी तस्वीर तो देखो,\n" +
                "हमने आपको प्यारा सा गुड मॉर्निंग किया है,\n" +
                "एक बार उठ कर मोबाइल तो देखो…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        list.add(new Data_show ( "कभी रूठकर, कभी मनाकर,\n" +
                "कभी हँसकर, कभी हँसाकर,\n" +
                "कभी रोकर, कभी रुलाकर,\n" +
                "हमारा SMS कहेगा आपसे,\n" +
                "हर पल जियो मुस्कुराकर…\n" +
                "\uD83D\uDC96\uD83C\uDF3F\uD83D\uDC95Good morning\uD83D\uDC95\uD83C\uDF3F\uD83D\uDC96" ));


        //list.add(new Data_show ( "" ));


    }
}