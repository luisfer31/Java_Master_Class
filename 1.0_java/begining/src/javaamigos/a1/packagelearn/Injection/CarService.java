package javaamigos.a1.packagelearn.Injection;

//@Component
public class CarService {
    private CarDAO carDAO = new CarDAO();
    private EmailService emailService;

    private MOTService motService;

//    @Autowire / @Inject
    public CarService(CarDAO carDAO, EmailService emailService, MOTService motService) {
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }
}
