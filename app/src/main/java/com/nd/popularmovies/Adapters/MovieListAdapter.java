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

    private int[] a;
    private List<MovieData> movieData;


    private Context context;

    public MovieListAdapter(List<MovieData> movieData) {
        this.movieData = movieData;
    }

    /*public MovieListAdapter(List<MovieData> getfList) {
        this.movieData = getfList;
    }*/

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
        //movieData.get(position).getMoviePoster()      "/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
        String url = context.getString(R.string.Base_URL_Image) + movieData.get(position).getMoviePoster();
        //Log.e( "onBindViewHolder: ", url);
        Picasso.with(context)
                .load(url)
                .into(holder.moviePosterImageView);
    }

    @Override
    public int getItemCount() {
        return movieData.size();
    }

    /*public static void setA(List<MovieData> movieData) {
        MovieListAdapter.movieData = movieData;
    }
*/
    public class MovieListAdapterViewHolder extends RecyclerView.ViewHolder {
        public final ImageView moviePosterImageView;

        public MovieListAdapterViewHolder(View view) {
            super(view);
            moviePosterImageView = view.findViewById(R.id.IV_movie_poster);
        }
    }
}
