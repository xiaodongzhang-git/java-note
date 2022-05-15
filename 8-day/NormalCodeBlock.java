
public class NormalCodeBlock {
    public static void main(String[] args) {
        // int x = 10 ;
        // int x = 100 ; // 重复定义会报错
        {
            int x = 10 ;
            System.out.println(x);
        } // 普通代码块
        int x = 100 ;
        System.out.println(x);
    }
}