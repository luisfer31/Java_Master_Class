package javaamigos.a1;

import java.util.Scanner;

public class ExFMethodsYield {
    static Scanner sc = new Scanner(System.in);
    static double mRentalIncome = 0;
    static double priceProperty = 0;

    public static void main(String[] args) {
        dataIncome();
        rentalYield(mRentalIncome, priceProperty);
    }
    public static void dataIncome() {
        System.out.println("Monthly rental income ?");
        mRentalIncome = sc.nextInt();
        System.out.println("Price of property ?");
        priceProperty = sc.nextInt();
    }

    public static void rentalYield(double mRental, double pPrice){
        double annualRental = mRental *12;
        double yield = (annualRental / pPrice) * 100;
        System.out.printf("Rental yield = %.2f%% ", yield);
    }
}
