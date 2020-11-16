package bookshelf;

public class BookShelfTest {

    public static void main(String[] args) {
        //다형성
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("태백산맥1");
        bookQueue.enQueue("태백산맥2");
        bookQueue.enQueue("태백산맥3");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
