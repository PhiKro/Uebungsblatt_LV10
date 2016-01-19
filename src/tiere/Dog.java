package tiere;

public class Dog extends Animal{

	public String name;
		
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
	
	
	
}
