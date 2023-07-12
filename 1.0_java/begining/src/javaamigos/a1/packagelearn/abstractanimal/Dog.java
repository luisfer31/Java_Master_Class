package javaamigos.a1.packagelearn.abstractanimal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Wof Wof");
    }
}
