package utils.venus.com.utils;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ViewFlipperActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private Button test;
    private Xxadapter xxadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_flipper);
        initView();
    }

    private void initView() {
        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        test = (Button) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                xxadapter.notifyItemChanged(0);
            }
        });
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

        List<String> imgs = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            imgs.add(String.valueOf(i));
        }
        xxadapter = new Xxadapter(imgs);
        recyclerview.setAdapter(xxadapter);
    }

    class Xxadapter extends BaseQuickAdapter<String, BaseViewHolder> {

        public Xxadapter(@Nullable List<String> data) {
            super(R.layout.item_viewflipper, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {


            Random myRandom = new Random();

            ViewFlipper viewFlipper = helper.getView(R.id.viewflipper);
            viewFlipper.removeAllViews();
            for (int i = 0; i <= 1; i++) {
                int ranColor = 0xff000000 | myRandom.nextInt(0x00ffffff);

                View view = LayoutInflater.from(getApplicationContext()).inflate(R.layout.item_viewflipper_nnn, null);

                viewFlipper.addView(view);
                view.setBackgroundColor(ranColor);

                Button viewById = view.findViewById(R.id.btn);
                int num = (int) ((Math.random() * 9 + 1) * 100000);
                viewById.setText(String.valueOf(num));


            }

        }
    }
}
