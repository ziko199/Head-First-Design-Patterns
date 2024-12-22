package headfirst.designpatterns.strategy.example;

public class Payment {

    private PayStrategy strategy;

    public Payment() {

    }


    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}
