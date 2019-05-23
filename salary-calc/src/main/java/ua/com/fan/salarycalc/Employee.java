package ua.com.fan.salarycalc;

public abstract class Employee {

	private int id;
	private double rate;
	private double hoursInMounth;
	private double workedHour;

	public Employee(int id, double rate, double hoursInMounth, double workedHour) {
		this.id = id;
		this.rate = rate;
		this.hoursInMounth = hoursInMounth;
		this.workedHour = workedHour;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getHoursInMounth() {
		return hoursInMounth;
	}

	public void setHoursInMounth(double hoursInMounth) {
		this.hoursInMounth = hoursInMounth;
	}

	public double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(double workedHour) {
		this.workedHour = workedHour;
	}

	public double getWorkedPercent() {
		double workedPersent = workedHour / hoursInMounth;
		return workedPersent;
	}

	public abstract double calculateSalary();
}
