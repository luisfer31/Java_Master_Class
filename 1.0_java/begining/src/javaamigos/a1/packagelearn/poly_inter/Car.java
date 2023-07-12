package javaamigos.a1.packagelearn.poly_inter;

public class Car implements Vehicle{
    private int currentSpeed;

    public Car() {
    }

    public Car(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        System.out.println("Start engine");
        System.out.println("accelerate");
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreaks(int amount){
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
