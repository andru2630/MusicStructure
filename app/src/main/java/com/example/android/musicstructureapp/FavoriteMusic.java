package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class FavoriteMusic extends AppCompatActivity {

    List<Song> favoriteSongList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_music);

        recyclerView = (RecyclerView) findViewById(R.id.favorite_playlist_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        favoriteSongList.add(new Song("Thunderstruck", "ACDC"));
        favoriteSongList.add(new Song("Another brick in the wall", "Pink Floyd"));
        favoriteSongList.add(new Song("Wish you were here", "Pink Floyd"));
        favoriteSongList.add(new Song("Highway to hell", "ACDC"));
        favoriteSongList.add(new Song("Nothing else matters", "Metallica"));
        favoriteSongList.add(new Song("I don't want to miss a thing", "Aerrosmith"));
        favoriteSongList.add(new Song("Dream On", "Aerosmith"));
        favoriteSongList.add(new Song("Lose Yourself", "Eminem"));
        favoriteSongList.add(new Song("Not Afraid", "Eminem"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));
        favoriteSongList.add(new Song("Song Name", "Artist Name"));

        SongAdapter songAdapter = new SongAdapter(favoriteSongList);
        recyclerView.setAdapter(songAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(), recyclerView, new RecyclerItemListener.RecyclerTouchListener() {
            public void onClickItem(View v, int position) {
                Intent intent = new Intent(FavoriteMusic.this, NowPlaying.class);
                startActivity(intent);
            }

            @Override
            public void onLongClickItem(View v, int position) {
                Toast.makeText(FavoriteMusic.this, "Features to be implemented", Toast.LENGTH_SHORT).show();
            }
        }));

        recyclerView.addItemDecoration(new VerticalSpacing(5));
    }
}
