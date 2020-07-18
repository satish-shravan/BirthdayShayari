package top.latest.birthdayshayari;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
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

public class UploadImages extends AppCompatActivity {

    //constant to track image chooser intent
    private static final int PICK_IMAGE_REQUEST = 1;

    CheckBox morning;

    //view objects
    private Button buttonChoose;
    private Button buttonUpload;
    private EditText editTextName;
    private TextView textViewShow;
    private ImageView imageView;

   private Uri filepath;

   StorageReference storageReference;
   DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_upload_images );

        morning=findViewById ( R.id.morning );


        buttonChoose = (Button) findViewById(R.id.buttonChoose);
        buttonUpload = (Button) findViewById(R.id.buttonUpload);
        imageView = (ImageView) findViewById(R.id.imageView);
        editTextName = (EditText) findViewById(R.id.editText);
        textViewShow = (TextView) findViewById(R.id.textViewShow);

        storageReference = FirebaseStorage.getInstance ().getReference ();


        databaseReference = FirebaseDatabase.getInstance ().getReference ("facts");




        buttonChoose.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                showFileChooser();
            }
        } );

        buttonUpload.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                UploadFile();
            }
        } );

        textViewShow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( getApplicationContext (), ShowImages.class );
                startActivity ( intent );
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

    void showFileChooser()
    {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST);
    }

    void UploadFile()
    {
        //chech if file is available or not
        if(filepath != null)
        {
            final ProgressDialog progressDialog = new ProgressDialog ( this );
            progressDialog.setTitle ( "Uploading..." );
            progressDialog.show ();



            StorageReference sRef = storageReference.child("facts/" + System.currentTimeMillis() + "." + getFileExtension(filepath));




            sRef.putFile ( filepath ).addOnSuccessListener ( new OnSuccessListener<UploadTask.TaskSnapshot> () {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                    progressDialog.dismiss ();

                    taskSnapshot.getMetadata ().getReference ().getDownloadUrl ().addOnSuccessListener ( new OnSuccessListener<Uri> () {
                        @Override
                        public void onSuccess(Uri uri) {
                            Uploads uploads = new Uploads ( editTextName.getText ().toString ().trim (),String.valueOf ( uri ) );

                            databaseReference.push ().setValue ( uploads );
                            Toast.makeText ( UploadImages.this, "Uploaded Successfull", Toast.LENGTH_SHORT ).show ();
                        }
                    } );

                }
            }).addOnFailureListener ( new OnFailureListener () {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressDialog.dismiss ();
                    Toast.makeText ( UploadImages.this, e.getMessage (), Toast.LENGTH_SHORT ).show ();
                }
            } ).addOnProgressListener ( new OnProgressListener<UploadTask.TaskSnapshot> () {
                @Override
                public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {

                        double progress= (100.0 * taskSnapshot.getBytesTransferred () / taskSnapshot.getTotalByteCount ());
                        progressDialog.setMessage ( "Uploaded "+ ((int) progress)+ "%...." );

                }
            } );


        }
        else
        {
            Toast.makeText ( this, "Error..... No images is selected.", Toast.LENGTH_SHORT ).show ();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult ( requestCode, resultCode, data );

        if(requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK && data !=null && data.getData () != null)
        {
                filepath =data.getData ();

            Bitmap bitmap = null;
            try {
                bitmap = MediaStore.Images.Media.getBitmap ( getContentResolver (),filepath );
            } catch (IOException e) {
                e.printStackTrace ();
            }
            imageView.setImageBitmap ( bitmap );
        }
    }

    public String getFileExtension(Uri uri) {
        ContentResolver cR = getContentResolver();
        MimeTypeMap mime = MimeTypeMap.getSingleton();
        return mime.getExtensionFromMimeType(cR.getType(uri));
    }
}
