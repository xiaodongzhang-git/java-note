public class ForDemo {
    public static void main(String[] args) {
        int sum = 0;
        for(int x = 0; x < 101; x++) {
            sum += x;
        }
        // int x = 0;
        // for(; x < 101;) {
        //     sum += x;
        //     x++;
        // }

        System.out.println(sum); // 5050
    }
}
