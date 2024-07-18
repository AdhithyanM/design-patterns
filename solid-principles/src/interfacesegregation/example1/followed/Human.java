package interfacesegregation.example1.followed;

public class Human implements Workable, Eatable, Sleepable{
    @Override
    public void eat() {
        // logic for eat
    }

    @Override
    public void sleep() {
        // logic for sleep
    }

    @Override
    public void work() {
        // logic for work
    }
}
