package top.latest.birthdayshayari;


import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;

public class GiftAdapter extends RecyclerView.Adapter<GiftAdapter.ViewHolder>
{

    int lastPosition = -1;

    //create storage ref
    StorageReference storageReference = FirebaseStorage.getInstance ().getReference ();

    Context context;
    private List<Gifts> list;

    public GiftAdapter(Context context, List<Gifts> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public GiftAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from ( parent.getContext () )
                .inflate (R.layout.giftview , parent,false );
        ViewHolder viewHolder = new ViewHolder ( v );
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GiftAdapter.ViewHolder holder, final int position)
    {
        //set the details
        holder.details.setText ( list.get ( position ).getDetails () );

        //set image into image view using glide library
        Glide.with (context).load ( list.get ( position ).getImage_url () ).placeholder ( R.drawable.new_loader ).into(holder.firebase_img);

        // for links
        final Uri url = Uri.parse ( list.get ( position ).getLink () );

        holder.link.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( Intent.ACTION_VIEW,url );
                intent.setFlags ( Intent.FLAG_ACTIVITY_NEW_TASK );
                context.startActivity ( intent );
            }
        } );

        holder.parent.setOnClickListener ( new View.OnClickListener () {
            String link_data = list.get ( position ).getLink ();
            @Override
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService ( Context.CLIPBOARD_SERVICE );
                ClipData clipData = ClipData.newPlainText ( "text",link_data );
                clipboardManager.setPrimaryClip ( clipData );
                Toast.makeText ( context, "Product Link Copied\n Show your Love by sharing :)", Toast.LENGTH_SHORT ).show ();

            }
        } );

        //set the animation
        setAnimation ( holder.itemView,position );

    }

    @Override
    public int getItemCount() {
        return list.size ();
    }

    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            Animation animation = AnimationUtils.loadAnimation(context, android.R.anim.slide_in_left);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        ImageView  firebase_img ;
        TextView details;
        Button link;
        LinearLayout parent;

        public ViewHolder(@NonNull View itemView) {
            super ( itemView );


            firebase_img = itemView.findViewById ( R.id.img );
            details = itemView.findViewById ( R.id.data );
            link = itemView.findViewById ( R.id.btn_link );
            parent = itemView.findViewById ( R.id.parent_ly );

        }
    }
}
