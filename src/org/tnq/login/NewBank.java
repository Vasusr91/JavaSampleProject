package org.tnq.login;

//polymorphism method overloading

public class NewBank {
	
	//Depends on the DataType
private void findEmp(String name) {
	System.out.println(name);
}

//Depends on the order

private void findEmp(int empid, String name) {
   System.out.println("Employee ID and Name:"+empid +" " +name);
}

//Depends on the count

private void findEmp(float salary, long phno, double avg) {
	System.out.println("Salary: Phno: and Avg is:"+salary +" " +phno +" " +avg);
}
public static void main(String[] args) {
NewBank n = new NewBank();
n.findEmp("Vasu");
n.findEmp(13945, "Vasu");
n.findEmp(10000, 1234567890l, 15.3);
}
}
