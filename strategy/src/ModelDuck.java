import behavior.FlyNoWay;
import behavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 모형 오리입니다.");
	}

}
