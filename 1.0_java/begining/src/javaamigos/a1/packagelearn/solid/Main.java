package javaamigos.a1.packagelearn.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Cube cube = new Cube();
        Rectangle rectangle = new Rectangle();
        ShapePrinter printer = new ShapePrinter(areaCalculator);
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(
//                noShape,
                circle,
                square,
                cube,
                rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }


}
