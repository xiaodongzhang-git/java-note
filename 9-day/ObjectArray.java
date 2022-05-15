
class Person {
    private String name;
    private int age;

    public Person(){};
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return this.name +":" + this.age;
    }
    // setter getter........
}

public class ObjectArray {
    public static void main(String[] args) {
        Person per [] = new Person[3];
        per[0] = new Person("小新", 5);
        per[1] = new Person("风间", 6);
        per[2] = new Person("阿呆", 4);
        for (Person p: per) {
            System.out.println(p.getInfo());
        }
    }
}
