
class Person {
    public Person() {
        System.out.println("执行了构造方法");
    }
    static {
        System.out.println("执行了静态块");
    } //普通类静态代码块
    {
        System.out.println("执行了构造块");
    }
}

public class StaticCodeBlock {
    static {
        System.out.println("代码初始化");
    } //主类静态代码块
    public static void main(String[] args) {
        new Person();
        new Person();
        new Person();
    }
}
