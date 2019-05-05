package com.kwhyr.rizkyapps.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.kwhyr.rizkyapps.R;

public class DetailActivity extends AppCompatActivity {
    ImageView mPlace;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mPlace = findViewById(R.id.imageView);
        Bundle mBundle = getIntent().getExtras();
        if(mBundle != null){
            mPlace.setImageResource(mBundle.getInt("Image"));
        }
    }
}
