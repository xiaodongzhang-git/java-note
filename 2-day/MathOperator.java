public class MathOperator{
    public static void main(String[] args) {
        int num = 10;
        num += 20;
        System.out.println(num); // 30

        num = (10 * 10 - 50)/2;
        System.out.println(num); // 25

        num %= 3;
        System.out.println(num); // 1
        
        int x = 10;
        int y = 20;
        // 尽量不要这样用
        int result = ++ x - y --; // -9
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println(result);
    }
}