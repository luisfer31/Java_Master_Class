package javaamigos.a1.packagelearn.poly_inter;

public class Bicycle implements Vehicle{
    private int currentSpeed;

    public Bicycle() {
    }

    public Bicycle(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public void move(int amount){
        System.out.println("pedal");
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

    @Override
    public double milesToKm() {
        return Vehicle.super.milesToKm();
    }
}
