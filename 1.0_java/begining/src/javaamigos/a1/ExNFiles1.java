package javaamigos.a1;

import java.io.*;
import java.util.Scanner;

public class ExNFiles1 {
    public static void main(String[] args) {
        File file = createFiles("1.0_java/begining/src/javaamigos/a1/foo.txt");
        writeToFile(file, true);
        readFile(file);
    }

    private static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // No need to add a boolean append argument
    private static void writeToFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter writer = new PrintWriter(fileWriter);
            writer.println("Renewal");
            writer.println("Hello");
            writer.println("World 1");
            writer.println("Amigos LM");
            writer.println("Valentina Muñoz V");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File createFiles(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            } else if (file.exists()) {
                file.delete();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
