package javaamigos.a1.packagelearn.abstractanimal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaooo");
    }
}
