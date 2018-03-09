package com.example.emma119018.makermap;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng FGU = new LatLng(24.816226, 121.722100);
        mMap.addMarker(new MarkerOptions()
                .position(FGU)
                .title("佛光大學"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FGU));

        LatLng SBH = new LatLng(24.984116, 121.451362);
        mMap.addMarker(new MarkerOptions()
                .position(SBH)
                .title("新北高中Fablab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SBH));

        LatLng HCH = new LatLng(25.007288, 121.447562);
        mMap.addMarker(new MarkerOptions()
                .position(HCH)
                .title("華僑高中FabLab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(HCH));

        LatLng KMS = new LatLng(25.063048, 121.500932);
        mMap.addMarker(new MarkerOptions()
                .position(KMS)
                .title("Kick2real Maker Space"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KMS));

        LatLng YDU = new LatLng(24.995194, 121.453119);
        mMap.addMarker(new MarkerOptions()
                .position(YDU)
                .title("亞東技術學院工商業設計系"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(YDU));

        LatLng CH = new LatLng(24.994027, 121.478425);
        mMap.addMarker(new MarkerOptions()
                .position(CH)
                .title("創客中和"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CH));

        LatLng TUA = new LatLng(25.002459, 121.445736);
        mMap.addMarker(new MarkerOptions()
                .position(TUA)
                .title("國立台灣藝術大學文化創意產學園區"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TUA));

        LatLng DM = new LatLng(25.084958, 121.662885);
        mMap.addMarker(new MarkerOptions()
                .position(DM)
                .title("夢基地木創"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DM));

        LatLng S7W = new LatLng(24.976492, 121.541913);
        mMap.addMarker(new MarkerOptions()
                .position(S7W)
                .title("小七工作站"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(S7W));

        LatLng DLU = new LatLng(24.972325, 121.455768);
        mMap.addMarker(new MarkerOptions()
                .position(DLU)
                .title("德霖技術學院3D列印實驗室"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DLU));

        LatLng GJH = new LatLng(25.073832, 121.488675);
        mMap.addMarker(new MarkerOptions()
                .position(GJH)
                .title("私立格致高中學FabLab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GJH));

        LatLng RFJ = new LatLng(25.105614, 121.817488);
        mMap.addMarker(new MarkerOptions()
                .position(RFJ)
                .title("瑞芳國中"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RFJ));

        LatLng DNU = new LatLng(25.003296, 121.604445);
        mMap.addMarker(new MarkerOptions()
                .position(DNU)
                .title("東南科技大學數位模型製作空間"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DNU));

        LatLng IOT = new LatLng(25.066270, 121.449388);
        mMap.addMarker(new MarkerOptions()
                .position(IOT)
                .title("物聯網創客基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IOT));

        LatLng SHU = new LatLng(25.226969, 121.451654);
        mMap.addMarker(new MarkerOptions()
                .position(SHU)
                .title("聖約翰科技大學3D設計列印中心"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SHU));

        LatLng RS = new LatLng(25.058565, 121.543935);
        mMap.addMarker(new MarkerOptions()
                .position(RS)
                .title("3D如水同學會"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RS));

        LatLng FCT = new LatLng(25.044150, 121.529441);
        mMap.addMarker(new MarkerOptions()
                .position(FCT)
                .title("FabCafe Taipei"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FCT));


        mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
    }
}
