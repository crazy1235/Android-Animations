package com.jacksen.vectordemo;

import android.graphics.drawable.Animatable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    private ImageView searchIv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.image_view);

        ((Animatable) (imageView.getDrawable())).start();

        searchIv = (ImageView) findViewById(R.id.search_iv);

        ((Animatable) (searchIv.getDrawable())).start();
    }
}
