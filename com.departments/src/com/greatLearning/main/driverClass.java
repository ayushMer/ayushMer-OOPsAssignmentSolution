package com.greatLearning.main;

import com.greatLearning.models.AdminDepartment;
import com.greatLearning.models.HRdepartment;
import com.greatLearning.models.techDepartment;

public class driverClass {
	
	public static void main(String[] args) {
		
		HRdepartment hr=new HRdepartment();
		techDepartment tech=new techDepartment();
		AdminDepartment admin=new AdminDepartment();
		
		//admin
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		
		//hr
		System.out.println("Welcome to "+hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		
		System.out.println();
		
		//tech
		System.out.println("Welcome to "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
		System.out.println(tech.getWorkDeadline());
		System.out.println(tech.getTechStackInformation());
		System.out.println(tech.isTodayAHoliday());
	}
}
