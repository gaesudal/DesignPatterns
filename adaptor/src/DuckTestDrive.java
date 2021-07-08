import adaptor.TurkeyAdapter;
import bird.Duck;
import bird.MallardDuck;
import bird.WildTurkey;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdaptor = new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdaptor);
	}
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}

}
