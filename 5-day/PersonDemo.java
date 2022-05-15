class Person {
    String name ;
    int age ;

    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.tell(); //没赋值会直接用默认值

        person.name = "小新";
        person.age = 5;
        person.tell();
    }
}
