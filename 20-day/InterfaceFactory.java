interface IFood {
    public void eat();
}

class Bread implements IFood {
    public void eat() {
        System.out.println("eating bread....");
    }
}

class Milk implements IFood {
    public void eat() {
        System.out.println("drinking milk....");
    }
}

class Factory {
    public static IFood getInstance(String className) {
        if ("bread".equals(className)) {
            return new Bread();
        } else if ("milk".equals(className)) {
            return new Milk();
        } else {
            return null;
        }
    }
}

public class InterfaceFactory {
    public static void main(String[] args) {
        IFood food = Factory.getInstance(args[0]);
        food.eat();
    }
}
