package com.example.meow_Movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositoty extends MongoRepository<Review, ObjectId> {
}
