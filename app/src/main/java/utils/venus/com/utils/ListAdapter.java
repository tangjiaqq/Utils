package utils.venus.com.utils;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.chad.library.adapter.base.util.MultiTypeDelegate;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
    private List<View> viewList = new ArrayList<View>();

    public ListAdapter() {
        super( null);


        setMultiTypeDelegate(new MultiTypeDelegate<String>() {
            @Override
            protected int getItemType(String entity) {
                //根据你的实体类来判断布局类型
                return 1;
            }
        });
        //Step.2
        getMultiTypeDelegate()
                .registerItemType(1, R.layout.item)
                .registerItemType(2, R.layout.item_img);

    }

    @Override
    protected void convert(BaseViewHolder helper, String item) {

        switch (helper.getItemViewType()){
            case 1:
                ViewPager view = helper.getView(R.id.viewpager);
                final Button view1 = helper.getView(R.id.test);

                for (String s : getData()) {

                    ImageView imageView=new ImageView(mContext);

                    Glide.with(mContext).load(s).into(imageView);
                    viewList.add(imageView);
                }
                view.setAdapter(new ViewAdapter(viewList));
                view.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {

                        view1.setText(String.valueOf(position)+"/"+viewList.size());
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });
                break;
            case 2:
                ImageView imageView = helper.getView(R.id.image);
                Glide.with(mContext).load(item).into(imageView);
                break;
        }


    }

    @Override
    public int getItemViewType(int position) {
        return position==0?1:2;
    }
}
