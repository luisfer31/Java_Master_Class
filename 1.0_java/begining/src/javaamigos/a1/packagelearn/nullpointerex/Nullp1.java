package javaamigos.a1.packagelearn.nullpointerex;

public class Nullp1 {
    public static void main(String[] args) {
        String brand = "LuisM-JavaDev";
        System.out.println(brand.toUpperCase());
        Cat rose = new Cat("rose");
        //rose = null;
        System.out.println(rose.getName());
    }

    static class Cat{
        private String name;
        public Cat(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
