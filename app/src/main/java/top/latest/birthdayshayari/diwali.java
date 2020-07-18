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

public class diwali extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;


    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    insta_adapter adapterRecyclerLinear;

    ArrayList<data> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_diwali );

            init_ads ();

        recyclerView = findViewById ( R.id.recycler );
        recyclerView.setHasFixedSize ( true );
        layoutManager = new LinearLayoutManager ( this );
        recyclerView.setLayoutManager ( layoutManager );
        list = new ArrayList<data> ();
        adapterRecyclerLinear = new insta_adapter ( this, list );
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


        list.add(new data (R.drawable .diwali, "Diwali marks the triumph of light over darkness and good over evil, but it also is a day of service and generosity to our fellow man."));
        list.add(new data (R.drawable .diwali, "May the Divine Light of Diwali Spread into your Life Peace, Prosperity, Happiness and Good Health. Happy Deepavali"));
        list.add(new data (R.drawable .diwali, "With Gleam of Diyas, And the Echo of the Chants, May Happiness and Contentment Fill Your life ! Wishing you a very happy and prosperous Diwali !!!With Gleam of Diyas, And the Echo of the Chants, May Happiness and Contentment Fill Your life ! Wishing you a very happy and prosperous Diwali !!!"));
        list.add(new data (R.drawable .diwali, "Happy Diwali, hope the light of this festive period shines in your life forever."));
        list.add(new data (R.drawable .diwali,"As the “festival of lights,” Diwali conveys an important message that transcends religions: the necessity of doing good and bringing light to the world. I wish you all a very happy Diwali."));
        list.add(new data (R.drawable .diwali, "Unity and goodwill which embodies Diwali."));
        list.add(new data (R.drawable .diwali, "I would like to wish everyone a very Happy Diwali and a very prosperous new year."));
        list.add(new data (R.drawable .diwali, "Your Planet Needs You. Say No To Fireworks & Fumes & Celebrate An Eco-Friendly Diwali"));
        list.add(new data (R.drawable .diwali, "No Crackers, Let’S Celebrate A Pollution-Free Diwali."));
        list.add(new data (R.drawable .diwali, "Minimize The Poisonous Gasses & Maximize The Happiness. Celebrate An Eco-Friendly Diwali"));
        list.add(new data (R.drawable .diwali, "Let’S Not Forget Our Nature This Diwali, Celebrate An Eco-Friendly Diwali"));
        list.add(new data (R.drawable .diwali, "Let’S Fill Out Mind And Homes With Lights And Flowers, Not Explosives And Fumes"));
        list.add(new data (R.drawable .diwali, "Let Us Have A Smoke Free And Breathe Free Diwali"));
        list.add(new data (R.drawable .diwali, "Lets Fill Our Homes With Prayers & Light Not With Fumes & Crackers."));
        list.add(new data (R.drawable .diwali, "Let This Diwali Burn All Your Bad Times, Celebrate An Eco-Friendly Diwali!"));
        list.add(new data (R.drawable .diwali, "Green Is The New Black. Have A Eco-Friendly Diwali."));
        list.add(new data (R.drawable .diwali,"Give Out Children A Green Future. Say No To Fireworks."));
        list.add(new data (R.drawable .diwali, "Don’T Act Mean, Go Green. Celebrate An Eco Friendly Diwali This Year."));
        list.add(new data (R.drawable .diwali, "Celebrate An Environmentally Safe Diwali"));
        list.add(new data (R.drawable .diwali, "Burst Crackers If You Want To Spoil The Nature."));
        list.add(new data (R.drawable .diwali, "Gul Ne Gulshan Se Gulfam Bheja Hai, Sitaro Ne Gagan Se Salam Bheja Hai, Mubarak Ho Apko Ye DIWALI Humne Tahe Dil Se Yeh Paigam Bheja Hai."));
        list.add(new data (R.drawable .diwali, "Lakhsmi Ka Hath Ho, Saraswathi Ka Sath Ho, Ganesha Ka Niwas Ho, Aapke Jeevan Mai Prakash Hi Prakash Ho"));
        list.add(new data (R.drawable .diwali, "Diwali Ke Is Mangal Avsar Pr, Ap Sabhi Ke Manokamna Pure Ho, Khushiyan Ap K Kadam Chume, Isi Kamna Ke Saath Ap Sabhi Ko, Diwali Ki Dhero Badhaiyan."));
        list.add(new data (R.drawable .diwali, "May the beauty of the festival of lights fill your home with happiness and my the new year bring joy, peace, and prosperity in your life. Wish you and family a very Happy Diwali!!"));
        list.add(new data (R.drawable .diwali, "Wishing you a gleam of diyas, echo of holy chants, contentment and happiness today, tomorrow and forever. Have a happy and prosperous Diwali!"));
        list.add(new data (R.drawable .diwali, "Let's celebrate the festival in the true sense by spreading joy and light up the world of others. Have a happy, safe and blessed Diwali!!"));
        list.add(new data (R.drawable .diwali,"Cherish the good times and the timeless memories made with friends this Diwali. Have a lovely festive time. \nHappy Diwali!"));
        list.add(new data (R.drawable .diwali, "May the festival of joy become more beautiful for you and family. All your new ventures get success and progress. \nHappy Diwali!"));
        list.add(new data (R.drawable .diwali, "May you get prosperity and fortune on this auspicious and pious occasion of Diwali."));
        list.add(new data (R.drawable .diwali, "May this Diwali be full of wonderful moments and surprises, may your house be full of diyas and lights and your heart be full of joy. Have a wonderful Diwali!"));
        list.add(new data (R.drawable .diwali, "Let each diya you light bring a glow of happiness on your face and enlighten your soul. Happy Diwali!"));
        String str2 = "Wishing the goodness of this festive season dwells within you and stays throughout the year. Happy Diwali!!";
        list.add(new data (R.drawable .diwali, str2));
        list.add(new data (R.drawable .diwali, str2));
        list.add(new data (R.drawable .diwali,"Just like the colors of Rangoli, hope this Diwali brings fresh smiles, undiscovered avenues, different perspective and unbound happiness. Have a wonderful Diwali and a great New Year!"));
        list.add(new data (R.drawable .diwali, "Diwali is the magical time to celebrate with the ones who matter to you. I wish the merriment of this wonderful festival makes your life joyous and bright. Have a happy and blessed Diwali!"));
        list.add(new data (R.drawable .diwali, "May light triumph over darkness and good over evil. May the spirit of light illuminate your life and fill it with bliss and contentment. Have a joyous and blessed Diwali!"));
        list.add(new data (R.drawable .diwali, "May you make beautiful moments this Diwali which will be treasured by you and family forever. Have a blessed Diwali!!"));
        list.add(new data (R.drawable .diwali, "Wishing you and your family a bombastic Diwali!!! Have loads of fun and loads of masti!! Happy Diwali!!"));
        list.add(new data (R.drawable .diwali, "Rejoice on this blessed occasion by spreading joy with your friends and loved ones. Happy Diwali 2018 "));
        list.add(new data (R.drawable .diwali,"On this auspicious occasion,\nMay joy, prosperity, and happiness\nIlluminate your life and your home.\nWishing you a Happy Diwali"));
        list.add(new data (R.drawable .diwali, "I'm maachis and you’re pataka, Together we are and it will be double dhamaka!!!"));
        String str3 = "For this special time family and friends gets together for fun. Wishing laughter and fun to cheer your days, in this festive season of diwali and always...";
        list.add(new data (R.drawable .diwali, str3));
        list.add(new data (R.drawable .diwali, "An occasion to celebrate victory over defeat, light over darkness, awareness over ignorance, an occasion to celebrate life. May this auspicious occasion light up your life with happiness, joy and peace. Happy Diwali!"));
        list.add(new data (R.drawable .diwali, "May you all attain full inner illumination! May the supreme light of lights enlighten your understanding! May you all attain the inexhaustible spiritual wealth of the Self! May you all prosper gloriously on the material as well as spiritual planes!"));
        list.add(new data (R.drawable .diwali, "A warm Diwali wish for every happiness. May the warmth and splendour, that are a part of this auspicious occasion, fill your life with happiness and bright cheer, and bring to you joy and prosperity, for the whole year."));
        list.add(new data (R.drawable .diwali, "May the supreme light illumine your minds, enlighten your hearts and strengthen the human bonds in your homes and communities."));
        list.add(new data (R.drawable .diwali, "Candles to enjoy life; Decorations to light life; Presents to share success; Fire Crackers to burn evils; Sweets to sweeten success, And worship to thank god! Wish you a joyous and prosperous Diwali"));
        list.add(new data (R.drawable .diwali, str3));
        list.add(new data (R.drawable .diwali,"To all my friends and foe''s, we fought a bitter battle for a prosperous, brighter and safer India, lets take a bow....\"HAPPY DEEPAVALI\" all"));
        list.add(new data (R.drawable .diwali, "Let the Light enlighten all Hindustanis and all souls emit goodness for the country and the world."));
        list.add(new data (R.drawable .diwali, "Have a wonderful Diwali and enjoy the festival of lights.May God bless you all and keep you in good health and spirits always."));
        list.add(new data (R.drawable .diwali, "Guide all towards enlightenment,inspire all for wisdom and illumine every heart with Love\nHappy Diwali"));
        list.add(new data (R.drawable .diwali,"Happy and prosperous diwali to you and your family.Let this diwali burn all your problems and difficulties and lighten you with bright light"));
        list.add(new data (R.drawable .diwali, "May the joyous celebration\nOf this divine festival\nFill your heart with\nNever ending joy and happiness!\nHappy Diwali"));





        // list.add(new Data_show ( "" ));
    }
}
