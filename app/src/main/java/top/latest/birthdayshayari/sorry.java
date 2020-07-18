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

public class sorry extends AppCompatActivity {


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
        setContentView ( R.layout.activity_sorry );

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




        list.add(new data (R.drawable .sorry, "I don’t like it, and I’m sorry I ever had anything to do with it"));
        list.add(new data (R.drawable .sorry, "But you know all about that, being sorry and having no words to say something when you know you should but you just can’t."));
        list.add(new data (R.drawable .sorry, "I’m not very good at saying sorry, but I apologize."));
        list.add(new data (R.drawable .sorry, "Forgiveness does not change the past, but it does enlarge the future"));
        list.add(new data (R.drawable .sorry, "I am immensely contrite. And I’m sorry for the damage I’ve done"));
        list.add(new data (R.drawable .sorry,"I felt ashamed for what I had done. I don’t have any excuses. I did what I did. I take full responsibility for myself and my actions. I wouldn’t pawn this off on anybody. I’m sorry it happened. And I Hurt people."));
        list.add(new data (R.drawable .sorry, "A sincere and warmly-expressed apology can produce the same effects as morphine on a suffering soul."));
        list.add(new data (R.drawable .sorry, "It’s very hard for me to say I’m sorry… but I do."));
        list.add(new data (R.drawable .sorry, "I have made terrible mistakes that have Hurt the people that I cared about the most, and I am terribly sorry. I am deeply ashamed of my terrible judgment and my actions."));
        String str2 = "An apology is a lovely perfume; it can transform the clumsiest moment into a gracious gift.";
        list.add(new data (R.drawable .sorry, str2));
        list.add(new data (R.drawable .sorry, "When you forgive, you free your soul. But when you say I’m sorry, you free two souls."));
        list.add(new data (R.drawable .sorry, "Be the hero of hearts; learn to say I’m sorry."));
        list.add(new data (R.drawable .sorry, "Apologies aren’t meant to change the past, they are meant to change the future."));
        list.add(new data (R.drawable .sorry, "I’m sorry.” Once again, those were the words. And now, anytime someone says I’m sorry, I’m going to think of her."));
        list.add(new data (R.drawable .sorry, "Saying sorry to someone is hard… but putting your pride down for someone is the hardest."));
        list.add(new data (R.drawable .sorry, "An apology is the superglue of life! It can repair just about anything!!"));
        list.add(new data (R.drawable .sorry, "It isn’t always to apologize for your mistakes but doing so shows a person with a strong sense of self."));
        list.add(new data (R.drawable .sorry, "Not admitting a mistake is a bigger mistake."));
        list.add(new data (R.drawable .sorry, "What is past is past, there is a future left to all men, who have the virtue to repent and the energy to atone."));
        list.add(new data (R.drawable .sorry, "I want to say to each of you, simply, and directly, I am deeply sorry for my irresponsible and selfish behavior I engaged in."));
        list.add(new data (R.drawable .sorry, "The hero isn’t the one who is right, but the one who steps forward to take the blame – deserved or not – and apologize to save a relationship."));
        list.add(new data (R.drawable .sorry, "And I felt sorry, and I have felt bad about what happened."));
        list.add(new data (R.drawable .sorry, "He who is sorry for having sinned is almost innocent"));
        list.add(new data (R.drawable .sorry, "Apologies bring people together."));
        list.add(new data (R.drawable .sorry, "I am sorry for the pain I caused you, I feel so bad."));
        list.add(new data (R.drawable .sorry, "I believe that when you’re wrong, own it and apologize, and so I do and put it on the equivalent of my front page."));
        list.add(new data (R.drawable .sorry, "Mistakes are always forgivable if one has the courage to admit them."));
        list.add(new data (R.drawable .sorry, "Chocolate says “I’m sorry” so much better than words"));
        list.add(new data (R.drawable .sorry, "In this life, when you deny someone an apology, you will remember it at time you beg forgiveness."));
        list.add(new data (R.drawable .sorry, "I’m sorry my existence is not very noble or sublime."));
        list.add(new data (R.drawable .sorry, str2));
        list.add(new data (R.drawable .sorry, "So many things that we never will undo I know you’re sorry, I’m sorry too."));
        list.add(new data (R.drawable .sorry, "True remorse is never just a regret over consequence; it is a regret over motive."));
        list.add(new data (R.drawable .sorry, "You must tell me who I might have Hurt. I have to write them an apology."));
        list.add(new data (R.drawable .sorry, "Apologies are great, but they don’t really change anything. You know what does? Action."));
        list.add(new data (R.drawable .sorry, "The first to apologize is the bravest. The first to forgive is the strongest. The first to forget is the happiest"));
        list.add(new data (R.drawable .sorry, "The only correct actions are those that demand no explanation and no apology."));
        list.add(new data (R.drawable .sorry,"Forgiveness is the sweetest revenge"));
        list.add(new data (R.drawable .sorry, "The most important trip you may take in life is meeting people halfway."));
        list.add(new data (R.drawable .sorry, "Never ruin an apology with an excuse."));
        list.add(new data (R.drawable .sorry, "Truly saying sorry is never easy to do, and when you are, you just hope it’s not too late"));
        list.add(new data (R.drawable .sorry, "More people should apologize, and more people should accept apologies when sincerely made"));
        list.add(new data (R.drawable .sorry, "Saying ‘I’m sorry’ is saying ‘I love you’ with a wounded heart in one hand and your smothered pride in the other."));
        list.add(new data (R.drawable .sorry, "When you realize you’ve made a mistake, make amends immediately. It’s easier to eat crow while it’s still warm."));
        list.add(new data (R.drawable .sorry, "I’m sorry.’ The two most inadequate words in the English language."));
        list.add(new data (R.drawable .sorry, "What I want to say is that I’m sorry. There’s no excuse for what I did. I will understand if you will never speak to me again, but I hope you will give me another chance to fix this."));
        list.add(new data (R.drawable .sorry, "Proper apologies have three parts: 1) What I did was wrong. 2) I feel bad that I Hurt you. 3) How do I make this better?"));
        list.add(new data (R.drawable .sorry, "To err is human, but contrition felt for the crime distinguishes the virtuous from the wicked."));
        list.add(new data (R.drawable .sorry,"Sometimes the best way to say “I’m sorry” doesn’t involve words"));
        list.add(new data (R.drawable .sorry, "My heart has been leaking and bleeding since the day I Hurt you. Please plug the holes with your forgiveness. I am sorry."));
        list.add(new data (R.drawable .sorry, "I have learned that sometimes SORRY is not enough. You actually have to change yourself."));
        list.add(new data (R.drawable .sorry,"I just want to tell you that I did not really know what happened to me, I’m sorry, my love."));
        list.add(new data (R.drawable .sorry, "Fools say sorry wise men will prove they are sorry."));
        list.add(new data (R.drawable .sorry, "Regret, heartbreak, and sadness have stolen my life’s happiness. I am sorry for letting you down, but I promise to erase your frowns."));
        list.add(new data (R.drawable .sorry, "Apologizing does not always mean that you’re wrong and the other person is right. It just means that you value your relationship more than your ego."));
        list.add(new data (R.drawable .sorry, "I’m sorry for being so annoying and demanding, for the things that I did the wrong way."));
        list.add(new data (R.drawable .sorry, "I’m sorry I can’t be the perfect girl you want me to, but all I can really do is try …"));
        list.add(new data (R.drawable .sorry, "I’m not perfect, I make mistakes, I Hurt people. But when I say sorry, I mean it."));
        list.add(new data (R.drawable .sorry, "Smart people always say sorry, while the stupid ones just wait for the smart one to say sorry."));
        list.add(new data (R.drawable .sorry,"By asking forgiveness your not going to become bigger or smaller in value but the person who forgives you has a very big heart"));
        list.add(new data (R.drawable .sorry, "If you wanna love someone, then make sure ur never gonna have to say “sorry”"));
        list.add(new data (R.drawable .sorry, "I trust fate and I believe in love, which is why I know you’ll accept my apology. I’m sorry."));
        list.add(new data (R.drawable .sorry, "I want you back. I’m sorry. I should have never let you go. Am I too late?"));
        list.add(new data (R.drawable .sorry, "A simple apology could fix a friendship that shouldn’t have ended in the first place. Don’t let your ego stop you from doing what’s right."));
        list.add(new data (R.drawable .sorry, "If losing you is my punishment for the things I did wrong, I would rather die than see that."));



        // list.add(new Data_show ( "" ));
    }
}
