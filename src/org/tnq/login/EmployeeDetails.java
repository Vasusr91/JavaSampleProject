package org.tnq.login;

public class EmployeeDetails extends CourseDetails {
private void empName() {
System.out.println("Vasu");
}
private void empID() {
	System.out.println(13945);
}
public static void main(String[] args) {
EmployeeDetails emp = new EmployeeDetails();
emp.empName();
emp.empID();

emp.javaCourse();
emp.seleniumCource();

emp.stdId();
emp.stdName();

}
}
