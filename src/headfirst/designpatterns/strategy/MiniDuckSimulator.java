package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {

		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");

		RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
		rubberDuck.performQuack();
		rubberDuck.performFly();

		MallardDuck	mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		DecoyDuck decoy = new DecoyDuck();
		decoy.performQuack();
		decoy.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
