package com.erprakash.conceptofphysics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentCallingActivity extends AppCompatActivity {
    View view;
    int resId ;
    TextView ch1,ch15;
    Bundle extras ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_calling);

        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        final android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        final PhysicalWrold chapter1 = new PhysicalWrold();
        final Wave wave = new Wave();
        Electrostatics electrostatic = new Electrostatics();
        Current current = new Current();
        ElectroPotential ep = new ElectroPotential();
        UnitAndMeasurement unit =  new UnitAndMeasurement();
        Calculator calculator  = new Calculator();
        MotionStraightLine mt = new MotionStraightLine();
        MotionInPlane mp = new MotionInPlane();
        view = new View(this);
        ch1 = (TextView)findViewById(R.id.chapter1);
        ch15 = (TextView)findViewById(R.id.chapter15);
        extras = getIntent().getExtras();
        resId = extras.getInt("key");
        switch(resId){
            case R.id.chapter1:
                fragmentTransaction.add(R.id.fragment_container,chapter1);
                fragmentTransaction.commit();
                break;
            case R.id.chapter2:
                fragmentTransaction.add(R.id.fragment_container,unit);
                fragmentTransaction.commit();
                break;

            case R.id.chapter3:
                fragmentTransaction.add(R.id.fragment_container,mt);
                fragmentTransaction.commit();
                break;

            case R.id.chapter4:
                fragmentTransaction.add(R.id.fragment_container,mp);
                fragmentTransaction.commit();
                break;
            case R.id.chapter15:
                fragmentTransaction.add(R.id.fragment_container,wave);
                fragmentTransaction.commit();
                break;
            case R.id.chapter16:
                fragmentTransaction.add(R.id.fragment_container,electrostatic);
                fragmentTransaction.commit();
                break;
            case R.id.chapter17:
                fragmentTransaction.add(R.id.fragment_container,ep);
                fragmentTransaction.commit();
                break;
            case R.id.chapter18:
                fragmentTransaction.add(R.id.fragment_container,current);
                fragmentTransaction.commit();
                break;

            case R.id.calculator:
                fragmentTransaction.add(R.id.fragment_container,calculator);
                fragmentTransaction.commit();
                break;
            default:
                Toast.makeText(this, "not working", Toast.LENGTH_SHORT).show();
        }


    }


}
