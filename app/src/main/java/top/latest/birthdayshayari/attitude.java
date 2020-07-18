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

public class attitude extends AppCompatActivity {

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
        setContentView ( R.layout.activity_attitude );

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

        list.add(new Data_show ( "अगर मै छोड़ दूँ अपनी पागलपंथी तो फिर\n" +
                "उनका क्या होगा\n" +
                "जिन्हें मेरे पागलपन से प्यार है …" ));


        list.add(new Data_show ( "#\uD83D\uDE0Eमेरा \uD83D\uDE1AStyle \uD83D\uDC9Aऔर #✴Attitude\uD83D\uDD17 #\uD83D\uDD25 \uD83D\uDC99ही #\uD83D\uDC9Cकुछ अलग है\uD83D\uDC8B ।# #✊बराबरी \uD83D\uDE08करने जाओगे \uD83D\uDC4A# #\uD83D\uDC95तो \uD83D\uDC4Cबरबाद हो ✴जाओगे# \uD83D\uDD2B।। \uD83D\uDE0E\uD83D\uDC51 રૉયલ નવાબ\uD83D\uDC51\uD83D\uDE0E" ));


        list.add(new Data_show ( "जब\uD83D\uDE12 #जान\uD83D\uDE18 #प्यारी☺ थी तो #दुश्मन\uD83D\uDC79 #हज़ारों\uD83D\uDC48 \uD83D\uDD22थे ✔ . अब☝ #मरने \uD83D\uDC69\uD83D\uDD2Bका #शौक\uD83D\uDE1E हुआ✔ तो #क़ातिल\uD83D\uDD2A नही ❌मिलते \uD83D\uDE0F\uD83D\uDE0F\uD83D\uDC79\uD83D\uDC7F" ));


        list.add(new Data_show ( "कुछ\uD83D\uDC4Cदिन\uD83C\uDF05से स्टेट्स\uD83D\uDCACनही❌लिखा✍\uD83C\uDFFBतो मार्क ज़ुकर्बक\uD83D\uDD35ने աɦǟtsǟքք✳से Stǟtʊs\uD83D\uDDEFका ऑप्शन्स\uD83D\uDE12ही हटा \uD83D\uDE0Fदिया इसको\uD83D\uDC49\uD83C\uDFFCकहते\uD83D\uDDE3हैं ख़ौफ़\uD83D\uDE08" ));

        list.add(new Data_show ( " #जिदगी_अपने_हिसाब से जीनी चाहिए\n" +
                "#औरो_के कहने पर तो: शेर भी #सरकस\uD83C\uDFAA में नाचते हैं...!\n" +
                "#रॉयल\uD83D\uDC51 #नवाबी\uD83D\uDE4F\uD83D\uDCAA\uD83D\uDE0E" ));


        list.add(new Data_show ( " स टोर भी #रॉयल तेरे यार की....\n" +
                "ना लोड़ मैने #हथ्यार की...\n" +
                "इन #पिसयां का करणा भी के स..\n" +
                "जब सपोर्ट रही मेरे जिगरी #यारा की..." ));

        list.add(new Data_show ( " #हमको जंजीरो में कैद करने का सपना मत देख.\n" +
                "क्युंकि हम वो #आदमखोर शेर हैं,\n" +
                "जिसका भी #शिकार करतें हैं,\n" +
                "उसका जिस्म तो क्या #रूह_भी_दम तोड़ देती हैं।\n" +
                "#Royal #Nawabi" ));

        list.add(new Data_show ( " #आदत हमारी #खराब नहीं\n" +
                "बस #जिंदगी थोड़ी #रॉयल जीते है..." ));


        list.add(new Data_show ( " जिस दिन हमने अपना #रॉयल अंदाज़ दिखाया..\n" +
                "उस दिन ये #Attitude वाली #लड़कियां\n" +
                "खड़े खड़े #ढेर हो जाएंगी\uD83D\uDCAA\uD83D\uDC7D" ));


