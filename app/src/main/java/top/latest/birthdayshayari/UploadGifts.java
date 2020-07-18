package top.latest.birthdayshayari;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;

public class UploadGifts extends AppCompatActivity {

    final int PICK_CODE=1;
    EditText link,details;
    TextView viewUploads;
    Button choooseImage,Upload;
    ImageView prev_imag;
    RadioButton boys;

    private Uri filepath; // store the path of image we are uploading

    //firebase references
    StorageReference storageReference;  // for storing images
    DatabaseReference databaseReference;  // for storing texts and image URL's
    DatabaseReference newdb ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_upload_gifts );

        link = (EditText) findViewById ( R.id.link );
        details =(EditText) findViewById ( R.id.details );
        viewUploads =(TextView) findViewById ( R.id.textShowUploads );
        choooseImage = (Button) findViewById ( R.id.chooseImage );
        Upload = (Button) findViewById ( R.id.upload );
        prev_imag =(ImageView) findViewById ( R.id.ImageView );

        boys = findViewById ( R.id.boys );


        storageReference = FirebaseStorage.getInstance ().getReference ();
        //path for the database
        databaseReference = FirebaseDatabase.getInstance ().getReference ("Gifts");
        newdb = FirebaseDatabase.getInstance ().getReference ("Boys");


        // choose the image you want to upload to firebase
        choooseImage.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                showFileChooser ();
            }
        } );

        // upload the images into firebase
        Upload.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                uploadData();
            }
        } );

        viewUploads.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( getApplicationContext (), ShowGifts.class );
                startActivity ( intent );
            }
        } );






    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult ( requestCode, resultCode, data );

        if(requestCode == PICK_CODE && resultCode == RESULT_OK && data !=null && data.getData () != null)
        {
            filepath = data.getData ();

            //shows image which you are uploading to firebase
            Bitmap bitmap = null;

            try {
                bitmap = MediaStore.Images.Media.getBitmap ( getContentResolver (),filepath );
            } catch (IOException e) {
                e.printStackTrace ();
            }

            prev_imag.setImageBitmap ( bitmap );

        }
    }

    void showFileChooser()
    {
        Intent intent = new Intent();
        intent.setType("image/*"); // * means shows all types images from your phone (jpeg,png,etc)
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_CODE);
    }

    void uploadData()
    {
        //check filepath i.e image is selected or not

        if(filepath != null)
        {
            final ProgressDialog progressDialog =new ProgressDialog ( this );
            progressDialog.setTitle ( "Uploading .... Please wait ..." );
            progressDialog.show ();

            StorageReference store;

            if(boys.isChecked ())
            {
                //create the child from the storagereference path
                 store = storageReference.child ( "Boys/" +System.currentTimeMillis () +"."+getFileExtension ( filepath ) );
            }
            else
            {
                //create the child from the storagereference path
                 store = storageReference.child ( "Gifts/" +System.currentTimeMillis () +"."+getFileExtension ( filepath ) );
            }


            // putFile() method is used to add data to firebase storage
            store.putFile ( filepath ).addOnSuccessListener ( new OnSuccessListener<UploadTask.TaskSnapshot> () {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    // disable the progress bar
                    progressDialog.dismiss ();

                    // get the URL of image to store in database
                    taskSnapshot.getMetadata ().getReference ().getDownloadUrl ().addOnSuccessListener ( new OnSuccessListener<Uri> () {
                        @Override
                        public void onSuccess(Uri uri) {
                            //set the coursedetails objects with the values which are going to uploaded
                            Gifts gifts = new Gifts ( String.valueOf ( uri ),details.getText ().toString (),link.getText ().toString () );
                            //uploads the data using setValue() method
                            if(boys.isChecked ())
                            {
                                newdb.push ().setValue ( gifts );
                            }
                            else
                            {
                                databaseReference.push ().setValue ( gifts );
                            }

                            Toast.makeText ( getApplicationContext (), "Uploaded Successfull :) ", Toast.LENGTH_SHORT ).show ();


                        }
                    } );

                }
            } ).addOnFailureListener ( new OnFailureListener () {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressDialog.dismiss ();
                    Toast.makeText ( getApplicationContext (), "Failed..try again", Toast.LENGTH_SHORT ).show ();
                }
            } ).addOnProgressListener ( new OnProgressListener<UploadTask.TaskSnapshot> () {
                @Override
                public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                    double progress = (100.0 * taskSnapshot.getBytesTransferred () / taskSnapshot.getTotalByteCount ());
                    progressDialog.setMessage ( "Uploaded  "+ ((int)(progress)) + "%" +" \nit takes few seconds..." );
                }
            } );


        }
        else {
            Toast.makeText ( this, "Image selected is invalid or no image is selected", Toast.LENGTH_SHORT ).show ();
        }

    }

    public String getFileExtension(Uri uri) {
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }
}

