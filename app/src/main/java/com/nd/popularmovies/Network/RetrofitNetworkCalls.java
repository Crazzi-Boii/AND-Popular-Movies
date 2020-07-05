package com.nd.popularmovies.Network;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.nd.popularmovies.Adapters.MovieListAdapter;
import com.nd.popularmovies.Api.RetrofitClient;
import com.nd.popularmovies.BuildConfig;
import com.nd.popularmovies.Models.MovieData;
import com.nd.popularmovies.Models.MovieDataResponse;
import com.nd.popularmovies.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitNetworkCalls {


    public static void apiCallPopular(Context context, View view) {

        Call<MovieDataResponse> call = RetrofitClient
                .getInstance(context)
                .getApi()
                .getMovieData(context.getString(R.string.Base_URL_Popular), BuildConfig.API_KEY);

        call.enqueue(new Callback<MovieDataResponse>() {
            @Override
            public void onResponse(Call<MovieDataResponse> call, Response<MovieDataResponse> response) {
                List<MovieData> movieData = response.body().getMovieDataResults();
                MovieData.setfList(movieData);
                //MovieListAdapter.setA(movieData);
                RetrofitNetworkCalls.initRecyclerView(view, context, movieData);
            }

            @Override
            public void onFailure(Call<MovieDataResponse> call, Throwable t) {

            }
        });

        if (call.isExecuted()) {
            Log.e("apiCallPopular: ", "EXECUTED");
            //MovieListAdapter.setA(MovieData.getfList());
        }


    }

    public static int apiCallMostRated(Context context, View view) {
        Call<MovieDataResponse> call = RetrofitClient
                .getInstance(context)
                .getApi()
                .getMovieData(context.getString(R.string.Base_URL_Top_Rated), BuildConfig.API_KEY);

        call.enqueue(new Callback<MovieDataResponse>() {
            @Override
            public void onResponse(Call<MovieDataResponse> call, Response<MovieDataResponse> response) {
                List<MovieData> movieData = response.body().getMovieDataResults();
                MovieData.setfList(movieData);
                //MovieListAdapter.setA(movieData);
                RetrofitNetworkCalls.initRecyclerView(view, context, movieData);
            }

            @Override
            public void onFailure(Call<MovieDataResponse> call, Throwable t) {

            }
        });

        if (call.isExecuted()) {
            Log.e("apiCallPopular: ", "EXECUTED");
            //MovieListAdapter.setA(MovieData.getfList());
        }

        return 0;
    }

    //  RECYCLER VIEW INITIALIZED
    static void initRecyclerView(View view, Context context, List<MovieData> movieData) {
        ProgressBar progressBar = view.findViewById(R.id.loading_indicator_pb);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_movieFront);
        GridLayoutManager layoutManager = new GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        MovieListAdapter movieListAdapter = new MovieListAdapter(movieData);
        recyclerView.setAdapter(movieListAdapter);
        progressBar.setVisibility(View.INVISIBLE);
        recyclerView.setVisibility(View.VISIBLE);

    }
}
