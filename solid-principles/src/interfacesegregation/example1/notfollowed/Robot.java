package interfacesegregation.example1.notfollowed;

/*
    The Robot class is forced to implement eat() and sleep(), even though these don't make sense for a robot.
    This violates the ISP because the Robot class is forced to depend on methods it doesn't use.
 */
public class Robot implements Worker {
    @Override
    public void work() {
        // logic for work
    }

    @Override
    public void eat() {
        throw new RuntimeException("Robot cannot eat");
    }

    @Override
    public void sleep() {
        throw new RuntimeException("Robot cannot sleep");
    }
}
