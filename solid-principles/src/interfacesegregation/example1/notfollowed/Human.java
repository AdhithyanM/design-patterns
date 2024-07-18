package interfacesegregation.example1.notfollowed;

public class Human implements Worker {
    @Override
    public void work() {
        // logic for work
    }

    @Override
    public void eat() {
        // logic for eat
    }

    @Override
    public void sleep() {
        // logic for sleep
    }
}
