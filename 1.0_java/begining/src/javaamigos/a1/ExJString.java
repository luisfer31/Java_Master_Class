package javaamigos.a1;

public class ExJString {
    public static void main(String[] args) {
        String name = "Luis Fernando Munoz C";
        String name1 = "Luis Fernando Munoz C";
        System.out.println(name.contains("Fer"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("   ".isBlank());
        System.out.println("   ".isEmpty());
        System.out.println("  Hello   ".trim());
        System.out.println(name.startsWith("L"));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));
        System.out.println(name.equals(name1));
        System.out.println();

        String number = String.valueOf(1);
        System.out.println(number);
        String format = String.format("Number %s", number);
        System.out.println(format);
        String[] namesA = {"Luis", "lili", "Vale"};
        String join = String.join(", ", namesA);
        System.out.println(join);

    }
}