        list.add(new Data_show ( " कागजो \uD83D\uDCC4 पर तो #अदालते\uD83C\uDFF0 चलती है\n" +
                "हम तो #रॉयल छोरे है\n" +
                "#फैसला_on_the_spot_करते है.\n" +
                "{{ Mr.Nawab}}" ));


        list.add(new Data_show ( " हमारे जीने का तरीका थोड़ा अलग है,\n" +
                "हम Umeed पर nahi अपनी Zid par Jeete है..." ));

        list.add(new Data_show ( " #नवाब की जिन्दगी जीने के लिए नसीब लगता है,\n" +
                "वर्ना #हीरो की जिन्दगी तोह कोई भी जीता है...!" ));


        list.add(new Data_show ( " #DNA म्हारा #रॉयल सै,\n" +
                "#Blood बड़ा ही #जोसिला रै...!!\n" +
                "\n" +
                "Royal Attitude" ));


        list.add(new Data_show ( "\n" +
                "Kirdar mera bhi शाम ए अवध sa gulaabi ho jaye.....\n" +
                "...Agar Tum Aa Jao Tu Ishq Mera Nawabi ho jaaye" ));



        list.add(new Data_show ( " → अपनी_तो_एक_हि पेहचान_है.\n" +
                "\uD83D\uDE00 हस्ता_चेहरा_शराबी_आंखे_\uD83D\uDE09\n" +
                "★_ नवाबी_शान \uD83D\uDE0E और दोस्तो के लिये ,,,\n" +
                "\uD83D\uDD2B ★ Jäãñ ★ \uD83D\uDD2B ... \uD83D\uDE0E" ));



        list.add(new Data_show ( " अभी #उम्र छोटी है इसलिए #दहशत... कम है।।" ));



        list.add(new Data_show ( "थोडा # टाइम... रुको, #ज़िंदगी...जियेगे\n" +
                "#शान से और #दहशत होगी\n" +
                "#रॉयल #नवाब... के नाम से....." ));


        list.add(new Data_show ( " #शिकार तो सभी करते हैं लेकिन\n" +
                "#नवाबों \uD83D\uDC2F से बेहतर #शिकार कोई नहीं करता...!" ));


        list.add(new Data_show ( " तु क्या हमारी बराबरी करेगी \u202A#\u200Eपगली,\n" +
                "हमारी तो #नींद में खींची हुई #फ़ोटो\n" +
                "भी लोगों की लिए #पोज़ बन जाती है...!" ));


        list.add(new Data_show ( "Hathiyar to सिर्फ shok ke लिए rakha karte है\n" +
                "Varna kisi ke man mein khauf Paida Karne के लिए तो बस Hamara Naam hi Kafi hai..!!\n" +
                "#रॉयल_नवाब" ));


        list.add(new Data_show ( " \uD83D\uDC51हर कहानी का एक \uD83D\uDC51किँग होता है \uD83D\uDC51\n" +
                "\uD83D\uDC51 ओर हर #किँग की एक\uD83D\uDC51 कहानी \uD83D\uDC51\n" ));


        list.add(new Data_show ( " #सुन पगली \uD83D\uDCE3\n" +
                "#माना की तू  \uD83D\uDC49\uD83D\uDC67\uD83C\uDFFB#लूडो?? की #किंग \uD83D\uDC78 है ?? #पर\n" +
                "#हम \uD83D\uDE0E भी अब\uD83D\uDE15 #स्टेटस_κiпg के #बादशाह\uD83E\uDD34?? है" ));

        list.add(new Data_show ( " साला #FB पे कोई अपने आप को #किंग\n" +
                "समझता है...तो कोई अपने आपको #एक्का...\n" +
                "अरे जा के बोल दो कोई उस #किंग और\n" +
                "#एक्के से के FB पे #_\"नवाबों\"कि #एन्ट्री हो चुकी है...!!" ));


        list.add(new Data_show ( "\n" +
                " #स्टेटस\uD83D\uDCAC तो हर☝\uD83C\uDFFD कोई #लिख✍\uD83C\uDFFC लेता है हम \uD83D\uDE0Eतो\n" +
                "#बादशाह\uD83D\uDC51 है #Attɨtʊɖɛ\uD83D\uDC7F से भरा #डायलॉग\uD83D\uDC49\uD83C\uDFFD लिखते \uD83D\uDCDD\n" ));

