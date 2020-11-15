package interfaceex;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        //다형성
        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        //다형성
        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
