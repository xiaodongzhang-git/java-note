
public class StringSub {
    public static void main(String[] args) {
        String str = "hello-java";
        // 从指定位置截取
        System.out.println(str.substring(6));
        //可以指定截取到哪一位之前（不包含）
        System.out.println(str.substring(0, 5));
    }
}
