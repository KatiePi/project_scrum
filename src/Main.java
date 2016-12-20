import Objects.Car;

import java.util.ArrayList;

/**
 * Created by Kasia on 2016-12-20.
 */
public class Main {

    public static void main(String [ ] args){

        ArrayList cars = new ArrayList<Car>();

        Car car = new Car("1234", "Jan", "Kowalski", "20-03-12", "10-06-16");
        cars.add(car);


    }
}
