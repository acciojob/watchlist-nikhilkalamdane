package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @PostMapping("/movies/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody Movie movie){
        movieService.addMovieToDB(movie);

        return new ResponseEntity("New movie added successfully",HttpStatus.CREATED);
    }

    @PostMapping("/movies/add-director")
    public ResponseEntity<String> addDirector(@RequestBody Director director){
        movieService.addDirectorToDB(director);

        return new ResponseEntity("New director added successfully",HttpStatus.CREATED);
    }

    @GetMapping("/movies/get-all-movies")
    public ResponseEntity<List<String>> findAllMovies(){
        return new ResponseEntity(movieService.findAllMovies(), HttpStatus.OK);
    }
}
