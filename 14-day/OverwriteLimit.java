
class Channel {
    // private是不可见的
    private void connect() {
        System.out.println("mysql连接中..........");
    }
}

class AdminChannel extends Channel {
    // 父类是public的场合，会报错
    // attempting to assign weaker access privileges; was public
    // OverwriteLimit.java:19: error: cannot find symbol
    // void connect() {
    //     System.out.println("postgres连接中..........");
    // }

    // 当父类是private的场合，因为不可见，因此此时不是覆写，而是相当于一个新的方法
    public void connect() {
        System.out.println("postgres连接中..........");
    }
}

public class OverwriteLimit {
    public static void main(String[] args) {
        AdminChannel ac = new AdminChannel();
        ac.connect();
    }
}
