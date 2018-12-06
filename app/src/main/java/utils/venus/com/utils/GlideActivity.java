package utils.venus.com.utils;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.SpanUtils;
import com.blankj.utilcode.util.Utils;
import com.bumptech.glide.Glide;

public class GlideActivity extends AppCompatActivity {

    private int length;
    private EditText viewById;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        ImageView imageView = findViewById(R.id.img);


        Glide.with(this)
                .load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1543062126046&di=a22c9607cd1164ffe4691f5449eeda0d&imgtype=0&src=http%3A%2F%2Fimg2.3lian.com%2F2014%2Ff4%2F139%2Fd%2F119.jpg")


//                .override(1080, 1920 / 1080 * 1080)
//                .override(0, 0)
                .into(imageView);

        Utils.init(this);

        viewById = findViewById(R.id.et);
// 响应点击事件的话必须设置以下属性
        viewById.setMovementMethod(LinkMovementMethod.getInstance());

        SpanUtils spanUtils = new SpanUtils();

        spanUtils.append("#xxxx#");

        length = "#xxxx#".length();


        viewById.setText(spanUtils.create());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SpanUtils spanUtils1 = new SpanUtils();

                spanUtils1.append("#话题#").setClickSpan(new ClickableSpan() {
                    @Override
                    public void onClick(@NonNull View widget) {

                    }
                });


                spanUtils1.append(viewById.getText().toString());

                viewById.setText(spanUtils1.create());

            }
        });


    }
}
