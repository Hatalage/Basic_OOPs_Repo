package com.nikita_mam_assign;
interface Account
{
	public abstract void deposit();
	public abstract void withdraw();
	static void aboutBank()
	{
		System.out.println("bank name is Canera");
		System.out.println("branch in karnataka");
	}
	default void takeLoan()
	{
		System.out.println("take loan");
	}
}
class Saving implements Account
{

	@Override
	public void deposit() {
		System.out.println("deposit amount in saving account");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw amount from saving account");
	}
	public void takeLoan()
	{
		System.out.println("loan for saving account");
	}
	
}
class Current implements Account
{

	@Override
	public void deposit() {
		System.out.println("deposit amount in current account");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw amount from current account");
	}
}
public interface Example6july24 {
	public static void main(String[] args) {
		Account ac = new Saving();
		ac.deposit();
		ac.withdraw();
		ac.takeLoan();
		Account ac1 = new Current();
		ac1.deposit();
		ac1.withdraw();
	}
}
