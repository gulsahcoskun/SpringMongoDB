package com.gulsah.exercise.SpringMongoDB.model;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by apple on 19.05.2017.
 */
@Document(collection = "cars")
public class Car {

    private String id;
    private String make;
    private String model;
    private String description;
    private int year;

    public Car() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
