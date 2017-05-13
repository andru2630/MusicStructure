package com.example.android.musicstructureapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


class RecyclerItemListener implements RecyclerView.OnItemTouchListener {

    private final GestureDetector gestureDetector;

    interface RecyclerTouchListener {
        void onClickItem(View v, int position);

        void onLongClickItem(View v, int position);
    }

    RecyclerItemListener(Context context, final RecyclerView recyclerView, final RecyclerTouchListener listener) {
        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {

            @Override
            public void onLongPress(MotionEvent e) {
                View v = recyclerView.findChildViewUnder(e.getX(), e.getY());
                listener.onLongClickItem(v, recyclerView.getChildAdapterPosition(v));
            }

            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                View v = recyclerView.findChildViewUnder(e.getX(), e.getY());
                listener.onClickItem(v, recyclerView.getChildAdapterPosition(v));
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent e) {
        View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
        return (child != null && gestureDetector.onTouchEvent(e));
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}