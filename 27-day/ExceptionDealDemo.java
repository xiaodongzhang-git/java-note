public class ExceptionDealDemo {
    public static void main(String[] args) {
        System.out.println("start......");
        try {
            int y = Integer.parseInt(args[1]);
            int x = Integer.parseInt(args[0]); // ArrayIndexOutOfBoundsException
            System.out.println(x / y); // ArithmeticException
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } finally { // 不管异常有没有处理，都会执行这一个函数
            System.out.println("finally......");
        }
        System.out.println("end.......");
    }
}