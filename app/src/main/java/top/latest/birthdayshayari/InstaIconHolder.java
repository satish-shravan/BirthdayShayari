package top.latest.birthdayshayari;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;
import com.google.android.gms.ads.reward.RewardedVideoAd;

import java.util.ArrayList;
import java.util.Random;

public class InstaIconHolder extends AppCompatActivity {

    GridView gridView;
    ArrayList<datax>list;
    ImageAdapter adapter;

    PublisherInterstitialAd publisherInterstitialAd;

    private int lastPosition=-1;
    RewardedVideoAd mRewardedVideoAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_insta_icon_holder );

        gridView=  findViewById ( R.id.gridview );

        gridlist();

        adapter=new ImageAdapter(this,list);
        gridView.setAdapter ( adapter );




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

    void gridlist()
    {
        list = new ArrayList<datax> (  );


        list.add ( new datax("Alone" ,R.drawable.alone) );
        list.add ( new datax("Angry" ,R.drawable.angry) );
        list.add ( new datax("Animal" ,R.drawable.animal) );
        list.add ( new datax("Anniversary" ,R.drawable.anniversary) );
        list.add ( new datax("Annoyed" ,R.drawable.annoyed3) );
        list.add ( new datax("Attitude" ,R.drawable.attitude) );
        list.add ( new datax("Beard" ,R.drawable.beard) );
        list.add ( new datax("Bicycle" ,R.drawable.bicycle) );
        list.add ( new datax("Birds" ,R.drawable.bird) );
        list.add ( new datax("Brother" ,R.drawable.brothers) );
        list.add ( new datax("Calm" ,R.drawable.calm) );
        list.add ( new datax("ChildHood" ,R.drawable.childhood) );
        list.add ( new datax("Christmas" ,R.drawable.christmas) );
        list.add ( new datax("Confused" ,R.drawable.confused) );
        list.add ( new datax("Cool" ,R.drawable.cool) );
        list.add ( new datax("WeekEnd" ,R.drawable.days) );
        list.add ( new datax("Diwali" ,R.drawable.diwali) );
        list.add ( new datax("FatherDay" ,R.drawable.fathersday) );
        list.add ( new datax("Festival" ,R.drawable.festival) );
        list.add ( new datax("Fitness" ,R.drawable.fitness) );
        list.add ( new datax("Flirt" ,R.drawable.flirt) );
        list.add ( new datax("Foodie" ,R.drawable.foodie) );
        list.add ( new datax("FootBall" ,R.drawable.football) );
        list.add ( new datax("Friendship" ,R.drawable.friendship) );
        list.add ( new datax("GetWellSoon" ,R.drawable.getwellsoon) );
        list.add ( new datax("Happy" ,R.drawable.happy) );
        list.add ( new datax("Hurt" ,R.drawable.hurt) );
        list.add ( new datax("Jealous" ,R.drawable.jealous) );
        list.add ( new datax("Life" ,R.drawable.life) );
        list.add ( new datax("Love" ,R.drawable.love) );
        list.add ( new datax("Make-Up" ,R.drawable.makeup) );
        list.add ( new datax("Men's Hair" ,R.drawable.manhair) );
        list.add ( new datax("Miss You" ,R.drawable.miss) );
        list.add ( new datax("Thank You" ,R.drawable.thanksgiving) );
        list.add ( new datax("Mother Day" ,R.drawable.mothersday) );
        list.add ( new datax("Motivation" ,R.drawable.motivation) );
        list.add ( new datax("Nature" ,R.drawable.nature) );
        list.add ( new datax("NavRatri" ,R.drawable.navratr) );
        list.add ( new datax("Party" ,R.drawable.party) );
        list.add ( new datax("Photo" ,R.drawable.photo) );
        list.add ( new datax("Rainy" ,R.drawable.rainy) );
        list.add ( new datax("Relax" ,R.drawable.relax) );
        list.add ( new datax("Romantic" ,R.drawable.romantic) );
        list.add ( new datax("Sad" ,R.drawable.sad) );
        list.add ( new datax("Savage" ,R.drawable.savage) );
        list.add ( new datax("Selfie" ,R.drawable.selfie) );
        list.add ( new datax("Shopping" ,R.drawable.shopping) );
        list.add ( new datax("Shy" ,R.drawable.shy) );
        list.add ( new datax("Sleepy" ,R.drawable.sleepy) );
        list.add ( new datax("Sorry" ,R.drawable.sorry) );
        list.add ( new datax("Style" ,R.drawable.style) );
        list.add ( new datax("Time" ,R.drawable.time) );
        list.add ( new datax("Travel" ,R.drawable.travel) );
        list.add ( new datax("Trust" ,R.drawable.trust) );

    }


}

class ImageAdapter extends BaseAdapter
{

    private Context context;
    ArrayList<datax> list;


    private int lastPosition=-1;


