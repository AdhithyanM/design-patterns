package openclosed.example1.followed;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<Notifier> notifiers;

    public NotificationService() {
        this.notifiers = new ArrayList<>();
    }

    public void addNotifier(Notifier notifier) {
        notifiers.add(notifier);
    }

    public void notifyAll(String message, String recipient) {
        for (Notifier notifier : notifiers) {
            notifier.send(message, recipient);
        }
    }
}
