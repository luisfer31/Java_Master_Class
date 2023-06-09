package javaamigos.a1;

public class ExEAccess {
    public static String foo = "bar";
     String brand = "amigosluis";

    public static void main(String[] args) {
        System.out.println(foo);
        ExEAccess m = new ExEAccess();

        //brand.indexOfNonWhitespace()
        m.brand.isBlank();
        m.fooMethod();

    }

    public void fooMethod(){

    }
}
