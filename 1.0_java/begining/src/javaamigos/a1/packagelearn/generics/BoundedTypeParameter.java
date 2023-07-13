package javaamigos.a1.packagelearn.generics;

public class BoundedTypeParameter {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Double[] numbers2 = {1.0, 2.8, 3.0};
        System.out.println(countGraterThan(numbers, 2));
        System.out.println(countGraterThan(numbers2, 2.0));

    }

//    interface A {
//    }
//
//    interface B {
//    }
//
//    static <T extends Comparable<T> & A & B> int countGraterThan(T[] numbers, T number) {

    static <T extends Comparable<T>> int countGraterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;

    }
}
