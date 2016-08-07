package com.jacksen.transitiondemo;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.ChangeBounds;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

/**
 * @author jacksen
 */
public class MainActivity extends AppCompatActivity {

    private Scene aScene;
    private Scene bScene;

    private FrameLayout rootScene;

    private Button nextSceneBtn;

    private Button movieListBtn;

    private boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootScene = (FrameLayout) findViewById(R.id.scene_root);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            aScene = Scene.getSceneForLayout(rootScene, R.layout.a_scene, this);
            bScene = Scene.getSceneForLayout(rootScene, R.layout.b_scene, this);
        }

        nextSceneBtn = (Button) findViewById(R.id.next_scene_btn);

        nextSceneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    if (flag) {
                        TransitionManager.go(aScene, new ChangeBounds());
                        flag = false;
                    } else {
                        TransitionManager.go(bScene, new ChangeBounds());
                        flag = true;
                    }
                }
            }
        });

        movieListBtn = (Button) findViewById(R.id.movie_list_btn);
        movieListBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MovieListActivity.class));
            }
        });
    }
}
