package store;

import ingredientFactory.NYPizzaIngredientFactory;
import ingredientFactory.PizzaIngredientFactory;
import pizza.*;

public class NYPizzaStore extends PizzaStore{

	
	
	@Override
	Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		// TODO Auto-generated method stub
		if(item.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
//		} else if (item.equals("veggie")) {
//			return new NYStyleVeggiePizza();
//		} else if (item.equals("clam")) {
//			return new NYStyleClamPizza();
//		} else if (item.equals("pepperoni")) {
//			return new NYStylePepperoniPizza();
		} else return null;
		
		return pizza;
	}
	
}
