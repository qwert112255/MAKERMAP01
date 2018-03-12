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

        LatLng FBT = new LatLng(25.029191, 121.516080);
        mMap.addMarker(new MarkerOptions()
                .position(FBT)
                .title("Fablab Taipei"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(FBT));

        LatLng MBT = new LatLng(25.041241, 121.529483);
        mMap.addMarker(new MarkerOptions()
                .position(MBT)
                .title("Markerbar Taipei"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MBT));

        LatLng MP = new LatLng(25.025042, 121.523137);
        mMap.addMarker(new MarkerOptions()
                .position(MP)
                .title("MakerPro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MP));

        LatLng NTU = new LatLng(25.015200, 121.537509);
        mMap.addMarker(new MarkerOptions()
                .position(NTU)
                .title("NTUMaker台灣大學"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NTU));

        LatLng OT = new LatLng(25.010834, 121.532407);
        mMap.addMarker(new MarkerOptions()
                .position(OT)
                .title("Openlab Taipei"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(OT));

        LatLng TH = new LatLng(25.052901, 121.516884);
        mMap.addMarker(new MarkerOptions()
                .position(TH)
                .title("Taipei Hackerspace"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TH));

        LatLng TSE = new LatLng(24.990414, 121.559161);
        mMap.addMarker(new MarkerOptions()
                .position(TSE)
                .title("私立再興小學FabLab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TSE));

        LatLng TTU = new LatLng(25.009193, 121.539071);
        mMap.addMarker(new MarkerOptions()
                .position(TTU)
                .title("國立台灣科技大學"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TTU));

        LatLng TUD = new LatLng(25.024624, 121.544637);
        mMap.addMarker(new MarkerOptions()
                .position(TUD)
                .title("國立台北教育大學創意自造中心&創客實驗室"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TUD));

        LatLng TNU = new LatLng(25.025951, 121.527489);
        mMap.addMarker(new MarkerOptions()
                .position(TNU)
                .title("國立臺灣師範大學自造大師基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TNU));

        LatLng DMC = new LatLng(25.071328, 121.595649);
        mMap.addMarker(new MarkerOptions()
                .position(DMC)
                .title("國防醫學院Fablab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DMC));

        LatLng SCU = new LatLng(25.083272, 121.545147);
        mMap.addMarker(new MarkerOptions()
                .position(SCU)
                .title("實踐大學媒體傳達設計學系FABLAB"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SCU));

        LatLng DTU = new LatLng(25.067154, 121.521804);
        mMap.addMarker(new MarkerOptions()
                .position(DTU)
                .title("大同大學未來產房"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DTU));

        LatLng LDD = new LatLng(25.022494, 121.529927);
        mMap.addMarker(new MarkerOptions()
                .position(LDD)
                .title("綠點點點點 - 社區營造基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LDD));

        LatLng TY = new LatLng(25.038982, 121.522255);
        mMap.addMarker(new MarkerOptions()
                .position(TY)
                .title("台北市青少年發展處創新學習基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TY));

        LatLng YYD = new LatLng(25.085563, 121.523113);
        mMap.addMarker(new MarkerOptions()
                .position(YYD)
                .title("英業達雲豹1號夢工廠"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(YYD));

        LatLng TNUH = new LatLng(25.033659, 121.540488);
        mMap.addMarker(new MarkerOptions()
                .position(TNUH)
                .title("師大附中附製工坊"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(TNUH));

        LatLng MK = new LatLng(25.040631, 121.538083);
        mMap.addMarker(new MarkerOptions()
                .position(MK)
                .title("魅客空間"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MK));

        LatLng IF = new LatLng(25.042729, 121.538529);
        mMap.addMarker(new MarkerOptions()
                .position(IF)
                .title("點子工廠 / 自造工坊"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IF));

        LatLng DMS = new LatLng(25.135276, 121.729937);
        mMap.addMarker(new MarkerOptions()
                .position(DMS)
                .title("3D創客新學園"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(DMS));

        LatLng CYU = new LatLng(25.131924, 121.754456);
        mMap.addMarker(new MarkerOptions()
                .position(CYU)
                .title("崇右技術學院創意商品設計系"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CYU));

        LatLng AL = new LatLng(24.968420, 121.195666);
        mMap.addMarker(new MarkerOptions()
                .position(AL)
                .title("Ark Lab多旋翼工坊"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AL));

        LatLng LHU = new LatLng(25.017519, 121.402853);
        mMap.addMarker(new MarkerOptions()
                .position(LHU)
                .title("龍華科技大學Fablab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LHU));

        LatLng NLU = new LatLng(24.978016, 121.255741);
        mMap.addMarker(new MarkerOptions()
                .position(NLU)
                .title("內壢高中FabLab"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NLU));

        LatLng NCU = new LatLng(24.968420, 121.195666);
        mMap.addMarker(new MarkerOptions()
                .position(NCU)
                .title("中央大學創意園區"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NCU));

        LatLng CYM = new LatLng(24.957498, 121.240539);
        mMap.addMarker(new MarkerOptions()
                .position(CYM)
                .title("中原大學創客夢工廠"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(CYM));

        LatLng NYU = new LatLng(24.936878, 121.251668);
        mMap.addMarker(new MarkerOptions()
                .position(NYU)
                .title("南亞技術學院 南工創意實驗室"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NYU));

        LatLng GTR = new LatLng(25.006105, 121.235557);
        mMap.addMarker(new MarkerOptions()
                .position(GTR)
                .title("鋼鐵人實作基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GTR));

        LatLng YC = new LatLng(24.965753, 121.225882);
        mMap.addMarker(new MarkerOptions()
                .position(YC)
                .title("青創指揮部"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(YC));

        LatLng ICFA = new LatLng(24.888284, 121.133733);
        mMap.addMarker(new MarkerOptions()
                .position(ICFA)
                .title("衣啟飛翔創客基地"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ICFA));


        mMap.animateCamera(CameraUpdateFactory.zoomTo(7));
    }
}
