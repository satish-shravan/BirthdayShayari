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

public class christmas extends AppCompatActivity {

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
        setContentView ( R.layout.activity_christmas );


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

        list.add(new data (R.drawable .christmas,"5’2 my height but my attitude 6’1\n"));

        list.add(new data (R.drawable .christmas,"That’s a wrap! Never thought this moment would arrive, but every single present is wrapped and ready!"));
        list.add(new data (R.drawable .christmas, "Jingle all the way, and all that jazz."));
        list.add(new data (R.drawable .christmas, "Stockings are my favorite … the perfectionist in me loves finding a use for a sock without a match."));
        list.add(new data (R.drawable .christmas, "Wishing you and yours a holly jolly Christmas!"));
        list.add(new data (R.drawable .christmas, "What happens under the mistletoe stays under the mistletoe\n"));
        list.add(new data (R.drawable .christmas, "Are visions of sugarplums dancing in my head? If by “sugarplums,” you mean toy wrapping and stocking filling and breakfast prepping … then yes.\n"));
        list.add(new data (R.drawable .christmas, "The children have nestled all snug in their beds … and when they wake up in three hours, they’ll be acting like terrors. But for now, let’s just savor this moment.\n"));
        list.add(new data (R.drawable .christmas, "About to settle down for a long winter’s nap. See you in the morning!\n"));
        list.add(new data (R.drawable .christmas, "Twinkle twinkle, little star. #christmastreelightsaremyfavorite"));
        list.add(new data (R.drawable .christmas, "Wishing you a magical and blissful holiday!\nHave a merry Christmas and prosperous New Year!"));
        list.add(new data (R.drawable .christmas, "May this season of giving be the start of your better life.\nHave a great and blessed holiday!"));
        list.add(new data (R.drawable .christmas, "May this Christmas season\nBrings you nothing but fond memories,\nHappiness and laughter"));
        list.add(new data (R.drawable .christmas, "Wish you all the best this holiday season\nand throughout the year,\nMerry Christmas!"));
        list.add(new data (R.drawable .christmas,"Let us forget the past and start anew,\nwishing to see you this Christmas!"));
        list.add(new data (R.drawable .christmas, "I wish this holiday season you would receive\nLove, peace and joy for the whole year,\nMerry Christmas!"));
        list.add(new data (R.drawable .christmas, "May you receive the greatest gift of all this Christmas,\nsomeone to share your life with,\nMerry Christmas!"));
        list.add(new data (R.drawable .christmas, "If I could tell Santa what to give you,\nIt would be happiness and peace\nNot just this Christmas,\nbut for the entire year"));
        list.add(new data (R.drawable .christmas,"May this Christmas be\nmore than just a season,\nbut a way of life"));
        String str2 = "May this holiday season\nbe full of surprises and cheers,\nsimply because you deserved the best";
        list.add(new data (R.drawable .christmas,str2));
        list.add(new data (R.drawable .christmas,str2));
        list.add(new data (R.drawable .christmas, "Underneath all my wrapping paper, gifts, bows, wreaths, decorations and bulbs, I send you lots of love and Christmas wishes with blessings from above."));
        list.add(new data (R.drawable .christmas, "Listen to the bells ringing, listen to the carolers singing, Christmas is coming!"));
        list.add(new data (R.drawable .christmas,"Merry Christmas! Love, Health, Wealth! Feliz Navidad! Happy Quanza! Bah Hum Bug! (Well… that should cover it.)"));
        list.add(new data (R.drawable .christmas, "Wonderful memories to be had, many reasons to be glad. Loving wishes all for you. Countless dreams you have made true. Merry Christmas!"));
        list.add(new data (R.drawable .christmas, "Sending you love, our warmest Christmas wishes and glad tiding from our family to yours. Merry Christmas and Happy Holidays!"));
        list.add(new data (R.drawable .christmas, "From one girlfriend to another: Santa Claus should be a chick. Doing all the festivities and gifts and shopping? We deserve those cookies a lot more than he does!"));
        list.add(new data (R.drawable .christmas, "This year I finished Christmas shopping early! I had my holiday cards completed and addressed, and I made homemade presents. I also learned it’s so much easier to plan these things than actually do them."));
        list.add(new data (R.drawable .christmas, "Peace on Earth. Love in our Hearts. Hope for the Future. Warmest Christmas Wishes."));
        list.add(new data (R.drawable .christmas,"Start the countdown because Santa Claus is coming to town!"));
        list.add(new data (R.drawable .christmas, "Have the best super twinkly, shiny bright festive Christmas ever! Merry Christmas!"));
        list.add(new data (R.drawable .christmas, "As the snow falls, I give you two my wishes, listen to the wind, I am blowing kisses!"));
        list.add(new data (R.drawable .christmas, "Enjoy the lights on the trees, the icicles formed on the eaves, the red hue of holly, and the love and warmth you feel surrounded by family and friends. Season’s greetings."));
        list.add(new data (R.drawable .christmas, "I have a message from all the snowmen, all the reindeer and little candy canes too: They are wishing a wonderful season from all of them to you! Merry Christmas!"));
        list.add(new data (R.drawable .christmas, "Forget your problems, forget stress – grab a drink and spread the Holiday cheers!"));
        list.add(new data (R.drawable .christmas, "This is the time of year we reflect on how lucky and blessed we are. I hope you find yourself happy, content, and reveling in the beauty of this Happy Christmas."));
        list.add(new data (R.drawable .christmas, "May the beauty, spirit, and magic of this wonderful Season live with your through the New Years. Best Wishes. Merry Christmas!"));
        list.add(new data (R.drawable .christmas, "Totally rock your Christmas this year! Party all through this awesome Season! Sing loud so the Angels get jealous! Show your gratitude by giving extra tight hugs!"));
        list.add(new data (R.drawable .christmas, "Merry Christmas to the most insane, outrageous, incredible, off-the-wall, upbeat, sparkling, vivacious, original and talented person(or people) I (or we) have ever known!"));
        list.add(new data (R.drawable .christmas, "Open the door and let them in, over the Christmas feast let the brightest smiles to be seen!"));
        list.add(new data (R.drawable .christmas,"During this spectacular holiday season, may health, hope and prosperity shine down on you and your family now and in the New Year! Happy Christmas."));
        list.add(new data (R.drawable .christmas, "My wish for you this Christmas: Make it through this beautiful, stressful time easily. Don’t let family; ornate suppers, and off-the-wall holiday demands break you. Also, I hope your wine glass never goes empty."));
         list.add(new data (R.drawable .christmas, "Hoping the presents you receive are what you wanted, but more importantly, all the love that was given with each gift is felt and shared."));
        list.add(new data (R.drawable .christmas, "Enjoy the friendships you have, and reach out to those loved ones that live far away, for distance doesn’t make or break the relationship."));
        list.add(new data (R.drawable .christmas, "Here’s to loving each moment you hear the words “Merry Christmas” and feeling the joy behind those words after each one"));
        list.add(new data (R.drawable .christmas, "May the flu pass by your door without stopping in for a visit this holiday season."));
        list.add(new data (R.drawable .christmas, "Sit down with the family and friends you love, watch a favorite movie or sing a favorite carol. Each memory is precious."));
        list.add(new data (R.drawable .christmas, "Taste the food that lays before you during your Christmas Feast. Each morsel was made with caring and love."));
        list.add(new data (R.drawable .christmas, "Find a favorite recipe, like grandma’s apple pie or your Dad’s famous green bean casserole, and make it for the family to share."));
        list.add(new data (R.drawable .christmas, "Be thankful for each moment, and make each moment one to cherish."));
        list.add(new data (R.drawable .christmas, "Sing a song that brings back memories from childhood Christmases. The spirit will be lifted along with the melody."));
        list.add(new data (R.drawable .christmas, "Spend the season with the people you choose to, living in the fellowship of those you love during this holiday season."));
        list.add(new data (R.drawable .christmas,"Read a favorite story to relive the enchanted worlds that Christmas has given birth to, whether it be ‘A Christmas Carol’ or ‘Twas The Night Before Christmas’. Enjoy the Christmas dreams"));
        list.add(new data (R.drawable .christmas, "Remember to forgive all past grievances. All feuds can be forgiven when hearts are opened through kindness."));
        list.add(new data (R.drawable .christmas, "It’s the season of the poets, time for carolers, wishing Christmas will last forever."));
        list.add(new data (R.drawable .christmas, "Safe journeys begin and end at the home. May each journey ending be a ‘merry’ beginning."));
        list.add(new data (R.drawable .christmas, "Wreaths are a symbol of the feeling each family feels during the holidays. Let every wreath you see be a reminder of the joys we all feel"));
        list.add(new data (R.drawable .christmas, "Every toy you buy is a new addition to a child’s happiness. Whether you buy one for your children or to donate, make a child’s Christmas a brighter one."));








        // list.add(new Data_show ( "" ));
    }
}
