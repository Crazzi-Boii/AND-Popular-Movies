package com.nd.popularmovies.Models;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    private static MovieData movieData ;
    private MovieData(){}
    public static MovieData getInstance() {
        if (movieData == null)
           movieData = new MovieData();
        return movieData;
    }

    private List<String> movieTitle;
    private List<String> movieOriginalTitle;
    private List<String> moviePoster;
    private List<String> movieImage_optional;
    private List<String> movieOverview;
    private List<String> movieUserRating;
    private List<String> movieReleaseDate;




    // SETTERS
    public void setMovieTitle(ArrayList<String> movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieOriginalTitle(ArrayList<String> movieOriginalTitle) {
        this.movieOriginalTitle = movieOriginalTitle;
    }

    public void setMoviePoster(ArrayList<String> moviePoster) {
        this.moviePoster = moviePoster;
    }

    public void setMovieImage_optional(ArrayList<String> movieImage_optional) {
        this.movieImage_optional = movieImage_optional;
    }

    public void setMovieOverview(ArrayList<String> movieOverview) {
        this.movieOverview = movieOverview;
    }

    public void setMovieUserRating(ArrayList<String> movieUserRating) {
        this.movieUserRating = movieUserRating;
    }

    public void setMovieReleaseDate(ArrayList<String> movieReleaseDate) {
        this.movieReleaseDate = movieReleaseDate;
    }

    // GETTERS
    public List<String> getMovieTitle() {
        return movieTitle;
    }

    public List<String> getMovieOriginalTitle() {
        return movieOriginalTitle;
    }

    public List<String> getMoviePoster() {
        return moviePoster;
    }

    public List<String> getMovieImage_optional() {
        return movieImage_optional;
    }

    public List<String> getMovieOverview() {
        return movieOverview;
    }

    public List<String> getMovieUserRating() {
        return movieUserRating;
    }

    public List<String> getMovieReleaseDate() {
        return movieReleaseDate;
    }
}
