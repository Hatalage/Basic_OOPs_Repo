package Lab16Julyassign;

import java.util.Scanner;

public class Ticket {
		private int ticketid;
		private int prise;
		static int availableTickets;
		public void setTicketid(int ticketid)
		{
			this.ticketid=ticketid;
		}
		public void setPrise(int prise)
		{
			this.prise=prise;
		}
		public static void setAvailableTickets(int availableTickets)
		{
			if(availableTickets>=0)
			{
				System.out.println("Available tickets are: "+availableTickets);
			}
			else
			{
				System.out.println("Enter correct value: ");
			}
		}
		public int getTicketid()
		{
			return ticketid;
		}
		public int getPrise()
		{
			return prise;
		}
		public static int getAvailableTickets()
		{
			return availableTickets;
		}
		public int CalculateTickets(int nooftickets)
		{
			int ticket=getAvailableTickets();
			if(ticket<nooftickets)
			return -1;
			else
			{
				int prise=getPrise();
				int available=ticket-nooftickets;
				setAvailableTickets(available);
				int amount=nooftickets*prise;
				return amount;
			}
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			Ticket t = new Ticket();
			System.out.println("Enter no of booking: ");
			int book = sc.nextInt();
			System.out.println("Enter the available tickets: ");
			int available = sc.nextInt();
			t.setAvailableTickets(available);
			for(int i=0;i<=book;i++)
			{
				System.out.println("Enter the ticketid: ");
				int id=sc.nextInt();
				t.setTicketid(id);
				System.out.println("Enter the prise: ");
				int prise = sc.nextInt();
				t.setPrise(prise);
				System.out.println("Enter the no of tickets: ");
				int tickets=sc.nextInt();
				if(tickets<=available)
				{
					System.out.println("Available tickets: "+t.getAvailableTickets());
					int amount =  t.CalculateTickets(tickets);
					if(amount==-1)
					{
						System.out.println("Tickets not available!!");
					}
						else
						{
							System.out.println("total amount: "+amount);
							System.out.println("Available ticket after booking: "+t.getAvailableTickets());
						}
					}
				}
			}
		}

