package javaamigos.a1;

public class ExFMethodsYieldAMCode {
    public static void main(String[] args) {
        double yield = calculatePropertyYield(1_300, 250_000);
        System.out.println(yield);
    }
    private static double calculatePropertyYield(
            double rent, double propertyPrice){
        double yearlyRent = rent *12;
        return (yearlyRent/propertyPrice)*100;
    }
}
