package top.latest.birthdayshayari;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

public class Main2Activity extends AppCompatActivity {

    private AdView mAdView,mAdView1;
    private PublisherInterstitialAd mPublisherInterstitialAd;



    CardView insta,shayari,facts,shareapp,birthday;
    TextView txt;
    ImageView follow,youtube;


    ImageView attitude,love,morning,night;
    ImageView miss,fitness,beard,selfie,happy,foodie,cool;




    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main2 );

        txt = findViewById ( R.id.text );
        txt.setSelected ( true );

        txt.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( Main2Activity.this,"THANK YOU :)",Toast.LENGTH_LONG ).show ();
                Intent share1=new Intent ( Intent.ACTION_SEND );
                final String pack=getApplicationContext ().getPackageName ();
                String applink1="";

                try
                {
                    applink1="https://play.google.com/store/apps/details?id="+pack;
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    applink1="https://play.google.com/store/apps/details?id="+pack;
                }
                share1.setType ( "text/link" );
                String body="\n"+"Hey! Check out Huge Collection of Handpicked Captions and Shayari's  "+"\n"+"\"Photo without a caption is like a book without a title\""+"\n\n "+applink1+ "\n Boost your insta profile !!";
                String sub="Captions for Instagram ";
                share1.putExtra ( Intent.EXTRA_SUBJECT,sub );
                share1.putExtra ( Intent.EXTRA_TEXT,body );
                startActivity ( Intent.createChooser ( share1,"Share App Using" ) );

            }
        } );


