package mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {
	
	ArrayList<Employee> Employees = new ArrayList<>();

	public EmployeeManager() {
		Employees = new ArrayList<>();
	}
	
	public double calcTotalSalary()
	{
		int total = 0 ;
		for (Employee employee : Employees) {
			total += employee.getFullSalary();
		}
		return total;
	}
	
	public void addEmployee(Employee e)
	{
		Employees.add(e);
	}
	
	public HashMap<String, Double> getSalaryByDepartment()
	{
		HashMap<String, Double> byDepartment = new HashMap<>();
		double temp =0;
		
		for (Employee employee : Employees) {
		if (byDepartment.containsKey(employee.department))
		{
			temp = byDepartment.get(employee.department);
			byDepartment.put(employee.department, employee.getFullSalary()+temp);
		}
		else 
		{
			byDepartment.put(employee.department, employee.getFullSalary());
		}
		}
	
		return byDepartment;
	}

	@Override
	public String toString() {
		return "EmployeeManager [Employees=" + Employees + "]";
	}

}
