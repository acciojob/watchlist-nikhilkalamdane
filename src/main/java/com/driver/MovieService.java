package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public void addMovieToDB(Movie movie){
        movieRepository.addMovieInDB(movie);
    }

    public void addDirectorToDB(Director director){
        movieRepository.addDirectorInDB(director);
    }

    public Movie getMovieByName(String name){
        return movieRepository.getMovieByNameFromDB(name);
    }

    public Director getDirectorByName(String name){
        return movieRepository.getDirectorByNameFromDB(name);
    }

    public List<String> findAllMovies(){
        return movieRepository.findAllMoviesFromDB();
    }

}
