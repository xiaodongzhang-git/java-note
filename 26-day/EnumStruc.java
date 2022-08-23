enum Color {
    RED("red") {
        public String getMessage() {
            return this.toString();
        }
    },GREEN("green") {
        public String getMessage() {
            return this.toString();
        }
    },BLUE("blue") {
        public String getMessage() {
            return this.toString();
        }
    };

    private String title;
    private Color(String title) {
        this.title = title;
    }

    public String toString() {
        return this.title;
    }

    public abstract String getMessage();
}

public class EnumStruc {
    public static void main(String[] args) {
        System.out.println(Color.RED.getMessage());
    }
}
