public class RecursionDemo {
    public static void main(String[] args) {
        System.out.println(add(100));
    }

    public static int add(int x) {
        if(x == 1) {
            return 1; //结束条件
        }

        return x + add(x - 1);
    }
}
