package javaamigos.a1.packagelearn.nullpointerex;

import java.util.Optional;

public class Nullp3Optional {
    public static void main(String[] args) {
        String brand = "LuisM-JavaDev"; // null
        Optional<String> brandOptional = Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty());
        if (brandOptional.isEmpty()){
            System.out.println("Brand is empty");
        }else {
            System.out.println(brandOptional.get());
        }

        // lambdas
        brandOptional.ifPresentOrElse(brandL->{
            System.out.println(brandL.toUpperCase());
        },()->{
            System.out.println("Brand is empty");
        });

        // or else
        var result = brandOptional.orElse(brand);
        System.out.println(result);

        //
        printToUpperCase(Optional.of("Luis"));
    }

    public static void printToUpperCase(Optional<String> input){
        input.ifPresent(s-> System.out.println(s.toUpperCase()));
    }
}
