package openclosed.example1.unfollowed;

/*
    NotificationService class that violates OCP

    if we need to add a new type of notification (e.g., a Slack notification),
    we would have to modify the NotificationService class to add a new method, which violates the Open/Closed Principle.
 */
public class NotificationService {
    public void sendEmail(String message, String recipient) {
        // logic to send an email
    }

    public void sendSMS(String message, String phoneNumber) {
        // logic to send an SMS
    }

    public void sendPushNotification(String message, String deviceToken) {
        // logic to send a push notification
    }
}
