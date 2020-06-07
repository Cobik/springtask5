package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.config.WebConfig;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/")
public class CarController {
    Car car = new Car("Mazda","cx9","sedan");
    Car car1 = new Car("BMW","M5","sedan");
    Car car2 = new Car("OKA","111","Sedan");

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        List<Car> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car1);
        cars.add(car2);

        model.addAttribute("cars", cars);
        return "cars";
    }




}
