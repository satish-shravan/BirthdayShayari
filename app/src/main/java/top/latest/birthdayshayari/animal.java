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

public class animal extends AppCompatActivity {

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
        setContentView ( R.layout.activity_animal );


      //  init_ads ();
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


        list.add(new data (R.drawable.animal, "Animals are my friends, and I don’t eat my friends."));
        list.add(new data (R.drawable.animal,"The love for all living creatures is the most noble attribute of man."));
        list.add(new data (R.drawable.animal, "A dog is the only thing on earth that will love you more than you love yourself."));
        list.add(new data (R.drawable.animal, "I am a huge animal lover. I prefer to rescue any of the pets that I have had."));
        list.add(new data (R.drawable.animal, "I don’t believe in the concept of hell, but if I did I would think of it as filled with people who were cruel to animals."));
        list.add(new data (R.drawable.animal, "There are two means of refuge from the miseries of life: music and cats."));
        list.add(new data (R.drawable.animal, "No matter how little money and how few possessions you own, having a dog makes you rich"));
        list.add(new data (R.drawable.animal, "Animal lovers are a special breed of humans, generous of spirit, full of empathy, perhaps a little prone to sentimentality, and with hearts as big as a cloudless sky.   "));
        list.add(new data (R.drawable.animal, "We can judge the heart of a man by his treatment of animals."));
        list.add(new data (R.drawable.animal, "Happiness is a warm puppy."));
        list.add(new data (R.drawable.animal, "Dogs never bite me. Just humans."));
        list.add(new data (R.drawable.animal, "The clearest way into the Universe is through a forest wilderness."));
        list.add(new data (R.drawable.animal, "The greatness of a nation and its moral progress can be judged by the way its animals are treated."));
        list.add(new data (R.drawable.animal, "Man is the cruelest animal."));
        list.add(new data (R.drawable.animal, "Some people talk to animals. Not many listen though. That's the problem."));
        list.add(new data (R.drawable.animal, "A dog is the only thing on earth that loves you more than he loves himself."));
        list.add(new data (R.drawable.animal, "Heaven goes by favor. If it went by merit, you would stay out and your dog would go in."));
        list.add(new data (R.drawable.animal, "All his life he tried to be a good person. Many times, however, he failed."));
        list.add(new data (R.drawable.animal, "For after all, he was only human. He wasn't a dog."));
        list.add(new data (R.drawable.animal, "The dog is a gentleman; I hope to go to his heaven not man's."));
        list.add(new data (R.drawable.animal, "Animals don't hate, and we're supposed to be better than them."));
        list.add(new data (R.drawable.animal, "The more I learn about people, the more I like my dog."));
        list.add(new data (R.drawable.animal, "I have studied many philosophers and many cats. The wisdom of cats is infinitely superior."));
        list.add(new data (R.drawable.animal,"An animal's eyes have the power to speak a great language."));
        list.add(new data (R.drawable.animal, "Whoever said you can't buy Happiness forgot little puppies"));
        list.add(new data (R.drawable.animal, "Animals don’t lie. Animals don’t criticize. If animals have moody days, they handle them better than humans do."));
        list.add(new data (R.drawable.animal, "Humanity's true moral test, its fundamental test…consists of its attitude towards those who are at its mercy: animals."));
        list.add(new data (R.drawable.animal, "If having a soul means being able to feel love and loyalty and gratitude, then animals are better off than a lot of humans."));
        list.add(new data (R.drawable.animal, "The animals of the world exist for their own reasons. They were not made for humans any more than black people were made for white, or women created for men"));
        list.add(new data (R.drawable.animal, "I think I could turn and live with the animals, they are so placid and self contained;"));
        list.add(new data (R.drawable.animal, "Animals are such agreeable friends―they ask no questions, they pass no criticisms"));
        list.add(new data (R.drawable.animal, "Animals are reliable, many full of love, true in their affections, predictable in their actions, grateful and loyal. Difficult standards for people to live up to."));
        list.add(new data (R.drawable.animal, "Clearly, animals know more than we think, and think a great deal more than we know."));
        list.add(new data (R.drawable.animal, "Animals are born who they are, accept it, and that is that. They live with greater peace than people do."));
        list.add(new data (R.drawable.animal, "Besides love and sympathy, animals exhibit other qualities connected with the social instincts which in us would be called moral."));
        list.add(new data (R.drawable.animal, "Outside of a dog, a book is man's best friend. Inside of a dog it's too dark to read."));
        list.add(new data (R.drawable.animal, "Such short little lives our pets have to spend with us, and they spend most of it waiting for us to come home each day."));
        list.add(new data (R.drawable.animal, "Petting, scratching, and cuddling a dog could be as soothing to the mind and heart as deep meditation and almost as good for the soul as prayer."));
        list.add(new data (R.drawable.animal, "I am in favor of animal rights as well as human rights. That is the way of a whole human being"));
        list.add(new data (R.drawable.animal, "Until one has loved an animal, a part of one’s soul remains unawakened."));
        list.add(new data (R.drawable.animal, "Dogs are our link to paradise. They don’t know evil or jealousy or discontent."));
        list.add(new data (R.drawable.animal,"The ideal of calm exists in a sitting cat."));
        list.add(new data (R.drawable.animal, "Learn a lesson from your dog- NO matter what life brings you, kick some grass over that shit and move on."));
        list.add(new data (R.drawable.animal, "You’ll never get the dog that you want, you’ll always get the dog that you need."));
        list.add(new data (R.drawable.animal, "Dogs have a way of finding the people who need them and filling an emptiness we didn’t even know we had."));
        list.add(new data (R.drawable.animal, "The best therapist has fur and four legs."));

        // list.add(new Data_show ( "" ));
    }
}
