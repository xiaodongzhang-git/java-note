abstract class Action {
    public static final int EAT = 1;
    public static final int SLEEP = 5;
    public static final int WORK = 10;

    public void command(int code) {
        switch (code) {
            case EAT: {
                this.eat();
                break;
            }
            case SLEEP: {
                this.sleep();
                break;
            }
            case WORK: {
                this.work();
                break;
            }
            case EAT + SLEEP + WORK: {
                this.eat();
                this.sleep();
                this.work();
                break;
            }
        }
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void work();
}

class Robot extends Action {
    public void eat() {
        System.out.println("充电当中......");
    }
    public void sleep() {}
    public void work() {
        System.out.println("机械性工作中......");
    }
}

class Person extends Action {
    public void eat() {
        System.out.println("吃美食中......");
    }
    public void sleep() {
        System.out.println("躺在床上睡觉中......");
    }
    public void work() {
        System.out.println("创造性的工作中......");
    }
}

class Pig extends Action {
    public void eat() {
        System.out.println("吃剩饭中......");
    }
    public void sleep() {
        System.out.println("睡猪圈中......");
    }
    public void work() {}
}

public class ActionDemo {
    public static void main(String[] args) {
        Action robot = new Robot();
        Action person = new Person();
        Action pig = new Pig();

        System.out.println("--------------机器人------------------");
        robot.command(Action.EAT);
        robot.command(Action.WORK);
        System.out.println("--------------人------------------");
        person.command(Action.EAT + Action.SLEEP + Action.WORK);
        System.out.println("--------------猪------------------");
        pig.command(Action.EAT);
        pig.command(Action.SLEEP);
    }
}