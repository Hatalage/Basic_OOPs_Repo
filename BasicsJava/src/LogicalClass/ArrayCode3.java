package LogicalClass;

public class ArrayCode3 {
		public static void replaceChar(char ch[])
		{
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]>=65&&ch[i]<=90)
				{
					ch[i]=(char)(ch[i]+32);
					System.out.println(ch[i]);
				}
				else if(ch[i]>=90&&ch[i]<=122)
				{
					ch[i]=(char)(ch[i]-32);
					System.out.println(ch[i]);
				}
			}
			
		}
		public static void main(String[] args) {
		char s[]=new char[] {'t','D','A','q'};
		for(int i=0;i<s.length;i++)
		{
			System.out.println("character at "+i+":"+s[i]);
		}
		replaceChar(s);
}
}
