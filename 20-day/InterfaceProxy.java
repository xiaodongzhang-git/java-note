interface IEat {
    public void get();
}

class EatReal implements IEat {
    public void get() {
        System.out.println("【真实主题】得到一份食物，开始品尝...");
    }
}

class EatProxy implements IEat { // 服务代理
    private IEat eat;

    public EatProxy(IEat eat) { // 一定要有一个代理项
        this.eat = eat;
    }

    public void get() {
        this.prepare();
        this.cook();
        this.eat.get();
        this.clear();
    }

    public void prepare() {
        System.out.println("【代理主题】购买食材...");
        System.out.println("【代理主题】处理食材...");
    }

    public void cook() {
        System.out.println("【代理主题】烹饪食材...");
    }

    public void clear() {
        System.out.println("【代理主题】收拾碗筷...");
    }

}

public class InterfaceProxy {
    public static void main(String[] args) {
        IEat eat = new EatProxy(new EatReal());
        eat.get();
    }
}
