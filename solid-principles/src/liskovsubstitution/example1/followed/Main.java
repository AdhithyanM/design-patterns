package liskovsubstitution.example1.followed;

public class Main {
    public static void main(String[] args) {
        Bird sparrow = new FlyableBird();
        Bird penguin = new Penguin();

        makeBirdMove(sparrow);  // Works fine
        makeBirdMove(penguin);  // Works fine too
    }

    public static void makeBirdMove(Bird bird) {
        bird.move();    // Now it works for both flying birds and penguin
    }
}
