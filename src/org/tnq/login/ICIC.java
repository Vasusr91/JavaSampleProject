package org.tnq.login;

//polymorphism method overriding

public class ICIC extends RBI {

	private void loanAcc() {
	System.out.println("5%");
	}
	private void mortgageAcc() {
	System.out.println("10%");
	}
	@Override
	public void savAcc() {
	System.out.println("6%");
	}
	@Override
	public void jointAcc() {
	System.out.println("8%");
	}
	@Override
	public void checkingAcc() {
	System.out.println("10%");
	}
	public static void main(String[] args) {
	ICIC i = new ICIC();
	i.loanAcc();
	i.mortgageAcc();
	i.jointAcc();
	i.savAcc();
	i.checkingAcc();
	}
}
