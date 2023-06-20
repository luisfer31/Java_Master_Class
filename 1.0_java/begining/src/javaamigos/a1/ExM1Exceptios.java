package javaamigos.a1;

public class ExM1Exceptios {
    public static void main(String[] args) {

        try {
            int number = Integer.parseInt("1");
            System.out.println(number);

            for (int i=10; i>=0; i--){
                System.out.println(10/i);
            }
            System.out.println("end");
        }

        /*catch (NumberFormatException e){
            System.out.println("Failed to parse 1x");
        }catch (ArithmeticException e){
            System.out.println("Not allowed divide by zero");
        }*/

        catch (NumberFormatException | ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            //catch all exceptions
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally always runs :)");
        }
    }
}
