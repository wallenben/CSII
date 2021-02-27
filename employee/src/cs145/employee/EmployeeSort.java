package cs145.employee;

import java.util.Arrays;
import java.text.DecimalFormat;

public class EmployeeSort {

	public static void main(String[] args) {
		Employee [] staff = new Employee[3];
		DecimalFormat money = new DecimalFormat("0.00");
		
		staff[0] = new Employee("Harry Hacker", 55000);
		staff[1] = new Employee("Carl Cracker", 75000);
		staff[2] = new Employee("Tony Tester", 60000);
		
		Arrays.sort(staff); //static method that allows you to pass an array of Comparable objects
		
		for (Employee e: staff)
		{
			System.out.println(e.getName() + "\t" + money.format(e.getSalary()));
		}

	}

}
