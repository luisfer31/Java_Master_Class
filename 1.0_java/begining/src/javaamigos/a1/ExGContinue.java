package javaamigos.a1;

public class ExGContinue {
    public static void main(String[] args) {
        String[] names = new String[]{
                "Andre",
                "Luis",
                "Ali",
                "Valentina"
        };
        for (String name: names){
            if (name.startsWith("A")){
                continue;
            }else {
                System.out.println(name);
            }
        }
    }
}
