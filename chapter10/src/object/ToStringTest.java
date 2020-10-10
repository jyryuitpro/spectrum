package object;

public class ToStringTest {

    public static void main(String[] args) {
        Book book = new Book("토지", "박경리");
        System.out.println(book);

        String str = new String("토지");
        System.out.println(str.toString());
    }
}
