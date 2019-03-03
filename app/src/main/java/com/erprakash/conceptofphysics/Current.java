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
public class Current extends Fragment {

    WebView fordisplay;
    public Current() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_current, container, false);
        fordisplay = (WebView)view.findViewById(R.id.displayCurrent);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("http://appointer-backend-api.herokuapp.com ");
        return view;
    }

}
