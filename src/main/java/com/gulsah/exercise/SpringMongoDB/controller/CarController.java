package com.gulsah.exercise.SpringMongoDB.controller;

import com.gulsah.exercise.SpringMongoDB.model.Car;
import com.gulsah.exercise.SpringMongoDB.repository.CarMongoRepository;
import com.gulsah.exercise.SpringMongoDB.repository.CarSearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by apple on 19.05.2017.
 */
@Controller
public class CarController {

    @Autowired
    CarMongoRepository carRepository;

    @Autowired
    CarSearchRepository carSearchRepository;

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("carList", carRepository.findAll());
        return "home";
    }

    @RequestMapping(value="/addCar", method = RequestMethod.POST)
    public String addCar(@ModelAttribute Car car){
        carRepository.save(car);
        return "redirect:home";
    }

    @RequestMapping(value = "search")
    public String search(Model model, @RequestParam String search) {
        model.addAttribute("carList",carSearchRepository.searchCars(search));
        model.addAttribute("search",search);
        return "home";
    }
}
