package com.gl.application;

import com.gl.service.AdminDepartment;
import com.gl.service.HrDepartment;
import com.gl.service.TechDepartment;

public class DriverClass {

	public static void main(String[] args) {
		
		AdminDepartment Obj1 = new  AdminDepartment();
		System.out.println(" Welcome to "+ Obj1.departmentName());
		System.out.println(Obj1.getTodaysWork());
		System.out.println(Obj1.getWorkDeadline());
		System.out.println(Obj1.isTodayAHoliday());
		
		HrDepartment Obj2 = new HrDepartment();
		System.out.println(" Welcome to "+ Obj2.departmentName());
		System.out.println(Obj2.doActivity());
		System.out.println(Obj2.getTodaysWork());
		System.out.println(Obj2.getWorkDeadline());
		System.out.println(Obj2.isTodayAHoliday());
		
		TechDepartment Obj3 = new TechDepartment();
		System.out.println(" Welcome to "+ Obj3.departmentName());
		System.out.println(Obj3.getTodaysWork());
		System.out.println(Obj3.getWorkDeadline());
		System.out.println(Obj3.getTechStackInformation());
		System.out.println(Obj3.isTodayAHoliday());
	}

}
