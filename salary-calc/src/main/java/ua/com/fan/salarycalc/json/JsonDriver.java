package ua.com.fan.salarycalc.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDriver {
	public static void main(String[] args) throws FileNotFoundException {

		ObjectMapper mapper = new ObjectMapper();
		try {
			Employees[] object = mapper
					.readValue(new File("C:\\eclipse-workspace\\salary-calc\\src\\main\\resources\\employee.json"),
							Employees[].class);

			String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
			System.out.println(json);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	JSONObject getPerson(Integer id, Double rate, Double hoursInMounth, Double workedHour) {
		JSONObject person = new JSONObject();
		try {
			person.put("id", id);
			person.put("rate", rate);
			person.put("hoursInMounth", hoursInMounth);
			person.put("workedHour", workedHour);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return person;
	}

}
