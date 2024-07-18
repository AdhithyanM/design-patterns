package lazy;

// In lazy initialization, the instance is created only when it is needed for the first time.
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        if (instance != null) {
            throw new UnsupportedOperationException("Instance of LazySingleton is already set");
        }
    }

    public static LazySingleton getInstance() {
        // this is not thread safe and doesn't guarantee there will always be only one instance. use DoubleCheckedLockingSingleton.
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
