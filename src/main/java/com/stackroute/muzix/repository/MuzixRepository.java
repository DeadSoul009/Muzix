package com.stackroute.muzix.repository;

import com.stackroute.muzix.model.Muzix;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MuzixRepository extends MongoRepository<Muzix,Integer> {
}
