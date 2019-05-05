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
    4. 04/05/2019 20.35 PM : Fix Sub Fragment
    5. 04/05/2019 23.16 PM : Mengisi Fragment Home dan Gallery
    6. 05/05/2019 01.08 AM : Mengisi Daily Fragment
    7. 05/05/2019 02.50 AM : Membuat Contact Call, Mail, dan Facebook di Profile Fragment
    8. 05/05/2019 05.09 AM : Membuat Map ,Marker Map, dan Custom Dialog About App
    9. 05/05/2019 06.42 AM : Fix Daily Fragment RecyclerView Adapter
    10.05/05/2019 10.04 AM : Membuat music player dan video player
    11.05/05/2019 21.50 PM : Fix Music Player

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
