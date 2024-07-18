package dependencyinversion.example1.notfollowed;

/*
   The NotificationService (high-level module) directly depends on EmailService and SMSService (low-level modules).
   It violates DIP because:
    a) The high-level module depends on low-level modules.
    b) It's tightly coupled to specific implementations.
    c) Adding a new notification type requires modifying NotificationService.
 */
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService() {
        emailService = new EmailService();
        smsService =  new SMSService();
    }

    public void sendNotification(String message, String channel) {
        if("email".equals(channel)) {
            emailService.sendEmail(message);
        }
        else if("sms".equals(channel)) {
            smsService.sendSMS(message);
        }
    }
}
