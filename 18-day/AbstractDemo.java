abstract class Message {
    private String type;

    public abstract String getContentInfo();

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

class DataBaseMessage extends Message {
    public String getContentInfo() {
        return "database connect......";
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Message msg = new DataBaseMessage();
        System.out.println(msg.getType());
        System.out.println(msg.getContentInfo());
    }
}