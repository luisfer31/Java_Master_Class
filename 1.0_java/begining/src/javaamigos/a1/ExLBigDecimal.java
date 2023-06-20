package javaamigos.a1;

import java.math.BigDecimal;

public class ExLBigDecimal {
    public static void main(String[] args) {
        double num1 = 0.02;
        double num2 = 0.03;
        double result = num2-num1;
        System.out.println("double result =" + result);

        BigDecimal num3 = new BigDecimal("0.02");
        BigDecimal num4 = new BigDecimal("0.03");
        BigDecimal resultB = num4.subtract(num3);
        System.out.println("BigDecimal result =" + resultB);

        System.out.println();

        BigDecimal number = BigDecimal.TEN;
        System.out.println(number);
        System.out.println(number.add(BigDecimal.ONE));
        System.out.println(number.max(BigDecimal.ZERO));
        System.out.println(number.compareTo(new BigDecimal("12"))); // 1 if is greater than , -1 if less than, 0 if is equal
        System.out.println(number.multiply(new BigDecimal(10)));




    }
}
