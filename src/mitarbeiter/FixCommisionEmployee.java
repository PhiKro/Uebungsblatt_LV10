package mitarbeiter;

public class FixCommisionEmployee extends Employee{
	protected double additionalCommision;

	public FixCommisionEmployee(String lastname, String firstname, String department, double baseSalary,
			double additionalCommision) {
		super(lastname, firstname, department, baseSalary);
		this.additionalCommision = additionalCommision;
	}
	
	@Override
	public double getFullSalary() 
	{
		return baseSalary+additionalCommision; // addiert den Commision Wert zum Basisgehalt
	}
	

}