        list.add(new Data_show ( "#हमारी  \uD83D\uDC68 photo � और  \uD83D\uDCCB #स्टेटस  ⛽ petrol की तरह है...\n" +
                "जरा सी  \uD83D\uDD25#चिंगारी✨और पूरे fac2ebook पे #आग � लगा दी\uD83D\uDD25.." ));

        list.add(new Data_show ( " मेरे \uD83D\uDC66 #स्टेटस #नशें \uD83C\uDF77की #तरह होते है," +
                "एक \uD83D\uDC46 बार #आदत पड़ गई तो #बिना $पढ़े \uD83D\uDCC3रह #पाना #मुश्किल है\n" +
                "#Nawab_Sahib" ));


        list.add(new Data_show ( " तेरा #Style\uD83D\uDE0E जीतना #Nawabi है..\n" +
                "#Oye_पगले\n" +
                "उससे ज्यादा तो मेरे\uD83D\uDC70\uD83C\uDFFB गाल #Gulabi है." ));


        list.add(new Data_show ( " #SuN__Pagli jitNe TeRy #GaAL__GulaaBi hain\n" +
                "#Us__Se ziYada MerY shok #NaWabi haiN" ));



        list.add(new Data_show ( " #Nawabi To Mery #Khooon Me Thi # Pagal\n" +
                "#Pata Nahe Ye #Dil Tera #Ghulaam Kb Sy Ho Gaya..\n" ));

        list.add(new Data_show ( "ना POLICE Mein report hoti hai...\n" +
                "ना Adaalat Court hoti hai ...\n" +
                "जब bhai ki PHOTO upload hoti hai to बस विस्फोट hoti hai\n" ));


        list.add(new Data_show ( "Aadat Hamari kharab nahi\n" +
                "bas Zindagi Thodi Royal. Jeete Hain" ));


        list.add(new Data_show ( "Hamara status to copy kar loge\n" +
                "साहब Par Ye  attitude Akad style Yeh Kahan Se लाओगे Jo bus Hamari रगो  Mein दोड़ती Hai...." ));




        list.add(new Data_show ( "वक्त Aane Do बंदूक bhi uthenge Trigger भी dabayenge और  Goli भी चलाएंगे\n" +
                "और उस Par राज भी करेगे जिसे लोग कहते Hai..... **दुनिया**" ));


        list.add(new Data_show ( "लहरो Ko खामोश देखकर Ye ना समझना Ki समंदर मे लहरें Nahi है\n" +
                "हम Jab भी उठेगे तूफान Bankar  उठेगे. बस उठने Ki अभी ठानी नही है." ));


        list.add(new Data_show ( "दुनिया Pyaar से नहीं\n" +
                "दादागिरी Se चलती हैं.\n" ));

        list.add(new Data_show ( "मेरी GF बोली Ki तुम्हरी आदते अच्छी Nahi\n" +
                "Maine कहा बेबी शरीफ To बच्चे होते हैं\n" +
                "हम To दादागिरी में Hi अच्छे लगते है." ));


        list.add(new Data_show ( "→ अपनी To एक हि पेहचान है.\n" +
                "हस्ता चेहरा शराबी आंखे\n" +
                "★ नवाबी शान Aur दोस्तो Ke लिये\n" +
                "★ JÄÃÑ ★ .\n" ));

        list.add(new Data_show ( "शिकार To सभी करते हैं लेकिन\n" +
                "नवाबों से बेहतर शिकार Koi नहीं करता." ));

        list.add(new Data_show ( "क्यूट Sa चहेरा मेरा कमीनी सी नज़र Teri\n" +
                "इतनी प्यारी हु Me के कही नज़र ना लगे Teri." ));


        list.add(new Data_show ( "स्टेटस Ka बादशाह हुं Aur कलम मेरी रानी है अल्फाजमेरे गुलाम Hai\n" +
                "बाकी रब Aur मेरे DOSTO Ki महेरबानी है." ));


