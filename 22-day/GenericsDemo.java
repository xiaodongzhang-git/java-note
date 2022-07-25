class Point<T> {
    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return this.x;
    }

    public T getY() {
        return this.y;
    }
}

public class GenericsDemo {
    public static void main(String[] args) {
        Point<Integer> point = new Point<Integer>();
        point.setX(10);
        point.setY(20);
        int x = point.getX();
        int y = point.getY();
        System.out.println("X坐标：" + x + "=>Y坐标：" + y);
    }
}