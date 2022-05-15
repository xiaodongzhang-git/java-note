
public class StringConstantPool {
    public static void main(String[] args) {
        String strA = "www.java.com";
        String strB = "www." + "java" + ".com";
        System.out.println(strA == strB); // 静态池

        String info = "java";
        String strC = "www.java.com";
        String strD = "www." + info + ".com";
        System.out.println(strC == strD); // 动态池
    }
}