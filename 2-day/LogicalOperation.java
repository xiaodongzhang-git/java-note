public class LogicalOperation {
    public static void main(String[] args) {
         int x = 10;
         int y = 20;
         int max = x > y? x: y;
         System.out.println(max); //20
         // 三目运算符可以嵌套使用 不建议用 可读性差
         int z = 15;
         int max_num = x > y? (x > z? x: z): (y > z? y: z);
         System.out.println(max_num); // 20
    }
}
