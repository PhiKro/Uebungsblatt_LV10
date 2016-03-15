package tiere;

public class Demo {

	public static void main (String Args[])
	{
	Dog quaxi = new Dog("Quaxi",2,"green") ;
	quaxi.walk();
	quaxi.makeNoise();
	System.out.println("---Upcast----");
	Animal quaxiasAnimal =quaxi;
	quaxiasAnimal.walk();
	quaxiasAnimal.makeNoise();
	System.out.println("---Downcast---");
	Dog quaxirecast = (Dog) quaxiasAnimal;
	quaxirecast.makeNoise();
	quaxirecast.walk();
	System.out.println("-------");
	Lion Simba = new Lion("brownish gold",2);
	Cat Dutchess = new Cat("Duchess", "White", 2);
	Dog Lady = new Dog("brown", 2, "Lady");
	System.out.println("-------");
	
	Nature here =  new Nature();
	here.addAnimal(Lady);
	here.addAnimal(Simba);
	here.addAnimal(Dutchess);
	here.addAnimal(quaxirecast);
	here.addAnimal(quaxiasAnimal);
	here.addAnimal(quaxi);
	
	
	System.out.println("There are/is "+here.countColour("green")+" green animals in the defined nature.");
	System.out.println("There are/is "+here.countColour("brownish gold")+" blue animals in the defined nature.");
	System.out.println("-------");
	
	Lady.fly();
	}
}
