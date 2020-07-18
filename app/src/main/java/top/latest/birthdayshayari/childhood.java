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

public class childhood extends AppCompatActivity {

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
        setContentView ( R.layout.activity_childhood );

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



        list.add(new data (R.drawable .childhood, "I clearly remember that day, when we were still so young, when everything was still alright."));
        list.add(new data (R.drawable .childhood, "Sometimes, I wish I am a child again so I can be whoever I want to be in the future, I wish"));
        list.add(new data (R.drawable .childhood, "Things were so much better in the past, back when I was still a child, back when it was okay."));
        list.add(new data (R.drawable .childhood, "In each person, there is a child hidden deep inside his heart, waiting to be awakened again."));
        list.add(new data (R.drawable .childhood, "Back when we were still kids, the air was so much better, pollution was just a nightmare."));
        list.add(new data (R.drawable .childhood, "There are times when being a child was all I ever wanted to be again because it was better."));
        list.add(new data (R.drawable .childhood, "Being an adult sucks most of the times, it just freaking hurts, it just is not what I expected."));
        list.add(new data (R.drawable .childhood, "Children look at everything and see the magic, feel it and breathe it while I cannot do so."));
        list.add(new data (R.drawable .childhood, "How will you measure how great your childhood is? By how much fun you truly had."));
        list.add(new data (R.drawable .childhood, "I miss being a child and there are a lot of times that I wished that I can go back to then."));
        list.add(new data (R.drawable .childhood, "Will you turn back time and let me live my childhood once more, I was happier back then."));
        list.add(new data (R.drawable .childhood, "It is quite nice to be a child again, to be foolish, to live life the way you want to, it was okay."));
        list.add(new data (R.drawable .childhood, "Childhood is practically the most beautiful part of a person’s life, the most innocent too."));
        list.add(new data (R.drawable .childhood, "What is a childhood but a promise that has never been kept, all but broken pieces of the heart."));
        list.add(new data (R.drawable .childhood, "It was back when I was still a child that I felt what my calling was, but as I grew up, it faded."));
        list.add(new data (R.drawable .childhood, "I have always thought that things would be better once I grew up but it certainly never did."));
        list.add(new data (R.drawable .childhood, "One day, when you feel like being a child again, remember to be kind, remember to be you."));
        list.add(new data (R.drawable .childhood, "There would always be one moment in time when you want to be a child even if you cannot."));
        list.add(new data (R.drawable .childhood, "For so long, I have believed that I had it all only to find out it was all but a dream in time."));
        list.add(new data (R.drawable .childhood, "Time is playful, it speeds up when you want it to slow down, I wish I can go back to that time."));
        list.add(new data (R.drawable .childhood, "There are childhood memories that you just want to keep going back to no matter how old."));
        list.add(new data (R.drawable .childhood, "Childhood is your foundation to whom you will become in the future, treasure just that thing."));
        list.add(new data (R.drawable .childhood, "If you have a happy childhood, chances are that you will be happy when you grow up, okay?"));
        list.add(new data (R.drawable .childhood, "There would always be that moment in your childhood that defines who you soon become."));
        list.add(new data (R.drawable .childhood, "You have opened so many doors in your childhood and soon enough it will define who you are."));
        list.add(new data (R.drawable .childhood, "When you go back to your hometown, what you miss is not the town itself but your childhood."));
        list.add(new data (R.drawable .childhood, "The people in your childhood are the one that you will miss the most when you are an adult."));
        list.add(new data (R.drawable .childhood, "When you are no longer allowed to play because you are meant to conform to rules, it sucks."));
        list.add(new data (R.drawable .childhood, "Childhood is practically a heaven, it knows no person, it knows no bounds, just happiness."));
        list.add(new data (R.drawable .childhood, "I miss being a child and doing practically senseless stuff and yet having the time of my life."));
        list.add(new data (R.drawable .childhood, "We were once permitted to be crazy, to be insane but after childhood, everything else change."));
        list.add(new data (R.drawable .childhood, "The only way not to lose your childhood is to carry it with you even when you become older."));
        list.add(new data (R.drawable .childhood, "I would not join Peter Pan in Neverland, I may be attached to my childhood but not that much."));
        list.add(new data (R.drawable .childhood, "It will never be too late for you to have the best childhood, you can just redo it over again."));
        list.add(new data (R.drawable .childhood, "The memories we have in our childhood are the ones that will mark us for the rest of forever."));
        list.add(new data (R.drawable .childhood, "What makes a great person is a great foundation which to say is the childhood he has been in."));
        list.add(new data (R.drawable .childhood, "Childhood is but a short time, a fleeting moment of your life you wish you could have stayed."));
        list.add(new data (R.drawable .childhood, "The best thing about your childhood memories is that mostly, they are not yours alone."));
        list.add(new data (R.drawable .childhood, "You share your childhood with your friends and they become your friends for the rest of it."));
        list.add(new data (R.drawable .childhood, "Being a child is one of the best thing that can ever happen to a person, pure bliss is what it is."));
        list.add(new data (R.drawable .childhood, "When did we all stop being a child, when did we stop trying to become who we wanted to be?"));
        list.add(new data (R.drawable .childhood, "Children always want to grow up but when they realize they do not want that, it is too late"));
        list.add(new data (R.drawable .childhood, "Growing up sucks, you stop being the child you once were because they all tell you to grow up."));
        list.add(new data (R.drawable .childhood, "Some days, I still wish to never grow up, to keep being the child I once were, I still wish for it."));
        list.add(new data (R.drawable .childhood, "I knew of a man who carried his childhood wherever he went and he was wonderful, truly."));
        list.add(new data (R.drawable .childhood, "I am in awe of people who are still young at heart and shows it, who means it and do it."));
        list.add(new data (R.drawable .childhood, "Every child deserves a happy childhood, one they would not be sad to remember later on."));
        list.add(new data (R.drawable .childhood, "In life, there will always be a person to remind you of your childhood, so make the most of it."));
        list.add(new data (R.drawable .childhood, "Years passed by and yet all I ever thought of was my childhood, all of its delights and I love it."));
        list.add(new data (R.drawable .childhood, "The happiness never leaves me whenever I am reminiscing my childhood days, I treasure them."));
        list.add(new data (R.drawable .childhood, "I think that being a child is the best season of my life, it was the one that makes me most happy"));
        list.add(new data (R.drawable .childhood, "The best thing about childhood is that it made you wonder, it made you believe the impossible."));
        list.add(new data (R.drawable .childhood, "I miss being the child whose eyes shone brightly at the thought of seeing the simplest of things."));
        list.add(new data (R.drawable .childhood, "The saddest moment in the world is when you realize that childhood is done and you move on."));
        list.add(new data (R.drawable .childhood,"People expect us to move on from childhood, but it really is impossible to do so, you know?"));
        list.add(new data (R.drawable .childhood, "The point is that no one should ever have a childhood that he would not want to remember."));
        list.add(new data (R.drawable .childhood, "Later on, after you have a family, your children would have a life, and you have to give them the best that you can give them, give them a happy childhood."));
        list.add(new data (R.drawable .childhood, "There are still days that I wish that there would be a channel for all those old cartoons on TV."));
        list.add(new data (R.drawable .childhood, "Those childhood days were practically the best time of my life, I wish I was there right now."));
        list.add(new data (R.drawable .childhood, "Today marks the beginning of the days I would love to go back to my childhood days, sadly"));
        list.add(new data (R.drawable .childhood,"I just know that one day, I will look back at my childhood days and realize how lucky I was."));
        list.add(new data (R.drawable .childhood, "I was lucky to have loving friends even back when I was still in my childhood days that still cares for me up until now and loves me as much as I love them."));
        list.add(new data (R.drawable .childhood,"Childhood is practically being drunk where you remember nothing but all of them do."));
        list.add(new data (R.drawable .childhood, "So let us go back to when we were kids and we do things that we can laugh about today."));
        list.add(new data (R.drawable .childhood, "I miss being a child, laughing about the little things, not caring about a thing in the world."));
        list.add(new data (R.drawable .childhood,"Who know what a good childhood really is? As long as you were happy back then, it is."));
        list.add(new data (R.drawable .childhood, "I never would have thought I would come to a point in life where I would wish childhood back."));
        list.add(new data (R.drawable .childhood, "I wanted to be the person to give you strength but even as a child I had always been weak."));
        list.add(new data (R.drawable .childhood, "The us we were when we were children are still the us we are now that we are young adults."));
        list.add(new data (R.drawable .childhood, "Some habits never change, the ones that we carry from childhood still remains until now."));







        // list.add(new Data_show ( "" ));
    }
}