/*
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags( WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }


 */



        /*
        Calendar calendar = Calendar.getInstance ();

        calendar.set ( Calendar.HOUR_OF_DAY,20 );
        calendar.set ( Calendar.MINUTE,29 );
        calendar.set ( Calendar.SECOND,0 );

        Intent intent = new Intent ( getApplicationContext (),Notification_demo.class );

        PendingIntent pendingIntent = PendingIntent.getBroadcast ( getApplicationContext (),100,intent,PendingIntent.FLAG_UPDATE_CURRENT );

        AlarmManager alarmManager = (AlarmManager) getSystemService ( Context.ALARM_SERVICE );
        alarmManager.setRepeating ( AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis (),AlarmManager.INTERVAL_DAY,pendingIntent );

         */

       /* ScheduledExecutorService scheduledExecutorService =
                Executors.newSingleThreadScheduledExecutor ();
        scheduledExecutorService.scheduleAtFixedRate ( new Runnable () {
            @Override
            public void run() {
                runOnUiThread ( new Runnable () {
                    @Override
                    public void run() {
                        if (mPublisherInterstitialAd.isLoaded ()) {
                            mPublisherInterstitialAd.show ();
                        } else {
                            Log.d("TAG", "The interstitial wasn't loaded yet.");
                        }
                        showAd ();
                    }
                } );
            }

        }, 60, 180, TimeUnit.SECONDS );
        */


        showAd ();

        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
        mPublisherInterstitialAd.show ();


        mPublisherInterstitialAd.setAdListener(new AdListener () {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
            }

        });


        /*
        gif = findViewById ( R.id.gif );


        Glide.with ( this )
                .load ( "https://firebasestorage.googleapis.com/v0/b/fir-89f97.appspot.com/o/Boys%2F1594403614125.gif?alt=media&token=b939448e-0664-4c78-b38b-321c1448f4bf" )
                .into ( gif );


         */


        // animationView = findViewById ( R.id.animationView );


        attitude = findViewById ( R.id.attitude_img );
        love = findViewById ( R.id.love_img );
        morning = findViewById ( R.id.morning_img );
        night = findViewById ( R.id.night_img);

        attitude.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this, top.latest.birthdayshayari.attitude.class ) );
            }
        } );

        love.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this, top.latest.birthdayshayari.love.class ) );
            }
        } );

        morning.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this, top.latest.birthdayshayari.morning.class ) );
            }
        } );

        night.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this, top.latest.birthdayshayari.night.class ) );
            }
        } );

        miss = findViewById ( R.id.missyou );
        fitness = findViewById ( R.id.fitness );
        beard= findViewById ( R.id.beard );
        selfie = findViewById ( R.id.selfie );
        happy = findViewById ( R.id.happy );
        foodie = findViewById ( R.id.foodie );
        cool = findViewById ( R.id.cool );

        miss.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,miss.class ) );
            }
        } );

        fitness.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,fitness.class ) );
            }
        } );

        beard.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,beard.class ) );
            }
        } );
        selfie.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,selfie.class ) );
            }
        } );
        happy.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,happy.class ) );
            }
        } );
        foodie.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,foodie.class ) );
            }
        } );
        cool.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                startActivity ( new Intent ( Main2Activity.this,cool.class ) );
            }
        } );



        follow=(ImageView) findViewById ( R.id.follow ) ;
        youtube=findViewById ( R.id.youtube );

        follow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText ( Main2Activity.this, "Follow us on Instagram", Toast.LENGTH_SHORT ).show ();
                //open a browser with a link
                Intent externalIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/caption.app/"));
                startActivity(externalIntent);
            }
        } );

        youtube.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                    Toast.makeText ( Main2Activity.this, "Subscribe us on YouTube", Toast.LENGTH_SHORT ).show ();
                    //open a browser with a link
                    Intent externalIntent = new Intent ( Intent.ACTION_VIEW, Uri.parse ( "https://www.youtube.com/channel/UCLNK_sRX5DNl-RH1V_Nrpag?sub_confirmation=1" ) );
                    startActivity ( externalIntent );

            }
        } );



        insta = (CardView) findViewById ( R.id.insta );
        shayari = (CardView) findViewById ( R.id.shayari );
        birthday = (CardView) findViewById ( R.id.birth );
        shareapp = (CardView) findViewById ( R.id.share );
        facts = (CardView) findViewById ( R.id.facts );

        insta.setOnClickListener ( new View.OnClickListener () {
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
                    Intent intent = new Intent ( getApplicationContext (), InstaIconHolder.class );
                    startActivity ( intent );
                }

            }
        } );

        shayari.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( getApplicationContext (),more.class );
                startActivity ( intent );
            }
        } );

        birthday.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent ( getApplicationContext (), MainActivity.class );
                    startActivity ( intent );
            }
        } );

        facts.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                {
                    Intent intent = new Intent ( getApplicationContext (), ShowImages.class );
                    startActivity ( intent );
                }
            }
        } );

        shareapp.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Toast.makeText ( Main2Activity.this, "Welcome to Gifts Store", Toast.LENGTH_SHORT ).show ();
                startActivity (new Intent ( getApplicationContext (),ShowGifts.class ));

               /* Toast.makeText ( Main2Activity.this,"THANK YOU :)",Toast.LENGTH_LONG ).show ();
                Intent share1=new Intent ( Intent.ACTION_SEND );
                final String pack=getApplicationContext ().getPackageName ();
                String applink1="";

                try
                {
                    applink1="https://play.google.com/store/apps/details?id="+pack;
                }
                catch (android.content.ActivityNotFoundException anfe)
                {
                    applink1="https://play.google.com/store/apps/details?id="+pack;
                }
                share1.setType ( "text/link" );
                String body="\n"+"Hey! Check out Huge Collection of Handpicked Captions and Shayari's  "+"\n"+"\"Photo without a caption is like a book without a title\""+"\n\n "+applink1+ "\n Boost your insta profile !!";
                String sub="Captions for Instagram ";
                share1.putExtra ( Intent.EXTRA_SUBJECT,sub );
                share1.putExtra ( Intent.EXTRA_TEXT,body );
                startActivity ( Intent.createChooser ( share1,"Share using" ) );

                */
            }
        } );






    }

    public void showAd()
    {
        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId( getString ( R.string.admob_intestial_id ) );
        mPublisherInterstitialAd.loadAd(new PublisherAdRequest.Builder().build());
    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        final  View custom = getLayoutInflater ().inflate ( R.layout.exit_alert,null );
        builder.setView ( custom );

        builder.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish ();
            }
        });
        builder.setNegativeButton("Follow",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent ( Intent.ACTION_VIEW, Uri.parse ( "https://www.instagram.com/caption.app/" ) );
                startActivity ( intent );
            }
        });

        builder.setNeutralButton ( "RATE US", new DialogInterface.OnClickListener () {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent ( Intent.ACTION_VIEW, Uri.parse ( "https://play.google.com/store/apps/details?id=top.latest.birthdayshayari&hl=en" ) );
                startActivity ( intent );
            }
        } );
        AlertDialog alert=builder.create();
        alert.show();
    }
}
