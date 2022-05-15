
class Person {
    public Person() {
        System.out.println("执行了构造方法");
    }
    {
        System.out.println("执行了构造块");
    }
}

public class BuildCodeBlock {
    public static void main(String[] args) {
        new Person();
        new Person();
        new Person();
    }
}
