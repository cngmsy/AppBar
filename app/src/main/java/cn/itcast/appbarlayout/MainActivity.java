package cn.itcast.appbarlayout;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    private CollapsingToolbarLayout collapsing_toolbar_layout;
    private CoordinatorLayout activity_main;
    private RecyclerView recycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //new CoordinatorLayout();
    }

    private void initView() {
        collapsing_toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        activity_main = (CoordinatorLayout) findViewById(R.id.activity_main);
        collapsing_toolbar_layout.setTitle("上海黑马程序员");
        collapsing_toolbar_layout.setExpandedTitleColor(Color.GREEN);
        collapsing_toolbar_layout.setCollapsedTitleTextColor(Color.RED);
        recycler_view = (RecyclerView) findViewById(R.id.recycler_view);
        recycler_view.setAdapter(new MyAdapter());
        recycler_view.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }

    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view=View.inflate(getApplicationContext(),R.layout.recyclerview,null);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 10;
        }
    }
    private class MyViewHolder extends RecyclerView.ViewHolder{
        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
