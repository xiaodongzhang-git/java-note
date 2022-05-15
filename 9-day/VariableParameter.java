class ArrayUtil {
    public static int sum(int ... data) {
        int total = 0;
        for (int temp: data) {
            total += temp;
        }
        return total;
    }
}

public class VariableParameter {
    public static void main(String[] args) {
        int x = ArrayUtil.sum(3, 4, 5, 8);
        System.out.println(x);
    }
}
