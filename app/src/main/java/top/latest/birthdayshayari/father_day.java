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

public class father_day extends AppCompatActivity {

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
        setContentView ( R.layout.activity_father_day );

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



        list.add(new data (R.drawable .fathersday,"When I was a boy of fourteen, my father was so ignorant I could hardly stand to have the old man around. But when I got to be twenty-one, I was astonished at how much the old man had learned in seven years"));
        list.add(new data (R.drawable .fathersday,"Dad taught me everything I know. Unfortunately, he didn’t teach me everything he knows."));
        list.add(new data (R.drawable .fathersday, "The older I get, the smarter my father seems to get."));
        list.add(new data (R.drawable .fathersday, "Dad, you’re someone to look up to no matter how tall I’ve grown."));
        list.add(new data (R.drawable .fathersday,"A man knows when he is growing old because he begins to look like his father."));
        list.add(new data (R.drawable .fathersday, "Dads are like chocolate chip cookies; they may have chips or be totally nutty, but they are sweet and make the world a better place."));
        list.add(new data (R.drawable .fathersday,"If at first you don’t succeed, call Dad"));
        list.add(new data (R.drawable .fathersday, "Who needs a super-hero when I have you as my Dad?"));
        list.add(new data (R.drawable .fathersday, "Some people don’t believe in heroes but they haven’t met my dad!"));
        list.add(new data (R.drawable .fathersday, "Daddy, you are as smart as Ironman,\nas strong as the Hulk,\nas fast as Superman,\nas brave as Batman.\nYou are my favorite super-hero."));
        list.add(new data (R.drawable .fathersday, "I believe that what we become depends on what our fathers teach us at odd moments, when they aren’t trying to teach us. We are formed by little scraps of wisdom."));
        list.add(new data (R.drawable .fathersday, "My father gave me the greatest gift anyone could give another person, he believed in me."));
        list.add(new data (R.drawable .fathersday, "Everyone can be a father, but it takes a lot to be a dad."));
        list.add(new data (R.drawable .fathersday, "He didn’t tell me how to live; he lived, and let me watch him do it."));
        list.add(new data (R.drawable .fathersday, "FATHER: a son’s first hero... and a daughter’s first love."));
        list.add(new data (R.drawable .fathersday,"When you need real understanding, When you need someone to care, When you need someone to guide you... A father’s always there."));
        list.add(new data (R.drawable .fathersday, "Dads are most ordinary men turned by love into heroes adventurers, story-tellers, singers of songs."));
        list.add(new data (R.drawable .fathersday, "A father is neither an anchor to hold us back, nor a sail to take us there, but a guiding light whose love shows us the way."));
        list.add(new data (R.drawable .fathersday, "It is a wise father that knows his own child."));
        list.add(new data (R.drawable .fathersday, "I cannot think of any need in childhood as strong as the need for a father’s protection."));
        list.add(new data (R.drawable .fathersday, "I have found the best way to give advice to your children is to find out what they want and then advise them to do it."));
        list.add(new data (R.drawable .fathersday, "Someday I will find my Prince but my Daddy will always be my King"));
        list.add(new data (R.drawable .fathersday,"A daughter needs a dad to be the standard against which she will judge all men."));
        list.add(new data (R.drawable .fathersday, "To a father growing old, nothing is dearer than a daughter."));
        list.add(new data (R.drawable .fathersday, "It was my father who taught me to value myself. He told me that I was uncommonly beautiful and that I was the most precious thing in his life. "));
        list.add(new data (R.drawable .fathersday, "Certain is it that there is no kind of affection so purely angelic as of a father to a daughter. In love to our wives there is desire; to our sons, ambition; but to our daughters there is something which there are no words to express"));
        list.add(new data (R.drawable .fathersday, "It is admirable for a man to take his son fishing, but there is a special place in heaven for the father who takes his daughter shopping. "));
        list.add(new data (R.drawable .fathersday, "Fathers, be good to your daughters. You are the God and the weight of her world. "));
        list.add(new data (R.drawable .fathersday,"A man’s daughter is his heart. Just with feet, walking out in the world. "));
        list.add(new data (R.drawable .fathersday, "My fingers may be small but I’ve got my daddy wrapped around them."));
        list.add(new data (R.drawable .fathersday, "A father’s job isn’t to teach his daughter how to be a lady, it’s to teach her how a lady should be treated."));
        list.add(new data (R.drawable .fathersday, "Every girl dreams about living the life of a princess. I have never dreamed of that because I have always been treated like a princess by you. I love you Dad. Happy Fathers day."));
        list.add(new data (R.drawable .fathersday, "A father holds his daughter’s hand for a short while but he holds her heart forever."));
        list.add(new data (R.drawable .fathersday, "A daughter may outgrow your lap but she’ll never outgrow your heart."));
        list.add(new data (R.drawable .fathersday, "There’s nothing like being a father to a little girl. A daughter can turn the hardest man into the world’s biggest softy. A dude could be a straight up gangster, but around his little girl he becomes a teddy bear."));
        list.add(new data (R.drawable .fathersday, "My father used to play with my brother and me in the yard. Mother would come out and say, “You’re tearing up the grass.” “We’re not raising grass,” Dad would reply. “We’re raising boys."));
        list.add(new data (R.drawable .fathersday, "One father is more than a hundred schoolmasters"));
        list.add(new data (R.drawable .fathersday, "A father is someone who wants to catch you before you fall but instead picks you up, brushes you off, and lets you try again"));
        list.add(new data (R.drawable .fathersday, "Every father should remember that one day his son will follow his example instead of his advice. "));
        list.add(new data (R.drawable .fathersday, "When you teach your son, you teach your son’s son. "));
        list.add(new data (R.drawable .fathersday, "Every son’s first superhero is his father, and it was the same for me. For me, he was Superman and Batman combined."));
        list.add(new data (R.drawable .fathersday, "Small boys become big men through the influence of big men who care about small boys."));
        list.add(new data (R.drawable .fathersday, "My father didn’t tell me how to live; he lived, and let me watch him do it."));
        list.add(new data (R.drawable .fathersday, "A man never stands as tall as when he kneels to help a child. "));
        list.add(new data (R.drawable .fathersday, "The only thing better than having you as my husband is our children having you as their father."));
        list.add(new data (R.drawable .fathersday, "A man’s worth is measured by how he parents his children. What he gives them, what he keeps away from them, the lessons he teaches and the lessons he allows them to learn on their own."));
        list.add(new data (R.drawable .fathersday,"The reward of child rearing is spending the rest of your life proudly knowing this person you helped guide"));
        list.add(new data (R.drawable .fathersday,"The greatest thing a father can do for his children is love their mother.\t"));
        list.add(new data (R.drawable .fathersday, "Father! - to God himself we cannot give a holier name."));
        list.add(new data (R.drawable .fathersday, "Blessed indeed is the man who hears many gentle voices call him father!"));
        list.add(new data (R.drawable .fathersday, "Train up a child in the way which he should go and when he is old he will not depart from it."));
        list.add(new data (R.drawable .fathersday, "May God give you the grace of wit and wisdom to understand that rainbows are only the result of showers, dust, and hope..."));
        list.add(new data (R.drawable .fathersday,"A father is neither an anchor to hold us back nor a sail to take us there, but a guiding light whose love shows us the way."));
        list.add(new data (R.drawable .fathersday,"Some people don't believe in heroes, but they haven't met my dad"));
        list.add(new data (R.drawable .fathersday,"My father gave me the greatest gift anyone could give another person: he believed in me"));
        list.add(new data (R.drawable .fathersday, "Dads are most ordinary men turned by love into heroes, adventurers, storytellers, and singers of song."));
        list.add(new data (R.drawable .fathersday,"The older I get, the smarter my dad gets."));
        list.add(new data (R.drawable .fathersday, "A great man is one who leaves others at a loss after he is gone"));
        list.add(new data (R.drawable .fathersday, "Dad, my mind still talks to you. My heart still looks for you. My soul knows you are at peace."));
        list.add(new data (R.drawable .fathersday, "I'm as lucky as can be, for the world's best dad belongs to me"));
        list.add(new data (R.drawable .fathersday, "Dad, remembering you is easy, I do it every day. Missing you is the heartache that never goes away."));
        list.add(new data (R.drawable .fathersday, "Spend time with those you love. One of these days you will say either, \"I wish I had\" or \"I'm glad I did."));
        list.add(new data (R.drawable .fathersday,"My father didn't tell me how to live; he lived, and let me watch him do it"));
        list.add(new data (R.drawable .fathersday, "She did not stand alone, but what stood behind her, the most potent moral force in her life, was the love of her father."));
        list.add(new data (R.drawable .fathersday, "Daddy, did I ever tell you you're my hero?"));
        list.add(new data (R.drawable .fathersday, "A father is someone you look up to no matter how tall you grow"));
        list.add(new data (R.drawable .fathersday, "No matter how old she may be, sometimes a girl just needs her dad."));
        list.add(new data (R.drawable .fathersday, "Father and daughter, true best friends for life."));
        list.add(new data (R.drawable .fathersday, "Love your parents. We are so busy growing up, we often forget they are also growing old."));
        list.add(new data (R.drawable .fathersday, "The best thing a father can do for his children is to love their mother"));
        list.add(new data (R.drawable .fathersday, "Any man can be a father, but it takes someone special to be a dad"));
        list.add(new data (R.drawable .fathersday, "Parenthood requires love, not DNA."));





        // list.add(new Data_show ( "" ));
    }
}
