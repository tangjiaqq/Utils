package utils.venus.com.utils.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.leibown.lcfn_library.LcfnLazyLoadBaseFragment;
import com.leibown.library.MultifunctionalLazyLoadFragment;

import utils.venus.com.utils.R;

public class Tab1Fragment extends LcfnLazyLoadBaseFragment {
    private static final String TAG = "Tab1Fragment";

    @Override
    public void ButterKnifeInit(View view) {

    }

    @Override
    public void unbindButterKnife() {

    }

    @Override
    protected void initViews() {

    }

    @Override
    protected void loadData() {
        Log.e(TAG, "loadData: ");

    }


    @Override
    public int getResId() {
        return R.layout.fragment_tab1;
    }


}
