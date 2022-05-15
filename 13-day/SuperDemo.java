class Person {
    private String name ;
    private int age ;
    Person(){
        System.out.println("Person---无参数");
    }
    Person(String name, int age){
        System.out.println("Person---有参数");
        this.name = name ;
        this.age = age ;
    }
}

class Student extends Person {
    private String school ;

    Student(){
        System.out.println("Student---无参数");
    }

    Student(String name, int age, String school){
        super(name, age); // super可以用来调用父类构造方法
        this.school = school ;
        System.out.println("Student---有参数");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Student stuA = new Student(); //默认会先调用Person无参构造
        System.out.println("--------------");
        Student stuB = new Student("新之助", 5, "双叶幼稚园");
    }
}
