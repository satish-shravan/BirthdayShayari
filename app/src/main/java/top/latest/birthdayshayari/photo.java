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

public class photo extends AppCompatActivity {

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
        setContentView ( R.layout.activity_photo );

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



        list.add(new data (R.drawable .photo, "Photography is the story I fail to put into words."));
        list.add(new data (R.drawable .photo, "When words become unclear, I shall focus with photographs. When images become inadequate, I shall be content with silence."));
        list.add(new data (R.drawable .photo, "In photography there is a reality so subtle that it becomes more real than reality."));
        list.add(new data (R.drawable .photo,"Taking an image, freezing a moment, reveals how rich reality truly is."));
        list.add(new data (R.drawable .photo, "Photography is a way of feeling, of touching, of loving. What you have caught on film is captured forever… It remembers little things, long after you have forgotten everything."));
        list.add(new data (R.drawable .photo, "We are making photographs to understand what our lives mean to us"));
        list.add(new data (R.drawable .photo, "A thing that you see in my pictures is that I was not afraid to fall in love with these people."));
        list.add(new data (R.drawable .photo, "You don’t take a photograph. You ask quietly to borrow it."));
        list.add(new data (R.drawable .photo,"Photography for me is not looking, it’s feeling. If you can’t feel what you’re looking at, then you’re never going to get others to feel anything when they look at your pictures."));
        list.add(new data (R.drawable .photo, "A portrait is not made in the camera but on either side of it."));
        list.add(new data (R.drawable .photo, "It’s one thing to make a picture of what a person looks like, it’s another thing to make a portrait of who they are."));
        list.add(new data (R.drawable .photo, "The best thing about a picture is that it never changes, even when the people in it do"));
        list.add(new data (R.drawable .photo, "Taking pictures is like tiptoeing into the kitchen late at night and stealing Oreo cookies"));
        list.add(new data (R.drawable .photo, "To me, photography is an art of observation. It’s about finding something interesting in an ordinary place… I’ve found it has little to do with the things you see and everything to do with the way you see them."));
        list.add(new data (R.drawable .photo, "The picture that you took with your camera is the imagination you want to create with reality."));
        list.add(new data (R.drawable .photo, "If the photographer is interested in the people in front of his lens, and if he is compassionate, it’s already a lot. The instrument is not the camera but the photographer."));
        list.add(new data (R.drawable .photo, "A tear contains an ocean. A photographer is aware of the tiny moments in a persons life that reveal greater truths."));
        list.add(new data (R.drawable .photo, "The camera is an instrument that teaches people how to see without a camera."));
        list.add(new data (R.drawable .photo, "Essentially what photography is is life lit up"));
        list.add(new data (R.drawable .photo, "I don’t trust words. I trust pictures."));
        list.add(new data (R.drawable .photo, "I really believe there are things nobody would see if I didn’t photograph them."));
        list.add(new data (R.drawable .photo, "Taking pictures is savoring life intensely, every hundredth of a second."));
        list.add(new data (R.drawable .photo, "Once you learn to care, you can record images with your mind or on film. There is no difference between the two."));
        list.add(new data (R.drawable .photo, "Photograph: a picture painted by the sun without instruction in art"));
        list.add(new data (R.drawable .photo, "Photography is truth"));
        list.add(new data (R.drawable .photo, "The camera makes you forget you’re there. It’s not like you are hiding but you forget, you are just looking so much."));
        list.add(new data (R.drawable .photo, "If you see something that moves you, and then snap it, you keep a moment."));
        list.add(new data (R.drawable .photo, "There are always two people in every picture: the photographer and the viewer."));
        list.add(new data (R.drawable .photo, "A photograph is a secret about a secret. The more it tells you the less you know."));
        list.add(new data (R.drawable .photo, "The whole point of taking pictures is so that you don’t have to explain things with words."));
        list.add(new data (R.drawable .photo, "One doesn’t stop seeing. One doesn’t stop framing. It doesn’t turn off and turn on. It’s on all the time."));
        list.add(new data (R.drawable .photo, "What I like about photographs is that they capture a moment that’s gone forever, impossible to reproduce"));
        list.add(new data (R.drawable .photo, "A good photograph is one that communicates a fact, touches the heart and leaves the viewer a changed person for having seen it. It is, in a word, effective."));
        list.add(new data (R.drawable .photo, "Beauty can be seen in all things, seeing and composing the beauty is what separates the snapshot from the photograph"));
        list.add(new data (R.drawable .photo, "To me, photography is an art of observation. It’s about finding something interesting an ordinary place… I’ve found it has little to do with the things you see and everything to do with the way you see them."));
        list.add(new data (R.drawable .photo, "You don’t take a photograph, you make it."));
        list.add(new data (R.drawable .photo, "When people ask me what equipment I use – I tell them my eyes."));
        list.add(new data (R.drawable .photo, "I wish that all of nature’s magnificence, the emotion of the land, the living energy of place could be photographed."));
        list.add(new data (R.drawable .photo, "I never have taken a picture I’ve intended. They’re always better or worse."));
        list.add(new data (R.drawable .photo, "All photographs are accurate. None of them is the truth"));
        list.add(new data (R.drawable .photo, "Today everything exists to end in a photograph."));
        list.add(new data (R.drawable .photo, "I think good dreaming is what leads to good photographs."));
        list.add(new data (R.drawable .photo, "I love the people I photograph. I mean, they’re my friends. I’ve never met most of them or I don’t know them at all, yet through my images I live with them."));
        list.add(new data (R.drawable .photo, "If you want to be a better photographer, stand in front of more interesting stuff."));
        list.add(new data (R.drawable .photo, "When I say I want to photograph someone, what it really means is that I’d like to know them. Anyone I know I photograph"));
        list.add(new data (R.drawable .photo, "My life is shaped by the urgent need to wander and observe, and my camera is my passport"));
        list.add(new data (R.drawable .photo, "Look and think before opening the shutter. The heart and mind are the true lens of the camera."));
        list.add(new data (R.drawable .photo, "The camera is an excuse to be someplace you otherwise don’t belong. It gives me both a point of connection and a point of separation."));
        list.add(new data (R.drawable .photo, "Most things in life are moments of pleasure and a lifetime of embarrassment; photography is a moment of embarrassment and a lifetime of pleasure."));
        list.add(new data (R.drawable .photo, "It is more important to click with people than to click the shutter."));
        list.add(new data (R.drawable .photo, "I like to photograph anyone before they know what their best angles are."));
        list.add(new data (R.drawable .photo,"Great photography is about depth of feeling, not depth of field."));
        list.add(new data (R.drawable .photo, "Life is like a camera. Just focus on what’s important and capture the good times, develop from the negatives and if things don’t work out, just take another shot."));
        list.add(new data (R.drawable .photo,"Only photograph what you love."));







        // list.add(new Data_show ( "" ));
    }
}
