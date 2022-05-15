class Person {
    private String name ;
    private int age ;
    // String country = "火星" ; //多少个对象会产生多少个堆内存
    static String country = "火星" ; //全局只有一个

    public Person(String name, int age) {
        this.name = name ;
        this.age = age ;
    }
    // set get相关方法省略

    public void getInfo() {
        System.out.println(this.name + ":" + this.age + ":" + country);
    }
}

public class StaticAttrDemo {
    public static void main(String[] args) {
        Person person1 = new Person("新之助", 5);
        // Person.country = "月球" ;
        // person1.country = "月球" ; //error
        Person person2 = new Person("阿呆", 6);
        Person person3 = new Person("风间", 7);
        person1.getInfo();
        person2.getInfo();
        person3.getInfo();
    }
}