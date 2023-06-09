package javaamigos.a1;

public class ExCSwitch {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("E");
                break;

            case 'B':
                System.out.println("Pass");
                break;

            case 'C':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Error grade");
        }

        String result = switch (grade) {
            case 'A' -> "Excellent";
            case 'B' -> "Pass";
            default -> "Fail";
        };
        System.out.println(result);
    }
}
