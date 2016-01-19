package mitarbeiter;

public class PercentCommisionEmployee extends Employee{
	protected double percentCommision;

	public PercentCommisionEmployee(String lastname, String firstname, String department, double baseSalary,
			double percentCommision) {
		super(lastname, firstname, department, baseSalary);
		this.percentCommision = percentCommision;
	}
	
	@Override
	public double getFullSalary() {
		return baseSalary+ (baseSalary*(percentCommision/100)); // Addiert zum Basisgehalt den ausgerechneten Prozentsatz.  
	}
	
	/*
	 * percentCommision/100 ergibt den 0,x Wert der ben�tigt wird um die H�he der Provision zu errechnen. 
	 * Alternativ w�rde auch gehen baseSalary*(1+(percentCommision/100))
	 */

}
