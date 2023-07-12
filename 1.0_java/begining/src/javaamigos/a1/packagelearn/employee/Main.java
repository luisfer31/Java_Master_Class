package javaamigos.a1.packagelearn.employee;

public class Main {
    public static void main(String[] args) {

        String[] languages = {"Java", "Go", "C++"};

        Programmer java = new Programmer(
                "Luis",
                45,
                "medellin",
                "BackEnd",
                languages
        );

        java.sayHi();

        java.writeSomeCode();
        System.out.println(java.getAddress());
        System.out.println(java.getName());
        System.out.println(java.getExperience());
        System.out.println(java.getAge());
    }
}
