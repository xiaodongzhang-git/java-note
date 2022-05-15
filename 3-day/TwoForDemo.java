
public class TwoForDemo {
    public static void main(String[] args) {

        for (int x = 0; x <= 9; x++) {
            for (int y=0; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + (x*y) + "\t");
            }
            System.out.println();
        }
    }
}
