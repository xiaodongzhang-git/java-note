
class Person {
    private String name ;
    private int age ;

    public Person(String n) { //重载
        name = n ;
        age = 6 ;
    }

    public Person(String n, int a) {
        name = n ;
        age = a ;
    }

    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class StructureDemo {
    public static void main(String[] args) {
        Person person1 = new Person("新之助", 5);
        person1.tell();
        Person person2 = new Person("新之助");
        person2.tell();
        new Person("风间", 6).tell(); // 匿名对象
    }
}