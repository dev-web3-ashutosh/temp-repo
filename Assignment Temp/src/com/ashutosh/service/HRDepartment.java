package com.ashutosh.service;

//import superclass
import com.ashutosh.model.SuperDepartment;

public class HRDepartment extends SuperDepartment { //inherits class SuperDepartment
	
	//subclass method to get department name
	public String departmentName() {
		
		return "HR Department";
		
	}
	
	//subclass method to get daily work assignment
	public String getTodaysWork() {
		
		return "Fill today's worksheet and mark your attendance";
		
	}
	
	//subclass method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Complete by EOD";
		
	}
	
	//subclass method to get activity
	public String doActivity() {
		
		return "team Lunch";
		
	}

}
