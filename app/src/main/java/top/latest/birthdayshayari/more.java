package top.latest.birthdayshayari;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

public class more extends AppCompatActivity {

    //ads
    private AdView mAdView, mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;

    CardView birthday, love, status,night,morning,motivation,prg_quote,hindi,app;
    TextView caption;

    CardView new_year,chrismas,friendship,dard,attitude,new_night;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_more );



        motivation=(CardView) findViewById ( R.id.motivation);
        birthday = (CardView) findViewById ( R.id.birthday );
        love = (CardView) findViewById ( R.id.love );
        status = (CardView) findViewById ( R.id.status );
        night = (CardView) findViewById ( R.id.night);
        morning = (CardView) findViewById ( R.id.morning );
        prg_quote = (CardView) findViewById ( R.id.program_quote );
        hindi=(CardView)findViewById ( R.id.hindi );
        caption=(TextView)findViewById ( R.id.insta ) ;
        //night_app=(Button)findViewById ( R.id.night_app ) ;

        friendship=(CardView)findViewById ( R.id.friend ) ;
        dard=(CardView)findViewById ( R.id.dard ) ;
        new_year=(CardView)findViewById ( R.id.new_year ) ;
        attitude =(CardView)findViewById ( R.id.attitude ) ;
        chrismas=(CardView)findViewById ( R.id.chrismas ) ;
       // new_night=(ImageView)findViewById ( R.id.night_sher );




        init_ads ();




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
                else {
                    Intent intent = new Intent ( more.this, birthday.class );
                    startActivity ( intent );
                }
            }
        } );


       caption.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                if(mPublisherInterstitialAd.isLoaded ())
                {
                    mPublisherInterstitialAd.show ();
                    mPublisherInterstitialAd.setAdListener ( new AdListener ()
                    {
                        @Override
                        public void onAdClosed() {
                            startActivity ( new Intent ( getApplicationContext (), top.latest.birthdayshayari.InstaIconHolder.class ) );
                        }
                    });
                }
                else {
                    Intent intent = new Intent ( more.this, InstaIconHolder.class );
                    startActivity ( intent );
                }
            }
        } );



        love.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(mPublisherInterstitialAd.isLoaded ())
                {
                    mPublisherInterstitialAd.show ();
                    mPublisherInterstitialAd.setAdListener ( new AdListener ()
                    {
                        @Override
                        public void onAdClosed() {
                            startActivity ( new Intent ( getApplicationContext (), top.latest.birthdayshayari.love.class ) );
                        }
                    });
                }
                else {
                    Intent intent = new Intent ( more.this, love.class );
                    startActivity ( intent );
                }
            }
        } );


        status.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
               {

                    Intent intent = new Intent ( more.this, status.class );

                    startActivity ( intent );
                }
            }
        } );

        night.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(mPublisherInterstitialAd.isLoaded ())
                {
                    mPublisherInterstitialAd.show ();
                    mPublisherInterstitialAd.setAdListener ( new AdListener ()
                    {
                        @Override
                        public void onAdClosed() {
                            startActivity ( new Intent ( getApplicationContext (), top.latest.birthdayshayari.night.class ) );
                        }
                    });
                }
                else {
                    Intent intent = new Intent ( more.this, night.class );
                    startActivity ( intent );
                }
            }
        } );


        morning.setOnClickListener ( new View.OnClickListener () {
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
                else {
                    Intent intent = new Intent ( more.this, morning.class );
                    startActivity ( intent );
                }
            }
        } );


        motivation.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( more.this, motivation.class );

                startActivity ( intent );
            }
        } );

        prg_quote.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( more.this, program_quote.class );

                startActivity ( intent );
            }
        } );


        hindi.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent ( more.this, hindi.class );

                startActivity ( intent );
            }
        } );


        friendship.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Snackbar.make ( v, "Learn JAVA", Snackbar.LENGTH_LONG ).show ();
                Intent intent=new Intent (more.this,friend.class );
                startActivity ( intent );
            }
        } );


        chrismas.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                //Snackbar.make ( v, "Learn JAVA", Snackbar.LENGTH_LONG ).show ();
                Intent intent=new Intent (more.this,chrismas.class );
                startActivity ( intent );
            }
        } );


        new_year.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                // Snackbar.make ( v, "Learn JAVA", Snackbar.LENGTH_LONG ).show ();
                Intent intent=new Intent (more.this,new_year.class );
                startActivity ( intent );
            }
        } );


        dard.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
               {
                    // Snackbar.make ( v, "Learn JAVA", Snackbar.LENGTH_LONG ).show ();
                    Intent intent = new Intent ( more.this, dard.class );

                    startActivity ( intent );
                }
            }
        } );


        attitude.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(mPublisherInterstitialAd.isLoaded ())
                {
                    mPublisherInterstitialAd.show ();
                    mPublisherInterstitialAd.setAdListener ( new AdListener ()
                    {
                        @Override
                        public void onAdClosed() {
                            startActivity ( new Intent ( getApplicationContext (), top.latest.birthdayshayari.attitude.class ) );
                        }
                    });
                }
                else {
                    // Snackbar.make ( v, "Learn JAVA", Snackbar.LENGTH_LONG ).show ();
                    Intent intent = new Intent ( more.this, attitude.class );
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
    public  void init_ads()
    {
        //call interstial ad
       showAd();
       mPublisherInterstitialAd.loadAd ( new PublisherAdRequest.Builder ().build () );
    }




}
