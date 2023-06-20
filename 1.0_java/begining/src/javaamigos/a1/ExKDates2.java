package javaamigos.a1;

import java.time.*;

public class ExKDates2 {
    public static void main(String[] args) {
        //Day time in Sidney
        LocalDateTime nowInSydney = LocalDateTime.now(ZoneId.of("Australia/Sydney"));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(nowInSydney);
        for (String zone:ZoneId.getAvailableZoneIds()){
            //System.out.println(zone);
        }
        System.out.println();
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());

    }
}
