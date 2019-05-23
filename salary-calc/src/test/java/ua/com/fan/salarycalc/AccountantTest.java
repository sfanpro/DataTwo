package ua.com.fan.salarycalc;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AccountantTest {

	@Test
	public void testGetSalary() {

		Accountant acc = new Accountant();
		Employee developer = new Developer(1, 3000, 160, 320);
		Manager manager = new Manager(2, 4000, 160, 320);

		List<Employee> employees = new ArrayList<>();
		employees.add(developer);
		employees.add(manager);

		Map<Employee, Double> expected = new Hashtable<Employee, Double>();
		expected.put(developer, 6000.0);
		expected.put(manager, 4000.0);

		Map<Employee, Double> actual = acc.getSalary(employees);

		Assert.assertEquals(expected, actual);
	}

}
