package lazy;

public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
        if (instance != null) {
            throw new UnsupportedOperationException("Instance already exists");
        }
    }

    public static SynchronizedSingleton getInstance() {
        // draw back of this is each time thread need to acquire lock on the class
        // to overcome this, we use double locking
        synchronized (SynchronizedSingleton.class) {
            if (instance == null) {
                instance = new SynchronizedSingleton();
            }
        }
        return instance;
    }
}
