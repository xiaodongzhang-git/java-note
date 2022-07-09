
public class PackageDemo {
    public static void main(String[] args) {
        Object obj = 12.9; //装箱
        Double d = (Double)obj; //拆箱
        System.out.println(d * 2);

        Integer x = 127;
        Integer y = 127;
        System.out.println(x == y);
        Integer z = 128;
        Integer w = 128;
        System.out.println(z == w);
        System.out.println(z.equals(w));
    }
}