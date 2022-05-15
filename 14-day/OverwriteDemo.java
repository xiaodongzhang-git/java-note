
class Channel {
    public void connect() {
        System.out.println("mysql连接中..........");
    }
}

class AdminChannel extends Channel {
    // 名字一样，会产生覆写
    public void connect() {
        System.out.println("postgres连接中..........");
    }
    // 可通过super调用
    public void mysqlConnect() {
        super.connect();
    }
}

public class OverwriteDemo {
    public static void main(String[] args) {
        AdminChannel ac = new AdminChannel();
        ac.connect();
        ac.mysqlConnect();
    }
}
