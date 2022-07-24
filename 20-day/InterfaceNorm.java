interface IUSB {
    public boolean check();

    public void work();
}

class Computer {
    public void plugin(IUSB usb) {
        if (usb.check()) {
            usb.work();
        } else {
            System.out.println("hardware error");
        }
    }
}

class Keyboard implements IUSB {
    public boolean check() {
        return true;
    }

    public void work() {
        System.out.println("keyboard working");
    }
}

class Print implements IUSB {
    public boolean check() {
        return false;
    }

    public void work() {
        System.out.println("print working");
    }
}

public class InterfaceNorm {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.plugin(new Keyboard()); // 插入键盘
        computer.plugin(new Print()); // 插入打印机
    }

}
