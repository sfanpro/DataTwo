package ua.com.fan.salarycalc;

import java.util.ArrayList;
import java.util.List;

import ua.com.fan.salarycalc.employees.Developer;
import ua.com.fan.salarycalc.employees.Employee;
import ua.com.fan.salarycalc.employees.Manager;
import ua.com.fan.salarycalc.enam.Post;
import ua.com.fan.salarycalc.service.Accountant;

public class Main {
	public static void main(String[] args) {
		Accountant accountant = new Accountant();

		Employee developer = new Developer(1, 3000, 150, 300, Post.DEVELOPER);
		Employee manager = new Manager(2, 4000, 100, 200, Post.MANAGER);

		List<Employee> employees = new ArrayList<>();
		employees.add(developer);
		employees.add(manager);

	}
}
