package javaamigos.a1.packagelearn.poly_inter;

public interface Vehicle {

    // constants
    double PURCHASE_RATE = 0.5;

    // abstract methods
    public void move(int amount);

    public void applyBreaks(int amount);

    public int getCurrentSpeed();

    // default methods
    default double milesToKm(){
        return getCurrentSpeed() * 1.609;
    }

    default double KmToMiles(){
        return getCurrentSpeed() / 1.609;
    }

    // static methods

}
