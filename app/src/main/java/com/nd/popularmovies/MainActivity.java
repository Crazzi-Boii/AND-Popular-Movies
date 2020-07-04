package com.nd.popularmovies;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nd.popularmovies.Adapters.MovieListAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieListAdapter movieListAdapter;

    int[] a = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i<20; i++)
            a[i] = i+50;

        initRecyclerView();

        movieListAdapter.setA(a);

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerview_movieFront);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        movieListAdapter = new MovieListAdapter();
        recyclerView.setAdapter(movieListAdapter);

    }


    /*  HANDLING MENU  */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.popular_movies:
                Toast.makeText(this, "popular", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mosted_rated:
                Toast.makeText(this, "Most Rated", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}