
public class MainDemo {
    public static void main(String[] args) {
        // java MainDemo "hello java" "hello python"
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}