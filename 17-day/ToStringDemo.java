
class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    // 可通过覆写来获取类信息
    // public String toString() {
    //     return "name : " + this.name;
    // }
}

public class ToStringDemo {
    public static void main(String[] args) {
        Person person = new Person("zhangsan");
        System.out.println(person); //本质是调用toString
        System.out.println(person.toString());
        //Person@251a69d7
        //Person@251a69d7
    }
}