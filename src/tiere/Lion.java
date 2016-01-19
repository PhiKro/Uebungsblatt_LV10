package tiere;

public class Lion extends Animal {

	
	public Lion(String colour, int countEyes) {
		super(colour, countEyes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk()
	{
		System.out.println("not moving");
	}
	
	@Override
	public void makeNoise()
	{
		System.out.println("zzzZZZZzzzz");
	}
	
	public void roar()
	{
		System.out.println("Roaaaaar");
	}
	
}
