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

public class calm extends AppCompatActivity {
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
        setContentView ( R.layout.activity_calm );

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


        list.add(new data (R.drawable .calm, "Anxiety is love’s greatest killer. It makes others feel as you might when a drowning man holds on to you. You want to save him, but you know he will strangle you with his panic."));
        list.add(new data (R.drawable .calm, "Every time you are tempted to react in the same old way, ask if you want to be a prisoner of the past or a pioneer of the future."));
        list.add(new data (R.drawable .calm, "If you trade your authenticity for safety, you may experience the following: anxiety, depression, eating disorders, addiction, rage, blame, resentment, and inexplicable grief."));
        list.add(new data (R.drawable .calm, "The largest part of what we call ‘personality’ is determined by how we’ve opted to defend ourselves against anxiety and sadness."));
        list.add(new data (R.drawable .calm, "The only thing that could spoil a day was people. People were always the limiters of happiness except for the very few that were as good as spring itself."));
        list.add(new data (R.drawable .calm, "People become attached to their burdens sometimes more than the burdens are attached to them."));
        list.add(new data (R.drawable .calm, "People have a hard time letting go of their suffering. Out of a fear of the unknown, they prefer suffering that is familiar"));
        list.add(new data (R.drawable .calm, "Anxiety is a thin stream of fear trickling through the mind. If encouraged, it cuts a channel into which all other thoughts are drained."));
        list.add(new data (R.drawable .calm, "Nothing diminishes anxiety faster than action."));
        list.add(new data (R.drawable .calm, "Anxiety does not empty tomorrow of its sorrows, but only empties today of its strength."));
        list.add(new data (R.drawable .calm, "People tend to dwell more on negative things than on good things. So the mind then becomes obsessed with negative things, with judgments, guilt and anxiety produced by thoughts about the future and so on."));
        list.add(new data (R.drawable .calm, "Nothing can bring you peace but yourself."));
        list.add(new data (R.drawable .calm, "Do not learn how to react. Learn how to respond."));
        list.add(new data (R.drawable .calm, "You wouldn’t worry so much about what others think of you if you realized how seldom they do."));
        list.add(new data (R.drawable .calm,"You can’t always control what goes on outside. But you can always control what goes on inside.”"));
        list.add(new data (R.drawable .calm, "Choose to be optimistic. It feels better."));
        list.add(new data (R.drawable .calm,"Everything we do is infused with the energy with which we do it. If we’re frantic, life will be frantic. If we’re peaceful, life will be peaceful."));
        list.add(new data (R.drawable .calm, "Raise your words, not your voice. It is rain that grows flowers, not thunder."));
        list.add(new data (R.drawable .calm, "Look at a tree, a flower, a plant. Let your awareness rest upon it. How still they are, how deeply rooted in being. Allow nature to teach you stillness."));
        list.add(new data (R.drawable .calm,"A person who practices compassion and forgiveness has great inner strength, whereas aggression is usually a sign of weakness."));
        list.add(new data (R.drawable .calm, "In a gentle way, you can shake the world."));
        list.add(new data (R.drawable .calm, "Patience is the calm acceptance that things can happen in a different order than the one you have in mind"));
        list.add(new data (R.drawable .calm, "Anxiety’s like a rocking chair. It gives you something to do, but it doesn’t get you very far."));
        list.add(new data (R.drawable .calm, "The one who had the power to calm the elements of the earth has power to calm our souls."));
        list.add(new data (R.drawable .calm, "Feelings are just visitors, let them come and go"));
        list.add(new data (R.drawable .calm, "Anger is an acid that can do more harm to the vessel in which it is stored that anything on which it is poured."));
        list.add(new data (R.drawable .calm,"Good humor is a tonic for mind and body. It is the best antidote for anxiety and depression. It is a business asset. It attracts and keeps friends. It lightens human burdens. It is the direct route to serenity and contentment."));
        list.add(new data (R.drawable .calm, "Do not let the behavior of others destroy your inner peace."));
        list.add(new data (R.drawable .calm,"Get the inside right. The outside will fall into place."));
        list.add(new data (R.drawable .calm, "Being relaxed, at peace with yourself, confident, emotionally neutral loose, and free-floating –these are the keys to successful performance in almost everything"));
        list.add(new data (R.drawable .calm, "Remember the entrance to the sanctuary is inside you."));
        list.add(new data (R.drawable .calm, "Remain calm, serene, always in command of yourself. You will then find out how easy it is to get along"));
        list.add(new data (R.drawable .calm, "Those who act with few desires are calm, without worry or fear"));
        list.add(new data (R.drawable .calm, "Compassion, tolerance, forgiveness and a sense of self-discipline are qualities that help us lead our daily lives with a calm mind"));
        list.add(new data (R.drawable .calm, "Let peace be your middle name"));
        list.add(new data (R.drawable .calm, "Never be in a hurry, do everything quietly and in a calm spirit. Do not lose your inner peace for anything whatsoever, even if your whole world seems upset"));
        list.add(new data (R.drawable .calm, "Yesterday is ashes, tomorrow wood. Only today does the fire burn brightly. Live Today!"));
        list.add(new data (R.drawable .calm, "A smile is the beginning of peace."));
        list.add(new data (R.drawable .calm, "Only when one is connected to one’s own core is one connected to others, I am beginning to discover.  And, for me, the core, the inner spring, can best be re-found through solitude."));
        list.add(new data (R.drawable .calm, "How beautiful it is to be alive!"));
        list.add(new data (R.drawable .calm, "Freedom from desire leads to inner peace"));
        list.add(new data (R.drawable .calm,"Being relaxed, at peace with yourself, confident, emotionally neutral loose, and free-floating – these are the keys to successful performance in almost everything"));
        list.add(new data (R.drawable .calm, "It’s all about finding the calm in the chaos."));
        list.add(new data (R.drawable .calm,"Calmness is the cradle of power."));
        list.add(new data (R.drawable .calm, "I breathe in calmness, I breathe out stress."));
        list.add(new data (R.drawable .calm, "The mind is like water. When it’s turbulent, it’s difficult to see. When it’s calm, everything becomes clear."));





        // list.add(new Data_show ( "" ));
    }
}
