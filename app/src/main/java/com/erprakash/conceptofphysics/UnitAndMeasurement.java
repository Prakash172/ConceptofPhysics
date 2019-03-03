package com.erprakash.conceptofphysics;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;

import java.io.IOException;


/**
 * A simple {@link Fragment} subclass.
 */
public class UnitAndMeasurement extends Fragment {
    WebView fordisplay ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
            View view =inflater.inflate(R.layout.fragment_unit_and_measurement, container, false);
        fordisplay = (WebView)view.findViewById(R.id.formula);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("file:///android_asset/chapter2.html");

        return view;
    }

}
