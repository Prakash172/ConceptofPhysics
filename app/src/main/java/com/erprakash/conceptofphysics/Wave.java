package com.erprakash.conceptofphysics;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import uk.co.senab.photoview.PhotoViewAttacher;


public class Wave extends Fragment {
    ImageView properties ;
    WebView wb ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.activity_wave, container, false);
        /* it was for video
        MediaController mc= new MediaController(getActivity());
        final VideoView vview = (VideoView)view.findViewById(R.id.video1);
        String path = "android.resource://com.erprakash.conceptofphysics/"+R.raw.ltwaves;
        vview.setVideoURI(Uri.parse(path));
        vview.requestFocus();
        vview.setMediaController(mc);
        vview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
                mp.setVolume(0f,0f);
            public void onPrepared(MediaPlayer mp) {
            }
        });
        vview.start();
        */
        // Adding animation
        wb = (WebView)view.findViewById(R.id.video1);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.getSettings().setBuiltInZoomControls(true);
        wb.loadUrl("file:///android_asset/simulations/wave_on_string.html");
        //----------Adding zoom effect on imageView-----------
        final TextView type_of_waves = (TextView)view.findViewById(R.id.wave_types);
        final TextView tv= (TextView)view.findViewById(R.id.types_of_wave_thoery);
        type_of_waves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String theory = getResources().getString(R.string.types_of_wave);
                   tv.setText(theory);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText("");
            }
        });
        properties = (ImageView)view.findViewById(R.id.prop);
        PhotoViewAttacher pAttacher;
        pAttacher = new PhotoViewAttacher(properties);
        pAttacher.update();
        //-------------zoom done------------------------------
        return view;
    }
}
