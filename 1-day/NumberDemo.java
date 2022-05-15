public class NumberDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(max); // 2147483647
        System.out.println(min); // -2147483648

        // max+1=min min-1=max
        // この現象はデータオーバーフローと呼ばれます。
        System.out.println(max + 1); // -2147483648
        System.out.println(max + 2); // -2147483647
        System.out.println(min - 1); // 2147483647
        // long + int = long   long - int = long
        System.out.println((long)min - 1);

        // byte -128~127
        byte y = 20;
        System.out.println(y * y);
    }
}