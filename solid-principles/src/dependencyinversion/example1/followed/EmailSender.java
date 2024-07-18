package dependencyinversion.example1.followed;

public class EmailSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Sending email: " + message);
    }
}
