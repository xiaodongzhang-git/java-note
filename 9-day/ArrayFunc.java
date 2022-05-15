
public class ArrayFunc {
    public static void main(String[] args) {
        int data [] = initArray();
        printArray(data);
        changeArray(data);
        printArray(data);
    }

    public static int [] initArray() {
        return new int [] {1, 2, 3, 4, 5};
    }

    public static void changeArray(int arr[]) {
        for (int x=0; x<arr.length; x++) {
            arr[x] *= 2;
        }
    }

    public static void printArray(int temp[]) {
        for (int t: temp) {
            System.out.println(t);
        }
    }
}
