package com.ashutosh.main;

//import subclasses for object creation
import com.ashutosh.service.AdminDepartment;
import com.ashutosh.service.HRDepartment;
import com.ashutosh.service.TechDepartment;

public class Main {

	public static void main(String[] args) {
		
		//create objects for each subclass
		AdminDepartment adminObj = new AdminDepartment();
		HRDepartment hrObj = new HRDepartment();
		TechDepartment techObj = new TechDepartment();
		
		//dynamic binding
		System.out.println("Welcome to " + adminObj.departmentName());
		System.out.println(adminObj.getTodaysWork());
		System.out.println(adminObj.getWorkDeadline());
		System.out.println(adminObj.isTodayAHoliday()); //access superclass method using subclass object
		
		System.out.println(); //insert newline for better GUI display
		
		//dynamic binding
		System.out.println("Welcome to " + hrObj.departmentName());
		System.out.println(hrObj.doActivity());
		System.out.println(hrObj.getTodaysWork());
		System.out.println(hrObj.getWorkDeadline());
		System.out.println(hrObj.isTodayAHoliday()); //access superclass method using subclass object
		
		System.out.println(); //insert newline for better GUI display
		
		//dynamic binding
		System.out.println("Welcome to " + techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday()); //access superclass method using subclass object

	}

}
