package javaamigos.a1.packagelearn.arrays;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class WorkingQueue {
    public static void main(String[] args) {
//        queues();

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Luis", 45));
        linkedList.add(new Person("Lili", 62));
        linkedList.add(1,new Person("Vale", 6));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());;
        }

        System.out.println();

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());;
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Luis", 45));
        supermarket.add(new Person("Lili", 62));
        supermarket.add(new Person("Vale", 6));
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){

    }
}
