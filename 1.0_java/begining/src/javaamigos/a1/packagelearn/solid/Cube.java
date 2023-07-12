package javaamigos.a1.packagelearn.solid;

public class Cube implements Shape, ThreeDimensionalShape{

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 0;
    }
}
