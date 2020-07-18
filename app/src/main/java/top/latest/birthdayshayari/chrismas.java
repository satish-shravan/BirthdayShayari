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

public class chrismas extends AppCompatActivity {

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
        setContentView ( R.layout.activity_chrismas );


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

        list.add(new Data_show ( "Christmas Ka Yeh Pyara Sa Tyohaar,\n" +
                "Zindagi Mein Laaye Khushiya Apaar,\n" +
                "Santa Claus Aaye Aapke Ghar,\n" +
                "Subhkamna Hamari Karo Sweekar." ));

        list.add(new Data_show ( "Devdoot banke koi aayega,\n" +
                "Saari aashaye tumhari,\n" +
                "Poori karke jaayega,\n" +
                "Christmas ke is shubh din par\n" +
                "Tohfe khushiyo ke de jayega." ));


        list.add(new Data_show ( "Sabke Dilo mein ho sabke liye Pyar,\n" +
                "Aanewala har din laye khusiyo ka Tyohar,\n" +
                "Is ummid ka sath aao bhulke sare Gum\n" +
                "Christmas me hum sab kare WEL-COME!" ));


        list.add(new Data_show ( "Aaya Santa aaya leke khusiya hazaar,\n" +
                "Baccho ke liye Gifts aur dher sara pyaar\n" +
                "Ho jaye khushiyo ki aap sab par bahaar\n" +
                "Mubarak ho aapko Christmas ka tyohaar\n" +
                "\n" ));



        list.add(new Data_show ( "Khuda se kya maangu tere waste\n" +
                "Sada khushiyo se bhare ho tere jeevan k raste\n" +
                "Hansi tere chehre pe rahe ess tarah\n" +
                "Khushbu phool ka sathh nibhati hai jis tarah.\n" +
                "\n" +
                "\n" +
                " \n" ));



        list.add(new Data_show ( "Na card bhej raha hun,\n" +
                "Na koi phool bhej raha hun\n" +
                "Sirf sache dil se mein aap ko\n" +
                "Christmas aur nav varsh ke\n" +
                "Shubhkamana bhej raha hun." ));



        list.add(new Data_show ( "आपकी आँखों में सजे हों जो भी सपने,\n" +
                "और दिल में छुपीं हों जो भी अभिलाषाएं,\n" +
                "ये क्रिसमस का पर्व उन्हे पूरा कर जाये,\n" +
                "आपके लिए है हमारी यही शुभकामनाएं.\n" +
                "\n" ));


        list.add(new Data_show ( "चाँद ने अपनी चांदनी बिखेरी है,\n" +
                "और तारों ने आस्मां को सजाया है,\n" +
                "लेकर तौफा अमन और प्यार का,\n" +
                "देखो स्वर्ग से कोई फ़रिश्ता आया है.\n" +
                "I wish you marry x-mas." ));


        list.add(new Data_show ( "Happy Christmas Ka Ye Pyara Sa Tyohaar,\n" +
                "Zindagi Me Laaye Khushiya Apaar,\n" +
                "Santa Clause Aaye Aapke Ghar, S\n" +
                "ubhkamna Hamari Karo Sweekar.\n" +
                "Merry Christmas." ));


        list.add(new Data_show ( "क्रिसमस 2019 आये बन कर उजाला,\n" +
                "खुल जाए आप की किस्मत का ताला,\n" +
                "हमेशा तुम पर मेहरबान रहे ऊपर वाला,\n" +
                "बस इतनी सी दुआ करता है आपका ये चाहने वाला\n" +
                "\n" +
                "मेरी क्रिसमस" ));


        list.add(new Data_show ( "आया सांता आया लेके खुशिया हज़ार\n" +
                "बच्चो के लिए गिफ्ट्स और ढेर सारा प्यार\n" +
                "हो जाये खुशियों की आप सब पर बहार\n" +
                "मुबारक हो आपको क्रिसमस का त्यौहार\n" +
                "\n" +
                "हैप्पी क्रिसमस 2019" ));


        list.add(new Data_show ( "Aaya Santa aaya leke khusiya hazaar,\n" +
                "Baccho ke liye Gifts aur dher sara pyaar\n" +
                "Ho jaye khushiyo ki aap sab par bahaar\n" +
                "Mubarak ho aapko Christmas ka tyohaar\n" +
                "\n" +
                "Happy Merry Christmas" ));

        list.add(new Data_show ( "Another day, another month, another Christmas,\n" +
                "Another winter, another smile, another year\n" +
                "May special memories brighten your Christmas\n" +
                "May the joy of Christmas be with you forever.\n" +
                "\n" +
                "Wish You Merry Christmas 2019" ));


