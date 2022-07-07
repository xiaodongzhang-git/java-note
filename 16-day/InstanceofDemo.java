class Person {
    public void print() {
        System.out.println("吃饭，睡觉...");
    }
}

class Boxer extends Person {
    public void action() {
        System.out.println("打拳...");
    }
}

public class InstanceofDemo {
    public static void main(String[] args) {
        // Person p = new Boxer();
        Person p = new Person();
        // 平常的时候
        p.print();
        // 比赛的时候
        if(p instanceof Boxer) { //判断避免报错
            Boxer b = (Boxer)p;
            b.action();
        }else{
            System.out.println("不是拳击手，无法参赛...");
        }
    }
}