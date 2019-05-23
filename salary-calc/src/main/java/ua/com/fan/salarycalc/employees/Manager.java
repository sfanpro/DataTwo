package ua.com.fan.salarycalc.employees;

import ua.com.fan.salarycalc.enam.Post;

public class Manager extends Employee {

	public Manager(int id, double rate, double hoursInMounth, double workedHour, Post position) {
		super(id, rate, hoursInMounth, workedHour, position);
	}

	@Override
	public double calculateSalary() {
		double salary = super.getRate() * super.getWorkedPercent();

		if (getWorkedPercent() < 1) {
			return salary;
		}
		return getRate();
	}
}
