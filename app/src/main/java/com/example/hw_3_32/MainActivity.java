package com.example.hw_3_32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> moviesList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        LoadData();
        MoviesAdapter adapter = new MoviesAdapter(moviesList);
        recyclerView.setAdapter(adapter);
    }

    private void LoadData() {
        moviesList.add("Форсаж 8");
        moviesList.add("Алиса в стране чудес");
        moviesList.add("Зеленая миля");
        moviesList.add("Побег из Шоушенка");
        moviesList.add("Криминальное чтиво");
        moviesList.add("Иван Васильевич меняет профессию");
        moviesList.add("Король Лев");
        moviesList.add("1+1");
        moviesList.add("Темный рыцарь");
        moviesList.add("Шерлок холмс");
        moviesList.add("Гладиатор");
        moviesList.add("Гарри Поттер");
        moviesList.add("Операция «Ы» и другие приключения Шурика");
        moviesList.add("Один дома 3");
        moviesList.add("Брат");
    }
}