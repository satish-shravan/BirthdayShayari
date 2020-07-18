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

public class style extends AppCompatActivity {


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
        setContentView ( R.layout.activity_style );


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




        list.add(new data (R.drawable .style, "You can never be overdressed or overeducated"));
        list.add(new data (R.drawable .style, "I often take a brand new suit or hat and throw it up against the wall a few times to get that stiff, square newness out of it."));
        list.add(new data (R.drawable .style, "You don’t find a style. A style finds you."));
        list.add(new data (R.drawable .style, "To achieve the nonchalance, which is absolutely necessary for a man, one article at least must not match."));
        list.add(new data (R.drawable .style, "Fashions fade, style is eternal."));
        list.add(new data (R.drawable .style,"Every man should have a magnifying mirror. If you look good magnified, you are set to go"));
        list.add(new data (R.drawable .style, "Shoes transform your body language and attitude. They lift you physically and emotionally"));
        list.add(new data (R.drawable .style, "Simplicity is the ultimate sophistication"));
        list.add(new data (R.drawable .style, "Know first who you are, and then adorn yourself accordingly"));
        list.add(new data (R.drawable .style, "People always ask me what the latest fashion trends are, but I’m not a believer in trends. Individuality is more important to me, to stand out and have the confidence to wear something you’re comfortable in – it just happens. I’m comfortable wearing a suit"));
        list.add(new data (R.drawable .style, "Whoever said that money can’t buy happiness, simply didn’t know where to go shopping."));
        list.add(new data (R.drawable .style, "Putting on a beautifully designed suit elevates my spirit, extols my sense of self, and helps define me as a man to whom details matter"));
        list.add(new data (R.drawable .style, "Fashion is what you adopt when you don’t know who you are."));
        list.add(new data (R.drawable .style, "If you can’t be better than your competition, just dress better"));
        list.add(new data (R.drawable .style, "If people turn to look at you on the street, you are not well dressed, but either too stiff, too tight, or too fashionable."));
        list.add(new data (R.drawable .style, "Anyone can be confident with a full head of hair. But a confident bald man – there’s your diamond in the rough."));
        list.add(new data (R.drawable .style,"Fashion is what you’re offered four times a year by designers. And style is what you choose"));
        list.add(new data (R.drawable .style, "Clothes mean nothing until someone lives in them."));
        list.add(new data (R.drawable .style, "Fashion is not necessarily about labels. It’s not about brands. It’s about something else that comes from within you."));
        list.add(new data (R.drawable .style, "To be noticed without striving to be noticed, this is what elegance is about."));
        list.add(new data (R.drawable .style, "Style is knowing who you are, what you want to say, and not giving a damn."));
        list.add(new data (R.drawable .style, "The difference between style and fashion is quality."));
        list.add(new data (R.drawable .style, "People will stare. Make it worth their while."));
        list.add(new data (R.drawable .style, "Good grooming is integral and impeccable style is a must. If you don’t look the part, no one will want to give you time or money"));
        list.add(new data (R.drawable .style, "It is both delusional and stupid to think that clothes don’t really matter and we should all wear whatever we want. Most people don’t take clothing seriously enough, but whether we should or not, clothes do talk to us and we make decisions based on people’s appearances."));
        list.add(new data (R.drawable .style, "Black is modest and arrogant at the same time. Black is lazy and easy – but mysterious. But above all black says this: ‘I don’t bother you – don’t bother me."));
        list.add(new data (R.drawable .style, "A man should look as if he has bought his clothes with intelligence, put them on with care and then forgotten all about them."));
        list.add(new data (R.drawable .style, "Anyone can get dressed up and glamorous, but it is how people dress in their days off that are the most intriguing."));
        list.add(new data (R.drawable .style, "Create your own visual style… Let it be unique for yourself and yet identifiable for others"));
        list.add(new data (R.drawable .style, "Dress like you’ve made something of yourself in the world, even if you haven’t."));
        list.add(new data (R.drawable .style, "Style is the answer to everything. A fresh way to approach a dull or dangerous thing. To do a dull thing with style is preferable to doing a dangerous thing without it. To do a dangerous thing with style is what I call art"));
        list.add(new data (R.drawable .style, "Style is the perfection of a point of view"));
        list.add(new data (R.drawable .style, "Fashion should be a form of escapism, and not a form of imprisonment."));
        list.add(new data (R.drawable .style, "Men with style are great because they have a sense of self."));
        list.add(new data (R.drawable .style, "The style of studied nonchalance is the psychological triumph of grace over order."));
        list.add(new data (R.drawable .style, "I can go all over the world with just three outfits: a blue blazer and grey flannel pants, a grey flannel suit, and black tie."));
        list.add(new data (R.drawable .style, "All it takes are a few simple outfits. And there’s one secret – the simpler the better."));
        list.add(new data (R.drawable .style, "Men tell me that I’ve saved their marriages. It costs them a fortune in shoes, but it’s cheaper than a divorce."));
        list.add(new data (R.drawable .style, "The well-dressed man is he whose clothes you never notice"));
        list.add(new data (R.drawable .style,"Hair is the first thing. And teeth the second. Hair and teeth. A man got those two things he’s got it all."));
        list.add(new data (R.drawable .style, "Clothes make the man. Naked people have little or no influence on society"));
        list.add(new data (R.drawable .style, "Every generation laughs at the old fashions, but follows religiously the new."));
        list.add(new data (R.drawable .style, "Elegance is not standing out, but being remembered"));
        list.add(new data (R.drawable .style, "Fashion is a form of ugliness so intolerable that we have to alter it every six months."));
        list.add(new data (R.drawable .style, "My style – it’s black and it’s expensive."));
        list.add(new data (R.drawable .style, "A fashion is nothing but an induced epidemic"));
        list.add(new data (R.drawable .style, "Make it simple, but significant"));
        list.add(new data (R.drawable .style,"Looking good isn’t self-importance; it’s self-respect"));
        list.add(new data (R.drawable .style, "I think in black"));
        list.add(new data (R.drawable .style, "Like every good man, I strive for perfection, and, like every ordinary man, I have found that perfection is out of reach – but not the perfect suit."));
        list.add(new data (R.drawable .style,"Style is primarily a matter of instinct"));
        list.add(new data (R.drawable .style, "A well-tied tie is the first serious step in life"));
        list.add(new data (R.drawable .style,"Some of the worst mistakes in my life were haircuts."));
        list.add(new data (R.drawable .style, "Clothes and manners do not make the man; but when he is made, they greatly improve his appearance"));
        list.add(new data (R.drawable .style, "Never wear anything that panics the cat"));
        list.add(new data (R.drawable .style,"Dressing well is a form of good manners."));
        list.add(new data (R.drawable .style, "Style is a way to say who you are without having to speak."));
        list.add(new data (R.drawable .style, "Fashion is an art. You express who you are through what you’re wearing."));
        list.add(new data (R.drawable .style, "To me, clothing is a form of self-expression – there are hints about who you are in what you wear"));





        // list.add(new Data_show ( "" ));
    }
}
