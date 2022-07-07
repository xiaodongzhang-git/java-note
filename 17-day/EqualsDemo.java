class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        if (this == obj) return true;

        Person per = (Person) obj;
        return this.name == per.name && this.age == per.age;
    }
}


public class EqualsDemo {
    public static void main(String[] args) {
        Person a = new Person("zhangsan", 20);
        Person b = new Person("zhangsan", 21);
        System.out.println(a.equals(b));
    }
}