package assign11july;

public class CarDemo {
	int carNum;
	String carName;
	int carPrise;
	public void acceptDetails(int num,String name,int prise)
	{
		carNum = num;
		carName = name;
		carPrise = prise;
	}
	public void display()
	{
		System.out.println(carNum+" "+carName+" "+carPrise);
	}
	public static void main(String args[])
	{
		CarDemo car1 = new CarDemo();
		car1.acceptDetails(111, "Swift", 1000000);
		car1.display();
		CarDemo car2 = new CarDemo();
		car2.acceptDetails(112, "Enova", 2000000);
		car2.display();
	}
}
