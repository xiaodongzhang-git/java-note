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

public class Down {
    public static void main(String[] args) {
        Person p = new Boxer(); // 向上转型
        // 平常的时候
        p.print();
        // 比赛的时候
        Boxer b = (Boxer)p; //向下转型（在这之前必须进行向上转型，不然会报错）
        b.action();
    }
}