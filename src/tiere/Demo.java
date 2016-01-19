package tiere;

public class Demo {

	public static void main (String Args[])
	{
	Frog quaxi = new Frog("green",2) ;
	quaxi.walk();
	quaxi.makeNoise();
	
	Animal quaxiasAnimal =quaxi;
	quaxiasAnimal.walk();
	quaxiasAnimal.makeNoise();
	
	Frog quaxirecast = (Frog) quaxiasAnimal;
	quaxirecast.makeNoise();
	quaxirecast.walk();
		
	Lion Simba = new Lion("goldish brown",2);
	Cat Dutchess = new Cat("Duchess", "White", 2);
	Dog Lady = new Dog("brown", 2, "Lady");
	
	Nature here =  new Nature();
	here.addAnimal(Lady);
	here.addAnimal(Simba);
	here.addAnimal(Dutchess);
	here.addAnimal(quaxirecast);
	here.addAnimal(quaxiasAnimal);
	here.addAnimal(quaxi);
	
	System.out.println("There are/is "+here.countColour("green")+" green animals in the defined nature.");
	System.out.println("There are/is "+here.countColour("goldish brown")+" blue animals in the defined nature.");
	}
}
