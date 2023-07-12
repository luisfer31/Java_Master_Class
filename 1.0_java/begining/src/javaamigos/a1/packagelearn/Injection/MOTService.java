package javaamigos.a1.packagelearn.Injection;

//@Component
public class MOTService {
    private EmailService emailService;

//    @Inject
    public MOTService(EmailService emailService) {
        this.emailService = emailService;
    }
}
