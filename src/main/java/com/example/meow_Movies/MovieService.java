package com.example.meow_Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        System.out.println(movieRepository.findAll().toString());
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String objectId){
        return movieRepository.findMovieByImdbId(objectId);
    }

}
