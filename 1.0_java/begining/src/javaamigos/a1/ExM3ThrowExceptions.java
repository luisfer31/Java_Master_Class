package javaamigos.a1;

public class ExM3ThrowExceptions {
    public static void main(String[] args) {
        try {
            liliana();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void liliana() throws Exception{
        valentina();
    }

    static void valentina() throws Exception{
        luis();
    }
    static void luis()throws Exception{
        divide(10,0);
    }
    public static double divide(int a, int b) throws Exception{
        if (b==0){
            throw new Exception("Cannot divide by zero");
        }
        return a/b;
    }
}
