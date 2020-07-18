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

public class new_year extends AppCompatActivity {

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
        setContentView ( R.layout.activity_new_year );

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



        list.add(new Data_show ( "दस्तक दी, किसी ने कहा सपने लाया हूँ;\n" +
                "खुश रहो आप हमेशा, इतनी दुआ लाया हूँ!\n" +
                "नाम है मेरा एस सम एस,\n" +
                "आपको `हैप्पी न्यू इयर` विश करने आया हूँ\n" +
                "नव वर्ष की हार्दिक शुभकामनायें 2020\n" ));

        list.add(new Data_show ( "कबीर जी ने कहा था,\n" +
                "कल करे सों आज कर,\n" +
                "आज करे सों अब,\n" +
                "नेटवर्क फेल हो गया विश करेगा कब\n" +
                "2020 नव वर्ष की शुभकामनायें" ));

        list.add(new Data_show ( "शेर कभी छुप कर शिकार नहीं करते\n" +
                "बुज़दिल कभी खुलकर वार नहीं करते\n" +
                "हम तो वो है जो नया साल विश करने के लिए\n" +
                "एक जनवरी का इंतज़ार नहीं करते!\n" +
                "।। नया साल मुबारक हो।।" ));

        list.add(new Data_show ( "आपके सारे गम खुशियों में तोल दूँ,\n" +
                "अपने सारे राज़ आपके सामने खोल दूँ\n" +
                "कोई मुझसे पहले न बोल दे,\n" +
                "इसलिए सोचा क्यों न आज ही,\n" +
                "आपको हैप्पी न्यू इयर बोल दूँ!" ));


        list.add(new Data_show ( "Oh my dear, forget your fear\n" +
                "let all your dreams be clear\n" +
                "never put tear, please hear\n" +
                "I want to tell one thing in your ear\n" +
                "Wishing you a very happy new year\n" +
                "A new year – A new start\n" +
                "A new chapter – A new beginning\n" +
                "Forget the bad cherish the good\n" +
                "I sincerely wish you a very\n" +
                "blessed new year ahead\n" +
                "\n" +
                "Happy New Year" ));


        list.add(new Data_show ( "I wish you to have a\n" +
                "Sweetest Sunday,\n" +
                "Marvelous Monday\n" +
                "Tasty Tuesday\n" +
                "Wonderful Thursday\n" +
                "Friendly Friday\n" +
                "Successful Saturday\n" +
                "Have a great Year\n" +
                "\n" +
                "Happy New Year" ));



        list.add(new Data_show ( "May every day of the new year glow with good\n" +
                "cheer & happiness for you & your family.\n" +
                "\n" +
                "Happy new year" ));



        list.add(new Data_show ( "हर किसी के दिल में हो, सबके लिए प्यार\n" +
                "पूरी हो अधूरी कहानी, नए साल में\n" +
                "\n" +
                "करते हैं हम ये दुआ, सिर को झुकाकर\n" +
                "मिले गरीब को रोटी और पानी, नए साल में\n" +
                "\n" +
                "पुराना साल हो रहा हैं, अब सबसे दूर\n" +
                "ख़त्म हो नफरतो की कहानी, नए साल में\n" +
                "\n" +
                "आपको तहे दिल से नववर्ष की शुभकामना" ));



        list.add(new Data_show ( "ज़िन्दगी हो जाये सुहानी, नए साल में\n" +
                "बात हो दिल की ज़ुबानी, नए साल में\n" +
                "\n" +
                "हर दिन हसीं और रातें रोशन हो\n" +
                "खुशियों की हो रवानी, नए साल में" ));


        list.add(new Data_show ( "है एक रंग नया सा, रूप नया सा\n" +
                "दिल में है आज एहसास नया सा\n" +
                "\n" +
                "नयी चाहते हैं और नयी उमंगें\n" +
                "मन में है एक ख्वाब नया सा\n" +
                "\n" +
                "नयी है साल, नया हैं दिन\n" +
                "रखो अंदाज़ ऐसे जीने का प्यारा सा\n" +
                "\n" +
                "नया साल मुबारक हो" ));


        list.add(new Data_show ( "Naya saal aa gaya sochata hu kuch uphar du\n" +
                "Jo khud hi gulaab ho, use kya gulab doo ?" ));


        list.add(new Data_show ( "Ye SMS nahi ek pyar bhara panna hain,\n" +
                "Aapko naya saal mubarak ho ye meri tamanna hai." ));


        list.add(new Data_show ( "Bhavre jhoomenge jab tak phoolo ki dal per,\n" +
                "Deta rahunga subhkamnaye tumhe har naye saal per." ));


