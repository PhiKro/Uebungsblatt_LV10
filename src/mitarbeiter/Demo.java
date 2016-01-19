package mitarbeiter;

public class Demo {
	public static void main (String Args[])
	{
	
	PercentCommisionEmployee Mike = new PercentCommisionEmployee("Maier", "Mike", "IT", 2000.00, 10);
	FixCommisionEmployee Amy = new FixCommisionEmployee("Kent",	"Amy", "IT", 1500.00, 600);
	PercentCommisionEmployee Mitch = new PercentCommisionEmployee("Argon", "Mitch", "Booking", 2500, 5);
	
	System.out.println(Mike.baseSalary);
	System.out.println(Mike.getFullSalary());
	System.out.println("-----");
	System.out.println(Amy.baseSalary);
	System.out.println(Amy.getFullSalary());
	System.out.println("-----");
	
	EmployeeManager workers = new EmployeeManager();
	
	workers.addEmployee(Mike);
	workers.addEmployee(Mitch);
	workers.addEmployee(Amy);
	
	System.out.println(workers.calcTotalSalary());
	System.out.println("-----");
	System.out.println(workers.getSalaryByDepartment());
	}
}
