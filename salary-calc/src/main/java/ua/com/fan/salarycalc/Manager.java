package ua.com.fan.salarycalc;

public class Manager extends Employee {

	public Manager(int id, double rate, double hoursInMounth, double workedHour) {
		super(id, rate, hoursInMounth, workedHour);
	}

	@Override
	public double calculateSalary() {
		double salary = getRate() * getWorkedPercent();

		if (getWorkedPercent() < 1) {
			return salary;
		}
		return getRate();
	}
}
