public class RelationalOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 11;
        boolean flag = x > y;
        System.out.println(flag); //false

        char c = '张';
        System.out.println((int)c); //24352
        boolean cflag = c == 24352;
        System.out.println(cflag); //true

    }
}
