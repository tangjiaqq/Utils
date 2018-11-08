package utils.venus.com.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class WebviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        WebView viewById = findViewById(R.id.webview);
        viewById.loadUrl("http://192.168.2.167:8081/ProductDetail/src/index.html?_ijt=tunkho5m5tma9jkbbkcm6aa4b6");

        viewById.getSettings().setJavaScriptEnabled(true);
    }
}