        list.add(new Data_show ( "Devdoot banke koi aayega\n" +
                "Saari aashayein tumhari\n" +
                "Poori karke jaayega\n" +
                "Christmas ke iss shubh din par\n" +
                "Tohfe khushiyo ke de jayega.\n" +
                "\n" +
                "Happy Xmas 2019" ));

        list.add(new Data_show ( "A little smile, A word of cheer,\n" +
                "A bit of love from someone near\n" +
                "A little gift from one held dear,\n" +
                "Best wishes for the coming year,\n" +
                "These make a Merry Christmas.\n" +
                "\n" +
                "Merry Christmas & Happy New Year 2019" ));

        list.add(new Data_show ( "Khuda se kya maangu tere waste\n" +
                "Sada khushiyo se bhare ho tere jeevan k raste\n" +
                "Hansi tere chehre pe rahe ess tarah\n" +
                "Khushbu phool ka sathh nibhati hai jis tarah.\n" +
                "\n" +
                "Happy Christmas to You" ));


        list.add(new Data_show ( "My Christmas message\n" +
                "Wrapped with love and happiness\n" +
                "Saying thank you Mom & Dad\n" +
                "For your support the whole year through\n" +
                "Now relax, you deserve the best.\n" +
                "\n" +
                "Merry Christmas Mom & Dad" ));


        list.add(new Data_show ( "May this Christmas bring you closer to God.\n" +
                "May you be able to understand the love that\n" +
                "He has for you in a more better manner.\n" +
                "May baby Jesus stay with you forever….!!\n" +
                "\n" +
                "Wish You Merry Christmas Friends" ));

        list.add(new Data_show ( "Aapki aankho mein saje ho jo bhi sapne\n" +
                "Aur dil mein chupi ho jo bhi abhilashaye\n" +
                "Ye Christmas ka parv unhe sach kar jaye\n" +
                "Aap ke liye hai humari yahi shubhkamnaye." ));

        list.add(new Data_show ( "May baby Jesus bring you\n" +
                "And your family lots of love.\n" +
                "May the host of angels\n" +
                "Fill your life with joy and bliss.\n" +
                "Merry Christmas to you\n" +
                "And all your loved ones.\n" +
                "\n" +
                "Happy Christmas 2019" ));


        list.add(new Data_show ( "Christmas ka ye pyara sa tyohaar\n" +
                "Jeevan me laye khushiyan apaar\n" +
                "Santa clause aayee aapke dwar\n" +
                "Subhkamna hamari kare sweekar.\n" +
                "\n" +
                "Merry Xmas & Happy New Year" ));


        list.add(new Data_show ( "I wish you joy all though your holidays,\n" +
                "I wish you good luck that forever stays.\n" +
                "I wish you the love of family and friends,\n" +
                "I wish you happy days that never ever ends.\n" +
                "\n" +
                "Wish You Merry Christmas to All  \uD83D\uDE42" ));



        list.add(new Data_show ( "Dil se manaye christmas aap,\n" +
                "Mile apko sab ka sath,\n" +
                "Dil mein ho jo khwaishein apke\n" +
                "Puri ho jaye aaj hathon hath.\n" +
                "\n" +
                "Merry Christmas" ));



        list.add(new Data_show ( "क्रिसमस का पावन त्यौहार,\n" +
                "हो खुशियों की बौछार,\n" +
                "परमेश्वर की कृपा हो\n" +
                "हो आपकी हर मुराद पूरी इस बार.\n" +
                "\n" +
                "Wish You a Merry Christmas" ));



        list.add(new Data_show ( "Christmas ki raat ho,\n" +
                "Sab apno ka sath ho,\n" +
                "Hathon me hath ho\n" +
                "Or sab pe khushiyon ki barsaat ho." ));


        list.add(new Data_show ( "Na rahe koi khwahish adhuri,\n" +
                "Na rahe koi sapna adhura,\n" +
                "Christmas de apko itni khushiya\n" +
                "Ki apke dil ka har khwab ho pura…" ));


        list.add(new Data_show ( "इस बार क्रिसमस पर मिले आपको ढेरो उपहार,\n" +
                "खुशियों का साथ अपनों का प्यार,\n" +
                "खूब अच्छा हो आपका आने वाला साल\n" +
                "मुबारक हो आपको क्रिसमस का त्यौहार.\n" +
                "\n" +
                "क्रिसमस की हार्दिक बधाई !" ));


        list.add(new Data_show ( "इस बार क्रिसमस खूब खुशियाँ लाये,\n" +
                "दुश्मनी सब की मिटाये अपनों को अपनों से मिलाये,\n" +
                "बुराई का अंत हो जाये\n" +
                "यीशु सब के दिलो में बस जाये.\n" +
                "\n" +
                "शुभ क्रिसमस" ));


