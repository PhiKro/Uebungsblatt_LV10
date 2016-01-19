package tiere;

public class Frog extends Animal{
	
	
	public Frog(String colour, int countEyes) {
		super(colour, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk()
	{
		System.out.println("jumping");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("Quak");
	}
}
