package object;

class Book {

    String title;

    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class ToStringTest {

    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str.toString());
    }
}
