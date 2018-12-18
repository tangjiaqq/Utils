package utils.venus.com.utils;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.blankj.utilcode.util.AdaptScreenUtils;

public class AdaptationActivity extends AppCompatActivity {
    private static final String TAG = "AdaptationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaptation);

        Log.e(TAG, "onCreate: "+AdaptScreenUtils.pt2Px(100) );
    }

    @Override
    public Resources getResources() {
        return AdaptScreenUtils.adaptWidth(super.getResources(), 1080);

    }
}
