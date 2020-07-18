package top.latest.birthdayshayari;


import android.Manifest;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.List;


public class firebaseadapter extends RecyclerView.Adapter<firebaseadapter.ViewHolder> {

    private int lastPosition=-1;

    StorageReference storageReference = FirebaseStorage.getInstance ().getReference ();

    private Context context;
    private List<Uploads> uploads;

    int count = 0;

    public firebaseadapter(Context context, List<Uploads> uploads) {
        this.uploads = uploads;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.firebase_img_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

   /* public void downloadFile(Context context,String directory,String  url)
    {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService ( Context.DOWNLOAD_SERVICE );

        Uri uri = Uri.parse ( url );

        DownloadManager.Request request = new DownloadManager.Request ( uri );

        request.setNotificationVisibility ( DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED );

        request.setDestinationInExternalFilesDir ( context,directory,"Images.jpg" );

        downloadManager.enqueue ( request );
    }

    */



    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final Uploads upload = uploads.get(position);

       // final Spanned Text = Html.fromHtml( "<a href='"+ upload.getName () +"'>Links </a>");
        //holder.textViewName.setMovementMethod ( LinkMovementMethod.getInstance () );
        holder.textViewName.setText(upload.getName ());


        Glide.with(context).load(upload.getUrl()).placeholder( R.drawable.loading ).into(holder.imageView);

        setAnimation ( holder.itemView,position );

        holder.download.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v)
            {
                Toast.makeText ( context, "Downloading.....", Toast.LENGTH_SHORT ).show ();
               //downloadFile(holder.textViewName.getContext (),DIRECTORY_DOWNLOADS,upload.getUrl ());
                if(ActivityCompat.checkSelfPermission(holder.textViewName.getContext (), Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED || ActivityCompat.checkSelfPermission(holder.textViewName.getContext (), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){

                    // this will request for permission when user has not granted permission for the app
                    ActivityCompat.requestPermissions( (Activity) holder.textViewName.getContext (), new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
                }
                else{
                    //Download Script
                    DownloadManager downloadManager = (DownloadManager) context.getSystemService (Context.DOWNLOAD_SERVICE);
                    Uri uri = Uri.parse ( upload.getUrl ());
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setTitle ( "Images" );
                    request.setVisibleInDownloadsUi(true);
                    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                    request.setDestinationInExternalPublicDir( Environment.DIRECTORY_DOWNLOADS, uri.getLastPathSegment());
                    assert downloadManager != null;
                    downloadManager.enqueue(request);
                }
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
        return uploads.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName;
        public ImageView imageView;
        public ImageView download;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textViewName);
            imageView = (ImageView) itemView.findViewById( R.id.imageView);
            download = (ImageView) itemView.findViewById ( R.id.download );

        }
    }
}


