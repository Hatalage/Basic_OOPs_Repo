package com.oopsLab;

public class AccessModifiers {
		public String cName;
		private int accBalance ;
		protected String cEmail;
		String cAddress;
		public void dopublic()
		{
			System.out.println("shiv");
		}
		public void doprivate()
		{
			System.out.println(200000);
		}
		public void doprotected()
		{
			System.out.println("shiv@gmail.com");
		}
		public void dodefault()
		{
			System.out.println("Nipani");
		}
		public static void main(String args[])
		{
			AccessModifiers am = new AccessModifiers();
			am.dopublic();
			am.doprivate();
			am.doprotected();
			am.dodefault();
		}
}

