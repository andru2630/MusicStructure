package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView playlist1;
    ImageView playlist2;
    ImageView addPlaylist;
    List<Song> songList = new ArrayList<>();
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playlist1 = (ImageView) findViewById(R.id.playlist_1);
        playlist2 = (ImageView) findViewById(R.id.playlist_2);
        addPlaylist = (ImageView) findViewById(R.id.add_playlist);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        songList.add(new Song("Thunderstruck", "ACDC"));
        songList.add(new Song("Another brick in the wall", "Pink Floyd"));
        songList.add(new Song("Wish you were here", "Pink Floyd"));
        songList.add(new Song("Highway to hell", "ACDC"));
        songList.add(new Song("Nothing else matters", "Metallica"));
        songList.add(new Song("I don't want to miss a thing", "Aerrosmith"));
        songList.add(new Song("Dream On", "Aerosmith"));
        songList.add(new Song("Lose Yourself", "Eminem"));
        songList.add(new Song("Not Afraid", "Eminem"));

        SongAdapter songAdapter = new SongAdapter(songList);
        recyclerView.setAdapter(songAdapter);
        recyclerView.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(), recyclerView, new RecyclerItemListener.RecyclerTouchListener() {
            public void onClickItem(View v, int position) {
                Intent intent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(intent);
            }

            @Override
            public void onLongClickItem(View v, int position) {
                Toast.makeText(MainActivity.this, "Features to be implemented", Toast.LENGTH_SHORT).show();
            }
        }));

        recyclerView.addItemDecoration(new VerticalSpacing(5));

        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });

        playlist2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(intent);
            }
        });
        addPlaylist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "This button would create a new playlist", Toast.LENGTH_SHORT).show();
            }
        });

    }
}