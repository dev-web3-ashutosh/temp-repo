package com.ashutosh.service;

//import superclass
import com.ashutosh.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment { //inherits class SuperDepartment
	
	//subclass method to get department name
	public String departmentName() {
		
		return "Admin Department";
		
	}
	
	//subclass method to get daily work assignment
	public String getTodaysWork() {
		
		return "Complete your documents submission";
		
	}
	
	//subclass method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Complete by EOD";
		
	}

}
