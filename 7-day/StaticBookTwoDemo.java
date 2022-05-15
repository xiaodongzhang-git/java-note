class Book {
    private String title ;
    private static int count ;
    public Book() {
        this("NOTITLE--" + count++) ;
    } ;
    public Book(String title) {
        this.title = title ;
    }

    public String getTitle() {
        return this.title ;
    }
}

public class StaticBookTwoDemo {
    public static void main(String[] args) {
        System.out.println(new Book("python").getTitle());
        System.out.println(new Book("java").getTitle());
        System.out.println(new Book("js").getTitle());
        System.out.println(new Book().getTitle());
        System.out.println(new Book().getTitle());
    }
}
