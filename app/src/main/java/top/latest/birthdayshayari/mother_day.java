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

public class mother_day extends AppCompatActivity {


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
        setContentView ( R.layout.activity_mother_day );



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

        list.add(new data (R.drawable .mothersday, "Mama was my greatest teacher, a teacher of compassion, love and fearlessness. If love is sweet as a flower, then my mother is that sweet flower of love."));
        list.add(new data (R.drawable .mothersday, "God could not be everywhere, and therefore he made mothers."));
        list.add(new data (R.drawable .mothersday, "When my mother had to get dinner for 8 she'd just make enough for 16 and only serve half."));
        list.add(new data (R.drawable .mothersday, "I remember my mother's prayers and they have always followed me. They have clung to me all my life."));
        list.add(new data (R.drawable .mothersday, "My mother is a walking miracle."));
        list.add(new data (R.drawable .mothersday, "Children are the anchors of a mother's life."));
        list.add(new data (R.drawable .mothersday, "The most important thing a father can do for his children is to love their mother."));
        list.add(new data (R.drawable .mothersday, "If evolution really works, how come mothers only have two hands?"));
        list.add(new data (R.drawable .mothersday, "A mother is a person who seeing there are only four pieces of pie for five people, promptly announces she never did care for pie."));
        list.add(new data (R.drawable .mothersday, "Being a full-time mother is one of the highest salaried jobs... since the payment is pure love."));
        list.add(new data (R.drawable .mothersday, "A suburban mother's role is to deliver children obstetrically once, and by car forever after."));
        list.add(new data (R.drawable .mothersday, "Mothers hold their children's hands for a short while, but their hearts forever."));
        list.add(new data (R.drawable .mothersday, "All mothers are working mothers."));
        list.add(new data (R.drawable .mothersday, "A mom's hug lasts long after she lets go"));
        list.add(new data (R.drawable .mothersday, "As is the mother, so is her daughter."));
        list.add(new data (R.drawable .mothersday,  "Men are what their mothers made them."));
        list.add(new data (R.drawable .mothersday, "Most mothers are instinctive philosophers"));
        list.add(new data (R.drawable .mothersday,  "Who is getting more pleasure from this rocking, the baby or me?"));
        list.add(new data (R.drawable .mothersday,  "The heart of a mother is a deep abyss at the bottom of which you will always find forgiveness."));
        list.add(new data (R.drawable .mothersday,  "Of all the rights of women, the greatest is to be a mother."));
        list.add(new data (R.drawable .mothersday,  "No matter how old a mother is, she watches her middle-aged children for signs of improvement."));
        list.add(new data (R.drawable .mothersday,  "When you are a mother, you are never really alone in your thoughts. A mother always has to think twice, once for herself and once for her child."));
        list.add(new data (R.drawable .mothersday,  "An ounce of mother is worth a ton of priest."));
        list.add(new data (R.drawable .mothersday,  "Mother - that was the bank where we deposited all our hurts and worries."));
        list.add(new data (R.drawable .mothersday,  "Biology is the least of what makes someone a mother."));
        list.add(new data (R.drawable .mothersday,  "All that I am or ever hope to be, I owe to my angel mother."));
        list.add(new data (R.drawable .mothersday, "Motherhood: All love begins and ends there."));
        list.add(new data (R.drawable .mothersday,  "Kids don't stay with you if you do it right. It's the one job where, the better you are, the more surely you won't be needed in the long run."));
        list.add(new data (R.drawable .mothersday,  "The best place to cry is on a mother's arms."));
        list.add(new data (R.drawable .mothersday,  "The phrase 'working mother' is redundant."));
        list.add(new data (R.drawable .mothersday,  "A mother's arms are more comforting than anyone else's."));
        list.add(new data (R.drawable .mothersday, "My mother was a reader, and she read to us. She read us Dr. Jekyll and Mr. Hyde when I was six and my brother was eight; I never forgot it."));
        list.add(new data (R.drawable .mothersday,  "It's not easy being a mother. If it were easy, fathers would do it."));
        list.add(new data (R.drawable .mothersday,  "Being a mom has made me so tired. And so happy."));
        list.add(new data (R.drawable .mothersday,  "Acceptance, tolerance, bravery, compassion. These are the things my mom taught me."));
        list.add(new data (R.drawable .mothersday,  "As my mom always said, 'You'd rather have smile lines than frown lines.'"));
        list.add(new data (R.drawable .mothersday, "My mom is a hard worker. She puts her head down and she gets it done. And she finds a way to have fun. She always says, 'Happiness is your own responsibility.'"));
        list.add(new data (R.drawable .mothersday, "She drove me to ballet class…and she took me to every audition. She'd be proud of me if I was still sitting in that seat or if I was watching from home. She believes in me and that's why this [award] is for her. She's a wonderful mother."));
        list.add(new data (R.drawable .mothersday,  "[What's beautiful about my mother is] her compassion, how much she gives, whether it be to her kids and grandkids or out in the world. She's got a sparkle."));
        list.add(new data (R.drawable .mothersday,  "My mom is my hero. [She] inspired me to dream when I was a kid, so anytime anyone inspires you to dream, that's gotta be your hero."));
        list.add(new data (R.drawable .mothersday,  "If I've learned anything as a mom with a daughter who's three, I've learned that you cannot judge the way another person is raising their kid. Everybody is just doing the best they can. It's hard to be a mom."));
        list.add(new data (R.drawable .mothersday, "I would say that my mother is the single biggest role model in my life, but that term doesn't seem to encompass enough when I use it about her. She was the love of my life."));
        list.add(new data (R.drawable .mothersday,  "My mother has always been my emotional barometer and my guidance. I was lucky enough to get to have one woman who truly helped me through everything."));
        list.add(new data (R.drawable .mothersday, "Having children just puts the whole world into perspective. Everything else just disappears."));
        list.add(new data (R.drawable .mothersday,  "When you're dying laughing because your three-year-old made a fart joke, it doesn't matter what else is going on. That's real happiness."));
        list.add(new data (R.drawable .mothersday,  "Over the years, I learned so much from mom. She taught me about the importance of home and history and family and tradition."));
        list.add(new data (R.drawable .mothersday, "Motherhood is heart-exploding, blissful hysteria."));
        list.add(new data (R.drawable .mothersday,  "My mother had a slender, small body, but a large heart—a heart so large that everybody's joys found welcome in it, and hospitable accommodation."));
        list.add(new data (R.drawable .mothersday,  "It has been a terrible, horrible, no good, very bad day. My mom says some days are like that."));
        list.add(new data (R.drawable .mothersday , "Motherhood is the biggest gamble in the world. It is the glorious life force. It's huge and scary - it's an act of infinite optimism."));
        list.add(new data (R.drawable .mothersday, "She raised us with humor, and she raised us to understand that not everything was going to be great - but how to laugh through it."));
        list.add(new data (R.drawable .mothersday,  "The mother's heart is the child's schoolroom."));
        list.add(new data (R.drawable .mothersday,  "Only mothers can think of the future - because they give birth to it in their children."));
        list.add(new data (R.drawable .mothersday,  "I was always at peace because of the way my mom treated me."));
        list.add(new data (R.drawable .mothersday,  "And remember that behind every successful woman is a basket of dirty laundry."));
        list.add(new data (R.drawable .mothersday,  "When your mother asks, \"Do you want a piece of advice?\" it's a mere formality. It doesn't matter if you answer yes or no. You're going to get it anyway."));
        list.add(new data (R.drawable .mothersday, "My mother always said 'Don't bother other people.' I think that's good advice."));
        list.add(new data (R.drawable .mothersday,  "Before becoming a mother I had a hundred theories on how to bring up children. Now I have seven children and only one theory: love them, especially when they least deserve to be loved."));
        list.add(new data (R.drawable .mothersday,  "Blessed is a mother that would give up part of her soul for her children's happiness."));
        list.add(new data (R.drawable .mothersday,  "Mothers were meant to love us unconditionally, to understand our moments of stupidity, to reprimand us for lame excuses while yet acknowledging our point of view, to weep over our pain and failures as well as cry at our joy and successes, and to cheer us on despite countless start-overs. Heaven knows, no one else will."));
        list.add(new data (R.drawable .mothersday, "They are not kidding when they say that mothers are strong women. We need to be strong in more ways than our children will ever know."));
        list.add(new data (R.drawable .mothersday,  "My sister taught me everything I really need to know, and she was only in sixth grade at the time."));
        list.add(new data (R.drawable .mothersday,  "There is nothing as sincere as a mother's kiss."));
        list.add(new data (R.drawable .mothersday, "In the end, Mothers are always right. No one else tells the truth."));
        list.add(new data (R.drawable .mothersday,  "I can imagine no heroism greater than motherhood."));
        list.add(new data (R.drawable .mothersday,  "A mother's love for her child is like nothing else in the world. It knows no law, no pity, it dates all things and crushes down remorselessly all that stands in its path."));
        list.add(new data (R.drawable .mothersday, "A good mother loves fiercely but ultimately brings up her children to thrive without her."));
        list.add(new data (R.drawable .mothersday,  "Mothers possess a power beyond that of a king on his throne."));
        list.add(new data (R.drawable .mothersday, "But behind all your stories is always your mother's story, because hers is where yours begins."));
        list.add(new data (R.drawable .mothersday, "My mother once told me, when you have to make a decision, imagine the person you want to become someday. Ask yourself, what would that person do?"));





        // list.add(new Data_show ( "" ));
    }
}
