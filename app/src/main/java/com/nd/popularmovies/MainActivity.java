package com.nd.popularmovies;

import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.nd.popularmovies.Adapters.MovieListAdapter;
import com.nd.popularmovies.Network.RetrofitNetworkCalls;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieListAdapter movieListAdapter;
    private ProgressBar progressBar;
    private TextView errTextView;

    private View view;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.loading_indicator_pb);
        progressBar.setVisibility(View.VISIBLE);
        recyclerView = findViewById(R.id.recyclerview_movieFront);
        errTextView = findViewById(R.id.error_msg_tv);

        view = getWindow().getDecorView().getRootView();

        ConnectivityManager connectivityManager = (ConnectivityManager) this.getSystemService(CONNECTIVITY_SERVICE);
        Log.e("onCreate: ", "" + connectivityManager.isDefaultNetworkActive());
        if (!connectivityManager.isDefaultNetworkActive())
            RetrofitNetworkCalls.apiCallPopular(this, view);
        else {
            progressBar.setVisibility(View.INVISIBLE);
            errTextView.setVisibility(View.VISIBLE);

        }


    }


    //  RECYCLER VIEW INITIALIZED
   /* public void initRecyclerView(List<MovieData> movieData) {

        GridLayoutManager layoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        movieListAdapter = new MovieListAdapter(movieData);
        recyclerView.setAdapter(movieListAdapter);
        recyclerView.setVisibility(View.VISIBLE);
    }*/

    //  HANDLING MENU
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.popular_movies:
                //Toast.makeText(this, "popular", Toast.LENGTH_SHORT).show();
                RetrofitNetworkCalls.apiCallPopular(this, view);
                recyclerView.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);
                return true;
            case R.id.mosted_rated:
                //Toast.makeText(this, "Most Rated", Toast.LENGTH_SHORT).show();
                RetrofitNetworkCalls.apiCallMostRated(this, view);
                recyclerView.setVisibility(View.INVISIBLE);
                progressBar.setVisibility(View.VISIBLE);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}