package com.gulsah.exercise.SpringMongoDB.repository;

import com.gulsah.exercise.SpringMongoDB.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by apple on 19.05.2017.
 */
@Repository
public class CarSearchRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public Collection searchCars(String text){
        return mongoTemplate.find(Query.query(new Criteria()
        .orOperator(Criteria.where("description").regex(text, "i"),
                Criteria.where("make").regex(text,"i"),
                Criteria.where("model").regex(text,"i"))
        ), Car.class);
    }
}
