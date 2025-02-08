package muhammedtahagunes;

public class AcademicStaff extends Staff {
	private int numberOfCourses;

	public AcademicStaff(String name, double salary, int numberOfCourses) {
		super(name, salary);
		this.numberOfCourses = numberOfCourses;
	}
	public void IncreaseSalary(double percentage) {
		double toplam=0;
		toplam+=getSalary()*percentage+numberOfCourses*1000;
		setSalary(toplam);	
	}
	public int getNumberOfCourses() {
		return numberOfCourses;
	}
	public void setNumberOfCourses(int numberOfCourses) {
		this.numberOfCourses = numberOfCourses;
	}
	@Override
	public String toString() {
		return "AcademicStaff [numberOfCourses=" + numberOfCourses + ", getSalary()=" + getSalary() + ", getName()="
				+ getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	

	
}
