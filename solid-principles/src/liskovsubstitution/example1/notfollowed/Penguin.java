package liskovsubstitution.example1.notfollowed;

// Subclass violates LSP
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly.");
    }
}
