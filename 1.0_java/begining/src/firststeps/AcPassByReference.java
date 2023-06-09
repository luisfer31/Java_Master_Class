package firststeps;

public class AcPassByReference {
    static public class MyClass{
        int myInt;
    }
    static int incrementByValue(int num){
        num ++;
        return num;
    }
    static void incrementByReference(MyClass obj){
        obj.myInt++;
    }

    public static void main(String[] args) {
        int num =5;
        int answ = incrementByValue(num);
        System.out.println(num);
        System.out.println(answ);
        System.out.println("\n");
    }


}
