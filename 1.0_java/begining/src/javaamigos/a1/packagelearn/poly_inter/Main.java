package javaamigos.a1.packagelearn.poly_inter;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person person = new Person("John", vehicles);
        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);
            System.out.println(vehicle.getCurrentSpeed());
            System.out.println();
        }

        System.out.println("purchase rate " + Vehicle.PURCHASE_RATE);

        System.out.println(car.milesToKm());

    }
}
