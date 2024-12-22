package headfirst.designpatterns.strategy.example;

public class DemoTest {

    public static void main(String[] args) {

        Payment payment = new Payment();

        payment.setStrategy(new PayByPayPal());
        payment.executePayment(100);

        payment.setStrategy(new PayByCreditCard());
        payment.executePayment(200);
    }
}
