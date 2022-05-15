public class BitOperation {
    public static void main(String[] args) {
        int x = 13; //1101
        int y = 7;  //0111
        // 1101
        // 0111
        //---------
        // 0101=5
        System.out.println(x & y); // 5
        // 1101
        // 0111
        //---------
        // 1111=15
        System.out.println(x | y); // 15

        // 移位
        // 0010==>移2位==》1000=8
        int z = 2;
        System.err.println(z << 2); // 8

        // && ||
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
    }
}
