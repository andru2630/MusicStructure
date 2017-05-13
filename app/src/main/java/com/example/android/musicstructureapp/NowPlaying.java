package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageView playButton;
        ImageView fastForwardButton;
        ImageView fastRewindButton;
        ImageView skipPreviousButton;
        ImageView skipNextButton;
        ImageView shuffleButton;
        ImageView repeatButton;
        ImageView favoriteButton;
        ImageView purchaseSongButton;
        ImageView favoriteSongsButton;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        playButton = (ImageView) findViewById(R.id.play);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for playing a song will be added", Toast.LENGTH_SHORT).show();
            }
        });
        fastForwardButton = (ImageView) findViewById(R.id.fast_forward);
        fastForwardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for fast forward will be added", Toast.LENGTH_SHORT).show();

            }
        });
        fastRewindButton = (ImageView) findViewById(R.id.fast_rewind);
        fastRewindButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for fast rewind will be added", Toast.LENGTH_SHORT).show();
            }
        });
        skipPreviousButton = (ImageView) findViewById(R.id.skip_previous);
        skipPreviousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for skip previous will be added", Toast.LENGTH_SHORT).show();
            }
        });
        skipNextButton = (ImageView) findViewById(R.id.skip_next);
        skipNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for skip next will be added", Toast.LENGTH_SHORT).show();
            }
        });
        shuffleButton = (ImageView) findViewById(R.id.shuffle);
        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for shuffle will be added", Toast.LENGTH_SHORT).show();
            }
        });
        favoriteSongsButton = (ImageView) findViewById(R.id.favorite_songs);
        favoriteSongsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, FavoriteMusic.class);
                startActivity(intent);
            }
        });
        repeatButton = (ImageView) findViewById(R.id.repeat);
        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Function for repeat will be added", Toast.LENGTH_SHORT).show();
            }
        });
        favoriteButton = (ImageView) findViewById(R.id.favorite);
        favoriteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this, "Added to favorite songs", Toast.LENGTH_SHORT).show();
            }
        });
        purchaseSongButton = (ImageView) findViewById(R.id.add_to_cart);
        purchaseSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NowPlaying.this, MusicShop.class);
                startActivity(intent);
            }
        });
    }
}