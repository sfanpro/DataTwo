package ua.com.fan.salarycalc;

public class Developer extends Employee {

	public Developer(int id, double rate, double hoursInMounth, double workedHour) {
		super(id, rate, hoursInMounth, workedHour);
	}

	@Override
	public double calculateSalary() {
		double salary = getRate() * getWorkedPercent();
		return salary;
	}
}
