package com.jacksen.transitiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MovieListActivity extends AppCompatActivity {

    private RecyclerView movieRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        movieRv = (RecyclerView) findViewById(R.id.movie_rv);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        movieRv.setLayoutManager(layoutManager);


        List<MovieBean> list = new ArrayList<>();
        MovieBean movieBean = new MovieBean();
        movieBean.setTitle("怦然心动");
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);
        list.add(movieBean);


        MovieListAdapter adapter = new MovieListAdapter(this, list);
        movieRv.setAdapter(adapter);

    }
}
