package utils.venus.com.utils;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.Utils;
import com.leibown.library.utils.DisplayUtil;

public class SpanActivity extends AppCompatActivity {

    private TextView mTv1;
    private TextView mTv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_span);

        Utils.init(this);
        mTv1 = (TextView) findViewById(R.id.tv1);
        mTv2 = (TextView) findViewById(R.id.tv2);


        {
            SpanUtils spanUtils = new SpanUtils();
//            spanUtils.append("地址").setFontSize(14, true);
            spanUtils.appendSpace(DisplayUtil.sp2px(this, 14) * 2);

            mTv1.setText(spanUtils.create());
        }

        {
            SpanUtils spanUtils = new SpanUtils();
            spanUtils.append("联系").setFontSize(DisplayUtil.sp2px(this, 14));
            mTv2.setText(spanUtils.create());
        }

        mTv1.setBackgroundColor(Color.RED);
        mTv2.setBackgroundColor(Color.RED);

    }

}
