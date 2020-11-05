package inheritance;

public class CustomerTest {

    public static void main(String[] args) {
//        Customer customerLee = new Customer();
        Customer customerLee = new Customer(10010, "이순신");
//        customerLee.setCustomerName("이순신");
//        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

//        VIPCustomer customerKim = new VIPCustomer();
//        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");

        //상위 클래스로의 묵시적 형 변환(업캐스팅)
        Customer customerKim = new VIPCustomer(10020, "김유신");
//        customerLee = customerKim;

//        customerKim.setCustomerName("김유신");
//        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

    }
}
