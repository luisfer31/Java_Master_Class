package javaamigos.a1.packagelearn;

import javaamigos.a1.packagelearn.car.Car;
import javaamigos.a1.packagelearn.car.CarService;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        carsExample();
    }

    private static void carsExample() {
        Car car = new Car(
                "1234",
                BigDecimal.TEN);

        CarService carService = new CarService();
        carService.registerNewcar(car);
        System.out.println(Arrays.toString(carService.getCars()));
    }
}
