class Color {
    private static final Color RED = new Color("red");
    private static final Color GREEN = new Color("green");
    private static final Color BLUE = new Color("blue");

    private String title;
    private Color(String title) {
        this.title = title;
    }

    public static Color getInstance(String color) {
        switch (color) {
            case "red": return RED;
            case "green": return GREEN;
            case "blue": return BLUE;
            default: return null;
        }
    }

    public String toString(){
        return this.title;
    }
}

public class MultiDemo {
    public static void main(String[] args) {
        Color red = Color.getInstance("red");
        System.out.println(red.toString());
        Color green = Color.getInstance("green");
        System.out.println(green.toString());
        Color blue = Color.getInstance("blue");
        System.out.println(blue.toString());
    }
}
