import behavior.FlyRocketPowered;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		
		mallard.performQuck();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		//????
	}
}
