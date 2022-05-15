class Channel {
    public void connect() {
        System.out.println("*******Channel*******");
    }
}

// 如果不写extends Channel也不会报错，程序运行结果也时预期值
class DataBaseChannel extends Channel {
    // 加入注解之后，如果删了extends Channel会报错
    @Override
    public void connect() {
        System.out.println("*******DataBaseChannel*******");
    }
}

public class AnnotationOverride {
    public static void main(String[] args) {
        new DataBaseChannel().connect();
    }
}