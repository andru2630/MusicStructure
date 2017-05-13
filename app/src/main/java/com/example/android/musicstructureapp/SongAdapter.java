package com.example.android.musicstructureapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class SongAdapter extends RecyclerView.Adapter<SongAdapter.MyViewHolder> {

    private final List<Song> songList;

    class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView songName;
        final TextView artistName;

        MyViewHolder(View view) {
            super(view);
            songName = (TextView) view.findViewById(R.id.song_name);
            artistName = (TextView) view.findViewById(R.id.artist_name);
        }
    }

    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Song song = songList.get(position);
        holder.songName.setText(song.songName);
        holder.artistName.setText(song.artistName);
    }


    @Override
    public int getItemCount() {
        return songList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_song, parent, false);
        return new MyViewHolder(view);
    }
}