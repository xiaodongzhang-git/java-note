public class OverloadDemo {
    public static void main(String[] args) {
        int x = add(10, 20);
        System.out.println(x);
        int y = add(10, 20, 30);
        System.out.println(y);
        double z = add(10.0, 20.0);
        System.out.println(z);
    }

    public static int add(int x, int y) {
        System.out.println("two int");
        return x + y;
    }

    public static int add(int x, int y, int z) {
        System.out.println("three int");
        return x + y + z;
    }

    public static double add(double x, double y) {
        System.out.println("two double");
        return x + y;
    }
}
