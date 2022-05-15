
class Person {
    private String name ;
    private int age ;

    public Person(String name, int age) {
        // name = name ;
        // age = age ;
        //　null：0
        this.name = name ;
        this.age = age ;
    }

    public void tell() {
        System.out.println(name + "：" + age);
    }
}

public class ThisAttrDemo {
    public static void main(String[] args) {
        Person person = new Person("新之助", 5);
        person.tell();
    }
}