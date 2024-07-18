package dependencyinversion.example1.notfollowed;

public class EmailService {
    public void sendEmail(String message) {
        System.out.println("Sending email: " + message);
    }
}
