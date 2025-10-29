package MID_EXAM.Q1;

public class Car implements Movable{
    @Override
    public void moveForward() {
        System.out.println("Car Moving forward");
    }
    @Override
    public void moveBackward() {
        System.out.println("Car Moving backward");
    }

}
