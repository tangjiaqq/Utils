package utils.venus.com.utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<String> get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

       get= new ArrayList<>();
        getlist();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);


        recyclerView.setLayoutManager(linearLayoutManager);
        ListAdapter listAdapter=new ListAdapter();
        recyclerView.setAdapter(listAdapter);

        listAdapter.setNewData(get);

    }

    private void getlist(){

        get.add("http://g.hiphotos.baidu.com/image/pic/item/5243fbf2b211931376d158d568380cd790238dc1.jpg");
        get.add("http://a.hiphotos.baidu.com/image/pic/item/4a36acaf2edda3ccc4a53e450ce93901213f9216.jpg");
        get.add("http://f.hiphotos.baidu.com/image/pic/item/63d0f703918fa0ec3551b4662b9759ee3c6ddbc3.jpg");
        get.add("http://e.hiphotos.baidu.com/image/pic/item/4b90f603738da9773ded4541bd51f8198718e39e.jpg");
    }


}
