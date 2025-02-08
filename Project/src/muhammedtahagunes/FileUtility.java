package muhammedtahagunes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FileUtility extends Staff {
	public FileUtility(String name, double salary) {
		super(name, salary);
	}
	public static List<Staff> readStaffFromFile(String fileName){
	    try {
	        File myObj = new File(fileName);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	          String data = myReader.nextLine();
	          String[] sData = data.split(",");
	          double x = Double.parseDouble(sData[1]);
	          Staff s=new Staff(sData[0], x);
	          StaffList.add(s);
	        }
	        myReader.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	    return StaffList;
	}
	public static void writeStaffToFile(List<Staff> staffList,String filename) {
	    try {
	        FileWriter myWriter = new FileWriter(filename);
	        for(Staff x:staffList) {
	        	myWriter.write(x.toString());;
	        }
	        myWriter.close();
	        System.out.println("Successfully wrote to the file.");
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
}
