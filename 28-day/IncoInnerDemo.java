interface IMessage {
    public void send(String str);
}

public class IncoInnerDemo {

    public static void main(String[] args) {
        IMessage msg = new IMessage() { // 匿名内部类
            public void send(String str) {
                System.out.println(str);
            }
        };
        msg.send("this is msg");
    }
}