        list.add(new Data_show ( "ROAD Pe SPEED LIMIT.\n" +
                "EXAM Me TIME LIMIT.\n" +
                "LOVE Me AGE LIMIT.\n" +
                "Par हमारी. दादागिरी Me NO LIMIT .\n" ));




        list.add(new Data_show ( "Hamri PHOTO � Aur स्टेटस PETROL Ki तरह है.\n" +
                "जरा सी चिंगारी Aur पूरे FACEBOOK पे आग � Laga दी." ));

        list.add(new Data_show ( "\n" +
                "\\ स्टाइल Sirf मिनी स्कर्ट Me ही नही होता\n" +
                "कुछ लड़किया To सलवार SUIT में Bhi दिल ले जाती Hai." ));


        list.add(new Data_show ( "Ham से PANGA लेने से पहले 10 बार सोच Lena\n" +
                "जितने तुम्हारे PHONE Me CONTACTS है\n" +
                "उससे 10X तो Hamari एक सीटी मरने पे\n" +
                "तेरे Ghar के बहार खड़े Ho जाये." ));


        list.add(new Data_show ( "इतना \u202A \u200EATTITUDE\u202C Mat दिखा \u202A \u200EPAGLI\u202C\n" +
                "Warna जैसे रोज \u202A \u200ESTATUS\u202C चेँज करता हुँ\n" +
                "वैसे ही Tujhe भी \u202A \u200ECHANGE\u202C कर दुँगा." ));



        list.add(new Data_show ( "गलती Meri ही Thi यारो\n" +
                "वो होंठ गोल Karke KISS मांग रही Thi\n" +
                "मैं [ उसे कमलापसन्द ♥ Ki पुड़िया दे आया ]\uD83D\uDE02\n" ));



        list.add(new Data_show ( "तेरे सामने \u202A[ SHARIF ]\u202C Hone Ka  दिखावा\uD83E\uDD17 Karta हुँ PAGLI\u202C⤵\n" +
                "\uD83D\uDE02 वर्ना आकर पुछ मेरे [ \u202AYAARO\u202C ] Se कमीनेपन मे \u200E BRANDED\u202C हरामी Hun...\uD83D\uDE0E\uD83D\uDC4C\n" ));



        list.add(new Data_show ( "\n" +
                "\u200EATTITUDE\u202C ki तो \u202A \u200Eतु\u202C बात Hi मत कर\n" +
                "क्योंकी जिस \u202A \u200ECOLUMM\u202C Me तु \u202A \u200EFEMALE\u202C लिखती है\n" +
                "उसमें तो Ham \u202A \u200Eभाई लिख देते हैं.\n" ));


        list.add(new Data_show ( "➡भीड़ में खड़ा Hona मकसद नहीं हैं Mera \uD83D\uDE44\n" +
                "बल्कि भीड़ जिसके Liye खड़ी हो वो बनना Hai.. मुझे.\uD83D\uDE0E\uD83D\uDC4C\n" ));


        list.add(new Data_show ( "Abhi उम्र छोटी Hai इसलिए दहशत. कम Hai...।।\n" +
                "थोडा Time. रुको ज़िंदगी.जियेगे\n" +
                "शान SE  और दहशत होगी\n" +
                "रॉयल नवाब. के Naam से." ));


        list.add(new Data_show ( "कागजो \uD83D\uDCC4 Par तो अदालते\uD83C\uDFF0 Chalti है\n" +
                "Ham To रॉयल छोरे है\n" +
                "फैसला ON THE SPOT Karte है..." ));


        list.add(new Data_show ( "Meri हर एक्सप्रेशन Hai CUTE\n" +
                "न समझो Mujhe MUTE\n" +
                "लोगे पंगा To मजबूर Ho जाओगे\n" +
                "बदलने Ko Apna  ROOT." ));


        list.add(new Data_show ( "तु क्या Hamari बराबरी करेगी \u202A \u200EPAGLI\n" +
                "हमारी To नींद में खींची हुई PHOTO\n" +
                "भी लोगों Ke लिए पोज़ Ban जाती है." ));

