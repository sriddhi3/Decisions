package com.example.decisions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    // https://api.themoviedb.org/3/discover/movie?api_key=283011eaf99b080922d9984d75e9b8e4&language=en-US&include_adult=false&include_video=false&with_genres={}&certification_country=US&certification={}&vote_average.gte={}&sort_by=popularity.desc





}
