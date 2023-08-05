package LogicalClass;

public class SortArray {
public static int[] sortArray(int a[])
{
	int len=a.length;
	for(int i=3;i<len;i++)
	{
		for(int j=3;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		for(int k=0;k<3;k++)
		{
			for(int j=0;j<2;j++)
				{
					if(a[j]<a[j+1])
					{
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
}
	return a;
}
public static void main(String[] args) {
	int num[]= {9,4,12,4,8,7,10};
	int sortOrder[]=sortArray(num);
	System.out.println("----Sorted Array---");
	for(int s:sortOrder)
	{
		System.out.println(s);
	}
}
}
