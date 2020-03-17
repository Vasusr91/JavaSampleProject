package org.tnq.login;

public class ControlStatementNestedIf {

	public static void main(String[] args) {
		int a = 10, b = 60, c = 1;
		if (a<b & a>c) {
			System.out.println("A is greater");
		}
		else if (b>a && b<c) {
			System.out.println("B is greater");
		}
		else {
			System.out.println("C is greater");
		}	
	}
}
