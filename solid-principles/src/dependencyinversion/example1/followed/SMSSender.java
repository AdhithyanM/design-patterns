package dependencyinversion.example1.followed;

public class SMSSender implements MessageSender {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
