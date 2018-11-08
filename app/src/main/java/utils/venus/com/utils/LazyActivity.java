package utils.venus.com.utils;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import utils.venus.com.utils.adapter.MyViewPageAdapter;
import utils.venus.com.utils.fragment.Tab1Fragment;
import utils.venus.com.utils.fragment.Tab2Fragment;
import utils.venus.com.utils.fragment.Tab3Fragment;
import utils.venus.com.utils.fragment.Tab4Fragment;
import utils.venus.com.utils.fragment.Tab5Fragment;

public class LazyActivity extends AppCompatActivity {

    private TabLayout tlMain;
    private ViewPager vpMain;
    private MyViewPageAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lazy);
        tlMain = (TabLayout) findViewById(R.id.tablayout);
        tlMain.setTabMode(TabLayout.MODE_FIXED);


        vpMain = (ViewPager) findViewById(R.id.viewpager);

        ArrayList<String> titls = new ArrayList<>();

        titls.add("一");
        titls.add("二");
        titls.add("三");
        titls.add("四");
        titls.add("五");

        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new Tab1Fragment());
        fragments.add(new Tab2Fragment());
        fragments.add(new Tab3Fragment());
        fragments.add(new Tab4Fragment());
        fragments.add(new Tab5Fragment());
        adapter = new MyViewPageAdapter(getSupportFragmentManager(), titls, fragments);


        vpMain.setOffscreenPageLimit(3);
        vpMain.setAdapter(adapter);

        tlMain.setupWithViewPager(vpMain);

    }
}
