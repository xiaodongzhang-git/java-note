
public class FuncDemo {
    public static void main(String[] args) {
        printFunc();
        int c = addFunc(10, 20);
        System.out.println(c);
    }

    public static void printFunc() {
        System.out.println("hello word");
    }

    public static int addFunc(int a, int b) {
        return a + b;
    }
}
