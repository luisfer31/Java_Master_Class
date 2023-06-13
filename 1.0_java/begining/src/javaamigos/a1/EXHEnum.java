package javaamigos.a1;

import java.util.Arrays;

public class EXHEnum {
    enum Gender{
        MALE,
        FEMALE
    }

    enum TShirtSize{
        S,
        M,
        L,
        XL
    }
    public static void main(String[] args) {
        System.out.println(Gender.FEMALE);
        System.out.println(Arrays.toString(Gender.values()));
        System.out.println(Arrays.toString(EXHEnumColor.values()));

        // Calling class ExILocalGlobal.BRAND
        System.out.println(ExILocalGlobal.BRAND);

    }
}
