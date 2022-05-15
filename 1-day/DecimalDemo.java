public class DecimalDemo {
    public static void main(String[] args) {
        double x = 13.14;
        int y = 10;
        double z = x + y;
        // double + int = double
        // 演算中、結果は自動的に広い範囲のデータ型に変換されます。
        System.out.println(z); // 23.14

        //DecimalDemo.java:10: error: incompatible types: possible lossy conversion from double to float
        //float a = 10.11;

        float j = (float)10.1;
        float k = 10.2F;
        System.out.println(j * k); // 103.020004

        int m = 10;
        int n = 4;
        System.out.println(m / n); // 2
        System.out.println((double)m / n); // 2.5
    }
}
