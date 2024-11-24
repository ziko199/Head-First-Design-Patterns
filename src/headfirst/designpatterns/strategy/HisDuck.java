package headfirst.designpatterns.strategy;

public class HisDuck extends Duck {

    public HisDuck() {
        flyBehavior = new FlyTheHisWay();
    }

    @Override
    void display() {
        System.out.println(" His Duck");
    }
}
