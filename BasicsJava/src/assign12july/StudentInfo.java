package assign12july;

public class StudentInfo {
		int id;
		String name;
		float m1;
		float m2;
		float m3;
		public StudentInfo(int sid, String sname, float marks1,float marks2, float marks3)
		{
			id=sid;
			name=sname;
			m1=marks1;
			m2=marks2;
			m3=marks3;
		}
		public void display()
		{
			System.out.println(id+" "+name+" "+m1+" "+m2+" "+m3);
		}
		public void percentage()
		{
			float per =((m1+m2+m3)/300)*100;
			System.out.println("percentage is%: "+per);
			if(per>70)
			{
				System.out.println("Grade is A");
			}
			else
			{
				System.out.println("Grade is B");
			}
		}
		public static void main(String args[])
		{
			StudentInfo stud= new StudentInfo(101,"neha",70f,80f,90f);
			stud.display();
			stud.percentage();
		}
}
