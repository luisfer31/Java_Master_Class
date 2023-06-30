package javaamigos.a1;

public class ExOClasses1 {
    public static void main(String[] args) {
        ExOClassesCat rose = new ExOClassesCat("Rose", 5, "blue");
        rose.meow();
        System.out.println(rose.getName());
        System.out.println(rose.getAge());
        System.out.println(rose);

        System.out.println();

        ExOClassesCat rose1 = new ExOClassesCat("Rose", 5, "blue");
        ExOClassesCat rose2 = new ExOClassesCat("Rose", 5, "blue");

        System.out.println(rose1 == rose2);
        System.out.println(rose1.equals(rose2));



//        System.out.println();
//
//        ExOClassesCat star = new ExOClassesCat("Star",3);
//        star.meow();
//        System.out.println(star.getName());
//        System.out.println(star.getAge());
//
//        System.out.println();
//
//        ExOClassesCat jupiter = new ExOClassesCat("jupiter");
//        System.out.println(jupiter.getName());
//        System.out.println(jupiter.getAge());
//
    }


}
