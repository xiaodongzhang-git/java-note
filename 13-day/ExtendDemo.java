
class Person {
    private String name ;
    private int age ;

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

    public String getInfo() {
        return String.format("姓名：%s 年龄：%d", name, age);
    }
}

class Student extends Person { //子类
    private String school ;

    public void setSchool(String school) {
        this.school = school ;
    }

    public String getSchool() {
        return this.school ;
    }
}

public class ExtendDemo {
    public static void main(String[] args) {
        Student stuA = new Student();
        stuA.setName("新之助");
        stuA.setAge(5);
        System.out.println(stuA.getInfo());

        stuA.setSchool("双叶幼稚园");
        System.out.println(stuA.getSchool());
    }
}