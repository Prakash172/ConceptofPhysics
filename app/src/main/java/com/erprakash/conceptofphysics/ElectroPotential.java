package com.erprakash.conceptofphysics;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ElectroPotential extends Fragment {
    WebView fordisplay;

    public ElectroPotential() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_electro_potential, container, false);
        fordisplay = (WebView)view.findViewById(R.id.displayPotential);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("file:///android_asset/potential.html");
        return view;
    }

}