        list.add(new Data_show ( "क्रिसमस को दिल से मनाये,\n" +
                "अन्दर की अच्छाई को जगाये,\n" +
                "जो रहे जाते है इस दिन भी खुशियों से अनजान\n" +
                "उन तक क्रिसमस की हर ख़ुशी पहुंचाएं.\n" +
                "\n" +
                "शुभ क्रिसमस" ));


        list.add(new Data_show ( "Sab se pyari khushiyan apke hiise me aye,\n" +
                "Apke jivan ko khushiyon se bhar jaye,\n" +
                "Agar managa ho apne bhi ek tofa senta se\n" +
                "To dua hai senta apko khub sare tofe de jaye.\n" +
                "\n" +
                "Merry Christmas" ));

        list.add(new Data_show ( "Sache dil se christmas manana,\n" +
                "Sabko khushi ka hiisa manana,\n" +
                "Apna paraya sab bhula kar\n" +
                "Dil se sab ko gale lagana.\n" +
                "\n" +
                "Merry Christmas" ));


        list.add(new Data_show ( "Christmas ki khushiyon me doob jana,\n" +
                "Is christmas ko dil se manana,\n" +
                "Apna ho ya gair koi\n" +
                "Khushi se gale sabko lagana." ));

        list.add(new Data_show ( "Meri har khushi ke sathi mere,\n" +
                "Christmas mubarak ho yaar mere,\n" +
                "Rehna tu yuhi paas mere\n" +
                "Har Christmas hume manana hai sath tere.\n" +
                "\n" +
                "Merry Christmas My Friend" ));

        list.add(new Data_show ( "Pyare insaan ko pyari shubhkamnaye,\n" +
                "Is christmas par hamari ye shubhkamnaye,\n" +
                "Apko mile khushiyan pyari pyari\n" +
                "Bas dil se hamari yeh shubhkamnaye.\n" +
                "\n" +
                "Christmas Ki Hardik Shubhkamnaye" ));


        list.add(new Data_show ( "आपकी आंखों से सजे हो जो भी सपने,\n" +
                "और दिल में छुपी हो जो भी अभिलाषाएं,\n" +
                "यह किसमस का पर्व उन्हें सच कर जाए,\n" +
                "आपके लिए है हमारी यही शुभकामनाएं..\n" +
                "मेरी क्रिसमस" ));


        list.add(new Data_show ( "चांद ने अपनी चांदनी बिखेरी है,\n" +
                "और तारों ने आसमां को सजाया है,\n" +
                "लेकर तौफा अमन और प्यार का,\n" +
                "देखो स्वर्ग से कोई फरिश्ता आया है..\n" +
                "Merry Christmas" ));



        list.add(new Data_show ( "खुदा से क्या मांगू तुम्हारे वास्ते,\n" +
                "सदा खुशियां हो तुम्हारे रास्ते,\n" +
                "हंसी तुम्हारे चेहरे पर रहे कुछ इस तरह,\n" +
                "खुशबू फूल का साथ निभाए जिस तरह!\n" +
                "क्रिसमस की बधाइयां" ));

        list.add(new Data_show ( "सबके दिलों में हो सबके लिए प्यार,\n" +
                "आने वाला हर दिन लाए खुशियों का त्यौहार,\n" +
                "इस उम्मीद के साथ आओ भूलके सारे गम,\n" +
                "क्रिसमस में हम सब करें वेल-कम !" ));


        list.add(new Data_show ( "लो आ गया जिस का था इंतजार,\n" +
                "सब मिल के बोलो मेरे यार, दिसंबर में लाया क्रिसमस बहार,\n" +
                "मुबारक हो आपको क्रिसमस मेरे यार.." ));


        list.add(new Data_show ( "सबके दिलों में हो सबके लिए प्यार,\n" +
                "आने वाला हर दिन लाए खुशियों का त्यौहार,\n" +
                "इस उम्मीद के साथ आओ भूलके सारे गम,\n" +
                "क्रिसमस में हम सब करें वेल-कम !" ));



        list.add(new Data_show ( "क्रिसमस का ये प्यारा सा त्यौहार,\n" +
                "जीवन में लाए खुशियां अपार,\n" +
                "संता क्लॉज आए आपके द्वार,,\n" +
                "शुभकामनाएं हमारी करें स्वीकार..\n" +
                "Merry Christmas" ));



        list.add(new Data_show ( "Baccho ka din, tohfon ka din Santa aayega\n" +
                "kuch tumhe deke jayega\n" +
                "Bhul na jana use shukriya kehna..\n" +
                "Yahi saadgi ishu saa sikhayega!\n" +
                "Christmas Day ki shubhkamnaye..\n" +
                "Merry X-Mas" ));



