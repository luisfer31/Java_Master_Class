package javaamigos.a1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class ExKDates {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.isAfter(LocalDate.of(2023, Month.JUNE,26).atStartOfDay()));
        System.out.println(now.minusDays(5));
    }
}
