// 加上final后无法被继承，会报错：error: cannot inherit from final Channel
// final class Channel {
//     public void connect() {
//         System.out.println("mysql连接中..........");
//     }
// }

class Channel {
    public static final int ON = 0 ;
    public static final int OFF = 1 ; //final定义变量后无法被修改
    // 加上final重写会报错
    // error: connect() in AdminChannel cannot override connect() in Channel
    // public final void connect() {
    //     System.out.println("mysql连接中..........");
    // }
    public void connect() {
        System.out.println("mysql连接中..........");
    }
}

class AdminChannel extends Channel {
    public void connect() {
        System.out.println("postgres连接中..........");
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        AdminChannel ac = new AdminChannel();
        ac.connect();
        //error: cannot assign a value to final variable ON
        // ac.ON = 2;
    }
}
