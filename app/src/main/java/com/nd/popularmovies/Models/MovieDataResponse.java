
package com.nd.popularmovies.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieDataResponse {

    @SerializedName("results")
    @Expose
    private List<MovieData> movieDataResults;

    public MovieDataResponse(List<MovieData> movieDataResults) {
        this.movieDataResults = movieDataResults;
    }

    public List<MovieData> getMovieDataResults() {
        return movieDataResults;
    }
    /*public void setMovieDataResults(List<MovieData> movieDataResults) {
        this.movieDataResults = movieDataResults;
    }*/

    /*

    @SerializedName("results")
    @Expose
    private List<MovieData> results = null;

    public List<MovieData> getResults() {
        return results;
    }

    public void setResults(List<MovieData> results) {
        this.results = results;
    }*/

    /*@SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("total_results")
    @Expose
    private Integer totalResults;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;


    /*public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    */
}