    public ImageAdapter(Context context, ArrayList<datax> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size ();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        convertView = LayoutInflater.from(context).inflate ( R.layout.insta_custom_layout,parent,false );


            ImageView image = convertView.findViewById ( R.id.img );
            TextView name = convertView.findViewById ( R.id.name );
            final CardView cardView= convertView.findViewById ( R.id.cardview );
            LinearLayout ly = convertView.findViewById ( R.id.ly );

            name.setText ( list.get(position).getName () );
            image.setImageResource ( list.get ( position ).getImg () );

           // setAnimation ( convertView,position );





        final View finalConvertView = convertView;
        image.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                if(position==0)
                {

                        Intent intent = new Intent ( finalConvertView.getContext (), alone.class );
                        context.startActivity ( intent );

                }

                if(position==1)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),angry.class );
                    context.startActivity ( intent );

                }

                if(position==2)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),animal.class );
                    context.startActivity ( intent );

                }

                if(position==3)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),aniversary.class );
                    context.startActivity ( intent );

                }

                if(position==4)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),annoyed.class );
                    context.startActivity ( intent );

                }

                if(position==5)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),attitude_insta.class );
                    context.startActivity ( intent );

                }

                if(position==6)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),beard.class );
                    context.startActivity ( intent );

                }

                if(position==7)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),bicycle.class );
                    context.startActivity ( intent );

                }

                if(position==8)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),bird.class );
                    context.startActivity ( intent );

                }

                if(position==9)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),brother.class );
                    context.startActivity ( intent );

                }

                if(position==10)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),calm.class );
                    context.startActivity ( intent );

                }

                if(position==11)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),childhood.class );
                    context.startActivity ( intent );

                }

                if(position==12)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),christmas.class );
                    context.startActivity ( intent );

                }

                if(position==13)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),confused.class );
                    context.startActivity ( intent );

                }

                if(position==14)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),cool.class );
                    context.startActivity ( intent );

                }

                if(position==15)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),days.class );
                    context.startActivity ( intent );

                }
                if(position==16)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),diwali.class );
                    context.startActivity ( intent );

                }

                if(position==17)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),father_day.class );
                    context.startActivity ( intent );

                }
                if(position==18)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),festival.class );
                    context.startActivity ( intent );

                }

                if(position==19)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),fitness.class );
                    context.startActivity ( intent );

                }
                if(position==20)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),flirt.class );
                    context.startActivity ( intent );

                }

                if(position==21)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),foodie.class );
                    context.startActivity ( intent );

                }
                if(position==22)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),football.class );
                    context.startActivity ( intent );

                }

                if(position==23)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),friendship_insta.class );
                    context.startActivity ( intent );

                }
                if(position==24)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),get_wellsoon.class );
                    context.startActivity ( intent );

                }

                if(position==25)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),happy.class );
                    context.startActivity ( intent );

                }
                if(position==26)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),hurt.class );
                    context.startActivity ( intent );

                }

                if(position==27)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),jealous.class );
                    context.startActivity ( intent );

                }

                if(position==28)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),life.class );
                    context.startActivity ( intent );

                }

                if(position==29)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),love_insta.class );
                    context.startActivity ( intent );

                }

                if(position==30)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),makeup.class );
                    context.startActivity ( intent );

                }

                if(position==31)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),man_hair.class );
                    context.startActivity ( intent );

                }

                if(position==32)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),miss.class );
                    context.startActivity ( intent );

                }

                if(position==33)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),moody.class );
                    context.startActivity ( intent );

                }

                if(position==34)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),mother_day.class );
                    context.startActivity ( intent );

                }

                if(position==35)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),motivation_insta.class );
                    context.startActivity ( intent );

                }
                if(position==36)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),nature.class );
                    context.startActivity ( intent );

                }

                if(position==37)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),nav_ratri.class );
                    context.startActivity ( intent );

                }
                if(position==38)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),party.class );
                    context.startActivity ( intent );

                }

                if(position==39)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),photo.class );
                    context.startActivity ( intent );

                }
                if(position==40)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),rainy.class );
                    context.startActivity ( intent );

                }

                if(position==41)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),relax.class );
                    context.startActivity ( intent );

                }

                if(position==42)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),romantic.class );
                    context.startActivity ( intent );

                }

                if(position==43)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),sad.class );
                    context.startActivity ( intent );

                }

                if(position==44)
                {

                    Intent intent = new Intent ( finalConvertView.getContext (),savage.class );
                    context.startActivity ( intent );

                }

                if(position==45)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),selfie.class );
                    context.startActivity ( intent );

                }
                if(position==46)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),shopping.class );
                    context.startActivity ( intent );

                }

                if(position==47)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),shy.class );
                    context.startActivity ( intent );

                }
                if(position==48)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),sleepy.class );
                    context.startActivity ( intent );

                }

                if(position==49)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),sorry.class );
                    context.startActivity ( intent );

                }
                if(position==50)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),style.class );
                    context.startActivity ( intent );

                }

                if(position==51)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),time.class );
                    context.startActivity ( intent );

                }

                if(position==52)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),travel.class );
                    context.startActivity ( intent );

                }
                if(position==53)
                {
                    Intent intent = new Intent ( finalConvertView.getContext (),trust.class );
                    context.startActivity ( intent );

                }

            }
        } );


        return convertView;




    }

    protected void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(new Random (  ).nextInt (501));//to make duration random number between [0,501)
            viewToAnimate.startAnimation(anim);
            lastPosition = position;
        }
    }


}

class datax
{
    public String name;
    public  int img;

    public datax(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }


    public int getImg() {
        return img;
    }


}