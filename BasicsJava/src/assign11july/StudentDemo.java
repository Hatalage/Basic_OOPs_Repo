package assign11july;

import java.util.Scanner;

public class StudentDemo {
		String name;
		int Rno;
		double per;
		
		public void acceptDetails(String sname, int sRno, double sper)
		{
			name = sname;
			Rno = sRno;
			per = sper;
		}
//		public void display()
//		{
//			System.out.println(name+" "+Rno+" "+per);
//		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			StudentDemo stud1 = new StudentDemo();
			System.out.println("Enter a Name");
			stud1.name=sc.nextLine();
			System.out.println("Enter a Roll Number");
			stud1.Rno=sc.nextInt();
			System.out.println("Enter a Percentage");
			stud1.per=sc.nextDouble();
			System.out.println("Enter Student1 name: "+stud1.name);
			System.out.println("Enter Student1 roll no: "+stud1.Rno);
			System.out.println("Enter Student1 percentage: "+stud1.per);
//			stud1.display();
		}
}
