
public class StringCompare{
    public static void main(String[] args) {
        String strA = "hello java";
        String strB = new String("hello java");
        System.out.println(strA == strB); // 比较的是内存地址
        System.out.println(strA.equals(strB)); // 比较的是内容
    }
}