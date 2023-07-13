package javaamigos.a1.packagelearn.generics;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildcards1 {
    public static void main(String[] args) {
        // ? Wildcards
        List<Double> list1 = Arrays.asList(0.1, 2.2, 2.9);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<Number> list3 = Arrays.asList();
        print(list1);
        print(list2);
        print(list3);


    }

    static void print(List<? extends Number> list){
        list.forEach(x ->{
            System.out.println(x.getClass().getName());
            System.out.println(x);
        });

    }
}
