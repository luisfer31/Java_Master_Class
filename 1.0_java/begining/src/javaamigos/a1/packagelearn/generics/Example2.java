package javaamigos.a1.packagelearn.generics;

public class Example2 {
    public static void main(String[] args) {
//        Comparable number = 10;
//        number.compareTo("10");

        Comparable<Integer> number = 10;
        System.out.println(number.compareTo(7));;
    }
}
