package utils.venus.com.utils;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        FrameLayout content = findViewById(R.id.framelayout);

        content.setBackgroundColor(Color.RED);


        {
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(100, 100));
            linearLayout.setBackgroundColor(Color.YELLOW);
            content.addView(linearLayout);
        }


        {
            LinearLayout linearLayout = new LinearLayout(this);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(200, 200);
            layoutParams.topMargin = 100;
            layoutParams.leftMargin = 100;
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setBackgroundColor(Color.BLUE);
            content.addView(linearLayout);
        }

    }
}
