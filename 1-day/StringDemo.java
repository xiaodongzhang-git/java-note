public class StringDemo {
    public static void main(String[] args) {
        String x = "hello world!";
        System.out.println(x); // hello world!

        String y = x + "hello java!";
        System.out.println(y); // hello world!hello java!
        
        // String > double > int
        int a = 10;
        double b = 13.14;
        String str = "result: " + a + b;
        System.out.println(str); // result: 1013.14

        String str2 = "result: " + (a + b);
        System.out.println(str2); // result: 23.14
        
        System.out.println("\thello world!\n hello \"java\"");
    }
}
