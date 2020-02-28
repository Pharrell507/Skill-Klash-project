package com.example.skillklashv10alpha.Pantallas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.skillklashv10alpha.Adapters.NewsAdapter;
import com.example.skillklashv10alpha.ArrayLists.Newsdb;
import com.example.skillklashv10alpha.R;

import java.util.ArrayList;

public class activity_home extends AppCompatActivity {

    private RecyclerView mNewsView;
    private RecyclerView.Adapter mNewsAdapter;
    private RecyclerView.LayoutManager mlayoutManager;

    ArrayList<Newsdb> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        news = new ArrayList<>();
        mNewsView = (RecyclerView) findViewById(R.id.my_news_view);
        mlayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        mNewsAdapter = new NewsAdapter(news);

        Cargarnews();
        mNewsView.setHasFixedSize(true);
        mNewsView.setLayoutManager(mlayoutManager);
        mNewsView.setAdapter(mNewsAdapter);

    }

    private void Cargarnews() {
        news.add(new Newsdb(R.drawable.mario));
        news.add(new Newsdb(R.drawable.layton));
        news.add(new Newsdb(R.drawable.dante));
        news.add(new Newsdb(R.drawable.phoenix));
        news.add(new Newsdb(R.drawable.sora));
        news.add(new Newsdb(R.drawable.maxresdefault));
    }
}
