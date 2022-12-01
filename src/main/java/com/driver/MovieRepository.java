package com.driver;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
@Component
public class MovieRepository {
    HashMap<String, Movie> movieHashMap = new HashMap<>();
    HashMap<String, Director> directorHashMap = new HashMap<>();

    public void addMovieInDB(Movie movie){
        movieHashMap.put(movie.getName(), movie);
    }

    public void addDirectorInDB(Director director){
        directorHashMap.put(director.getName(), director);
    }

    public Movie getMovieByNameFromDB(String name){
        return movieHashMap.get(name);
    }

    public Director getDirectorByNameFromDB(String name){
        return directorHashMap.get(name);
    }

    public List<String> findAllMoviesFromDB(){
        List<String> movieList = new ArrayList<>();
        for(String movieName: movieHashMap.keySet()){
            movieList.add(movieName);
        }

        return movieList;
    }
}
