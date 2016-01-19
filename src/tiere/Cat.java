package tiere;

public class Cat extends Animal {
	

	public Cat(String name, String colour, int countEyes) {
		super(colour, countEyes);
		this.name = name;
	}

	public String name;
	
	@Override
	public void walk()
	{
		System.out.println("sneaking");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Nyan");
	}
}
