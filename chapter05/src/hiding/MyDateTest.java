package hiding;

public class MyDateTest {

    public static void main(String[] args) {
        MyDate myDate = new MyDate();
//        myDate.day = 10;
//        myDate.month = 7;
//        myDate.year = 2019;
        myDate.setYear(2019);
        myDate.setMonth(7);
        myDate.setDay(10);

        myDate.showDate();

        MyDate myDate2 = new MyDate();
        myDate2.setDay(20);

    }
}
