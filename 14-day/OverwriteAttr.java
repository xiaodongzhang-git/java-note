
class Person {
    private String name = "java0";
    public String getInfoA() {
        return this.name;
    }
}

class Student extends Person {
    // 属性不会覆写，只是相当于重新定义了一个新的变量
    private String name = "java1";
    public String getInfoB() {
        return this.name ;
    }
}

public class OverwriteAttr {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.getInfoA());
        System.out.println(stu.getInfoB());
    }
}
