package javaamigos.a1;

import java.util.Objects;

public class ExOClassesCat {
    private String name;
    private String color;
    private int age;

    public ExOClassesCat() {
    }

    public ExOClassesCat(String name, int age, String color) {
        this(name,age);
        this.color = color;
    }

    public ExOClassesCat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ExOClassesCat(String name){
        this.name = name;
        this.age = 0;
    }

    public void meow() {
        System.out.println(name + " : meow...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "name: " + name + " Color: " + color + " Age: " + age;
    }

//    @Override
//    public String toString() {
//        return "ExOClassesCat{" +
//                "name='" + name + '\'' +
//                ", color='" + color + '\'' +
//                ", age=" + age +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExOClassesCat that = (ExOClassesCat) o;
        return age == that.age && Objects.equals(name, that.name) && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }
}