        list.add(new Data_show ( "खुदा से क्या मांगू तेरे वास्ते,\n" +
                "सदा खुशियों से भरे हो तेरे जीवन के रास्ते,\n" +
                "हंसी तेरे चेहरे पे रहे इस तरह,\n" +
                "खुशबु फूल का साथ निभाती है जिस तरह.." ));


        list.add(new Data_show ( "लो आ गया जिस का था इंतजार,\n" +
                "सब मिल के बोलो मेरे यार,\n" +
                "दिसंबर में लाया क्रिसमस बहार,\n" +
                "मुबारक हो आपको क्रिसमस मेरे यार.." ));


        list.add(new Data_show ( "क्रिसमस के शुभ अवसर पर आपको और\n" +
                "आपके परिवार को हमारी ओर से हार्दिक शुभकामनाएं.." ));


        list.add(new Data_show ( "Sabke Dilo mein ho sabke liye Pyar,\n" +
                "Aanewala har din laye khusiyo ka Tyohar,\n" +
                "Is ummid ke sath aao bhulke\n" +
                "sare Gum Christmas me hum sab kare…\n" +
                "WEL-COME Merry Christmas" ));


        list.add(new Data_show ( "क्रिसमस 2019 आए बन कर उजाला,\n" +
                "खुल जाए आपकी किस्मत का ताला,\n" +
                "हमेशा तुम पर मेहरबान रहे ऊपर वाला,\n" +
                "बस इतनी सी दुआ करता है आपका ये चाहने वाला!\n" +
                "मेरी क्रिसमस" ));


        list.add(new Data_show ( "इस क्रिसमस आपका जीवन क्रिसमस ट्री की तरह,\n" +
                "हरा भरा और भविष्य तारों की तरह चमचमाता रहे!" ));

        list.add(new Data_show ( "खुदा से क्या मांगू तुम्हारे वास्ते,\n" +
                "सदा खुशियाँ हो तुम्हारे रास्ते,\n" +
                "हंसी तुम्हारे चेहरे पर रहे कुछ इस तरह,\n" +
                "खुशबू फूल का साथ निभाए जिस तरह !\n" +
                "\n" +
                "क्रिसमस की बधाईयाँ" ));


        list.add(new Data_show ( "लो आ गया जिसका था इंतज़ार,\n" +
                "सब मिल कर बोलो मेरे यार,\n" +
                "दिसम्बर में लाया क्रिसमस बहार,\n" +
                "मुबारक हो तुमको क्रिसमस मेरे यार!" ));

        list.add(new Data_show ( "Aapki aankho mein\n" +
                "saje ho jo bhi sapne\n" +
                "Aur dil mein chupi ho\n" +
                "jo bhi abhilashaye\n" +
                "Ye Christmas ka parv\n" +
                "unhe sach kar jaye\n" +
                "Aap ke liye hai\n" +
                "humari yahi shubhkamnaye" ));

        list.add(new Data_show ( "Khuda se kya maangu tere waste Sada khushiyo se bhare ho tere jeevan k raste\n" +
                "Hansi tere chehre pe rahe ess tarah Khushbu phool ka sathh nibhati hai jis tarah" ));


        list.add(new Data_show ( "*********************************\n" +
                "\n" +
                "Devdoot banke koi aayega,\n" +
                "Saari aashayein tumhari,\n" +
                "Poori karke jaayega,\n" +
                "Christmas ke iss shubh din par,\n" +
                "Tohfe khushiyo ke de jayega.\n" +
                "\n" +
                "Happy Xmas" ));


        list.add(new Data_show ( "Khuda se kya maangu tere waste\n" +
                "Sada khushiyo se bhare ho tere jeevan k raste\n" +
                "Hansi tere chehre pe rahe is tarah\n" +
                "Khushboo phool ka sathh nibhati hai jis tarah.\n" +
                "\n" +
                "Happy Christmas to You" ));


        list.add(new Data_show ( "Aapki aankho mein saje ho jo bhi sapne\n" +
                "Aur dil mein chupi ho jo bhi abhilashaye\n" +
                "Ye Christmas ka parv unhe sach kar jaye\n" +
                "Aap ke liye hai humari yahi shubhkamnaye." ));

        list.add(new Data_show ( "Christmas ka ye pyara sa tyohaar\n" +
                "Jeevan me laye khushiyan apaar\n" +
                "Santa clause aayee aapke dwar\n" +
                "Subhkamna hamari kare sweekar.\n" +
                "\n" +
                "Merry Xmas & Happy New Year" ));






        // list.add(new Data_show ( "" ));
    }
}
