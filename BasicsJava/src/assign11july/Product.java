package assign11july;

public class Product {
		int prodId;
		String prodName;
		int prodPrice;
		int prodQuantity;
		public void acceptDetails(int id, String name, int price, int quantity)
		{
			prodId=id;
			prodName=name;
			prodPrice=price;
			prodQuantity=quantity;
		}
		public void display()
		{
			System.out.println(prodId+" "+prodName+" "+prodPrice+" "+prodQuantity);
		}
		public void bill()
		{
			if(prodQuantity>0)
			{
				int bill=prodQuantity*prodPrice;
				System.out.println(bill);
			}
			else
			{
				System.out.println("error");
			}
		}
		public static void main(String args[])
		{
			Product prod1 = new Product();
			prod1.acceptDetails(12,"KitKat",50,4);
			prod1.display();
			prod1.bill();
		}
}
