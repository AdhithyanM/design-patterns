package liskovsubstitution.example1.followed;

public class FlyableBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Flying bird is flying");
    }
}
