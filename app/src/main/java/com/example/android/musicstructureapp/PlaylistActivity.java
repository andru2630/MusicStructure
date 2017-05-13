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

public class PlaylistActivity extends AppCompatActivity {
    private final List<Song> myPlaylistSongs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        RecyclerView recyclerView;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        recyclerView = (RecyclerView) findViewById(R.id.playlist_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        myPlaylistSongs.add(new Song("Adventures of rain dance Maggie", "Red Hot Chili Peppers"));
        myPlaylistSongs.add(new Song("Go Robot", "Red Hot Chili Peppers"));
        myPlaylistSongs.add(new Song("Bytes", "Martin Garrix"));
        myPlaylistSongs.add(new Song("Snow", "Red Hot Chili Peppers"));
        myPlaylistSongs.add(new Song("Californication", "Red Hot Chili Peppers"));
        myPlaylistSongs.add(new Song("Feel Good Inc", "Gorillaz"));
        myPlaylistSongs.add(new Song("Andromeda", "Gorillaz"));
        myPlaylistSongs.add(new Song("Crazy", "Aerosmith"));
        myPlaylistSongs.add(new Song("Forbidden Voices", "Martin Garrix"));
        myPlaylistSongs.add(new Song("Thunderstruck", "ACDC"));
        myPlaylistSongs.add(new Song("Another brick in the wall", "Pink Floyd"));
        myPlaylistSongs.add(new Song("Wish you were here", "Pink Floyd"));
        myPlaylistSongs.add(new Song("Highway to hell", "ACDC"));
        myPlaylistSongs.add(new Song("Nothing else matters", "Metallica"));
        myPlaylistSongs.add(new Song("I don't want to miss a thing", "Aerosmith"));
        myPlaylistSongs.add(new Song("Dream On", "Aerosmith"));
        myPlaylistSongs.add(new Song("Lose Yourself", "Eminem"));
        myPlaylistSongs.add(new Song("Not Afraid", "Eminem"));

        SongAdapter mySongsAdapter = new SongAdapter(myPlaylistSongs);
        recyclerView.setAdapter(mySongsAdapter);
        recyclerView.addItemDecoration(new VerticalSpacing(5));

        recyclerView.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(), recyclerView, new RecyclerItemListener.RecyclerTouchListener() {
            public void onClickItem(View v, int position) {
                Intent intent = new Intent(PlaylistActivity.this, NowPlaying.class);
                startActivity(intent);
            }

            @Override
            public void onLongClickItem(View v, int position) {
                Toast.makeText(PlaylistActivity.this, "Features to be implemented", Toast.LENGTH_SHORT).show();
            }
        }));
    }
}