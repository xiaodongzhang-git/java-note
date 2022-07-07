class Message {
    public void print() {
        System.out.println("base message...");
    }
}

class DbMessage extends Message {
    public void print() {
        System.out.println("db message...");
    }
}

class WebMessage extends Message {
    public void print() {
        System.out.println("web message...");
    }
}

public class Up {
    public static void main(String[] args) {
        func(new Message());
        func(new DbMessage());
        func(new WebMessage());
    }

    // 多态性 参数向上转型兼容
    public static void func(Message message) {
        message.print();
    }
}