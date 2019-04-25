package utils.venus.com.utils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.tang.Utils;

import java.util.ArrayList;
import java.util.List;

import utils.venus.com.entity.MainCalss;

public class MainActivity extends AppCompatActivity {

    private BaseQuickAdapter<MainCalss, BaseViewHolder> baseQuickAdapter;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: " + getPackageName());

        Utils.Test();
        RecyclerView viewById = findViewById(R.id.recyclerview);

        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();

        pagerSnapHelper.attachToRecyclerView(viewById);

        viewById.setLayoutManager(new GridLayoutManager(this, 3));
        List<MainCalss> data = new ArrayList<>();

        data.add(new MainCalss(ViewFlipperActivity.class, "轮播"));
        data.add(new MainCalss(GlideActivity.class, "Glide"));
        data.add(new MainCalss(SpanActivity.class, "Span"));
        data.add(new MainCalss(FrameActivity.class, "FrameActivity"));
        data.add(new MainCalss(AdaptationActivity.class, "AdaptationActivity"));
        data.add(new MainCalss(NotificationActivity.class, "Nofi"));
        data.add(new MainCalss(SmartActivity.class, "Smart"));


        baseQuickAdapter = new BaseQuickAdapter<MainCalss, BaseViewHolder>(R.layout.item, data) {

            @Override
            protected void convert(BaseViewHolder helper, MainCalss item) {
                helper.setText(R.id.test, item.getName());
                helper.addOnClickListener(R.id.test);

            }
        };
        viewById.setAdapter(baseQuickAdapter);
        baseQuickAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                Intent intent = new Intent(MainActivity.this, baseQuickAdapter.getItem(position).getaClass());
                startActivity(intent);
            }
        });
    }
}
