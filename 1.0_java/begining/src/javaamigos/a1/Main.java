package javaamigos.a1;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point pointA = new Point(10,10);
        Point pointB = pointA;

        pointA.x = 100;
        pointB.y = 90;
        System.out.println(pointA);
        System.out.println(pointB);
    }

    static int increment(int age){
        return ++age;
    }
}