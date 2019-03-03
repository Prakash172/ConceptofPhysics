package com.erprakash.conceptofphysics;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;

import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MotionInPlane extends Fragment {

    ProgressBar pb;
    WebView wb ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_motion_in_plane, container, false);
        pb = (ProgressBar) view.findViewById(R.id.progressBar);
        wb = (WebView) view.findViewById(R.id.motionWeb);
        wb.getSettings().setJavaScriptEnabled(true);
        wb.setWebViewClient(new myWebClient());
        wb.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (keyCode == KeyEvent.KEYCODE_BACK
                        && event.getAction() == MotionEvent.ACTION_UP
                        && wb.canGoBack()) {
                    handler.sendEmptyMessage(1);
                    return true;
                }

                return false;
            }
        });
        wb.setPadding(0,0,0,0);
        wb.setInitialScale(getScale());
        wb.loadUrl("file:///android_asset/home.html");
        return view;
    }
    private int getScale()
    {

        Point size = new Point();
        Display display = ((WindowManager)getActivity().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        display.getSize(size);
        int width = size.x;
        Double val = width/800d;
        return val.intValue();
    }

    public class myWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            // TODO Auto-generated method stub
            pb.setVisibility(View.VISIBLE);
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub

            view.loadUrl(url);
            return true;

        }

        @Override
        public void onReceivedError(WebView view, int errorCode,
                                    String description, String failingUrl) {
            // TODO Auto-generated method stub
            Toast.makeText(getContext(), "Oh no! " + description, Toast.LENGTH_SHORT).show();
            //super.onReceivedError(view, errorCode, description, failingUrl);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            // TODO Auto-generated method stub
            super.onPageFinished(view, url);

            pb.setVisibility(View.GONE);
        }
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:{
                    webViewGoBack();
                }break;
            }
        }
    };
    private void webViewGoBack(){
        wb.goBack();
    }

}



