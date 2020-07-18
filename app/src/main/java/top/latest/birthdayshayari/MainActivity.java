package top.latest.birthdayshayari;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    LinearLayout ly;
    RelativeLayout relativeLayout;
    Random random=new Random (  );
    TextView txt;
    ImageView next,share,back;
    int index=0;
    Button birthday,gifts;


    private AdView mAdView,mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;



    int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        showAd ();

       // ly= (LinearLayout)  findViewById ( R.id.ly );

        birthday=(Button) findViewById ( R.id.more);
        gifts=(Button)findViewById ( R.id.gifts );
        txt=(TextView)findViewById ( R.id.txt );
        next=(ImageView) findViewById ( R.id.next );
        share=(ImageView) findViewById ( R.id.share );
        back=(ImageView) findViewById ( R.id.back );



        Resources res=getResources ();
        final String quate[]=res.getStringArray ( R.array.quates_array );
        txt.setText ( quate[0] );




        next.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if(index<quate.length-1)
                    index=index+1;
                txt.setText ( quate[index] );
            }
        } );

        share.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent share=new Intent ( Intent.ACTION_SEND );
                share.setType ( "text/plain" );
                String sub="Subject";
                // share.putExtra ( Intent.EXTRA_SUBJECT,b1 );
                share.putExtra ( Intent.EXTRA_TEXT,txt.getText (  ) );
                startActivity ( Intent.createChooser ( share,"Share Via" ) );

            }
        } );

        back.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(index>0)
                    index=index-1;
                txt.setText ( quate[index] );

            }
        } );

        gifts.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent ( MainActivity.this,ShowGifts.class );
                startActivity ( intent );
            }
        } );


        birthday.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(mPublisherInterstitialAd.isLoaded ())
                {
                    mPublisherInterstitialAd.show ();
                    mPublisherInterstitialAd.setAdListener ( new AdListener ()
                    {
                        @Override
                        public void onAdClosed() {
                            startActivity ( new Intent ( getApplicationContext (), top.latest.birthdayshayari.birthday.class ) );
                        }
                    });
                }
                else
                {
                    Intent intent = new Intent ( MainActivity.this, birthday.class );
                    startActivity ( intent );
                }
            }
        } );


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





}
