package javaamigos.a1.packagelearn.solid;

import java.util.List;

public class ShapePrinter {

    private final IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }


    public String json(List<Shape> shapes){
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shape_sum, %s".formatted(areaCalculator.sum(shapes));
    }
}
