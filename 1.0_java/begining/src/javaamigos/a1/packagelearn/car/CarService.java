package javaamigos.a1.packagelearn.car;

public class CarService {

    private CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public int registerNewcar(Car car){
        carDAO.saveCar(car);
        return 1;
    }

    public Car[] getCars(){
        return carDAO.selectAllCars();
    }
}

