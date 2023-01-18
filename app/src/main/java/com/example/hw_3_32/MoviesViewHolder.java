package com.example.hw_3_32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MoviesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvMovies;

    public MoviesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMovies = itemView.findViewById(R.id.tv_movies);
    }

    public void bind(String movies){
        tvMovies.setText(movies);
    }
}
