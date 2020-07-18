package top.latest.birthdayshayari;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class ShowGifts extends AppCompatActivity {
    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;

    DatabaseReference mdataref;

    ProgressDialog progressDialog;

    List<Gifts> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_show_gifts );

        getSupportActionBar ().setDisplayHomeAsUpEnabled ( true );



        recyclerView = findViewById ( R.id.recyclerView );

        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );
        recyclerView.setHasFixedSize ( true );

        progressDialog = new ProgressDialog ( this );

        list = new ArrayList<> (  );

        //display progress dialog while fetching images
        progressDialog.setMessage ( "Feching data " + "\nEnsure Mobile data is ON" );
        progressDialog.setCancelable ( false );
        progressDialog.show ();

        mdataref = FirebaseDatabase.getInstance ().getReference ("Gifts");


        mdataref.addValueEventListener ( new ValueEventListener () {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                progressDialog.dismiss ();

                for(DataSnapshot postdata : dataSnapshot.getChildren ())
                {
                    Gifts courseDetails = postdata.getValue (Gifts.class);
                    list.add ( courseDetails );
                }
                //set the value in the adapter
                recyclerView.setAdapter ( new GiftAdapter ( getApplicationContext (),list) );
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                progressDialog.dismiss ();
            }
        } );





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

}
