package com.erprakash.conceptofphysics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView cha1 = (TextView) findViewById(R.id.chapter1);
        TextView cha2 = (TextView) findViewById(R.id.chapter2);
        TextView cha3 = (TextView) findViewById(R.id.chapter3);
        TextView cha4 = (TextView) findViewById(R.id.chapter4);
        TextView cha5 = (TextView) findViewById(R.id.chapter5);
        TextView cha6 = (TextView) findViewById(R.id.chapter6);
        TextView cha7 = (TextView) findViewById(R.id.chapter7);
        TextView cha8 = (TextView) findViewById(R.id.chapter8);
        TextView cha9 = (TextView) findViewById(R.id.chapter9);
        TextView cha10 = (TextView) findViewById(R.id.chapter10);
        TextView cha11 = (TextView) findViewById(R.id.chapter11);
        TextView cha12 = (TextView) findViewById(R.id.chapter12);
        TextView cha13 = (TextView) findViewById(R.id.chapter13);
        TextView cha14 = (TextView) findViewById(R.id.chpater14);
        TextView cha15 = (TextView) findViewById(R.id.chapter15);
        TextView cha16 = (TextView) findViewById(R.id.chapter16);
        TextView cha17 = (TextView) findViewById(R.id.chapter17);
        TextView cha18 = (TextView) findViewById(R.id.chapter18);
        TextView calc = (TextView) findViewById(R.id.calculator);

        /*
        VideoView vid = (VideoView)findViewById(R.id.video);
        MediaController mc= new MediaController(this);
        String path = "android.resource://com.erprakash.conceptofphysics/"+R.raw.back;
        vid.setVideoURI(Uri.parse(path));
        vid.requestFocus();
        vid.setMediaController(mc);
        vid.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f,0f);
                mp.setLooping(true);
            }
        });
        vid.start();
        */
        extras = new Bundle();

        cha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter1);
                Intent ch1 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch1.putExtras(extras);
                startActivity(ch1);

            }
        });
        cha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter2);
                Intent ch1 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch1.putExtras(extras);
                startActivity(ch1);
                // Toast.makeText(getApplicationContext(),"Have some patience",Toast.LENGTH_SHORT).show();
            }
        });

        cha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter3);
                Intent ch1 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch1.putExtras(extras);
                startActivity(ch1);
                // Toast.makeText(getApplicationContext(),"Have some patience",Toast.LENGTH_SHORT).show();
            }
        });

        cha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter4);
                Intent ch1 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch1.putExtras(extras);
                startActivity(ch1);
                //Toast.makeText(getApplicationContext(),"Have some patience",Toast.LENGTH_SHORT).show();
            }
        });

        cha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });

        cha6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });

        cha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });
        cha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });
        cha9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });

        cha10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });

        cha11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });

        cha12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });
        cha13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });
        cha14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Have some patience", Toast.LENGTH_SHORT).show();
            }
        });
        cha15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter15);
                Intent ch15 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch15.putExtras(extras);
                startActivity(ch15);
            }
        });

        cha16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter16);
                Intent ch16 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch16.putExtras(extras);
                startActivity(ch16);
            }
        });
        cha17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter17);
                Intent ch17 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch17.putExtras(extras);
                startActivity(ch17);
            }
        });
        cha18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.chapter18);
                Intent ch18 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch18.putExtras(extras);
                startActivity(ch18);
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extras.putInt("key", R.id.calculator);
                Intent ch15 = new Intent(getApplicationContext(), FragmentCallingActivity.class);
                ch15.putExtras(extras);
                startActivity(ch15);
            }
        });
    }
}
