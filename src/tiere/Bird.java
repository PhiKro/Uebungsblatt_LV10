package tiere;

public class Bird extends Animal implements Fly {

	public String Name;
	
	
	public Bird(String colour, int countEyes, String name) {
		super(colour, countEyes);
		Name = name;
	}

	@Override
	public void fly() {
		System.out.println("Flap Wings");

	}

	@Override
	public void walk() {
		System.out.println("Hops");

	}

	@Override
	public void makeNoise() {
		System.out.println("Chirp");
	}

}
