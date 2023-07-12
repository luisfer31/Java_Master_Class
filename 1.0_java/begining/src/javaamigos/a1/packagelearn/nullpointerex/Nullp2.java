package javaamigos.a1.packagelearn.nullpointerex;

public class Nullp2 {
    public static void main(String[] args) {
        String brand = "LuisM-JavaDev";
        try {
            System.out.println(brand.toUpperCase());
        }catch (NullPointerException e){
            System.out.println("brand is null");;
        }
    }
}
