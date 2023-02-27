class BombException extends Exception {
    public BombException(String msg) {
        super(msg);
    }
}

class Food {
    public static void eat(int num) throws BombException {
        if (num > 10) {
            throw new BombException("吃太多了...");
        }else{
            System.out.println("正常吃...");
        }
    }
}

public class DiyException {
    public static void main(String[] args) {
        try {
            Food.eat(11);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}