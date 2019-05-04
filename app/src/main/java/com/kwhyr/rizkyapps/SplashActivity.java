package com.kwhyr.rizkyapps;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

/*
NIM   : 10116051
Nama  : Muhamad Rizky Fauzan
Kelas : AKB2/IF2

Change log
    1. 02/05/2019 12.58 PM : Membuat Splash Screen
    2. 02/05/2019 16.11 PM : Membuat Walkthrough
    3. 03/05/2019 16.50 PM : Membuat Membuat Navigation Drawer
 */

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = findViewById(R.id.imgSplashImg);
        TextView logdesc = findViewById(R.id.txtSplashDesc);
        Animation splash = AnimationUtils.loadAnimation(this, R.anim.splashscreen);
        logo.startAnimation(splash);
        logdesc.startAnimation(splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent start  = new Intent(SplashActivity.this, WalkthroughActivity.class);
                startActivity(start);
                finish();
            }
        },4000);
    }
}
