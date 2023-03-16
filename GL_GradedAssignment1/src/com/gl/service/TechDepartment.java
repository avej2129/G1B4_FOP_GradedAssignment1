package com.gl.service;

public class TechDepartment extends SuperDepartment {
	
	public String departmentName() {
		String deptName = "Tech Department";
		return deptName;
	}
	public String getTodaysWork() {
		String getWork = "Complete coding of module 1";
		return getWork;
	}
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
	}
	public String getTechStackInformation() {
		String getinformation = " core Java";
		return getinformation;
	}
}