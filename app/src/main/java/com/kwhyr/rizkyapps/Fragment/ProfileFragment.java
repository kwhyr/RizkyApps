package com.kwhyr.rizkyapps.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kwhyr.rizkyapps.R;

public class ProfileFragment extends Fragment implements OnMapReadyCallback {
    View v;
    ImageView fb,mail,call;
    GoogleMap mgoogleMap;
    private static final LatLng home = new LatLng(-6.892922, 107.620278);
    MapView mapView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_profile, container, false);
        fb = v.findViewById(R.id.imgfb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://fb.com/nommaker")));
            }
        });
        mail = v.findViewById(R.id.imgmail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:rizkyc993@gmail.com")));
            }
        });
        call = v.findViewById(R.id.imgcall);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+6281223566695")));
            }
        });
        Button btShow = v.findViewById(R.id.aboutapp);
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Initiate Custom Dialog
                 */
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.about_customdialog);
                dialog.setTitle("About this App");

                /**
                 * Mengeset komponen dari custom dialog
                 */
                TextView text = dialog.findViewById(R.id.tv_desc);
                text.setText("Rizky Apps\nVersion 1.0");
                ImageView image = dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButton = dialog.findViewById(R.id.bt_ok);
                /**
                 * Jika tombol diklik, tutup dialog
                 */
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = v.findViewById(R.id.mapid);
        if (mapView != null) {
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        mgoogleMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(home).title("This is where i live").snippet("Jln. Haur Mekar no E19"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(home, 17));

    }
}
