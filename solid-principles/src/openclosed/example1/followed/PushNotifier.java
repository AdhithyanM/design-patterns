package openclosed.example1.followed;

public class PushNotifier implements Notifier {
    @Override
    public void send(String message, String deviceToken) {
        // logic to send push notifications
        System.out.println("messe");
    }
}
