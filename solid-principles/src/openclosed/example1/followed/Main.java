package openclosed.example1.followed;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.addNotifier(new EmailNotifier());
        notificationService.addNotifier(new SMSNotifier());
        notificationService.addNotifier(new PushNotifier());
        notificationService.addNotifier(new SlackNotifier());
        // open for new additions but closed for modifications

        notificationService.notifyAll("message", "recipient");
    }
}