        list.add(new Data_show ( "Suraj niklta he purab ki or se\n" +
                "Naya sal mubarak ho aapko meri or se" ));

        list.add(new Data_show ( "Ye Saal bhi guzra hai tere piyar ki maanind,\n" +
                "Aaty huwe kuch aur tha, Jaty huwe kuch aur hai..!!" ));


        list.add(new Data_show ( "January sapane dikhati hai\n" +
                "aur December AUKAT" ));

        list.add(new Data_show ( "Koi Ranjj ka lamha na kisi ke paas aaye.\n" +
                "Khuda kare ke ye Naya Saal aap sabko raas aaye" ));

        list.add(new Data_show ( "ज़िन्दगी का फलसफा भी कितना अजीब है,\n" +
                "शामें कटती नहीं और साल गुज़रते चले जा रहे है" ));


        list.add(new Data_show ( "Naya Saal Mubarak !!\n" +
                "Kya Bharosa\n" +
                "Mobile Ka\n" +
                "Battery ka\n" +
                "Charger Ka\n" +
                "Network Ka\n" +
                "Balance Ka\n" +
                "Life ka\n" +
                "Time Ka\n" +
                "Is Liye Meri Taraf Se\n" +
                "Advance Main\n" +
                "\"Naya Saal Mubarak\"\n" ));


        list.add(new Data_show ( "दिल’ को “धड़कन” से पहले,\n" +
                "‘दोस्त’ को “दोस्ती” से पहले,\n" +
                "‘प्यार’ को “मोहब्बत” से पहले,\n" +
                "‘खुशी’ को “गम” से पहले,\n" +
                "ओर ‘आप’ को “सबसे” पहले,\n" +
                "Happy New Year 2020!" ));

        list.add(new Data_show ( "पूरे हो आपके सारे Aim,\n" +
                "सदा बढ़ती रहे आप की Fame,\n" +
                "मिलते रहे सबसे प्यार और दोस्ती,\n" +
                "और मिले A Lot of Fun और Masti,\n" +
                "Wish You a Happy New Year,\n" +
                "With A Plenty of Peace & Prosperity!!" ));

        list.add(new Data_show ( "नये बरस की पहली घड़ी है,\n" +
                "उम्मीद की नाव किनारे आने लगी है,\n" +
                "मन से एक दुआ निकली है,\n" +
                "यह धरती जो हम को मिली है,\n" +
                "या रब अब तो रहमत का साया कर दे,\n" +
                "के ये धूप में बहोत जली है!!\n" ));


        list.add(new Data_show ( "\uD83E\uDD17\uD83E\uDD17Isse Pehle Ki Saal Ka Antim Suraj Ast Ho,\n" +
                "Isse Pehle Ki 2018 Ka Calender Nast Ho,\n" +
                "Isse Pehle Ki Aap Khushi Ke Mahaul Me Mast Ho,\n" +
                "Aur Isse Pehleki Mobile Network Vyast Ho,\n" +
                "Dua Hai Ki Aane Wala Saal Aapke Liye Zabardast Ho.\n" +
                "\uD83D\uDE0B\uD83D\uDE0BHappy New Year 2020.\uD83D\uDE0D\uD83D\uDE0D\uD83D\uDE0D" ));


        list.add(new Data_show ( "\uD83D\uDC49\uD83D\uDC49Phool \uD83C\uDF37Khilte Rahen Jivan Ki Raah\uD83D\uDC83 Me,\n" +
                "Khushi Chamakti Rahe Aapki Nigaah Me,\n" +
                "Har Kadam Pe Mile Khuushi Ki Bahar Apko,\n" +
                "Main Deta Hu Aisi Naye Saal Ki Shubhkamnayen Aapko.\uD83D\uDC6A\uD83D\uDC65" ));



        list.add(new Data_show ( "कभी हंसती है तो कभी रुलाती है\n" +
                "ये जिंन्दगी भी न जाने कितने रंग दिखाती है।\n" +
                "हंसते हैं तो भी आंखों में नमी आ जाती है\n" +
                "न जाने ये कैसी यादें है जो दिल में बस जाती हैं\n" +
                "दुआ करते हैं इन नए साल के अवसर पर\n" +
                "मेरे दोस्तो के होठों पर सदा मुस्कान रहे\n" +
                "क्योंकि उनकी हर मुस्कुराहट हमें खुशी दे जाती है।" ));



