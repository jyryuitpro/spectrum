package interfaceex;

public interface Calc {

//    public static final : 상수
    double PI = 3.14;

    int ERROR = -999999999;

    int add(int num1, int num2);

    int substract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    //디폴트 메서드
    default void description() {
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    }

    //정적 메서드
    static int total(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total += i;
        }
        myStaticMethod();
        return total;
    }

    //with 디폴트 메서드 (Java 9)
    private void myMethod() {
        System.out.println("private method");
    }

    //with 정적 메스드 (Java 9)
    private static void myStaticMethod(){
        System.out.println("private static method");
    }
}
