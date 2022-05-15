public class CharDemo {
    public static void main(String[] args) {
        char x = 'A';
        System.out.println(x); // A
        /*
            A(65)-Z(90)
            a(97)-z(122)
        */
        int y = x;
        System.out.println((int)y); // 65

        // '0'(48)-'9'(57)
        char z = '0';
        System.out.println((int)z); // 48

        char a = 'x';
        int b = (int)a - 32;
        System.out.println((char)b); // X
        
        // unicode
        char m = '桜';
        System.out.println((int)m); // 26716
    }
}