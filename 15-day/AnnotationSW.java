class Channel {
    @Deprecated
    public void oldConnect() {
        System.out.println("*******old Channel*******");
    }

    public void newConnect() {
        System.out.println("*******new Channel*******");
    }
}

public class AnnotationSW {
    // 可以压制警告，比如@Deprecated发出的警告，直接忽略掉
    @SuppressWarnings({"deprecation"})
    public static void main(String[] args) {
        new Channel().oldConnect();
    }
}

