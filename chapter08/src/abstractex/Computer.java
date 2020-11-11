package abstractex;

public abstract class Computer {

    //추상 메서드
    public abstract void display();

    public abstract void typing();

    //구현된 메서드 : 하위 클래스에 따라 재정의 할 수 있음 단, final로 메서드가 선언된 경우는 재정의 할 수 없음
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
