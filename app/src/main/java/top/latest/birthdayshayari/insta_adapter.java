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
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

import static android.content.Context.CLIPBOARD_SERVICE;

public  class insta_adapter extends RecyclerView.Adapter<insta_adapter.MyHolder>
{
    Context context;
    ArrayList<data> datas;

    CoordinatorLayout coordinatorLayout;

    private  int lastPosition =-1;





    public insta_adapter(Context context, ArrayList<data> datas)
    {
        this.context=context;
        this.datas= datas;
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from ( context ).inflate ( R.layout.insta,viewGroup,false );

        MyHolder myHolder = new MyHolder(view);


        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, final int i) {
        myHolder.name.setText(datas.get (i).getData () );
        myHolder.logo.setImageResource ( datas.get ( i ).getId () );
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
                    share.setPackage ("com.instagram.android");
                    String sub = "Subject";
                    // share.putExtra ( Intent.EXTRA_SUBJECT,mcontext );
                    share.putExtra ( Intent.EXTRA_TEXT, datas.get ( i ).getData () );

                    context.startActivity ( share );
                    Toast.makeText ( context, " Instagram ", Toast.LENGTH_SHORT ).show ();
                }
                catch(Exception e)
                {
                    Toast.makeText ( context,"Instagram is not Installed " +"\n\t" + "PLEASE INSTALL Instagram" ,Toast.LENGTH_SHORT).show ();
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
                share.putExtra ( Intent.EXTRA_TEXT, datas.get ( i ).getData ());

                context.startActivity ( share );
                Toast.makeText ( context, "Thank You !!", Toast.LENGTH_SHORT ).show ();
            }
        });


        myHolder.copy_text.setOnClickListener ( new View.OnClickListener ()
        {
            String text=datas.get ( i ).getData ();
            @Override
            public void onClick(View v) {

                ClipboardManager clipboard=(ClipboardManager) context.getSystemService (CLIPBOARD_SERVICE);
                ClipData clip= (ClipData) ClipData.newPlainText ( "text", text);
                clipboard.setPrimaryClip ( clip );

                Toast.makeText ( context, "Caption Copied", Toast.LENGTH_SHORT ).show ();
            }
        });

        myHolder.linearLayout.setOnClickListener ( new View.OnClickListener () {
            String text=datas.get ( i ).getData ();
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard=(ClipboardManager) context.getSystemService (CLIPBOARD_SERVICE);
                ClipData clip= (ClipData) ClipData.newPlainText ( "text", text);
                clipboard.setPrimaryClip ( clip );

                Toast.makeText ( context, "Caption Copied", Toast.LENGTH_SHORT ).show ();
            }
        } );




    }


    protected void setAnimation(View viewToAnimate, int position) {
        if (position > lastPosition) {
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            anim.setDuration(new Random ().nextInt(1001));//to make duration random number between [0,501)
            viewToAnimate.startAnimation(anim);
            lastPosition = position;
        }
    }

    @Override
    public int getItemCount() {
        return datas.size ();
    }


    public static class MyHolder extends RecyclerView.ViewHolder
    {
        TextView name;
        LinearLayout linearLayout;
        ImageView whatup,share_btn,copy_text,logo;


        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public MyHolder(@NonNull View itemView)
        {
            super(itemView);
            name=itemView.findViewById ( R.id.data );
            linearLayout=itemView.findViewById ( R.id.linear_layout );
            whatup=itemView.findViewById ( R.id.mwhatsapp );
            copy_text=itemView.findViewById ( R.id.mcopy );
            share_btn=itemView.findViewById ( R.id.share);
            logo=itemView.findViewById ( R.id.img );


        }
    }
}


