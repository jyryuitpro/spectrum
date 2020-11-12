package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    //hook method
    public void washCar() {}

    //템플릿 메서드 : 재정의 불가
    final public void run() {
        //호출 시나리오
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
