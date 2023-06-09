package javaamigos.a1;

import java.util.Scanner;

public class ExFMethodsYieldTwoValues {

    double mRentalIncome;
    double priceProperty;
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        ExFMethodsYieldTwoValues input = dataIncome();
        rentalYield(input);
    }
    public static ExFMethodsYieldTwoValues dataIncome() {
        ExFMethodsYieldTwoValues twoValues = new ExFMethodsYieldTwoValues();
        System.out.println("Monthly rental income ?");
        twoValues.mRentalIncome = sc.nextInt();
        System.out.println("Price of property ?");
        twoValues.mRentalIncome = sc.nextInt();
        return twoValues;
    }

    public static void rentalYield(ExFMethodsYieldTwoValues values){
        double annualRental = values.mRentalIncome *12;
        double yield = (annualRental / values.priceProperty) * 100;
        System.out.printf("Rental yield = %.2f%% ", yield);
    }
}
