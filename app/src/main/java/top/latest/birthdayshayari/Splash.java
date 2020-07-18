package top.latest.birthdayshayari;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags( WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView ( R.layout.activity_splash );

        new Handler (  ).postDelayed ( new Runnable () {
            @Override
            public void run() {
                Intent intent = new Intent ( Splash.this,Main2Activity.class);
                startActivity ( intent );
                finish ();
            }
        },2500 );
    }
}
