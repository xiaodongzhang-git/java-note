
class Message<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return this.content;
    }
}

public class WildcardDemo {
    public static void main(String[] args) {
        Message<Integer> msgA = new Message<Integer>();
        Message<String> msgB = new Message<String>();
        msgA.setContent(10);
        fun(msgA);
        msgB.setContent("www.google.com");
        msgB.getContent();
        fun(msgB);
    }

    public static void fun(Message<?> temp) {
        System.out.println(temp.getContent());
    }
}
