package LogicalClass;

public class ArrayCode4 {
	public static void alternateChar(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				ch[i]=(char)(ch[i]+34);
				System.out.println(ch[i]);
			}
			else if(ch[i]>=90&&ch[i]<=122)
			{
				ch[i]=(char)(ch[i]-30);
				System.out.println(ch[i]);
			}
		}
		
	}
	public static void main(String[] args) {
	char s[]=new char[] {'t','D','A','y'};
	for(int i=0;i<s.length;i++)
	{
		System.out.println("character at "+i+":"+s[i]);
	}
	alternateChar(s);
}
}
