package headfirst.designpatterns.strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {

		System.out.println("--> MallardDuck ------- ");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		mallard.display();
		mallard.swim();

		System.out.println("--> ModelDuck ------- ");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		System.out.println("--> HisDuck ------- ");
		Duck hisDuck = new HisDuck();
		hisDuck.setFlyBehavior(new FlyTheHisWay());
		hisDuck.performFly();
		hisDuck.setFlyBehavior(new FlyNoWay());
		hisDuck.performFly();
		hisDuck.setFlyBehavior(new FlyWithWings());
		hisDuck.performFly();
		hisDuck.setQuackBehavior(new Quack());
		hisDuck.performQuack();
	}
}
