package tiere;

import java.util.ArrayList;

public class Nature {
	ArrayList<Animal> Tiere = new ArrayList<>();

	public Nature() {
		@SuppressWarnings("unused")
		ArrayList<Animal> Tiere = new ArrayList<>();
	}
	
	public void addAnimal(Animal a)
	{
		Tiere.add(a);
	}
	
	public int countColour(String colour)
	{
		int count=0;
		for (Animal animal : Tiere) {
			if (animal.colour.equals(colour))
			{
				count++;
			}
		}
		return count;
	}
}
