package gamelevel;

public abstract class PlayerLevel {

    public abstract void run();

    public abstract void jump();

    public abstract void turn();

    public abstract void showLevelMessage();

    //템플릿 메서드 패턴, final로 메서드가 선언된 경우는 재정의 할 수 없음
    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}