        list.add(new Data_show ( "भूल जाओ बीते हुए कल को\n" +
                "दिल में बसा लो आने वाले कल को\n" +
                "मुस्कुराओ चाहे जो भी हो पल\n" +
                "खुशियां लेकर आएगा आने वाला कल।\n" +
                "नए साल की शुभकामनाएं।" ));



        list.add(new Data_show ( "सोचा किसी अपने से बात करे,\n" +
                "अपने किसी खास को याद करे!\n" +
                "किया जो फैसला नए साल की शुभकामनाए देने का,\n" +
                "दिल ने कहा क्यों न शुरुआत आप से करे." ));


        list.add(new Data_show ( "Kya Bharosa\n" +
                "Cellular KA\n" +
                "Battery KA\n" +
                "Charger KA\n" +
                "Community KA\n" +
                "Impact KA\n" +
                "Li Fe KA\n" +
                "Time KA\n" +
                "Can Be Liye Meri Taraf Se\n" +
                "Advance Major\n" +
                "“Naya Saal Mubarak”" ));


        list.add(new Data_show ( "“Cheers to a new year and another chance for us to get it right.”" ));


        list.add(new Data_show ( "हर साल आता है\n" +
                "हर साल जाता है\n" +
                "इस नए साल में\n" +
                "आपको वो सब मिले\n" +
                "जो आपका दिल चाहता है\n" +
                "नया साल मुबारक\n" +
                "\n" ));


        list.add(new Data_show ( "मुबारक हो तुम्हे नववर्ष का महिना,\n" +
                "चमको तुम जैसे फागुन का महिना,\n" +
                "पतझर न आये तेरी जिन्दगी में,\n" +
                "यही हैं दोस्त अपनी तम्मना" ));


        list.add(new Data_show ( "इस नए साल में जो तू चाहे वो तेरा हो\n" +
                "हरदिन खुबसूरत और राते रोशन हो\n" +
                "कमियाबीचूमती रहे तेरे कदम हमेशा यार\n" +
                "नयासाल मुबारक हो तुझे मेरे यार" ));

        list.add(new Data_show ( "आ गले लग जा मेरे यार दे दू जादू कीझप्पी दो,\n" +
                "चार ऐसे ही कट जायेज़िन्दगी विथौत एनी रिस्क\n" +
                "इस उम्मीद के साथविश यू अ वैरी हैप्पी न्यू इयर" ));


        list.add(new Data_show ( "पुराना साल सबसे हो रहा है दूर\n" +
                "पुराना साल सबसे हो रहा है दूर\n" +
                "क्या करे यही है कुदरत का दस्तूर\n" +
                "पुरानी यादे सोचकर उदास न हो तुम!\n" +
                "नया साल आया है चलो\n" +
                "‘धूम मचाले, धूम मचाले धूम!’" ));

        list.add(new Data_show ( "सुनहरी धुप बरसात के बाद\n" +
                "थोड़ी सी हंसी हर बात के बाद\n" +
                "उसी तरह हो मुबारक आपको 2020\n" +
                "2019 के बाद, विश यू अ हैप्पी न्यू इयर" ));

        list.add(new Data_show ( "Sabke dilo me ho sabke liye pyar\n" +
                "Aane wala har din laye khushiyo ka tyohar\n" +
                "Is ummeed ka saath aao bhulke saare gham\n" +
                "New year ko ham sab kare welcome" ));


        list.add(new Data_show ( "Ek – khubsurati!\n" +
                "Ek – taazgi!\n" +
                "Ek – sapna!\n" +
                "Ek – ehsaas!\n" +
                "Ek – aastha!\n" +
                "Ek – vishwas!\n" +
                "Yahi hai ek achhe saal ki shuruat!\n" +
                "Nav varsh ki hardik shubhkamnaye!" ));


        list.add(new Data_show ( "मुझे ना सर पे ताज चाहिये…\n" +
                "ना दुनिया पे राज चाहिये…!!!\n" +
                "साल 2020 मै बस इतनी हि मांग है Bhagwan से\n" +
                "कोई गरीब भुखा नही सोना चाहिए…!!!!" ));



        list.add(new Data_show ( "सोचा किसी अपने से बात करे,\n" +
                "सोचा किसी अपने से बात करे,\n" +
                "अपने किसी खास को याद करे!\n" +
                "किया जो फैसला नए साल की शुभकामनाए देनेका,\n" +
                "दिल ने कहा क्यों न शुरुआत आप से करे." ));

        list.add(new Data_show ( "नए रंग हों नयी उमंगें आँखों में उल्लास नया, नए गगन को छू लेने का मन में हो विश्वास नया, नए वर्ष में चलो पुराने मौसम का हम बदलें रंग, नयी बहारें लेकर आये जीवन में मधुमास नया. नए वर्ष हार्दिक बधाई…" ));


