
class Person {
    private String name ;
    private int age ;
    public Person(String name, int age) {
        this.setName(name) ;
        this.setAge(age) ; //不加this也可以，建议统一加上
    }
    public void tell() {
        System.out.println(name + "：" + age);
    }
    public void setName(String name) {
        this.name = name ;
    }
    public void setAge(int age) {
        this.age = age ;
    }

    public String getName() {
        return this.name ;
    }
    public int getAge() {
        return this.age ;
    }

}

public class ThisFuncDemo {
    public static void main(String[] args) {
        Person person = new Person("新之助", 5);
        person.tell();
    }
}