package com.erprakash.conceptofphysics;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


public class Electrostatics extends Fragment {

    WebView fordisplay;
    public Electrostatics() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_electrostatics, container, false);
        fordisplay = (WebView)view.findViewById(R.id.displayElectro);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("file:///android_asset/current.html");
        return view;  }


}

