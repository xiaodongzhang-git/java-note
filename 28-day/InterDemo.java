interface IMessageWrap {
    static interface IMessage {
        public String getContent();
    }

    static interface IChannel {
        public boolean connect(); //消息连接通道
    }

    public static void send(IMessage msg, IChannel channel) {
        if(channel.connect()){
            System.out.println(msg.getContent());
        }else{
            System.out.println("通道连接失败...");
        }
    }
}

class DefaultMessage implements IMessageWrap.IMessage {
    public String getContent() {
        return "this is msg";
    }
}

class NetChannel implements IMessageWrap.IChannel {
    public boolean connect() {
        return true;
    }
}


public class InterDemo {
    public static void main(String[] args) {
        IMessageWrap.send(new DefaultMessage(), new NetChannel());
    }
}