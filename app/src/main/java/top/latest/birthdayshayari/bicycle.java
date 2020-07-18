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

public class bicycle extends AppCompatActivity {

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
        setContentView ( R.layout.activity_bicycle );

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


        list.add(new data (R.drawable .bicycle, "If you want to be happy for a day, drink.\nIf you want to be happy for a year, marry.\nIf you want to be happy for a lifetime, ride a motorcycle"));
        list.add(new data (R.drawable .bicycle, "You don't stop riding when you get old, you get old when you stop riding."));
        list.add(new data (R.drawable .bicycle, "Bikes don't leak oil, they mark their territory."));
        list.add(new data (R.drawable .bicycle, "Note to self: Never ride a motorcycle in stilettos and a miniskirt."));
        list.add(new data (R.drawable .bicycle, "I don't really feel like going for a ride today. Said no motorcycle rider ever."));
        list.add(new data (R.drawable .bicycle, "My prince charming doesn't ride a horse...he rides wheelies."));
        list.add(new data (R.drawable .bicycle, "The only thing better than a streetbike.. is a woman riding one."));
        list.add(new data (R.drawable .bicycle, "Life is not about waiting for the storms to pass: it's about learning how to ride in the rain!"));
        list.add(new data (R.drawable .bicycle, "A bike on the road is worth two in the shed."));
        list.add(new data (R.drawable .bicycle, "Four wheels move the body,\nTwo wheels move the soul."));
        list.add(new data (R.drawable .bicycle, "It wasn't until I went to college and I got my first motorcycle that I understood the thrill of speed."));
        String str2 = "I look my best when i take my helmet off after a long motorcycle ride. I have a glow and a bit of helmet hair.";
        list.add(new data (R.drawable .bicycle, str2));
        list.add(new data (R.drawable .bicycle,"Only a biker knows why a dog sticks his head out of a car window."));
        list.add(new data (R.drawable .bicycle, "There's two kinds of riders: Those who have crashed and those who will."));
        list.add(new data (R.drawable .bicycle,"The older I get, the faster I was. There are old bikers and there are bold bikers, but there are no old, bold bikers"));
        list.add(new data (R.drawable .bicycle, "I asked God for a bike, but I know God doesn't work that way. So I stole a bike and asked for forgiveness."));
        list.add(new data (R.drawable .bicycle, "You do not need a therapist if you own a motorcycle, any kind of motorcycle!"));
        list.add(new data (R.drawable .bicycle, "When I was old enough to ride a motorcycle and got my license, I bought a '69 Sportster."));
        list.add(new data (R.drawable .bicycle, "That is why, as soon as I felt a real attraction for my first passion which was the motorcycle, and in spite of the danger it could represent, they encouraged me."));
        //list.add(new data (R.drawable .bicycle, "The perfect man? A poet on a motorcycle.", "❏Faster, faster, faster, until the thrill of speed overcomes the fear of death Click to Copy!"));
        list.add(new data (R.drawable .bicycle, "Never ride faster than your guardian angel can fly"));
        list.add(new data (R.drawable .bicycle, "Animals travel on all fours. Mankind on two. Motorcycling is not a means of transport but an ideology, a nomadic way of life."));
        list.add(new data (R.drawable .bicycle, "Most motorcycle problems are caused by the nut that connects the handlebars to the saddle."));
        list.add(new data (R.drawable .bicycle, "If you don't ride in the rain, you don't ride"));
        list.add(new data (R.drawable .bicycle, "A cold hamburger can be reheated quite nicely by strapping it to an exhaust pipe and riding forty miles"));
        list.add(new data (R.drawable .bicycle, "Young riders pick a destination and go... Old riders pick a direction and go."));
        list.add(new data (R.drawable .bicycle, "I want to ride my motorcycle up the side of the Luxor to the light and vanish."));
        list.add(new data (R.drawable .bicycle, "People are more violently opposed to fur than leather because it's safer to harass rich women than motorcycle gangs."));
        list.add(new data (R.drawable .bicycle, "People are like Motorcycles: each is customized a bit differently."));
        list.add(new data (R.drawable .bicycle, "Thin leather looks good in the bar, but it won't save your butt from \"road rash\" if you go down."));
        list.add(new data (R.drawable .bicycle, "The only good view of a thunderstorm is in your rearview mirror."));
        list.add(new data (R.drawable .bicycle, "Sometimes it takes a whole tankful of fuel before you can think straight."));
        list.add(new data (R.drawable .bicycle, "Death may have no master but the bike is, most emphatically, not its slave."));
        list.add(new data (R.drawable .bicycle, "The sharpest mind often ruin their lives by overthinking the next step, while the dull win the race with eyes closed."));
        list.add(new data (R.drawable .bicycle, "Everyone crashes. Some get back on. Some don’t some can’t."));
        list.add(new data (R.drawable .bicycle, "Got in a wreck with a smart car today, its totaled my bike if fine though."));
        list.add(new data (R.drawable .bicycle, "Why cant’t a bike stand on its own? Because it is two-tired."));
        list.add(new data (R.drawable .bicycle, "Cheating is not an accident guys. Falling off a bike is an accident"));
        list.add(new data (R.drawable .bicycle, "Everyone crashes. Some get real interesting until about 150."));
        list.add(new data (R.drawable .bicycle, "Anybody can jump a motorcycle. The trouble begins when you try to land it."));
        list.add(new data (R.drawable .bicycle, "You do not need a therapist if you own a motorcycle, any kind of motorcycle."));
        list.add(new data (R.drawable .bicycle, "Do not complete with anyone in the race of life. Compete with yourself."));
        list.add(new data (R.drawable .bicycle, "I relay love to ride my motorcycle. When I want to just get away and be by myself and clear my head, that’s what i do."));
        list.add(new data (R.drawable .bicycle, str2));
        list.add(new data (R.drawable .bicycle, "You do not need a therapist if you own a motorcycle, any kind of motorcycle.\n\nAny body can jump a motorcycle. The trouble begins when you try to land it."));
        list.add(new data (R.drawable .bicycle, "My son was’t too pleased about me giving him a bath earlier. Apparently he wanted a bike for his birthday."));
        list.add(new data (R.drawable .bicycle, "Your Motorcycle never wants a night out alone with the other Motorcycles."));
        list.add(new data (R.drawable .bicycle, "In the race of life, you need self confidence, courage and faith in our abilities to win the race."));
        list.add(new data (R.drawable .bicycle, "Don’t limit your challenges. As challenge your limit."));
        list.add(new data (R.drawable .bicycle, "To live is the rarest thing in the world. Most people just exit. That’s why we ride."));
        list.add(new data (R.drawable .bicycle, "Take the journey, soar like an eagle, there are so many road to explore so little."));
        list.add(new data (R.drawable .bicycle, "No road is too long when you have good company."));
        list.add(new data (R.drawable .bicycle, "Any body can jump a motorcycle. The trouble begins when you try to land it."));
        list.add(new data (R.drawable .bicycle, str2));
        list.add(new data (R.drawable .bicycle, "Why is it to hard to find an exercise bike with a nice little basket where I can put my nachos?"));
        list.add(new data (R.drawable .bicycle,"On a bike no one ever asks, “Are we there yet?"));
        list.add(new data (R.drawable .bicycle, "That's all the motorcycle is, a system of concepts worked out in steel."));
        list.add(new data (R.drawable .bicycle, "Love is the feeling you get when you like something as much as your motorcycle."));
        list.add(new data (R.drawable .bicycle, "At the end of the day, it's still a show about guys who ride extremely fast motorcycles for a living"));
        list.add(new data (R.drawable .bicycle, "Although motorcycle riding is romantic, motorcycle maintenance is purely classic."));






        // list.add(new Data_show ( "" ));
    }
}
