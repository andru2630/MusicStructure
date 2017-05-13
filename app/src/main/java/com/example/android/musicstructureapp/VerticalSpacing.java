package com.example.android.musicstructureapp;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

class VerticalSpacing extends RecyclerView.ItemDecoration {

    private final int spacing;

    VerticalSpacing(int spacing) {
        this.spacing = spacing;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = spacing;
    }
}