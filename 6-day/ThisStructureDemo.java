
class Person {
    private String name ;
    private int age ;
    public Person() {
        System.out.println("new person----------");
    }
    public Person(String name) {
        this() ; //调用构造方法
        this.name = name ;
    }
    public Person(String name, int age) {
        this(name) ;
        this.age = age ;
    }
    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class ThisStructureDemo {
    public static void main(String[] args) {
        Person person = new Person("新之助", 5);
        person.tell();
    }
}