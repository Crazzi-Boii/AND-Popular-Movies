package com.nd.popularmovies.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nd.popularmovies.Models.MovieData;
import com.nd.popularmovies.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MovieListAdapter extends RecyclerView.Adapter<MovieListAdapter.MovieListAdapterViewHolder> {

    private List<MovieData> movieData;

    private Context context;

    public MovieListAdapter(List<MovieData> movieData) {
        this.movieData = movieData;
    }


    @NonNull
    @Override
    public MovieListAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        int id = R.layout.movie_list;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(id, parent, false);
        return new MovieListAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieListAdapterViewHolder holder, int position) {
        String url = context.getString(R.string.Base_URL_Image) + movieData.get(position).getMoviePoster();
        Picasso.with(context)
                .load(url)
                .into(holder.moviePosterImageView);
    }

    @Override
    public int getItemCount() {
        return movieData.size();
    }

    public class MovieListAdapterViewHolder extends RecyclerView.ViewHolder {
        public final ImageView moviePosterImageView;
        public MovieListAdapterViewHolder(View view) {
            super(view);
            moviePosterImageView = view.findViewById(R.id.IV_movie_poster);
        }
    }
}
