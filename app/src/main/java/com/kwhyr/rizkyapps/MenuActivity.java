package com.kwhyr.rizkyapps;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.kwhyr.rizkyapps.Fragment.DailyFragment;
import com.kwhyr.rizkyapps.Fragment.GalleryFragment;
import com.kwhyr.rizkyapps.Fragment.HomeFragment;
import com.kwhyr.rizkyapps.Fragment.MusicvideoFragment;
import com.kwhyr.rizkyapps.Fragment.ProfileFragment;

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

public class MenuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        setTitle("Home");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_Home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_Home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                setTitle("Home");
                break;
            case R.id.nav_DailyActivity:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DailyFragment()).commit();
                setTitle("Daily Activity");
                break;
            case R.id.nav_Gallery:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new GalleryFragment()).commit();
                setTitle("Gallery");
                break;
            case R.id.nav_MV:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MusicvideoFragment()).commit();
                setTitle("Music & Video");
                break;
            case R.id.nav_Profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ProfileFragment()).commit();
                setTitle("Profile");
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
