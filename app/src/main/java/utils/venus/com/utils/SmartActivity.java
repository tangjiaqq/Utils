package utils.venus.com.utils;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshLoadMoreListener;

import java.util.ArrayList;
import java.util.List;

public class SmartActivity extends AppCompatActivity {
    private SmartRefreshLayout smartRefreshLayout;
    private SmartRefreshLayout smartRefreshLayout1;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smart);


//        smartRefreshLayout = findViewById(R.id.refreshLayout);
        smartRefreshLayout1 = findViewById(R.id.refreshLayoutxxx);
        recyclerView = findViewById(R.id.recyclerView);

//
//        smartRefreshLayout.setEnableRefresh(false);
//        smartRefreshLayout.setEnableLoadMore(false);
//        smartRefreshLayout.setEnableOverScrollDrag(false);
//        smartRefreshLayout.setEnabled(false);
        /*里层*/
//        smartRefreshLayout1.setOnRefreshLoadMoreListener(new OnRefreshLoadMoreListener() {
//            @Override
//            public void onLoadMore(RefreshLayout refreshLayout) {
////                smartRefreshLayout1.finishLoadMore();
//
//            }
//
//            @Override
//            public void onRefresh(RefreshLayout refreshLayout) {
//
//                Toast.makeText(SmartActivity.this, "刷新完成", Toast.LENGTH_SHORT).show();
//
//                smartRefreshLayout1.finishRefresh();
//
//            }
//        });

//
        smartRefreshLayout1.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(RefreshLayout refreshLayout) {


            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {

            list.add(String.valueOf(i));
        }

        recyclerView.setAdapter(new BaseQuickAdapter<String, BaseViewHolder>(R.layout.item, list) {

            @Override
            protected void convert(BaseViewHolder helper, String item) {
                helper.setText(R.id.test, item);

            }
        });
    }
}
