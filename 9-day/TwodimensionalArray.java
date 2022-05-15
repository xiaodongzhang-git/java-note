
public class TwodimensionalArray {
    public static void main(String[] args) {
        int data [][] = new int [][] {
            {1, 2}, {3, 4, 5}, {6, 7, 8, 9}
        };
        for (int x=0; x<data.length; x++) {
            for (int y=0; y<data[x].length; y++) {
                System.out.println("data["+x+"]["+y+"] = " + data[x][y]);
            }
            System.out.println("-------------");
        }
        
        // foreach ok
        // for (int temp []: data) {
        //     for (int num: temp) {
        //         System.out.println(num);
        //     }
        // }
    }
}
