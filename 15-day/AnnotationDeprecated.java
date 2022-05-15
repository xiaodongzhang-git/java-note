class Channel {
    // 声明这个方法是过期的，不要再用了，编译的时候会提示，不过可以执行
    // Note: AnnotationDeprecated.java uses or overrides a deprecated API.
    //Note: Recompile with -Xlint:deprecation for details.
    @Deprecated
    public void oldConnect() {
        System.out.println("*******old Channel*******");
    }

    public void newConnect() {
        System.out.println("*******new Channel*******");
    }
}

public class AnnotationDeprecated {
    public static void main(String[] args) {
        new Channel().oldConnect();
    }
}
