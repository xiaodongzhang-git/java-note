
public class StringReplace {
    public static void main(String[] args) {
        String str = "hello java";
        // 全部替换
        System.out.println(str.replaceAll("l", "-"));
        // 替换首个
        System.out.println(str.replaceFirst("l", "-"));
    }
}
