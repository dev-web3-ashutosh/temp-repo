package com.ashutosh.service;

//import superclass
import com.ashutosh.model.SuperDepartment;

public class TechDepartment extends SuperDepartment { //inherits class SuperDepartment
	
	//class method to get department name
	public String departmentName() {
		
		return "Tech Department";
		
	}
	
	//class method to get daily work assignment
	public String getTodaysWork() {
		
		return "Complete coding of Module 1";
		
	}
	
	//subclass method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Complete by EOD";
		
	}
	
	//subclass method to get activity
	public String getTechStackInformation() {
		
		return "Core Java";
		
	}

}
