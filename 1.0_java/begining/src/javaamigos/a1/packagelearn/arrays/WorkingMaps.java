package javaamigos.a1.packagelearn.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingMaps {
    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Luis"), new Diamond("African Diamond"));

        System.out.println(new Person("Luis").hashCode());
        System.out.println(new Person("Luis").hashCode());

        System.out.println(map.get(new Person("Luis")));
    }

    private static void maps() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Luis"));
        map.put(2, new Person("Lili"));
        map.put(3, new Person("Vale"));
//        map.put(3, new Person("Vale 2"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);

        System.out.println();

//        map.entrySet().forEach(System.out::println);

        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println();
        map.forEach((key, person) -> {
            System.out.println(key + " - " + person);
        });

        System.out.println(map.getOrDefault(3, new Person("default")));
        System.out.println(map.values());
    }

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
    record Diamond(String name){}
}
