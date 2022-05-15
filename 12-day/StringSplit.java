
public class StringSplit {
    public static void main(String[] args) {
        String strA = "hello java hello python";
        String [] resultA = strA.split(" ");
        for(String x: resultA){
            System.out.println(x);
        }
        // 可以指定拆几个
        String [] resultB = strA.split(" ", 2);
        for(String y: resultB){
            System.out.println(y);
        }

        String strB = "192.160.0.2";
        // String [] resultC = strB.split("."); //得不到结果，因为.需要转义才可识别
        String [] resultC = strB.split("\\."); // \\转义
        for(String z: resultC){
            System.out.println(z);
        }
    }
}
