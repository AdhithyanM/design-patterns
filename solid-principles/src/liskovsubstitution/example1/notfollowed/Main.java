package liskovsubstitution.example1.notfollowed;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        Bird penguin = new Penguin();

        makeBirdFly(sparrow); // works fine
        makeBirdFly(penguin); // throws an exception violating LSP
    }

    public static void makeBirdFly(Bird bird) {
        bird.fly(); // This would throw exception if bird is a Penguin
    }
}
