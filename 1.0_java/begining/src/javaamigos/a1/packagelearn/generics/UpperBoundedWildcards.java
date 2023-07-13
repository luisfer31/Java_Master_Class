package javaamigos.a1.packagelearn.generics;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UpperBoundedWildcards {
    public static void main(String[] args) {
        // ? Wildcards
        List<Object> list1 = Arrays.asList("1", 2, new Date());
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        print(list1);
        print(list2);
        print(list3);


    }

    static void print(List<?> list){
        list.forEach(x ->{
            System.out.println(x.getClass().getName());
            System.out.println(x);
        });

    }
}
