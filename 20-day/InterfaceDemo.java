interface IMessage {
    public abstract String getMessage();
}

interface Channel {
    public boolean getChannel();
}

// extends在类的时候只能继承一个，接口可以多个
interface Server extends IMessage, Channel {
    public String getService();
}

class MessageService implements Server {
    public String getMessage() {
        return "this is message";
    }

    public boolean getChannel() {
        return true;
    }

    public String getService() {
        return "this is server";
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        MessageService service = new MessageService();
        System.out.println(service.getMessage());
        System.out.println(service.getChannel());
        System.out.println(service.getService());
    }
}
