package com.iyer.shailesh.dbar;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.threed.jpct.Config;
import com.threed.jpct.Object3D;
import com.threed.jpct.Primitives;
import com.threed.jpct.SimpleVector;
import com.threed.jpct.Texture;
import com.threed.jpct.TextureManager;
import com.threed.jpct.World;
import com.threed.jpct.util.BitmapHelper;

import org.artoolkit.ar.base.ARToolKit;
import org.artoolkit.ar.base.NativeInterface;
import org.artoolkit.ar.jpct.ArJpctActivity;
import org.artoolkit.ar.jpct.TrackableObject3d;

import java.util.List;

public class ArActivity extends ArJpctActivity {
    private int position;
    public int UID;
    View view;
    TrackableObject3d tckobj;
    sqlitehelper sqlite;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);
        position=getIntent().getIntExtra("position",-1);
        view=findViewById(R.id.cameraLayout);
        sqlite=new sqlitehelper(this);
    }

    @Override
    protected FrameLayout supplyFrameLayout() {
        return (FrameLayout)this.findViewById(R.id.cameraLayout);
    }

    @Override
    public void configureWorld(World world) {
        Config.farPlane = 2000;
        world.setAmbientLight(255, 255, 255);
    }
    @Override
    public void onBackPressed(){
        ARToolKit.getInstance().cleanup();
        Intent returnIntent=new Intent();
        returnIntent.putExtra("position",position);
        setResult(RESULT_CANCELED,returnIntent);
        Log.e("Aractivity","On back presed");
        finish();
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.e("aractivity","on Resume");

    }
    @Override
    protected void populateTrackableObjects(List<TrackableObject3d> list) {
        //Trackable marker initializations
        NativeInterface.arwSetPatternDetectionMode(NativeInterface.AR_MATRIX_CODE_DETECTION);
        NativeInterface.arwSetMatrixCodeType(NativeInterface.AR_MATRIX_CODE_3x3_HAMMING63);

        Drawable dr;
        Texture texture;
        Object3D db= Primitives.getSphere(100);
        db.setOrigin(new SimpleVector(50, 50, 200));
        db.calcTextureWrapSpherical();

        if (position==0) {
            //Dragon Ball 1
            tckobj= new TrackableObject3d("single_barcode;0;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star1);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db1", texture);
            try{
                db.setTexture("db1");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        else if (position==1) {
            //Dragon Ball 2
            tckobj = new TrackableObject3d("single_barcode;1;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star2);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db2", texture);
            try{
                db.setTexture("db2");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        else if (position==2) {
            //Dragon Ball 3
            tckobj= new TrackableObject3d("single_barcode;2;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star3);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db3", texture);
            try{
                db.setTexture("db3");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        else if (position==3) {
            //Dragon Ball 4
            tckobj= new TrackableObject3d("single_barcode;3;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star4);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db4", texture);
            try{
                db.setTexture("db4");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        else if (position==4) {
            //Dragon Ball 5
            tckobj= new TrackableObject3d("single_barcode;4;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star5);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db5", texture);
            try{
                db.setTexture("db5");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);
        }
        else if (position==5) {
            //Dragon Ball 6
            tckobj= new TrackableObject3d("single_barcode;5;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star6);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db6", texture);
            try{
                db.setTexture("db6");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        else if (position==6) {
            //Dragon Ball 7
            tckobj = new TrackableObject3d("single_barcode;6;80");
            dr= ContextCompat.getDrawable(this,R.drawable.star7);
            texture = new Texture(BitmapHelper.rescale(BitmapHelper.convert(dr), 64, 64));
            TextureManager.getInstance().addTexture("db7", texture);
            try{
                db.setTexture("db7");
                tckobj.addChild(db);

            }
            catch(Exception e){
                e.printStackTrace();
            }
            list.add(tckobj);


        }
        Log.e("trackobjlist","reached end of method ");
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UID=tckobj.getmMarkerId();
                Log.e("Marker","searching marker with  "+UID);
                boolean markervisible= ARToolKit.getInstance().queryMarkerVisible(UID);
                Intent returnIntent= new Intent();
                if (markervisible){
                    sqlite.update_Status(position);
                    ARToolKit.getInstance().cleanup();
                    Log.e("Aractivity","Since caught exiting activity");
                    returnIntent.putExtra("position",position);
                    setResult(RESULT_OK,returnIntent);
                    finish();
                }

            }
        });
    }


}
