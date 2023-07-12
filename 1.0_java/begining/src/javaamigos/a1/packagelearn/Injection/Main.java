package javaamigos.a1.packagelearn.Injection;

import javaamigos.a1.packagelearn.car.CarService;

public class Main {
    public static void main(String[] args) {
        // dependencis
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);
        // inject
//        CarService carService = new CarService(carDAO, emailService,motService);
    }
}
