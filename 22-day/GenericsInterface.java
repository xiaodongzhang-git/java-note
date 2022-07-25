interface IMessage<T> {
    public String echo(T t);
}

class Message implements IMessage<String> {
    public String echo(String t) {
        return "[echo]:" + t;
    }
}

public class GenericsInterface {
    public static void main(String[] args) {
        IMessage<String> message = new Message();
        System.out.println(message.echo("www.google.com"));
    }
}
