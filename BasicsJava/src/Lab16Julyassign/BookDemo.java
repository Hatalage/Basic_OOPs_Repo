package Lab16Julyassign;

public class BookDemo {
		private String bname;
		private int bprise;
		private String author_name;
		public void setBname(String bname)
		{
			this.bname=bname;
		}
		public void setBprise(int bprise)
		{
			this.bprise=bprise;
		}
		public void setAuthor_name(String author_name)
		{
			this.author_name=author_name;
		}
		public String getBname()
		{
			return bname;
		}
		public int getBprise()
		{
			return bprise;
		}
		public String getAuthor_name()
		{
			return author_name;
		}
	public static void main(String args[])
	{
		BookDemo bk = new BookDemo();
		bk.setBname("Java");
		bk.setBprise(500);
		bk.setAuthor_name("Einstein");
		System.out.println("The book name is: "+bk.getBname());
		System.out.println("The book prise is: "+bk.getBprise());
		System.out.println("The book author is: "+bk.getAuthor_name());
	}
}
