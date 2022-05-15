
class Person {
    String name ;
    int age ;

    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class QuotePersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "小新";
        person1.age = 5;

        Person person2 = person1; //引用传递 指向栈内存
        person2.age = 10;
        person1.tell();

        change(person1); // 和上面的是一样的道理
        person1.tell();
    }

    public static void change(Person p) {
        p.age = 15;
    }
}
