
class Message {
    public static <U> void print(U[] list) {
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
        System.out.println();
    }
}

public class GenericsFunc {
    public static void main(String[] args) {
        String a[] = { "a", "b", "c", "d", "e" };
        Character b[] = { '1', '2', '3', '4', '5' };
        Integer c[] = { 1, 2, 3, 4, 5 };
        Message.print(a);
        Message.print(b);
        Message.print(c);
    }

}
