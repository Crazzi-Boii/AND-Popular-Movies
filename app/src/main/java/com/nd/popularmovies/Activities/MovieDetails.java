package com.nd.popularmovies.Activities;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.nd.popularmovies.Models.MovieData;
import com.nd.popularmovies.R;
import com.squareup.picasso.Picasso;

public class MovieDetails extends AppCompatActivity {

    private MovieData movieData;
    private String BASE_URL;
    private ImageView imageView;
    private TextView originalTitle, rating, releaseDate, overview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        setTitle(MovieData.getMovieData().getMovieTitle());

        //Log.e( "onCreate: MovieDetails", MovieData.getMovieData().getMovieTitle());

        initViews();

        populateViews();

    }

    private void initViews() {
        movieData = MovieData.getMovieData();
        BASE_URL = getString(R.string.Base_URL_Image);

        imageView = findViewById(R.id.IV_movie_detail_optional_picture);
        originalTitle = findViewById(R.id.TV_original_Title);
        rating = findViewById(R.id.TV_rating);
        releaseDate = findViewById(R.id.TV_release_date);
        overview = findViewById(R.id.TV_overview);
    }

    private void populateViews() {
        Picasso.with(this)
                .load(BASE_URL + movieData.getMovieImage_optional())
                .fit()
                .centerCrop()
                .into(imageView);
        originalTitle.setText(movieData.getMovieOriginalTitle());
        rating.setText(movieData.getMovieUserRating());
        releaseDate.setText(movieData.getMovieReleaseDate());
        overview.setText(movieData.getMovieOverview());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.moviedetailmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Action_Back:
                finish();
                return true;
            default:
                return true;
        }
    }

}