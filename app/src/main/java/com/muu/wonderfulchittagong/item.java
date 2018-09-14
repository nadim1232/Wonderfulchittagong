package com.muu.wonderfulchittagong;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class item extends AppCompatActivity {

    TextView nameTextView,detailsTextView;
    ImageView imageView;
    WebView webView;

    Integer imageID;
    String nameText;
    String details;
    String loadUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        imageView=findViewById(R.id.ImageViewID);
        nameTextView=findViewById(R.id.nameTextViewID);
        detailsTextView=findViewById(R.id.detailsViewID);
        webView=findViewById(R.id.webViewId);

        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();

        imageID=bundle.getInt("imageID",0);
        nameText=bundle.getString("content_name",null);
        details=bundle.getString("content_details",null);
        loadUrl=bundle.getString("url",null);

        imageView.setImageResource(imageID);
        nameTextView.setText(nameText);
        detailsTextView.setText(details);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(loadUrl);
    }


}
