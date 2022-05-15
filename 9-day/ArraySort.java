
class ArrayUtil {
    public static void sort(int data[]) {
        for (int x=0; x<data.length; x++) {
            for (int y=0; y<data.length-x-1; y++) {
                if(data[y] > data[y+1]) {
                    int temp = data[y];
                    data[y] = data[y+1];
                    data[y+1] = temp;
                }
            }
        }
    }

    public static void printArray(int temp[]) {
        for (int t: temp) {
            System.out.println(t);
        }
    }
}

public class ArraySort {
    public static void main(String[] args) {
        int data [] = new int [] {8,9,0,2,3,5,10,7,6,1};
        ArrayUtil.sort(data);
        ArrayUtil.printArray(data);
    }
}
