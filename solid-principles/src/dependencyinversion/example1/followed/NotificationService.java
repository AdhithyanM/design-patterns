package dependencyinversion.example1.followed;

/*
    We introduce the MessageSender interface (abstraction).
    EmailSender and SMSSender implement MessageSender interface (low-level modules depend on abstraction).
    NotificationService depends on MessageSender (high-level module depends on abstraction).

    Key improvements:
    a) Decoupling: NotificationService is not tied to specific implementations.
    b) Flexibility: New message types can be added without changing NotificationService.
    c) Testability: Easy to create mock MessageSender implementations for testing.
    d) Single Responsibility: Each class has a single, well-defined purpose.
 */
public class NotificationService {
    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.send(message);
    }
}
