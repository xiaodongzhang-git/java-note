
class ArrayUtil {
    public static void printArray(int temp[]) {
        for (int t: temp) {
            System.out.println(t);
        }
    }
}

public class ArrayBuiltinMethod {
    public static void main(String[] args) {
        int dataA [] = new int [] {0,1,2,3,4,5,6,7,8,9};
        int dataB [] = new int [] {11,22,33,44,55,66,77};
        // System.arraycopy(src, srcPos, dest, destPos, length);
        System.arraycopy(dataA, 5, dataB, 2, 3);
        ArrayUtil.printArray(dataA);
        System.out.println("------------");
        ArrayUtil.printArray(dataB);
    }
}

