class Outer {
    private String msg = "this is a Outer class";
    public void fun() {
        Inner in = new Inner();
        in.print();
        System.out.println(in.info);
    }

    class Inner {
        private String info = "this is a Inner class";
        public void print() {
            System.out.println(Outer.this.msg);
        }
    }
}

public class InnerDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.fun();
    }
}