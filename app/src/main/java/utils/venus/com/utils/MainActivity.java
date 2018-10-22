package utils.venus.com.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView viewById = findViewById(R.id.recyclerview);

        viewById.setLayoutManager(new LinearLayoutManager(this));
        List<String> data = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            data.add(String.valueOf(i));
        }

        viewById.setAdapter(new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item, data) {

            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.test, item);

            }
        });

    }
}
