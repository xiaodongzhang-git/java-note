class Book {
    private String title ;
    private static int count ;
    public Book() {} ;
    public Book(String title) {
        this.title = title ;
        count ++ ;
        System.out.println(this.title + ":" + count) ;
    }
}

public class StaticBookDemo {
    public static void main(String[] args) {
        new Book("python");
        new Book("java");
        new Book("js");
    }
}
