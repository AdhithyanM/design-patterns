package openclosed.example1.unfollowed;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendEmail("abc", "abc@gmail.com");
        notificationService.sendSMS("Hello", "13124124124");
        notificationService.sendPushNotification("gege3", "1312412-13123-12");
    }
}