        list.add(new Data_show ( "इस साल आपके घर खुशियों का हो धमाल, दौलत की हो ना कमी, आप हो जाएं मालामाल सदा मुस्कुराते रहें, ऐसा हो आपका हाल, दिल से मुबारक हो आपको नया साल…" ));


        list.add(new Data_show ( "न्यू ईयर 2020 हमे तुम्हारे साथ बिताना है.\n" +
                "चलो तुम्हे किसी और ही दुनिया में ले जाना है.\n" +
                "\n" +
                " " ));



        list.add(new Data_show ( "नया साल जिंदगी में आये बार बार.\n" +
                "खुश रहे हम सभी हर बार." ));



        list.add(new Data_show ( "हर नया साल आने पर.\n" +
                "बिता हुआ साल जाता  ही है.\n" +
                "पर एक तेरा दोस्त तुझे कभी नहीं भूलता है.\n" +
                "\n" +
                " " ));



        list.add(new Data_show ( "2020 में मचानी है ढ़ेरो मस्ती.\n" +
                "शुरुआत होगी सबसे अच्छी." ));


        list.add(new Data_show ( "नया साल में मिले .\n" +
                "तुम्हे खुशियों का मेला.\n" +
                "जिंदगी चमकती रहे.\n" +
                "हर सुबह सवेरा." ));


        list.add(new Data_show ( "2020 Ka Naya Saal Aaye Ban Kar Ujala.\n" +
                "Khul Jaye Aap Ke Band Kismat Ka Tala.\n" +
                "Puri Ho Jaye Tumhari Har Manokamana.\n" +
                "Mile Tumhe Khushiyo Ka Khajana." ));


        list.add(new Data_show ( "Har Saal Aata Hai Har Saal Jata Hai.\n" +
                "Mile Aap Ko Vo Saari Chije.\n" +
                "Jo Aap Ka Man Chahta Hai." ));


        list.add(new Data_show ( "नए रंग हों नयी उमंगें आँखों में उल्लास नया\n" +
                "नए गगन को छू लेने का मन में हो विश्वास नया\n" +
                "नए वर्ष में चलो पुराने मौसम का हम बदलें रंग\n" +
                "नयी बहारें लेकर आये जीवन में मधुमास नया\n" +
                "नए वर्ष हार्दिक बधाई" ));


        list.add(new Data_show ( "सदा दूर रहो ग़म की परछाइयों से\n" +
                "सामना न हो कभी तन्हाईओं से!\n" +
                "हर अरमान हर ख्वाब पूरा हो आपका\n" +
                "यही दुआ है दिल की गहराइयों से!\n" +
                "नव वर्ष की हार्दिक शुभकामनायें!\n" ));

        list.add(new Data_show ( "ये फूल ये खुशबू ये बहार !\n" +
                "तुमको मिले ये सब उपहार !!\n" +
                "आसमा के चाँद और सितारे !\n" +
                "इन सब से तुम करो सृंगार !!\n" +
                "तुम खुश रहों आवाद रहों..\n" +
                "खुशियों का हो ऐसी फुहार !\n" +
                "हमारी ऐसी दुआ हैं हजार !!\n" +
                "दामन तुम्हारा छोटा पर जाए !\n" +
                "जीवन में मिले तुम्हे इतना प्यार !!" ));


        list.add(new Data_show ( "बीत गया जो साल, भूल जाए\n" +
                "बीत गया जो साल, भूल जाए\n" +
                "इस नए साल को गले लगाये!\n" +
                "करते है दुआ हम रब से सर झुका के\n" +
                "इस साल के सारे सपने पूरे हो आपके!\n" +
                "नव वर्ष की हार्दिक शुभकामनायें!" ));







        list.add(new Data_show ( "दस्तक दी, किसी ने कहा सपने लाया हूँ;\n" +
                "खुश रहो आप हमेशा, इतनी दुआ लाया हूँ!\n" +
                "नाम है मेरा एस सम एस,\n" +
                "आपको `हैप्पी न्यू इयर` विश करने आया हूँ\n" +
                "नव वर्ष की हार्दिक शुभकामनायें 2020\n" ));

        list.add(new Data_show ( "कबीर जी ने कहा था,\n" +
                "कल करे सों आज कर,\n" +
                "आज करे सों अब,\n" +
                "नेटवर्क फेल हो गया विश करेगा कब\n" +
                "2020 नव वर्ष की शुभकामनायें" ));




        // list.add(new Data_show ( "" ));
    }
}
