package thread;

class Bank {

    private int money = 10000;

//    public synchronized void plusMoney(int money) {
    public void plusMoney(int money) {
//        synchronized (this) {
            int m = this.getMoney();

            try {
            Thread.sleep(3000);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }

            setMoney(m + money);
//        }
    }

//    public synchronized void minusMoney(int money) {
    public void minusMoney(int money) {
        int m = this.getMoney();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - money);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {

    @Override
    public void run() {
        synchronized (SyncTest.myBank) {
            System.out.println("start plus");
            SyncTest.myBank.plusMoney(3000);
            System.out.println("save money:" + SyncTest.myBank.getMoney());
        }
    }
}

class ParkWife extends Thread {

    @Override
    public void run() {
        synchronized (SyncTest.myBank) {
            System.out.println("start minus");
            SyncTest.myBank.minusMoney(1000);
            System.out.println("minus money:" + SyncTest.myBank.getMoney());
        }
    }
}

public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) {
        Park p = new Park();
        p.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ParkWife pw = new ParkWife();
        pw.start();
    }
}
