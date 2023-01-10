package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Model-1", "red", 111));
        cars.add(new Car("Model-2", "black", 222));
        cars.add(new Car("Model-3", "green", 333));
        cars.add(new Car("Model-4", "white", 444));
        cars.add(new Car("Model-5", "blue", 555));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count < 5) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }
}