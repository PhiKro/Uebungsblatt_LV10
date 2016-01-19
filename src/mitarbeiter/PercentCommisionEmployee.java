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
		return baseSalary+ (baseSalary*(percentCommision/100));
	}
	

}
