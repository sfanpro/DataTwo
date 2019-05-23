package ua.com.fan.salarycalc;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class Accountant {

	public Map<Employee, Double> getSalary(List<Employee> employees) {
		Map<Employee, Double> mapSalary = new Hashtable<Employee, Double>();
		for (Employee employee : employees) {
			mapSalary.put(employee, employee.calculateSalary());
		}
		return mapSalary;
	}
}
