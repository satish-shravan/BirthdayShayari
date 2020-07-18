package top.latest.birthdayshayari;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

import java.util.ArrayList;

import static android.content.Context.CLIPBOARD_SERVICE;

public class Adapter extends RecyclerView.Adapter< Adapter.MyHolder>
{
    Context context;
    ArrayList<Data_show> data_shows;

    CoordinatorLayout coordinatorLayout;

    PublisherInterstitialAd publisherInterstitialAd;

    private  int lastPosition=-1;

    public Adapter(Context context, ArrayList<Data_show> data_shows)
    {
        this.context=context;
        this.data_shows=data_shows;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public Adapter.MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.custom,viewGroup,false );

        MyHolder myHolder = new MyHolder(view);

        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.codeName.setText(data_shows.get (i).getData () );
        //myHolder.btn.setText(pojoLinears.get (i).getBtn ());

        setAnimation ( myHolder.itemView,i );

     /*   myHolder.relativeLayout.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent share=new Intent ( Intent.ACTION_SEND );
                share.setType ( "text/plain" );
                String sub="Subject";
                // share.putExtra ( Intent.EXTRA_SUBJECT,mcontext );
                share.putExtra ( Intent.EXTRA_TEXT, data_shows.get ( i ).getData ());
                context.startActivity ( share );
            }
        } );  */

        myHolder.whatup.setOnClickListener ( new View.OnClickListener ()
        {

            @Override
            public void onClick(View v) {
                try {
                    Intent share = new Intent ( Intent.ACTION_SEND );
                    share.setType ( "text/plain" );
                    share.setPackage ( "com.whatsapp" );
                    String sub = "Subject";
                    // share.putExtra ( Intent.EXTRA_SUBJECT,mcontext );
                    share.putExtra ( Intent.EXTRA_TEXT, data_shows.get ( i ).getData () );

                    context.startActivity ( share );
                    Toast.makeText ( context, " Whatsapp ", Toast.LENGTH_SHORT ).show ();
                }
                catch(Exception e)
                {
                   Toast.makeText ( context,"Whatsapp is not Installed " +"\n\t" ,Toast.LENGTH_SHORT).show ();
                   // Snackbar snackbar = Snackbar
                       //    .make(coordinatorLayout, "Please Install WhatsApp", Snackbar.LENGTH_LONG);
                    //snackbar.show();

                }
            }
        });



        myHolder.share_btn.setOnClickListener ( new View.OnClickListener ()
        {

            @Override
            public void onClick(View v) {
                Intent share=new Intent ( Intent.ACTION_SEND );
                share.setType ( "text/plain" );
                String sub="Subject";
                // share.putExtra ( Intent.EXTRA_SUBJECT,mcontext );
                share.putExtra ( Intent.EXTRA_TEXT, data_shows.get ( i ).getData ());

                context.startActivity ( share );
                Toast.makeText ( context, "Thank You !!", Toast.LENGTH_SHORT ).show ();
            }
        });


        myHolder.copy_text.setOnClickListener ( new View.OnClickListener ()
        {
            String text=data_shows.get ( i ).getData ();
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard=(ClipboardManager) context.getSystemService (CLIPBOARD_SERVICE);
                ClipData clip= (ClipData) ClipData.newPlainText ( "text", text);
                clipboard.setPrimaryClip ( clip );

                Toast.makeText ( context, "Shayari Copied", Toast.LENGTH_SHORT ).show ();
            }
        });

        myHolder.relativeLayout.setOnClickListener ( new View.OnClickListener () {
            String text=data_shows.get ( i ).getData ();
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard=(ClipboardManager) context.getSystemService (CLIPBOARD_SERVICE);
                ClipData clip= (ClipData) ClipData.newPlainText ( "text", text);
                clipboard.setPrimaryClip ( clip );

                Toast.makeText ( context, "Shayari Copied", Toast.LENGTH_SHORT ).show ();
            }
        } );

    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }



    @Override
    public int getItemCount() {
        return data_shows.size ();
    }


    public static class MyHolder extends RecyclerView.ViewHolder
    {
        TextView codeName;
        RelativeLayout relativeLayout;
        ImageView whatup,share_btn,copy_text;


        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public MyHolder(@NonNull View itemView)
        {
            super(itemView);
            codeName=itemView.findViewById ( R.id.data );
            relativeLayout=itemView.findViewById ( R.id.relative_layout );
            whatup=itemView.findViewById ( R.id.mwhatsapp );
            copy_text=itemView.findViewById ( R.id.mcopy );
            share_btn=itemView.findViewById ( R.id.share);
        }
    }
}