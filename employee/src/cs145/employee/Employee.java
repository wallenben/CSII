package cs145.employee;

public class Employee implements Comparable<Employee>
{
	private String name;
	private double salary;
	
	/**
	 * Creates a new Employee
	 * @param name the name of the employee
	 * @param salary the starting salary
	 */
	public Employee(String name, double salary)
	{
		this.name = name;
		this.salary = salary;
	}

	/**
	 * Returns the salary of the employee
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Allows an increase in the employee's salary by a percentage
	 * @param byPercent the percentage to raise the employee's salary by
	 */
	public void setSalary(double byPercent) {
		double raise = salary * byPercent/100;
		this.salary += raise;
	}

	/**
	 * Returns the name of the employee
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * return zero on equal, -1 if calling is less than, 1 if greater than
	 * 
	 */
	public int compareTo(Employee x) {
		if (this.salary < x.salary) {
			return -1;
		}
		else if (this.salary > x.salary) {
			return 1;
		}else {	return 0; }
	}
	
	

}
