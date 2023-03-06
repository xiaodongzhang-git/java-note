class Outer {
    private String msg = "this is outer.";
    public void fun(long time) {
        class Inner {
            public void print() {
                System.out.println(Outer.this.msg); //访问外部类变量
                System.out.println(time); //访问外部方法变量
            }
        }
        new Inner().print();
    }
}

public class FunInnerDemo {

    public static void main(String[] args) {
        new Outer().fun(2373373);
    }
}