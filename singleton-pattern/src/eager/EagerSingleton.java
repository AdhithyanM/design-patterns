package eager;

// In eager initialization, the instance of the Singleton class is created at the time of class loading.
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    // Private constructor to prevent instantiation
    private EagerSingleton() {
        // check to avoid construction invoking using reflection
        if(instance != null) {
            throw new UnsupportedOperationException("Eager instance is already instantiated");
        }
    }

    // Public method to provide access to the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}
