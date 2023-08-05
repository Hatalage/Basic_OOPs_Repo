package assign12july;

public class ThisDemo {
		int x;
		public void input(int x)
		{
			this.x=x;
		}
		public void foo()
		{
			this.show();
			System.out.println("hii java");
		}
		public void show()
		{
			System.out.println(x);
		}
		public void show2()
		{
			System.out.println("Student");
		}
		public static void main(String args[])
		{
			ThisDemo t = new ThisDemo();
			t.input(300);
			t.show2();
			t.foo();
		}
}
