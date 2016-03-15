package tiere;

public class Dog extends Animal implements Fly{

	public String name;
		
	public String getName() {
		return name;
	}

	public Dog(String colour, int countEyes, String name) {
		super(colour, countEyes);
		this.name = name;
	}

	@Override
	public void walk()
	{
		System.out.println("walking");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("barking");
	}
	
	@Override
	public void fly() {
	System.out.println(getName() + " Flaps ears verry fast.");
	}
	
	
}
