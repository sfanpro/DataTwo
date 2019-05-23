package ua.com.fan.salarycalc.json;

public class Employees {
	private Double rate;

	private Double hoursInMounth;

	private Double workedHour;

	private Integer id;

	private String position;

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getHoursInMounth() {
		return hoursInMounth;
	}

	public void setHoursInMounth(Double hoursInMounth) {
		this.hoursInMounth = hoursInMounth;
	}

	public Double getWorkedHour() {
		return workedHour;
	}

	public void setWorkedHour(Double workedHour) {
		this.workedHour = workedHour;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

}
