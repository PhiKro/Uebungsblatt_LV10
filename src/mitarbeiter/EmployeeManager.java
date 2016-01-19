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
			total += employee.getFullSalary(); //addiert den berechneten Gehalt der einzelnen Mitarbeiter 
		}
		return total;
	}
	
	public void addEmployee(Employee e)
	{
		Employees.add(e);
	}
	
	public HashMap<String, Double> getSalaryByDepartment()
	{
		HashMap<String, Double> byDepartment = new HashMap<>(); //erstellen der Hashmap in der die Ergebnisse gespeichert werden, gleichzeitig die Ausgabe
		double temp =0; // Übergangsvariable um Werte aus der Hashmap zu übernehmen. 
		
		for (Employee employee : Employees) 
		{
			if (byDepartment.containsKey(employee.department)) // prüft ob die Hashmap bereits einen Key mit dem Namen des Departments enthält. 
				{
					temp = byDepartment.get(employee.department); //Schreibt den Aktuellen Wert in die temp Variable
					byDepartment.put(employee.department, employee.getFullSalary()+temp); // Überschreibt die bestehenden Werte, daher ist zum addieren der gesammtgehälter die Temp Variable nötig (Bissher errechneter Gehalt + Gehalt des aktuellen Mitarbeiters.)
				}
			else 
				{
					byDepartment.put(employee.department, employee.getFullSalary()); // Legt das Department an und setzt den Gehalt des aktuellen Mitarbeiters als Startwert.
				}
		}
	
		return byDepartment; // zurückgeben ALLER(!!!) vorhandenen Departments mit deren Gesamtgehalt.  
	}

	@Override
	public String toString()  
	{
		return "EmployeeManager [Employees=" + Employees + "]";
	}
}
