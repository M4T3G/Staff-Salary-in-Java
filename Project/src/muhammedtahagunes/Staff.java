package muhammedtahagunes;

public class Staff  {
	private String name;
	private double salary;
	public Staff(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public void IncreaseSalary(double percentage) {
		salary+=percentage*salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", salary=" + salary + "]";
	}
	
}
