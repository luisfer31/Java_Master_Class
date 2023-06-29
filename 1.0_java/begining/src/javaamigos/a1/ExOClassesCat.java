package javaamigos.a1;

public class ExOClassesCat {
    private String name;
    private String color;
    private int age;

    public ExOClassesCat() {
    }

    public ExOClassesCat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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
}
