package demo.dankim.com.mvvmrecyclerviewwithdatabind;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import demo.dankim.com.mvvmrecyclerviewwithdatabind.adapters.NewsRecyclerViewAdapter;
import demo.dankim.com.mvvmrecyclerviewwithdatabind.models.News;
import demo.dankim.com.mvvmrecyclerviewwithdatabind.viewmodels.NewsModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private NewsRecyclerViewAdapter adapter;
    private List<NewsModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new NewsRecyclerViewAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        setData();
    }

    private void setData() {

        NewsModel newsModel;

        newsModel = new NewsModel();
        newsModel.title = "Title 1";
        newsModel.desc = "Title 1";
        list.add(newsModel);

        newsModel = new NewsModel();
        newsModel.title = "Title 2";
        newsModel.desc = "Title 2";
        list.add(newsModel);


        newsModel = new NewsModel();
        newsModel.title = "Title 3";
        newsModel.desc = "Title 3";
        list.add(newsModel);

        newsModel = new NewsModel();
        newsModel.title = "Title 4";
        newsModel.desc = "Title 4";
        list.add(newsModel);
    }
}
