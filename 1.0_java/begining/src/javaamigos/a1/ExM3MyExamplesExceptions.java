package javaamigos.a1;

public class ExM3MyExamplesExceptions {
    public static void main(String[] args) {
        try {
            System.out.println(divide(10,0));
        } catch (ExM3MyCheckedExceptions e) {
            throw new RuntimeException(e);
        }

    }
    public static int divide(int a, int b) throws ExM3MyCheckedExceptions {
        if (b==0){
            throw new ExM3MyCheckedExceptions("cannot divide by zero");
        }
        return a/b;
    }
}
