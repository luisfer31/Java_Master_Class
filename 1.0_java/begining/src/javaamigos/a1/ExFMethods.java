package javaamigos.a1;

public class ExFMethods {

    private static int add(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    private static void printBrand(String brand){
//        System.out.println("LuisMBackend-J");
        System.out.println(brand.toUpperCase());
    }

    private static void isAdult(int age){
        if (age >= 16){
            System.out.println("Adult :)");
        }else {
            System.out.println("Not is an Adult :(");
        }
    }

    public static void main(String[] args) {
        ExFMethods methods = new ExFMethods();
        int result = add(10,10);
        int result2 = add(10,100);
        System.out.println(result);
        System.out.println(result2);
        printBrand("LuisMBackend-J");
        printBrand("Nike");
        isAdult(16);
        isAdult(15);

    }
}
