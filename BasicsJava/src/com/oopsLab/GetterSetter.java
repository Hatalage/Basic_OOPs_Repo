package com.oopsLab;

public class GetterSetter {
		private int acid;
		private String name;
		private int balance;
		public void setAcid(int acid)
		{
			this.acid=acid;
		}
		public void setName(String name)
		{
			this.name=name;
			
		}
		public void setBalance(int balance)
		{
			this.balance=balance;
		}
		public int getAcid()
		{
			return acid;
		}
		public String getName()
		{
			return name;
		}
		public int getBalance()
		{
			return balance;
		}
}
