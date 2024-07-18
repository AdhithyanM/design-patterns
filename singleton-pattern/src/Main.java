import eager.EagerSingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton singleton1 = EagerSingleton.getInstance();
        EagerSingleton singleton2 = EagerSingleton.getInstance();

        System.out.println(singleton1.equals(singleton2));
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
