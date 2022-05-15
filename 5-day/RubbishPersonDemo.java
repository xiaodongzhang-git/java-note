
class Person {
    String name ;
    int age ;

    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class RubbishPersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "小新";
        person1.age = 5;

        person2.name = "风间";
        person2.age = 6;

        person2 = person1; //执行之后，原本的堆内存会变成垃圾空间，因为无任何指向
    }

}

