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

public class confused extends AppCompatActivity {


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
        setContentView ( R.layout.activity_confused );

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

        list.add(new data (R.drawable .confused,"5’2 my height but my attitude 6’1\n"));

        list.add(new data (R.drawable .confused, "I am both happy and sad at the same time, and I’m still trying to figure out how that could be"));
        list.add(new data (R.drawable .confused, "When you finally accept that it’s OK not to have answers and it’s OK not to be perfect, you realize that feeling confused is a normal part of what it is to be a human being"));
        list.add(new data (R.drawable .confused,"You can never control who you fall in love with, even when you’re in the most sad, confused time of your life. You don’t fall in love with people because they’re fun. It just happens"));
        list.add(new data (R.drawable .confused, "The most confused we ever get is when we’re trying to convince our heads of something our heart knows is a lie"));
        list.add(new data (R.drawable .confused, "When you don’t know where to start, just go to a place you miss so much."));
        list.add(new data (R.drawable .confused, "We are buried beneath the weight of information, which is being confused with knowledge; quantity is being confused with abundance and wealth with happiness"));
        list.add(new data (R.drawable .confused, "If you are sure you understand everything that is going on, you are hopelessly confused. "));
        list.add(new data (R.drawable .confused, "I freely admit I’m confused. I’m a confused and troubled individual but at the same time…It’s Free!"));
        list.add(new data (R.drawable .confused, "I have never been lost, but I will admit to being confused for several weeks."));
        list.add(new data (R.drawable .confused, "I’ve never been lost, but I was mighty turned around for three days once"));
        list.add(new data (R.drawable .confused, "When I feel a little confused, the only thing to do is to turn back to the study of nature before launching once again into the subjects closest to heart."));
        String str2 = "Confusion is the welcome mat at the door of creativity.";
        list.add(new data (R.drawable .confused, str2));
        list.add(new data (R.drawable .confused, "If you’re not confused, you’re not paying attention."));
        list.add(new data (R.drawable .confused, "At times he felt that he had almost rather not be in love with her, for it brought him no peace. What was the use of it, if it was only going to be painful?"));
        list.add(new data (R.drawable .confused, "When I feel confused or depressed, I remember back to junior high and I silently repeat, ‘This, too, shall pass."));
        String str3 = "Confusion now hath made his masterpiece!";
        list.add(new data (R.drawable .confused, str3));
        list.add(new data (R.drawable .confused, "Today, if you are not confused, you are not thinking clearly"));
        list.add(new data (R.drawable .confused, "I loved her as much as ever and I still did not know how much that was."));
        list.add(new data (R.drawable .confused,"If I’m perplexed by the fact that I’m constantly lost, maybe somewhere in my head I’ve determined that being lost serves a greater purpose than being found."));
        list.add(new data (R.drawable .confused, "What I’m not confused about is the world needing much more love, no hate, no prejudice, no bigotry and more unity, peace and understanding. Period."));
        list.add(new data (R.drawable .confused, "Whenever I’m confused about something, I ask God to reveal the answers to my questions, and he does."));
        list.add(new data (R.drawable .confused, "One moment in life you get stuck… and confused."));
        list.add(new data (R.drawable .confused,"I’m gutted and feeling a bit lost, but I’m determined to get through it."));
        list.add(new data (R.drawable .confused,"Just keep going like crazy and look back when it’s over. Otherwise you just get confused. "));
        list.add(new data (R.drawable .confused, "Someday, everything will make perfect sense. So, for now, laugh at the confusion, smile through the tears, be strong and keep reminding yourself that everything happens for a reason"));
        list.add(new data (R.drawable .confused, "Confused like small birds trap into a badminton game."));
        String str4 = "Confusion is a word we have invented for an order which is not yet understood.";
        list.add(new data (R.drawable .confused, str4));
        list.add(new data (R.drawable .confused, "You can’t follow your heart when it is more confused than your head."));
        list.add(new data (R.drawable .confused, "Most of my life I’ve had long periods of feeling down and lost. That’s why every five years or so I’ve smashed my life to pieces and started again"));
        list.add(new data (R.drawable .confused, "I’m not confused, I’m just well mixed."));
        list.add(new data (R.drawable .confused, "However, confused the scene of our life appears, however torn we may be who now do face that scene, it can be faced, and we can go on to be whole."));
        list.add(new data (R.drawable .confused, "I always make a decision, even if it’s the wrong one. I hate being confused"));
        list.add(new data (R.drawable .confused,"I am suffocated and lost when I have not the bright feeling of progression"));
        list.add(new data (R.drawable .confused, "However confused the scene of our life appears, however torn we may be who now do face that scene, it can be faced, and we can go on to be whole."));
        list.add(new data (R.drawable .confused, "I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel."));
        list.add(new data (R.drawable .confused, str4));
        list.add(new data (R.drawable .confused, str2));
        list.add(new data (R.drawable .confused, "I'm not confused, I'm just well mixed."));
        list.add(new data (R.drawable .confused, str3));
        String str5 = "When you're in love make sure you really are in love and not just in love with the idea of being in love.";
        list.add(new data (R.drawable .confused, str5));
        list.add(new data (R.drawable .confused,"Why does this boy have my heart when he doesn't even deserve it?"));
        list.add(new data (R.drawable .confused, "Romantic love is an illusion. Most of us discover this truth at the end of a love affair or else when the sweet emotions of love lead us into marriage and then turn down their flames."));
        list.add(new data (R.drawable .confused, str5));
        list.add(new data (R.drawable .confused, "Confused? Confusion is good. It’s an excellent place to learn something new from."));
        list.add(new data (R.drawable .confused,"Nothing is more confused than to be ordered into a war to die or to be maimed for life without the faintest idea of what’s going on"));
        list.add(new data (R.drawable .confused, "The dangers of not thinking clearly are much greater now than ever before. It’s not that there’s something new in our way of thinking; it’s that credulous and confused thinking can be much more lethal in ways it was never before"));
        list.add(new data (R.drawable .confused, "My perspective is the Earth will be here. It just may not be habitable to our life form. We get confused. We think we’re the center of everything"));
        list.add(new data (R.drawable .confused, "Now I’m confused. Now I don’t know what I want."));
        list.add(new data (R.drawable .confused, "Sometimes I’m confused by what I think is really obvious. But what I think is really obvious obviously isn’t obvious."));
        list.add(new data (R.drawable .confused, "Before I came here, I was confused about this subject. Having listened to your lecture I am still confused. But on a higher level."));
        list.add(new data (R.drawable .confused, "Nature is a temple in which living columns sometimes emit confused words. Man approaches it through forests of symbols, which observe him with familiar glances"));
        list.add(new data (R.drawable .confused, "Love is when two people who care for each other get confused"));
        list.add(new data (R.drawable .confused, "Without censorship, things can get terribly confused in the public mind."));
        list.add(new data (R.drawable .confused, "For I am a bear of very little brain and long words bother me"));
        list.add(new data (R.drawable .confused, "Every time a new technology comes along, we feel we’re about to break through to a place where we will not be able to recover. The advent of broadcast radio confused people. It delighted people, of course, but it also changed the world."));
        list.add(new data (R.drawable .confused, "The more you explain it, the more I don’t understand it."));
        list.add(new data (R.drawable .confused, "The little waiter’s eyebrows wandered about his forehead in confusion."));
        list.add(new data (R.drawable .confused, "It’s funny. All you have to do is say something nobody understands, and they’ll do practically anything you want them to"));
        list.add(new data (R.drawable .confused, "I was kind of confused. I thought, Well, if I get drafted, I’ll go. Everybody was very concerned with it. I had friends who went. Some that came back and some that didn’t"));
        list.add(new data (R.drawable .confused, "To be given permission to be confused — and remain confused — for as long as it takes would have been a huge gift"));
        list.add(new data (R.drawable .confused,"To cut off the confusion and accept an answer just because it’s too scary not to have an answer is a good way to get the wrong answer"));
        list.add(new data (R.drawable .confused, "History and experience tell us that moral progress comes not in comfortable and complacent times, but out of trial and confusion."));
        list.add(new data (R.drawable .confused, "We often confuse what we wish for with what is."));



        // list.add(new Data_show ( "" ));
    }
}
