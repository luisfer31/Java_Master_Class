package javaamigos.a1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ExKDates1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.isAfter(LocalDate.of(2023, Month.JUNE, 26)));
        System.out.println(localDate.minusDays(5));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println();

        LocalDateTime someDayInThePass = LocalDateTime.of(
                1978,
                Month.APRIL,
                02,
                23,
                15
        );
        System.out.println(someDayInThePass);

        LocalDate someDayInThePass1 = LocalDate.of(
                1978,
                Month.APRIL,
                02
        );

        LocalTime someTime = LocalTime.of(12, 55, 48);
    }
}
