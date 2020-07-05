package com.nd.popularmovies.Models;

import android.util.Log;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieData {

    /*@SerializedName("title")
    @Expose
    private String movieTitle;

    public MovieData(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTitle() {
        return movieTitle;
    }*/

   /* private static MovieData movieData ;
    private MovieData(){}
    public static MovieData getInstance() {
        if (movieData == null)
           movieData = new MovieData();
        return movieData;
    }*/


    private static boolean isUpdated = false;
    private static List<MovieData> fList = null;
    @SerializedName("title")
    @Expose
    private String movieTitle;
    @SerializedName("original_title")
    @Expose
    private String movieOriginalTitle;
    @SerializedName("poster_path")
    @Expose
    private String moviePoster;
    @SerializedName("backdrop_path")
    @Expose
    private String movieImage_optional;
    @SerializedName("overview")
    @Expose
    private String movieOverview;
    @SerializedName("vote_average")
    @Expose
    private String movieUserRating;
    @SerializedName("release_date")
    @Expose
    private String movieReleaseDate;

    public MovieData(String movieTitle, String movieOriginalTitle, String moviePoster, String movieImage_optional, String movieOverview, String movieUserRating, String movieReleaseDate) {
        this.movieTitle = movieTitle;
        this.movieOriginalTitle = movieOriginalTitle;
        this.moviePoster = moviePoster;
        this.movieImage_optional = movieImage_optional;
        this.movieOverview = movieOverview;
        this.movieUserRating = movieUserRating;
        this.movieReleaseDate = movieReleaseDate;
    }

    public static boolean isUpdated() {
        return isUpdated;
    }

    public static List<MovieData> getfList() {
        return fList;
    }

    public static void setfList(List<MovieData> fList) {
        Log.e("setfList: ", "" + fList.size());
        if (fList == null) {
            MovieData.fList = fList;
            MovieData.isUpdated = true;
        }

    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieOriginalTitle() {
        return movieOriginalTitle;
    }

    public String getMoviePoster() {
        return moviePoster;
    }

    public String getMovieImage_optional() {
        return movieImage_optional;
    }

    public String getMovieOverview() {
        return movieOverview;
    }

    public String getMovieUserRating() {
        return movieUserRating;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }


    /*static void initRecyclerView(View view, Context context) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview_movieFront);
        GridLayoutManager layoutManager = new GridLayoutManager(context, 2, GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        MovieListAdapter movieListAdapter = new MovieListAdapter();
        MovieListAdapter.setA(MovieData.getfList());
        recyclerView.setAdapter(movieListAdapter);
        recyclerView.setVisibility(View.VISIBLE);

    }*/
}

/*

    @SerializedName("popularity")
    @Expose
    private Double popularity;
    @SerializedName("vote_count")
    @Expose
    private Integer voteCount;
    @SerializedName("video")
    @Expose
    private Boolean video;
    @SerializedName("poster_path")
    @Expose
    private String posterPath;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("adult")
    @Expose
    private Boolean adult;
    @SerializedName("backdrop_path")
    @Expose
    private String backdropPath;
    @SerializedName("original_language")
    @Expose
    private String originalLanguage;
    @SerializedName("original_title")
    @Expose
    private String originalTitle;
    @SerializedName("genre_ids")
    @Expose
    private List<Integer> genreIds = null;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("vote_average")
    @Expose
    private Double voteAverage;
    @SerializedName("overview")
    @Expose
    private String overview;
    @SerializedName("release_date")
    @Expose
    private String releaseDate;

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public List<Integer> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<Integer> genreIds) {
        this.genreIds = genreIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
*/



