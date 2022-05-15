
// class A {}
// class B {}
// class C extends A, B {} // error不允许多重继承

class A {}
class B extends A {}
class C extends B {} //多层可，不建议超过3层

class Person {
    private String name ;
    public void setName(String name) {
        this.name = name ;
    }
    public String getName() {
        return this.name ;
    }
}

class Student extends Person {

    public String getInfo() {
        // return this.name ; //error
        return getName() ; //隐式访问
    }
}

public class MultExtend {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("小新");
        System.out.println(stu.getInfo());
    }
}