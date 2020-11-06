package inheritance;

public class VIPCustomer extends Customer {

    double salesRatio;

    private int agentID;


//    public VIPCustomer() {
////        super();
////        super(0, null);
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("VIPCustomer() 생성자 호출");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

//        System.out.println("VIPCustomer(int, String) 생성자 호출");
    }

    //메서드 오버로딩 : ex) public int calcPrice(double price)
    //메서드 오버라이딩 : 동일한 선언부를 가짐
    //애노테이션
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
