
public class ArrayDef {
    public static void main(String[] args) {
        int data [] = new int [3]; //动态初始化
        // int data [] = new int [] {10, 20, 30}; //静态初始化
        for (int x=0; x<data.length; x++) {
            System.out.println(data[x]); // 默认值
        }
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;
        for (int x=0; x<data.length; x++) {
            System.out.println(data[x]);
        }
    }
}
