package javaamigos.a1.packagelearn.abstractanimal;

public class Main {
    public static void main(String[] args) throws Exception{
        String path = "1.0_java/begining/src/javaamigos/a1/packagelearn/data.txt";
        ExtractorReport numberExtractorReport =
                new NumberExtractorReport();

        numberExtractorReport.prepareAndSendReport(path);
        System.out.println();

        ExtractorReport emailExtractorReport =
                new EmailExtractorReport();

        emailExtractorReport.prepareAndSendReport(path);

        ExtractorReport[] report = {
                numberExtractorReport, emailExtractorReport
        };

        for (ExtractorReport extractorReport : report) {
            
        }



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
