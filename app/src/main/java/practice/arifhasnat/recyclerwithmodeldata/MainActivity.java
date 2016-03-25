package practice.arifhasnat.recyclerwithmodeldata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import practice.arifhasnat.recyclerwithmodeldata.Adapter.AdapterForRecyler;
import practice.arifhasnat.recyclerwithmodeldata.Model.ItemData;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);


        ItemData itemData[] = {new ItemData(R.drawable.image1, "flowerOne"),new ItemData(R.drawable.image1, "flowerOne")
        ,new ItemData(R.drawable.image1, "flowerOne"),new ItemData(R.drawable.image1, "flowerOne"),new ItemData(R.drawable.image1, "flowerOne"),new ItemData(R.drawable.image1, "flowerOne")
        ,new ItemData(R.drawable.image1, "flowerOne")};

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        mAdapter = new AdapterForRecyler(itemData);
        mRecyclerView.setAdapter(mAdapter);


    }


}
