package org.spi.login;

import org.tnq.login.CourseDetails;
import org.tnq.login.EmployeeDetails;

public class EmpDetails {
	public void empName() {
	System.out.println("Vasu");
	}
	public void empID() {
		System.out.println("13945");
	}
	public void workExp() {
System.out.println("seven years");
	}
	public static void main(String[] args) {
	EmpDetails emp = new EmpDetails();
	emp.empName();
	emp.empID();
	emp.workExp();
	
	CourseDetails course = new CourseDetails();
	course.javaCourse();
	course.seleniumCource();


	}
			
	}


