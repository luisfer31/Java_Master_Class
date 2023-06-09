package firststeps;

import java.time.LocalDate;

public class AbReferenceTypes {

    static class Person{
        private String name;
    }

    public static void main(String[] args) {
        Person person = new Person();
        String brand = new String("LuisMJava");
        LocalDate date = LocalDate.now();
    }
}
