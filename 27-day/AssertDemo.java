public class AssertDemo {
    public static void main(String[] args) {
        int x = 10;
        // ......经过一系列代码
        assert x == 100 : "x不等于100";
        System.out.println(x);
    }
}