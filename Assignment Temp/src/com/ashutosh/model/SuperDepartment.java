package com.ashutosh.model;

public class SuperDepartment { //superclass
	
	//superclass method to get department name
	public String departmentName() {
		
		return "Super Department";
		
	}
	
	//superclass method to get daily assignment
	public String getTodaysWork() {
		
		return "No Work as of now";
		
	}
	
	//superclass method to get assignment deadline
	public String getWorkDeadline() {
		
		return "Nil";
		
	}
	
	//superclass method to determine if the day is a holiday
	public String isTodayAHoliday() {
		
		return "Today is not a Holiday";
		
	}

}
