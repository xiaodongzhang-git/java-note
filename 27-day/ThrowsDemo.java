class MyMath {
    public static int div(int x, int y) throws Exception {
        return x / y;
    }
}

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            System.out.println(MyMath.div(10, 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}