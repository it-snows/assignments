package assignments;

import java.util.Scanner;

	public class assignmentonetwo {
	    public static void main(String[] args) {
	  
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.print("Total working hours in day: ");
	    	
	    	double workingHoursInDay = scanner.nextDouble(); 
	    	double totalSalary;
	    	
	    	
	    	if (workingHoursInDay <= 8 && workingHoursInDay > 0) {
	    	totalSalary = workingHoursInDay * 10;
	    	System.out.println(totalSalary + "EUR");
	    	
	    	} else if (workingHoursInDay > 8 && workingHoursInDay < 24) {	
	    		totalSalary = 80 + (workingHoursInDay - 8) * 15;
	    		System.out.println(totalSalary + "EUR");
	    		
	    	} else {
	    	System.out.println("Please check the value!");
	    	scanner.close();
	    } 
	    }
	   	}