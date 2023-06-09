package javaamigos.a1;

import java.awt.Color;
import java.awt.Point;
import java.util.Date;
//import java.sql.Date;

public class ExDPackage {
    public static void main(String[] args) {
        //Packages

        Point point = new Point();
        Color color = new Color(0xFF0000);

        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(5);

        // Access to value of ExEAccess.foo
        System.out.println(ExEAccess.foo);
    }
}
