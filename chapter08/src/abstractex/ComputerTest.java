package abstractex;

public class ComputerTest {

    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.display();
        computer.turnOff();

        Computer myNoteBook1 = new MyNoteBook();
        MyNoteBook myNoteBook2 = new MyNoteBook();
    }
}
