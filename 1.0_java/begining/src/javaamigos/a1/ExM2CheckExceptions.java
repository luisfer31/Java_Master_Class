package javaamigos.a1;

import java.io.File;
import java.io.IOException;

public class ExM2CheckExceptions {
    public static void main(String[] args) {
        try {


            File file = new File("1.0_java/begining/src/javaamigos/a1/foo.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
