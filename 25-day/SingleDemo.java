class Singleton {
    private static Singleton instance;
    private Singleton() {};

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("this is single demo");
    }
}

public class SingleDemo {
    public static void main(String args[]) {
        Singleton instance = null;
        instance = Singleton.getInstance();
        instance.print();
    }
}
