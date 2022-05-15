
class Person {
    private String name ;
    private int age ;
    public void tell() {
        System.out.println(name + "：" + age);
    }
    public void setName(String n) {
        name = n ;
    }
    public void setAge(int a) {
        age = a ;
    }

    public String getName() {
        return name ;
    }
    public int getAge() {
        return age ;
    }

}

public class PrivateDemo {
    public static void main(String[] args) {
        Person person = new Person();
        // person.name = "zhangsan";
        // PrivateDemo.java:14: error: name has private access in Person
        // person.name = "zhangsan"; //
        //             ^
        // 1 error
        person.tell();
        person.setName("新之助");
        person.setAge(5);
        person.tell();
    }
}