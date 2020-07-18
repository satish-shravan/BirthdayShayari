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

public class selfie extends AppCompatActivity {


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
        setContentView ( R.layout.activity_selfie );

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
    @Override
    public void onBackPressed() {
        if (mPublisherInterstitialAd.isLoaded()) {
            mPublisherInterstitialAd.show();
            mPublisherInterstitialAd.setAdListener(new AdListener () {
                @Override
                public void onAdClosed() {
                    super.onAdClosed();
                    finish();
                }
            });
        }else{
            super.onBackPressed();
        }

    }


    private void linearList()
    {




        list.add(new data (R.drawable .selfie, "Sweeter than Honey.\n"));
        list.add(new data (R.drawable .selfie, "I didn’t ask to be a queen…but, hey if the crown fits?\n"));
        list.add(new data (R.drawable .selfie, "We met for a reason…Either you’re a blessing or a lesson.\n"));
        list.add(new data (R.drawable .selfie, "The smile looks good on me.\n"));
        list.add(new data (R.drawable .selfie, "Two bodies…One soul.\n"));
        list.add(new data (R.drawable .selfie, "Me and My group of friends are the funniest humans I know."));
        list.add(new data (R.drawable .selfie, "Friends are recipe to life."));
        list.add(new data (R.drawable .selfie, "Friends make life memorable."));
        list.add(new data (R.drawable .selfie, "Memories keep a song in your heart. Memories keep a song in your heart."));
        list.add(new data (R.drawable .selfie, "F.R.I.E.N.D.S Fight for you. Respect you. Include you. Encourage you. Need you. Deserve you. Stand by you.\n"));
        list.add(new data (R.drawable .selfie,"Best friends are meant to last forever."));
        list.add(new data (R.drawable .selfie, "We’re like the super friends. We’re a highly animated group."));
        list.add(new data (R.drawable .selfie, "Friendship is the only cement that will ever hold the world together."));
        list.add(new data (R.drawable .selfie, "A day spent with friends is always a day well spent"));
        list.add(new data (R.drawable .selfie, "WELCOME..Enter as guest and leave as friends.\n"));
        list.add(new data (R.drawable .selfie, "It’s the friends we meet along the way that help us appreciate the journey.\n"));
        list.add(new data (R.drawable .selfie, "Friends buy you a lunch. Best friends eat your lunch.\n"));
        list.add(new data (R.drawable .selfie, "Thank you for making me laugh.\n"));
        list.add(new data (R.drawable .selfie, "I Love The Nights I Can’t Remember With The Friends I’ll Never Forget.\n"));
        list.add(new data (R.drawable .selfie, "No man is a failure who has friends.\n"));
        list.add(new data (R.drawable .selfie, "I don’t know what’s tighter, our jeans or our friendship.\n"));
        list.add(new data (R.drawable .selfie, "I and my best friends can communicate just with…face expressions.\n"));
        list.add(new data (R.drawable .selfie,"Forever and Always.\n"));
        list.add(new data (R.drawable .selfie, "When a group of best friends meet..the humor is higher than comedy show.\n"));
        list.add(new data (R.drawable .selfie, "Do you remember the times we had? Let’s bring it back.\n"));
        list.add(new data (R.drawable .selfie, "We take photos as a return ticket to a moment otherwise gone.\n"));
        list.add(new data (R.drawable .selfie, "Best friends are the people you can do anything and nothing with and still have the best time.\n"));
        list.add(new data (R.drawable .selfie, "Truly great friends are hard to find, difficult to leave and impossible to forget.\n"));
        list.add(new data (R.drawable .selfie, "Years from now, I hope we are still in each other’s lives.\n"));
        list.add(new data (R.drawable .selfie, "Nobody really likes us except for us.\n"));
        list.add(new data (R.drawable .selfie,"True friends don’t judge each other. They judge other people..Together!\n"));
        list.add(new data (R.drawable .selfie,"I’m one of the girls that you would love to have in your group of friends.\n"));
        list.add(new data (R.drawable .selfie,"Love me now, hate me never, and best friends forever.\n"));
        list.add(new data (R.drawable .selfie,"One friend can change your whole life.\n"));
        list.add(new data (R.drawable .selfie, "Friendship isn’t a big thing it’s a million little things.\n"));
        list.add(new data (R.drawable .selfie, "True friendship is not being inseparable, it’s being separated and nothing changes.\n"));
        list.add(new data (R.drawable .selfie, "A sweet friendship refreshes the soul.\n"));
        list.add(new data (R.drawable .selfie, "A good friend knows all your stories. A best friend helped you write them.\n"));
        list.add(new data (R.drawable .selfie, "Life was meant for Best Friends and Good Adventures.\n"));
        list.add(new data (R.drawable .selfie, "I would rather walk with a friend in the dark, than alone in the light.\n"));
        list.add(new data (R.drawable .selfie, "Best Friends make good times better and hard times easier.\n"));
        list.add(new data (R.drawable .selfie, "With You, I forget all my problems. With You, Time Stands Still.\n"));
        list.add(new data (R.drawable .selfie,"A friend will always make you Smile, especially when you don’t want to..\n"));
        list.add(new data (R.drawable .selfie, "If you never had friends..you never lived life.\n"));
        list.add(new data (R.drawable .selfie, "Sometimes being with your best friend is all the therapy you need.\n"));
        list.add(new data (R.drawable .selfie, "Good friends are hard to find, harder to leave & impossible to forget.\n"));
        list.add(new data (R.drawable .selfie,"Friends are God’s way of looking after us.\n"));
        list.add(new data (R.drawable .selfie, "The only way to have a best friend is to be one.\n"));
        list.add(new data (R.drawable .selfie, "FRIENDS are the most important ingredient in the recipe of life.\n"));
        list.add(new data (R.drawable .selfie, "Side by side or miles apart, real friends are always close to the heart.\n"));
        list.add(new data (R.drawable .selfie, "Hard times will always reveal true friends.\n"));
        list.add(new data (R.drawable .selfie, "Besides chocolate, my friends are my favorite.\n"));
        list.add(new data (R.drawable .selfie, "Good friends show their love in times of trouble, not just in times of happiness.\n"));
        list.add(new data (R.drawable .selfie, "Friendship is a knot tied by angels hands.\n"));
        list.add(new data (R.drawable .selfie,"The road to a friend’s home is never long.\n"));
        list.add(new data (R.drawable .selfie, "No man is a failure who has group of friends.\n"));
        list.add(new data (R.drawable .selfie, "The ornament of a house is the friends who frequent it.\n"));
        list.add(new data (R.drawable .selfie, "Friends are people who see you the way no one else can..\n"));
        list.add(new data (R.drawable .selfie,"If friendship is your weakest point then you are the strongest person in the world.\n"));
        list.add(new data (R.drawable .selfie,"Only those who care about you can hear you when you’re quiet.\n"));
        list.add(new data (R.drawable .selfie, "Life would be so boring without my crazy friends.\n"));
        list.add(new data (R.drawable .selfie,"Unexpected friendships are the best ones.\n"));
        list.add(new data (R.drawable .selfie,"Life is short. Make each selfie look fabulous.\n"));
        list.add(new data (R.drawable .selfie, "You don’t know this new me.\n"));
        list.add(new data (R.drawable .selfie, "I like when you smile because it’s cute.\n"));
        list.add(new data (R.drawable .selfie, "There’s simply no competition, nobody can be me.\n"));
        list.add(new data (R.drawable .selfie, "I will wait for you my soul-mate because honestly, I love you.\n"));
        list.add(new data (R.drawable .selfie, "Not everyone likes me because not everyone matters.\n"));
        list.add(new data (R.drawable .selfie, "Don’t look back, you’re not going that way.\n"));
        list.add(new data (R.drawable .selfie, "Life’s big question: Is you attractive or you’re smart enough to take selfies.\n"));
        list.add(new data (R.drawable .selfie, "I am the hot dude with a cool attitude.\n"));
        list.add(new data (R.drawable .selfie, "I was born to stand out.\n"));
        list.add(new data (R.drawable .selfie, "Go big or go home.\n"));
        list.add(new data (R.drawable .selfie,"I’m a model and my agency is Instagram.\n"));
        list.add(new data (R.drawable .selfie, "I tried, you didn’t. Have fun, I’m done.\n"));
        list.add(new data (R.drawable .selfie,"I’m in love with you and all your little things.\n"));
        list.add(new data (R.drawable .selfie,"Good time and tan lines.\n"));
        list.add(new data (R.drawable .selfie, "I’m still alive but I’m barely breathing.\n"));
        list.add(new data (R.drawable .selfie, "Smile a little more, regret a little less.\n"));
        list.add(new data (R.drawable .selfie,"The beach is calling, I must go.."));
        list.add(new data (R.drawable .selfie,"The sea lives in every one of us."));
        list.add(new data (R.drawable .selfie, "A pineapple a day keeps the worries away."));
        list.add(new data (R.drawable .selfie, "Here comes the sun"));
        list.add(new data (R.drawable .selfie, "Sleep. Work. Train. Repeat."));
        list.add(new data (R.drawable .selfie, "Pain is temporary, pride is forever"));
        list.add(new data (R.drawable .selfie, "When my body shouts ‘STOP’, my mind screams ‘NEVER’."));
        list.add(new data (R.drawable .selfie,"Train like a beast, look like a beauty."));
        list.add(new data (R.drawable .selfie, "The last three or four reps is what makes the muscle grow. This area of pain divides the champion from someone else who is not a champion."));
        list.add(new data (R.drawable .selfie, "Winners Train, Losers Complain."));
        list.add(new data (R.drawable .selfie,"The hardest lift of all is lifting your butt off the couch."));
        list.add(new data (R.drawable .selfie,"Get ripped, get laid"));
        list.add(new data (R.drawable .selfie, "Pain is weakness leaving the body"));
        list.add(new data (R.drawable .selfie, "Being defeated is often a temporary condition. Giving up is what makes it permanent."));
        list.add(new data (R.drawable .selfie, "Failure is only a temporary change in direction to set you straight for your next success."));
        list.add(new data (R.drawable .selfie, "Fitness is not about being better than someone else, it’s about being better than you used to be."));
        list.add(new data (R.drawable .selfie,"If you fail to prepare, you prepare to failIf you fail to train, you train to fail."));
        list.add(new data (R.drawable .selfie,"Weights before dates."));
        list.add(new data (R.drawable .selfie, "When it starts to hurt, that’s when the set starts."));
        list.add(new data (R.drawable .selfie,"Doubt me, hate me, you’re the inspiration I need"));
        list.add(new data (R.drawable .selfie,"Hard work beats talent when talent doesn’t work hard."));
        list.add(new data (R.drawable .selfie, "Build your body, build your character"));
        list.add(new data (R.drawable .selfie, "I’m not on steroids, but thanks for asking…"));
        list.add(new data (R.drawable .selfie,"When the going gets tough the tough gets going\n"));
        list.add(new data (R.drawable .selfie, "Rise & Grind"));
        list.add(new data (R.drawable .selfie, "You can’t flex fat so shut up and lift."));
        list.add(new data (R.drawable .selfie,"With great size comes great responsibility"));
        list.add(new data (R.drawable .selfie, "Go hard or go home."));
        list.add(new data (R.drawable .selfie, "To achieve something you’ve never had before, you must do something you’ve never done before."));
        list.add(new data (R.drawable .selfie, "In training, you listen to your body. In competition, you tell your body to shut up."));
        list.add(new data (R.drawable .selfie, "When you have a clear vision of your goal, it’s easier to take the first step toward it."));
        list.add(new data (R.drawable .selfie, "Ability is limitless. Be more| Do more"));
        list.add(new data (R.drawable .selfie, "Even if you fail on your face. You’re still moving forward."));
        list.add(new data (R.drawable .selfie, "There’s no secret formula. I lift heavy, work hard, and aim to be the best."));
        String str2 = "You don’t always get what you wish for but you always get what you work for.";
        list.add(new data (R.drawable .selfie, str2));
        list.add(new data (R.drawable .selfie, "One of the greatest moment in life is realizing that two weeks ago, your body couldn’t do what it just did"));
        list.add(new data (R.drawable .selfie,str2));
        list.add(new data (R.drawable .selfie, "The greatest pleasure in life is doing what people say you cannot do."));
        list.add(new data (R.drawable .selfie, "There comes a certain point in life when you have to stop blaming other people for how you feel or the misfortunes in your life. You can’t go through life obsessing about what might have been."));
        list.add(new data (R.drawable .selfie, "Most people give up right before the big break comes—don’t let that person be you."));
        list.add(new data (R.drawable .selfie, "Sweat is just fat crying"));
        list.add(new data (R.drawable .selfie, "Sweat + Sacrifice = Success."));
        list.add(new data (R.drawable .selfie,"Some people dream of success, while I wake up and train hard at it."));
        list.add(new data (R.drawable .selfie, "Don’t wait for inspiration, be the inspiration."));
        list.add(new data (R.drawable .selfie, "Keep calm and lift that shit."));
        list.add(new data (R.drawable .selfie, "For me, life is continuously being hungry. The meaning of life is not simply to exist, to survive, But to move ahead, to go up, to achieve, to conquer."));
        list.add(new data (R.drawable .selfie,"The tan lines will fade but the memories won’t."));
        list.add(new data (R.drawable .selfie, "I think it’s time for a trip to the beach"));
        list.add(new data (R.drawable .selfie, "In the waves of change we find our direction."));
        list.add(new data (R.drawable .selfie, "The sun and the sand and a drink in my hand"));
        list.add(new data (R.drawable .selfie, "Namast’ay at the beach"));
        list.add(new data (R.drawable .selfie, "The ocean roar is music to the soul."));
        list.add(new data (R.drawable .selfie, "My dreams are made of sand and waves"));
        list.add(new data (R.drawable .selfie, "Let the currents guide your heart."));
        list.add(new data (R.drawable .selfie, "I followed my heart, it leads me to the Beach."));
        list.add(new data (R.drawable .selfie,"The beach is always a good idea"));
        list.add(new data (R.drawable .selfie, "Positive mind, Postive vibes, Positive life."));
        list.add(new data (R.drawable .selfie,"Even castles made from sand fall to the ocean."));
        list.add(new data (R.drawable .selfie,"Every season is bikini season"));
        list.add(new data (R.drawable .selfie,"I need vitamin Sea."));
        list.add(new data (R.drawable .selfie, "Seas the Day!"));
        list.add(new data (R.drawable .selfie, "Tropic like its hot."));
        list.add(new data (R.drawable .selfie, "Resting Beach Face."));
        list.add(new data (R.drawable .selfie, "Aquaholic."));
        list.add(new data (R.drawable .selfie, "If there’s a will, there’s a wave."));
        list.add(new data (R.drawable .selfie, "Shell we dance?"));
        list.add(new data (R.drawable .selfie,"Beach life is shore perfect."));
        list.add(new data (R.drawable .selfie, "Adios beaches!"));
        list.add(new data (R.drawable .selfie, "Water we doing here?"));
        list.add(new data (R.drawable .selfie, "Beach you to it."));
        list.add(new data (R.drawable .selfie,"You used to call me on my shellphone."));
        list.add(new data (R.drawable .selfie, "The beach gives me porpoise."));
        list.add(new data (R.drawable .selfie, "Water we waiting for!"));
        list.add(new data (R.drawable .selfie, "Let the sea set you free."));
        list.add(new data (R.drawable .selfie, "An ocean breeze puts the mind at ease."));
        list.add(new data (R.drawable .selfie, "Let the waves hit your feet and the sand be your seat."));
        list.add(new data (R.drawable .selfie,"Sandy toes. Sunkissed nose."));
        list.add(new data (R.drawable .selfie, "Don’t need a man if you’ve got a tan."));
        list.add(new data (R.drawable .selfie, "You, me, a drink and the sea."));
        list.add(new data (R.drawable .selfie, "The sun and the sand and a drink in my hand."));
        list.add(new data (R.drawable .selfie, "Gone to the beach. Be back never."));
        list.add(new data (R.drawable .selfie, "I’ll have a side of beach with my morning coffee."));
        list.add(new data (R.drawable .selfie, "Currently pretending I’m at the beach."));
        list.add(new data (R.drawable .selfie, "Life, love, and the pursuit of the next beach trip."));
        list.add(new data (R.drawable .selfie, "Life is a beach, I’m just playing in the sand."));


        // list.add(new Data_show ( "" ));
    }
}
