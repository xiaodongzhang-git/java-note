class Person {
    private String name ;
    private int age ;
    // String country = "火星" ; //多少个对象会产生多少个堆内存
    private static String country = "火星" ;
    
    public static void setCountry(String c) {
        country = c ;
    }

    public Person(String name, int age) {
        this.name = name ;
        this.age = age ;
    }
    // set get相关方法省略

    public void getInfo() {
        System.out.println(this.name + ":" + this.age + ":" + country);
    }
}

public class StaticFuncDemo {
    public static void main(String[] args) {
        Person.setCountry("月球");
        Person person = new Person("新之助", 5);
        person.getInfo();
    }
}