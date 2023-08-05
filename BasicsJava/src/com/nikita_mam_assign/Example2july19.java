package com.nikita_mam_assign;
class Contact{
		
		String contactperson;
		int mobile;
		String email;
		
		Contact(String contactperson,int mobile,String email)
		{
			this.contactperson=contactperson;
			this.mobile=mobile;
			this.email=email;
		}
		public void setContactperson(String contactperson)
		{
			this.contactperson=contactperson;
		}
		public void setMobile(int mobile)
		{
			this.mobile=mobile;
		}
		public void setEmail(String email)
		{
			this.email=email;
		}
		
		public void PrintContact() 
		{
			System.out.println("\n\nContact Person\t\n");
			System.out.println("Name\t\t:"+contactperson);
			System.out.println("Mobile\t\t:"+mobile);
			System.out.println("E-mail\t\t:"+email);
		}
	}
	class CompanyContact extends Contact{
		String company_name;
		String website;
		String department;
		String city;
		String country;
		String address;
		int pin;

		CompanyContact(String contactperson, int mobile, String email, String company_name, String website, String department, String address, String country, String city, int pin)
		{
			super(contactperson, mobile, email);
			
			this.company_name=company_name;
			this.website=website;
			this.department=department;
			this.city=city;
			this.country=country;
			this.address=address;
			this.pin=pin;
		}
		
		public void PrintContact() {
			
			System.out.println("Company Info\n");
			System.out.println("Company Name:\t"+company_name);
			System.out.println("Website\t\t:"+website);
			System.out.println("Department\t:"+department);
			System.out.println("City\t\t:"+city);
			System.out.println("Country\t\t:"+country);
			System.out.println("Address\t\t:"+address);
			System.out.println("Pincode\t\t:"+pin);
		}
		public void setCompany_name(String company_name) {
			this.company_name = company_name;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setPin(int pin) {
			this.pin = pin;
		}
		
		
		public String getCompany_name() {
			return company_name;
		}

		public String getWebsite() {
			return website;
		}

		public String getDepartment() {
			return department;
		}

		public String getCity() {
			return city;
		}

		public String getCountry() {
			return country;
		}

		public String getAddress() {
			return address;
		}

		public int getPin() {
			return pin;
		}
	}
	class EmployeeContact extends Contact{

		String city;
		String country;
		int pin;
		String designation;
		int DateOfBirth;
		
		EmployeeContact(String contactperson, int mobile, String email, String city, String country, int pin, String designation, int DateOfBirth) 
		{
			super(contactperson, mobile, email);
			this.city=city;
			this.country=country;
			this.pin=pin;
			this.designation=designation;
			this.DateOfBirth=DateOfBirth;
		}
		public void PrintContact()
		{
			System.out.println("\n\nEmployee Info\n");
			System.out.println("City\t\t:"+city);
			System.out.println("Country\t\t:"+country);
			System.out.println("Pin\t\t:"+pin);
			System.out.println("Designation\t:"+designation);
			System.out.println("DOB\t\t:"+DateOfBirth);
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public void setPin(int pin) {
			this.pin = pin;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public void setDateOfBirth(int dateOfBirth) {
			DateOfBirth = dateOfBirth;
		}
		public String getCity() {
			return city;
		}
		public String getCountry() {
			return country;
		}
		public int getPin() {
			return pin;
		}
		public String getDesignation() {
			return designation;
		}
		public int getDateOfBirth() {
			return DateOfBirth;
		}	
	}
	public class Example2july19 {
		
		public static void main(String[] args) {
			
			CompanyContact cc = new CompanyContact("Ulka",8574223,"ulka@gamail.com","Think quotient","www.Tq.com","Developement Department","Pune","India","Nal Stop", 56246);          
			cc.PrintContact();
			
			Contact ct = new Contact("Vedashree",857520,"Vedashree@gmail.com");
			ct.PrintContact();
			
			EmployeeContact ec = new EmployeeContact("Vedashree",966520,"Vedashree@gmail.com","Wakad","India",45769,"Jr.Developer",14);
			ec.PrintContact();
			
		}

	}

