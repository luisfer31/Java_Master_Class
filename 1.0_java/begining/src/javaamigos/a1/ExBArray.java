package javaamigos.a1;

import java.util.Arrays;

public class ExBArray {
    public static void main(String[] args) {
        int[] empty = new int[3];
        Arrays.fill(empty, 4);
        empty[1] = 17;
        System.out.println(Arrays.toString(empty));
        int[] numbers = {1, 2, 3, 4, 5};
        // numbers[5]=6; index 5 out of bounds for length

        String[] strArray = {"a", "b", "c", "d"};
        System.out.println(Arrays.toString(strArray));
        String[] strArray1 = strArray;
        strArray1[0] = "z";
        System.out.println(Arrays.toString(strArray1));
        String[] strArray7 = Arrays.copyOf(strArray1, 5);
        System.out.println(Arrays.toString(strArray7));
        for (String strA : strArray7) {
            System.out.println(strA);
        }
        Arrays.stream(strArray7).forEach(arr -> System.out.print(arr + " "));
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 10; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array10 = new int[11];
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            array10[i] = i;
            sum +=i;
        }
        System.out.println(Arrays.toString(array10) + " sum=" +sum);

        String[] strWords = {"i", "sure", "do", "love", "bees"};
        String[] strWordsUper = new String[strWords.length];
        for (int i = 0; i < strWords.length; i++) {
            strWordsUper[i] = strWords[i].toUpperCase();
        }
        System.out.println(Arrays.toString(strWords));
        System.out.println(Arrays.toString(strWordsUper));
        String[]letters = Arrays.stream(strWords).map(String::toUpperCase).toArray(String[]::new);
        Arrays.stream(letters).forEach(System.out::println);
        System.out.println(Arrays.toString(strWords));

        String gender = "mALE";
        if (gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Male")){
            System.out.println("Valid gender");
        }else {
            System.out.println("Invalid gender");
        }

/*
        String[] firstLetter = Arrays.stream(strWords).map();
        for (int i = 0; i < strWords.length; i++) {



        }
*/



    }

}
