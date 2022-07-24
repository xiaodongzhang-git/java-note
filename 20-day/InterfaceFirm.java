interface IMessage {
    public String getMessage();

    // 普通方法需要加关键词：default
    public default boolean connect() {
        return true;
    }

    public static DbMessage getInstance() {
        return new DbMessage();
    }
}

class DbMessage implements IMessage {
    public String getMessage() {
        if (this.connect()) {
            return "get db mysql info";
        }

        return "db error";
    }
}

public class InterfaceFirm {
    public static void main(String[] args) {
        IMessage db = IMessage.getInstance();
        System.out.println(db.getMessage());
    }
}
