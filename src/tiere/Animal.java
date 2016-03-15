package tiere;

public abstract class Animal {

	public String colour;
	public int countEyes;

	public Animal(String colour, int countEyes) {
		super();
		this.colour = colour;
		this.countEyes = countEyes;
	}
	
	public abstract void walk();
	
	public abstract void makeNoise();

}
