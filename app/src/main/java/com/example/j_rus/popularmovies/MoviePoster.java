package com.example.j_rus.popularmovies;

/**
 * Created by j_rus on 8/3/2016.
 */
public class MoviePoster {

    String posterPath;


    public MoviePoster(String posterPath){
        this.posterPath = Constants.BASE_POSTER_URL + posterPath;;
    }
}
