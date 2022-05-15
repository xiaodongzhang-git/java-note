public class WhileDemo {
    public static void main(String[] args) {
        // 计算1加到100
        int sum = 0;
        int num = 1;
        while(num <= 100){
            sum += num;
            num ++;   //不加会导致死循环
        }
        System.out.println(sum);

        // do while(基本不用) 和 while区别：先执行一次后判断
        do {
            sum += num;
            num ++;   //不加会导致死循环
        } while(num <= 100);
        System.out.println(sum);
    }
}
