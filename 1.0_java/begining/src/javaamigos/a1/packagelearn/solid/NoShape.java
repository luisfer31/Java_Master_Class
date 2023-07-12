package javaamigos.a1.packagelearn.solid;

public class NoShape implements Shape{
    @Override
    public double area() {
        throw new IllegalStateException("Cannot calculate area");
    }
}
