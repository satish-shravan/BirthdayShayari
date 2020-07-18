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

public class jealous extends AppCompatActivity {


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
        setContentView ( R.layout.activity_jealous );

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




        list.add(new data (R.drawable .jealous, "Jealousy is a disease, love is a healthy condition. The immature mind often mistakes one for the other, or assumes that the greater the love, the greater the jealousy - in fact, they are almost incompatible; one emotion hardly leaves room for the other."));
        list.add(new data (R.drawable .jealous, "Jealousy, that dragon which slays love under the pretence of keeping it alive. "));
        list.add(new data (R.drawable .jealous, "The thermometer of success is merely the jealousy of the malcontents. "));
        list.add(new data (R.drawable .jealous, "You can only be jealous of someone who has something you think you ought to have yourself.  "));
        list.add(new data (R.drawable .jealous,"What sort of love is permeated by jealousy? You are jealous because you are unaware that everything you need is inside you."));
        list.add(new data (R.drawable .jealous,"A competent and self-confident person is incapable of jealousy in anything. Jealousy is invariably a symptom of neurotic insecurity"));
        list.add(new data (R.drawable .jealous, "The jealous are troublesome to others, but a torment to themselves. "));
        list.add(new data (R.drawable .jealous, "The jealous are possessed by a mad devil and a dull spirit at the same time."));
        list.add(new data (R.drawable .jealous, "Jealousy is the tribute mediocrity pays to genius."));
        list.add(new data (R.drawable .jealous, "Jealousy lives upon doubts. It becomes madness or ceases entirely as soon as we pass from doubt to certainty. "));
        list.add(new data (R.drawable .jealous,"Love sees sharply, hatred sees even more sharp, but Jealousy sees the sharpest for it is love and hate at the same time."));
        list.add(new data (R.drawable .jealous, "To cure jealousy is to see it for what it is, a dissatisfaction with self"));
        list.add(new data (R.drawable .jealous, "To jealousy, nothing is more frightful than laughter."));
        list.add(new data (R.drawable .jealous, "Jealousy is that pain which a man feels from the apprehension that he is not equally beloved by the person whom he entirely loves"));
        list.add(new data (R.drawable .jealous, "Never waste jealousy on a real man:_ it is the imaginary man that supplants us all in the long run."));
        list.add(new data (R.drawable .jealous, "Jealousy in romance is like salt in food._ A little can enhance the savor, but too much can spoil the pleasure and, under certain circumstances, can be life-threatening"));
        list.add(new data (R.drawable .jealous, "O jealousy! thou magnifier of trifles."));
        list.add(new data (R.drawable .jealous, "Jealousy is the jaundice of the soul"));
        list.add(new data (R.drawable .jealous,"Jealousy is never satisfied with anything short of an omniscience that would detect the subtlest fold of the heart."));
        list.add(new data (R.drawable .jealous, "Comparison is a very foolish attitude, because each person is unique and incomparable. Once this understanding settles in you, jealousy disappears."));
        list.add(new data (R.drawable .jealous, "Jealousy would be far less torturous if we understood that love is a passion entirely unrelated to our merits."));
        list.add(new data (R.drawable .jealous, "More men die of jealousy than of cancer. "));
        list.add(new data (R.drawable .jealous, "Jealousy is not a barometer by which the depth of love can be read, it merely records the degree of the lover's insecurity."));
        list.add(new data (R.drawable .jealous,"A person in jealousy can never be happy, as his insecurity takes away that pride from him."));
        list.add(new data (R.drawable .jealous,"If you’re perfectly fit in the suit of jealousy, you’ll be happy to see if other’s don’t fit well in their own respective suits."));
        list.add(new data (R.drawable .jealous, "A jealous person can only be happy to see others in pain, no matter if his own life is going to be in vain."));
        list.add(new data (R.drawable .jealous, "Jealousy is a practice which makes you laugh on others but you don’t realize that your own life is laughing at you."));
        list.add(new data (R.drawable .jealous, "Jealousy will give you a degree named as Master In Criticism."));
        list.add(new data (R.drawable .jealous, "Jealousy makes you a part of that ugly competition, where cheat overtakes faith and hate overtakes love."));
        list.add(new data (R.drawable .jealous, "Jealousy will give you that happiness which will continue to stay as long as you see others’ unhappiness."));
        list.add(new data (R.drawable .jealous,"It is easy to become jealous about what others have but it is difficult to be happy for what yourself have."));
        list.add(new data (R.drawable .jealous, "A jealous person easily choses the wrong instead of the right, as it makes him blind and takes away the power of true judgment."));
        list.add(new data (R.drawable .jealous,"Oh God, please save me from the spirit of jealousy I will rather prefer dying."));
        list.add(new data (R.drawable .jealous, "A jealous friend is more dangerous than a competing enemy."));
        list.add(new data (R.drawable .jealous, "Life is complicated, but when jealousy takes place it becomes disastrous."));
        list.add(new data (R.drawable .jealous, "Jealousy is like a food, which you will enjoy eating at first then suffer a dehydration later."));
        list.add(new data (R.drawable .jealous, "If you really want to learn to be happy when others are in pain, then start learning the art of jealousy."));
        list.add(new data (R.drawable .jealous, "Jealousy will help you to achieve pinnacle, but in return it will take away your peace of mind."));
        list.add(new data (R.drawable .jealous, "Climbing a mountain with the highest altitude is far more easy than getting over your habit of jealousy."));
        list.add(new data (R.drawable .jealous, "Become jealous my boy, so it will help you in losing your loved ones."));
        list.add(new data (R.drawable .jealous, "Jealousy is something which eat ups your life, and make it insecure."));
        list.add(new data (R.drawable .jealous, "Jealousy is that quality where you become happy to see others fail instead of seeing your success."));
        list.add(new data (R.drawable .jealous,"A person who has excellence in jealousy, is a person who has excelled in losing his loved ones."));
        list.add(new data (R.drawable .jealous, "For a person who is filled with jealousy, the most important thing is to see others fail"));
        list.add(new data (R.drawable .jealous, "Jealousy is an art which teaches you to be happy in other’s sorrow."));
        list.add(new data (R.drawable .jealous, "Jealousy is a negative feeling that when you follow becomes the enemy of your own happiness."));
        list.add(new data (R.drawable .jealous, "The king of jealousy in the end can have everything but no one to share or talk to."));
        list.add(new data (R.drawable .jealous, "Jealousy is that kind of dirt, which starts contaminating your life, it never leaves until you were completely ruined."));
        list.add(new data (R.drawable .jealous, "Jealousy is a sea in which getting drowned seems better than swimming and sustaining."));
        list.add(new data (R.drawable .jealous, "Jealousy teaches you how to hate and fails to let you love."));
        list.add(new data (R.drawable .jealous, "Jealousy is a talent which only mean, selfish and cruel people can pursue."));
        list.add(new data (R.drawable .jealous, "I am not happy although I scored an A, but I am sad that my friend scored an A+ but I am not jealous"));
        list.add(new data (R.drawable .jealous, "Good men always pity on jealous people, whereas the stupidity of the jealous people makes them to make fun of that pity."));
        list.add(new data (R.drawable .jealous, "Don’t become jealous my dear or else you will have to face fear."));
        list.add(new data (R.drawable .jealous, "The best way to become alone, is to be jealous and lost everyone."));
        list.add(new data (R.drawable .jealous, "A jealous person can never be happy, as he ends up comparing his wealth with others till the day he dies."));
        list.add(new data (R.drawable .jealous, "Always love the people who are jealous of you, as their jealousy proves that you are better than them."));
        list.add(new data (R.drawable .jealous, "Where there is love there is no place for jealousy, and where there is jealousy there is no place for love."));
        list.add(new data (R.drawable .jealous, "Jealousy is that mindset which can make you doubt the ones you trust the most."));
        list.add(new data (R.drawable .jealous, "The more you run behind jealousy, the greater is the speed of distortion that follows."));
        list.add(new data (R.drawable .jealous, "I feel pity for people who are jealous of me, as they’re waiting for me to fail but I keep on disappointing them."));
        list.add(new data (R.drawable .jealous, "If you’re hoping to see me sad because of your jealousy then let me tell you stop hoping, Your jealousy is a sign of my success and achievements."));
        list.add(new data (R.drawable .jealous, "If you don’t have people jealous of you, then your success is truly incomplete."));
        list.add(new data (R.drawable .jealous, "Earning success is much more easier than earning jealousy."));
        list.add(new data (R.drawable .jealous, "The best way to make a jealous person feel low, is by climbing more heights and giving credit to that person as well."));
        list.add(new data (R.drawable .jealous,"You laugh at me in jealousy and I laugh at you seeing your insecurity."));
        list.add(new data (R.drawable .jealous, "If there is someone who is extremely jealous of you and always find means to bring you down then be happy, because you have achieved something great which he can’t even think about."));
        list.add(new data (R.drawable .jealous,"I still wonder how a person can come up by bringing someone down, but then I remembered the word Jealousy."));
        list.add(new data (R.drawable .jealous, "If you are jealous of someone, then get over it and get rid of it but if someone is jealous because of you then be proud of it."));
        list.add(new data (R.drawable .jealous, "For a jealous person clapping for someone’s victory is the most unbelievable thing in the world."));
        list.add(new data (R.drawable .jealous, "People are jealous of you not because you are good but because you are much better than them."));
        list.add(new data (R.drawable .jealous, "Instead of being jealous you should try to be capable enough that someone else can be jealous of you."));
        list.add(new data (R.drawable .jealous, "Jealous People criticizing you makes you more confident and capable for achieving your dreams in your life."));
        list.add(new data (R.drawable .jealous, "If you are jealous of someone’s victory it will reflect in your insecurities and incapability of achieving things"));






        // list.add(new Data_show ( "" ));
    }
}
