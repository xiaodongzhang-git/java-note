
public class StringCompare {
    public static void main(String[] args) {
        // equals区分大小写
        System.out.println("m".equals("M"));
        // equalsIgnoreCase忽略大小写
        System.out.println("m".equalsIgnoreCase("M"));
        // compareTo获取int差值
        System.out.println("java".compareTo("Java"));
        // compareToIgnoreCase忽略大小写获取int差值
        System.out.println("java".compareToIgnoreCase("Java"));
    }
}