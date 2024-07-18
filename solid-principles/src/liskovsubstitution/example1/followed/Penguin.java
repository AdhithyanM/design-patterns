package liskovsubstitution.example1.followed;

public class Penguin extends Bird {
    @Override
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("Penguin is walking");
    }
}
