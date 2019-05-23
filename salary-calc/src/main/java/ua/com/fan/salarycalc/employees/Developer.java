package ua.com.fan.salarycalc.employees;

import ua.com.fan.salarycalc.enam.Post;

public class Developer extends Employee {

	public Developer(int id, double rate, double hoursInMounth, double workedHour, Post position) {
		super(id, rate, hoursInMounth, workedHour, position);
	}

	@Override
	public double calculateSalary() {
		double salary = super.getRate() * super.getWorkedPercent();
		return salary;
	}
}
