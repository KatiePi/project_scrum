package Users;

import Objects.Car;

import java.util.ArrayList;

/**
 * Created by Kasia on 2016-12-20.
 */
public class Foreman {

    private ArrayList<Car> cars;

    public Foreman(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

}
