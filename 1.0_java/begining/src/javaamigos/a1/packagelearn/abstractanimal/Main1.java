package javaamigos.a1.packagelearn.abstractanimal;

public class Main1 {
    public static void main(String[] args) throws Exception{
        String path = "1.0_java/begining/src/javaamigos/a1/packagelearn/data.txt";

        System.out.println(1+1);
        System.out.println("1" + "1");
        catsAndDogs();


        NumberExtractorReport numberExtractorReport =
                new NumberExtractorReport();
        numberExtractorReport.prepareAndSendReport(path);
        System.out.println();
        new EmailExtractorReport().prepareAndSendReport(path);



    }

    private static void catsAndDogs(){
        Animal dog = new Dog("Foo");
        Animal cat = new Cat("Bar");
        Animal[]animals={cat,dog};
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }

}
