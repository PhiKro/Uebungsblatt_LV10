package tiere;

public class Animal {

	public String colour;
	public int countEyes;

	public Animal(String colour, int countEyes) {
		super();
		this.colour = colour;
		this.countEyes = countEyes;
	}
	
	public void walk()
	{
		System.out.println("Default: walking");
	}
	
	public void makeNoise()
	{
		System.out.println();
	}
}
