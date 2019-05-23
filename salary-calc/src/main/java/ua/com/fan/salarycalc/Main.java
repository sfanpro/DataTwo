package ua.com.fan.salarycalc;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();

		Employee developer = new Developer(1, 3000, 150, 300);
		Employee manager = new Manager(2, 4000, 100, 200);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(developer);
		employees.add(manager);

		System.out.println(accountant.getSalary(employees));
	}
}
