package com.example.android.musicstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MusicShop extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button proceedToCheckOutButton;
        List<Song> availableSongs = new ArrayList<>();
        RecyclerView recyclerView;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_shop);

        proceedToCheckOutButton = (Button) findViewById(R.id.proceed_to_checkout);
        recyclerView = (RecyclerView) findViewById(R.id.music_shop_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));
        availableSongs.add(new Song("Song Name", "Artist Name"));

        SongAdapter shopSongs = new SongAdapter(availableSongs);
        recyclerView.setAdapter(shopSongs);
        recyclerView.addItemDecoration(new VerticalSpacing(5));
        recyclerView.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(), recyclerView, new RecyclerItemListener.RecyclerTouchListener() {

            @Override
            public void onClickItem(View v, int position) {
                Toast.makeText(MusicShop.this, "Features to be implemented", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClickItem(View v, int position) {
                Toast.makeText(MusicShop.this, "Added to your cart", Toast.LENGTH_SHORT).show();
            }
        }));
        proceedToCheckOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MusicShop.this, "Features to be implemented", Toast.LENGTH_SHORT).show();
            }
        });
    }
}