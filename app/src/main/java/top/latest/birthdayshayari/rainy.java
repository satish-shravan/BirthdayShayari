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

public class rainy extends AppCompatActivity {
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
        setContentView ( R.layout.activity_rainy );

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




        list.add(new data (R.drawable .rainy, "Some people feel the rain. Others just get wet."));
        list.add(new data (R.drawable .rainy,"Nothing beats learning to dance in the rain."));
        list.add(new data (R.drawable .rainy, "The best thing one can do when it's raining is to let it rain.\""));
        list.add(new data (R.drawable .rainy, "Raindrops keep falling on my head."));
        list.add(new data (R.drawable .rainy, "Anyone who thinks that sunshine is pure happiness, has never danced in the rain.\""));
        list.add(new data (R.drawable .rainy, "The nicest thing about the rain is that it always stops. Eventually."));
        String str2 = "Rain showers my spirit and waters my soul.";
        list.add(new data (R.drawable .rainy, str2));
        list.add(new data (R.drawable .rainy, "Do not be angry with the rain; it simply does not know how to fall upwards"));
        list.add(new data (R.drawable .rainy, "And when it rains on your parade, look up rather than down. Without the rain, there would be no rainbow.\""));
        list.add(new data (R.drawable .rainy, "The sound of rain needs no translation."));
        list.add(new data (R.drawable .rainy,"When life gives you a rainy day, play in the puddles"));
        list.add(new data (R.drawable .rainy,"Let the rain wash away all the pain of yesterday."));
        list.add(new data (R.drawable .rainy,"I like people who smile when it's raining"));
        list.add(new data (R.drawable .rainy, "Let the rain kiss you. Let the rain beat upon your head with silver liquid drops. Let the rain sing you a lullaby"));
        list.add(new data (R.drawable .rainy, "Rain is not only drops of water. Its the love of sky for earth. They never meet each other but sends love this way.\""));
        list.add(new data (R.drawable .rainy, "Some days you just have to create your own sunshine."));
        list.add(new data (R.drawable .rainy, "Being soaked alone is cold. Being soaked with your best friend is an adventure.\""));
        String str3 = "Rainy days should be spent at home with a cup of tea and a good book.";
        list.add(new data (R.drawable .rainy, str3));
        list.add(new data (R.drawable .rainy, "Life isn't about waiting for the storm to pass. It's able learning to dance in the rain."));
        list.add(new data (R.drawable .rainy, "Rain didn't make things messy. People did that all on their own."));
        list.add(new data (R.drawable .rainy,"Rain or shine — you've got to find the beauty in every single day. That way, there's always room for your forecast to be happy and full of life."));
        list.add(new data (R.drawable .rainy,"The way I see it, if you want the rainbow, you gotta put up with the rain"));
        list.add(new data (R.drawable .rainy, "I'm singin' in the rain, just singin' in the rain"));
        list.add(new data (R.drawable .rainy, "The best thing one can do when it's raining is to let it rain."));
        list.add(new data (R.drawable .rainy, "The nicest thing about the rain is that it always stops. Eventually"));
        list.add(new data (R.drawable .rainy, "Life isn't about waiting for the storm to pass. It's about learning to dance in the rain."));
        String str4 = "Being soaked alone is cold. Being soaked with your best friend is an adventure";
        list.add(new data (R.drawable .rainy, str4));
        list.add(new data (R.drawable .rainy, str3));
        list.add(new data (R.drawable .rainy,"Rainy days are the perfect days to cuddle and watch movies"));
        list.add(new data (R.drawable .rainy,str4));
        String str5 = "The person who dances with you in the rain will most likely walk with you in the storms.";
        list.add(new data (R.drawable .rainy, str5));
        list.add(new data (R.drawable .rainy, "Even the darkest night will end and the sun will rise."));
        list.add(new data (R.drawable .rainy, "Rain is grace; rain is the sky descending to the earth; without rain, there would be no life."));
        String str6 = "And when it rains on your parade, look up rather than down. Without the rain, there would be no rainbow.";
        list.add(new data (R.drawable .rainy, str6));
        String str7 = "Let the rain kiss you. Let the rain beat upon your head with silver liquid drops. Let the rain sing you a lullaby.";
        list.add(new data (R.drawable .rainy, str7));
        list.add(new data (R.drawable .rainy, "Just know I’m right here hoping, That you’ll come in with the rain."));
        list.add(new data (R.drawable .rainy, "All was silent as before, all silent save the dripping rain."));
        list.add(new data (R.drawable .rainy, "Tears fall in my heart like the rain on the town."));
        list.add(new data (R.drawable .rainy, "The drop of rain maketh a hole in the stone, not by violence, but by oft falling."));
        list.add(new data (R.drawable .rainy, "I always like walking in the rain, so no one can see me crying."));
        list.add(new data (R.drawable .rainy, "Let a smile be your umbrella on a rainy day."));
        list.add(new data (R.drawable .rainy, str2));
        list.add(new data (R.drawable .rainy, "Thy fate is the common fate of all; Into each life, some rain must fall."));
        list.add(new data (R.drawable .rainy, "I’m singing in the rain, just singing in the rain; What a wonderful feeling, I’m happy again"));
        list.add(new data (R.drawable .rainy, "I love the rain. I want the feeling of it on my face."));
        list.add(new data (R.drawable .rainy, "I need the seasons to live to the rhythm of rain and sun."));
        list.add(new data (R.drawable .rainy, "The summer sun was not meant for boys like me. Boys like me belonged to the rain."));
        list.add(new data (R.drawable .rainy, "Like a welcome summer rain, humor may suddenly cleanse and cool the earth, the air and you."));
        list.add(new data (R.drawable .rainy, "Clouds come floating into my life, no longer to carry rain or usher storm but to add color to my sunset sky."));
        list.add(new data (R.drawable .rainy, str3));
        list.add(new data (R.drawable .rainy, "A rainy day is the perfect time for a walk in the woods."));
        list.add(new data (R.drawable .rainy, "Rainy days are perfect for cuddling up with a warm blanket, my laptop, a good book, the remote and a nice cup of something warm!"));
        list.add(new data (R.drawable .rainy,"If people were like rain, I was like drizzle and she was a hurricane."));
        list.add(new data (R.drawable .rainy, "Don’t threaten me with love, baby. Let’s just go walking in the rain."));
        list.add(new data (R.drawable .rainy, str7));
        list.add(new data (R.drawable .rainy,"The sound of the rain needs no translation."));
        list.add(new data (R.drawable .rainy, "You’re never too old to jump in the puddles and splash in the rain."));
        list.add(new data (R.drawable .rainy, "Dear Sun, I know you’re up there hiding behind the clouds. Hide and seek is over, let’s have some sunshine!"));
        list.add(new data (R.drawable .rainy, "When life gives you a rainy day… Play in the puddles."));
        list.add(new data (R.drawable .rainy, str5));
        list.add(new data (R.drawable .rainy,str6));
        list.add(new data (R.drawable .rainy, "I open up the curtains/ To hear the thunder and the rain."));
        list.add(new data (R.drawable .rainy, "I love the rain – it washes memories off the sidewalk of life."));
        list.add(new data (R.drawable .rainy, "For lonely people, rain is a chance to be touched"));
        list.add(new data (R.drawable .rainy,"Every heartache will fade away, just like every storm runs out of the rain."));
        list.add(new data (R.drawable .rainy,"The rain cools the air, calms the soul and replenishes life."));
        list.add(new data (R.drawable .rainy, "Heavy rain showers remind me of challenges in life. Never ask for a lighter rain. Instead, pray for a better umbrella."));
        list.add(new data (R.drawable .rainy,"Do not, on a rainy day, ask your child what he feels like doing, because I assure you that what he feels like doing, you won’t feel like watching."));









        // list.add(new Data_show ( "" ));
    }
}