        list.add(new Data_show ( "हथियार To सिर्फ शौक के Liye रखा करते है\n" +
                "Warna किसी के मन Me खौंफ पैदा Karne के Liye तो बस हमारा NAAM ही काफी है.\n" +
                "             ➡ रॉयल नवाब ↩" ));


        list.add(new Data_show ( "DARR \uD83D\uDE30 मत Pagali मार \uD83D\uDD2ANahi डालूँगा Tujhe ये तो हमारी नजरें Hi कातिलाना है.\n" +
                "Warna दिल ❤ तो बड़ा ही Aashique मिजाज है." ));

        list.add(new Data_show ( "ठाट APNI देसी\n" +
                "रुतबा APNA देसी\n" +
                "स्टाइल APNA देसी\n" +
                "फेर ke चीज़ म्हारे A ge विदेशी.\n" ));

        list.add(new Data_show ( "सुन \u202APAGALI NEWS REPORTER \u202A\u200EDuniya की खबरें Batata है\n" +
                "ज्योतिष हाथ Dekh कर लोगों का भविष्य बताता है\n" +
                "Lekin हम वो है जो\n" +
                "Dusman की शक्ल देख कर Uski \u200Eऔकात बता देते हैं." ));


        list.add(new Data_show ( "Ham  1⃣5⃣% BATTERY \uD83D\uDD0B WARNING ⚠ Ko भी सीरियसली Nahi लेते हैं\n" +
                "kisi की \uD83D\uDE08 फालतू बातें तो Bahoot दूर की Baat है.\n" ));


        list.add(new Data_show ( "JARURAT Hai MUJHE कुछ नए \uD83D\uDC4D Nafarat \uD83D\uDE12 करने वालों Ki\n" +
                "पुराने वाले \uD83D\uDE1C TO अब Bhai को चाहने \uD83D\uDE18 लगे है..।" ));


        list.add(new Data_show ( "Dekha \uD83D\uDC41 दी है औकात जिन्हें हम Apna मानते थे\n" +
                "वो Hi निकले बेवफा\uD83D\uDC94 जिन्हें Sabse\uD83C\uDF0F करीब \uD83D\uDE0Dमानते थे." ));

        list.add(new Data_show ( "Duniya \uD83C\uDF0E जलती हैं To जलने दो\n" +
                "Kyunke जलाने वाले भी हम है और\n" +
                "बुझाने वाले Bhi \uD83D\uDE0D हम Hi है." ));


        list.add(new Data_show ( "राहें बदले \uD83D\uDEA7 Ya बदले waqt हम तो अपनी -मँजिल Paayenge \uD83D\uDE0C\n" +
                "जो समझते \uD83D\uDE12है खुद Ko बादशाह एक दिन☝उसे Apne [ दरबार ] में Zaroor नचायेगे." ));


        list.add(new Data_show ( "\uD83D\uDC49\uD83D\uDE0E एक Din ßhai इतना Famous होगा की \uD83D\uDE0F Log, ßhai को \u202A\uD83D\uDD07 Facebook\u202C पे नहीं \u202A\uD83D\uDCE2 Google\u202C पे Search करेंगे..\uD83D\uDCCA" ));



        list.add(new Data_show ( "\uD83D\uDE0E रेस वो Log करते है, \uD83D\uDE09 जीसे Apani किस्मत आजमानी हो, Ham तो वो खिलाडी है, \uD83D\uDC46 जो Apani किस्मत के साथ खेलते है..\uD83D\uDE0F" ));




        list.add(new Data_show ( "\uD83E\uDD3C डरते तो Ham किसी के Baap से भी नही,\uD83D\uDE17 बस Respect नाम की चीज Bich मे आ जाती हे..\uD83C\uDF1D" ));


        list.add(new Data_show ( "\uD83D\uDEB6 मुकाम वो Chahiye की जिस Din भी हारु,\uD83D\uDE42 उस Din जीतने Wale से Zada मेंरे चर्चे हो..\uD83D\uDE0E\n" ));






        // list.add(new Data_show ( "" ));
    }
}
