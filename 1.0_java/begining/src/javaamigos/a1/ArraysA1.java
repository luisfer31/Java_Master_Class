package javaamigos.a1;

import java.util.Arrays;

public class ArraysA1 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Arrays.fill(numbers,-2);
        numbers[2] = 27;
        System.out.println(Arrays.toString(numbers));

        String[] names = new String[3];
        Arrays.fill(names,"Valentina");
        names[1] = "Luis";
        System.out.println(Arrays.toString(names));


    }
}
