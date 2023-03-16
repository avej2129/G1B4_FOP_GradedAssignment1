package com.gl.service;

public class HrDepartment extends SuperDepartment {
	
	public String departmentName() {
		String deptName = "Hr Department";
		return deptName;
	}
	public String getTodaysWork() {
		String getWork = "Fill today’s timesheet and mark your attendance";
		return getWork;
	}
	public String getWorkDeadline() {
		String getDeadline = "Complete by EOD";
		return getDeadline;
	}
	public String doActivity() {
		String activity = "team Lunch";
		return activity;
	}
}
