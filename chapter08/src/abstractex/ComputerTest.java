package abstractex;

public class ComputerTest {

    public static void main(String[] args) {

        //인스턴스화 불가
        //Computer computer = new Computer();

        //묵시적 형변환
        Computer computer = new DeskTop();

        //가상함수
        computer.display();
        computer.turnOff();

        Computer myNoteBook1 = new MyNoteBook();
        MyNoteBook myNoteBook2 = new MyNoteBook();
    }
}
