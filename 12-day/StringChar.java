
public class StringChar {
    public static void main(String[] args) {
        // 获取索引位的字符
        String strA = "hello java";
        char chA = strA.charAt(0);
        System.out.println(chA);

        // 字符串小写转大写
        char [] chB = strA.toCharArray();
        for (int i=0; i<chB.length; i++) {
            chB[i] -= 32;
        }

        String strB = new String(chB);
        System.out.println(strB);
        System.out.println(new String(chB, 0, 5)); // 截取部分位置

        // 判断字符串是否全是数字
        System.out.println(isNumber(strA));
        System.out.println(isNumber("1294"));
    }

    public static boolean isNumber(String str) {
        char [] arr = str.toCharArray();
        for (char c: arr) {
            if(c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}