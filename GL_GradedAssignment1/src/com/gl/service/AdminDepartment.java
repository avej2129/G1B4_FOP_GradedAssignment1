package com.gl.service;

public class AdminDepartment extends SuperDepartment{
	
	public String departmentName() {
		String deptName = "Admin Department";
		return deptName;
	}
	public String getTodaysWork() {
		String getWork = "Complete your documents Submission";
		return getWork;
	}
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
	}
}
