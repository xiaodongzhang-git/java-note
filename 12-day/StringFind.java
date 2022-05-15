
public class StringFind {
    public static void main(String[] args) {
        String str = "hello java";
        //判断是否包含子字符串
        System.out.println(str.contains("java"));
        //查找第一次出现的位置，可以指定从哪个位置开始查找
        System.out.println(str.indexOf("l"));
        System.out.println(str.indexOf("l", 3));
        //从后面开始查找，可以指定从哪个位置开始查找
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 8));
        //以什么开头，可以指定从哪个位置开始
        System.out.println(str.startsWith("h"));
        System.out.println(str.startsWith("h", 1));
        //以什么结尾
        System.out.println(str.endsWith("a"));
    }
}
