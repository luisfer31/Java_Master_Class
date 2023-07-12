package javaamigos.a1.packagelearn.arrays;

import java.util.ArrayList;
import java.util.List;

public class WorkingList {
    public static void main(String[] args) {

        // List Unmodifiable
        List<String> colorUnmodifiable = List.of(
                "blue",
                "yellow"
        );


        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));
        System.out.println(colors);

        for (String color:colors){
            System.out.println(color);
        }

        System.out.println();
        colors.forEach(System.out::println);

        System.out.println();
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
    }
}
