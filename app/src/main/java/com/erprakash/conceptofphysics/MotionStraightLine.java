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
public class MotionStraightLine extends Fragment {


    private WebView fordisplay;

    public MotionStraightLine() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_motion_straight_line, container, false);
        fordisplay = (WebView)view.findViewById(R.id.display);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("file:///android_asset/chapter3.html");

        return view;
    }

}
