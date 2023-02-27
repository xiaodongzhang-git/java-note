public class ThrowDemo {
    public static void main(String[] args) {
        try {
            throw new Exception("throw exception...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}