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

    public List<String> findAllMovies(){
        return movieRepository.findAllMoviesFromDB();
    }

}
