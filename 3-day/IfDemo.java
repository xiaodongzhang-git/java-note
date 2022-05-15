public class IfDemo {
    public static void main(String[] args) {
        int age = 19;
        if(age > 18) {
            System.out.println("成年了");
        }else{
            System.out.println("未成年");
        }

        int score = 70;
        if(score <= 60) {
            System.out.println("不合格");
        }else if(score > 60 && score <= 80) {
            System.out.println("合格了");
        }else {
            System.out.println("很优秀");
        }
    }
}
