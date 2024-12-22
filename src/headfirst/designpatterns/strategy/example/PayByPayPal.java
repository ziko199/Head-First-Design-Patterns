package headfirst.designpatterns.strategy.example;

public class PayByPayPal implements PayStrategy {

    @Override
    public void pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using PayPal.");
    }
}
