
class ArrayUtil {
    public static void reverse(int data[]) {
        int center = data.length / 2;
        int head = 0;
        int tail = data.length - 1;
        for (int x=0; x<center; x++) {
            int temp = data[head];
            data[head] = data[tail];
            data[tail] = temp;
            head ++;
            tail --;
        }
    }

    public static void printArray(int temp[]) {
        for (int t: temp) {
            System.out.println(t);
        }
    }
}

public class ArrayReverse {
    public static void main(String[] args) {
        int data [] = new int [] {0,1,2,3,4,5,6,7,8,9};
        ArrayUtil.reverse(data);
        ArrayUtil.printArray(data);
    }
}
