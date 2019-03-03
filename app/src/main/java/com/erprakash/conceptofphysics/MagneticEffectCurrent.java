package com.erprakash.conceptofphysics;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class MagneticEffectCurrent extends Fragment {


    public MagneticEffectCurrent() {

    }

    WebView fordisplay ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_magnetic_effect_current, container, false);
        fordisplay = (WebView)view.findViewById(R.id.displayCurrent);
        fordisplay.getSettings().setJavaScriptEnabled(true);
        fordisplay.getSettings().setBuiltInZoomControls(true);
        fordisplay.loadUrl("http://appointer-backend-api.herokuapp.com");

        fordisplay.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });
        return view;
    }

}
