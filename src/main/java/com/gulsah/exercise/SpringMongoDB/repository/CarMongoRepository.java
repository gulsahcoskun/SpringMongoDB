package com.gulsah.exercise.SpringMongoDB.repository;

import com.gulsah.exercise.SpringMongoDB.model.Car;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by apple on 19.05.2017.
 */
public interface CarMongoRepository extends CrudRepository<Car, String>{

}
