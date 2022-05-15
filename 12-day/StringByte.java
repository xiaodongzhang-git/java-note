
public class StringByte {
    public static void main(String[] args) {
        String str = "hello java";
        // 字符串小写转大写
        byte [] by = str.getBytes();
        for (int i=0; i<by.length; i++) {
            by[i] -= 32;
        }

        String strA = new String(by);
        System.out.println(strA);
        System.out.println(new String(by, 0, 5)); // 截取部分位置

    }

}