enum Sex {
    MALE("man"), FEMALE("woman");
    private String title;
    private Sex(String title) {
        this.title = title;
    }
    public String toString() {
        return this.title;
    }
}

class Person {
    private String name;
    private int age;
    private Sex sex;

    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String toString() {
        return this.name + " - " + this.age + " - " +this.sex;
    }
}

public class EnumSex {
    public static void main(String[] args) {
        System.out.println(new Person("zhangsan", 20, Sex.MALE));
    }
}
