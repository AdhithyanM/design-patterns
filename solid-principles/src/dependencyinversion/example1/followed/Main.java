package dependencyinversion.example1.followed;

public class Main {
    public static void main(String[] args) {
        NotificationService service1 = new NotificationService(new EmailSender());
        service1.sendNotification("something to email");

        NotificationService service2 = new NotificationService(new SMSSender());
        service2.sendNotification("something to sms");
    }
}
