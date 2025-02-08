package muhammedtahagunes;

import java.util.ArrayList;
import java.util.List;

public class SalaryIncreaseThread extends Staff implements Runnable {
	private List<Staff> StaffList=new ArrayList<>();
	private double IncreasePercentage;
	

	public SalaryIncreaseThread(List<Staff> staffList, double increasePercentage) {
		StaffList = staffList;
		IncreasePercentage = increasePercentage;
	}

	@Override
	public void run() {
		for(Staff x:StaffList) {
			x.IncreaseSalary(IncreasePercentage);
		}
	}
	
}
