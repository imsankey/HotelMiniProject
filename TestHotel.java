package miniproject;

import java.util.Scanner;

public class TestHotel 
{
	public static void main(String [] arg)
	{
		Scanner sc=new Scanner(System.in);
		String cname;
		int ccontact,cid,croomno,choice=0,count=0,totalroom=10,availableroom=0;
		Hotel[] h=new Hotel[10];
		
		do
		{
			System.out.println("1.Manage room detail \n2.check in details \n3.get available room. \n4.Search customer\n5.checkout room\n6.get customer summary");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("total number of room "+totalroom);
				break;
				
			case 2:
				System.out.println("Enter the customer name");
				cname=sc.next();
				
				System.out.println("Enter the customer contact");
				ccontact=sc.nextInt();
				
				System.out.println("Enter the customer Id");
				cid=sc.nextInt();
				
				System.out.println("Enter the customer room no");
				croomno=sc.nextInt();
				
				h[count]=new Hotel(cname,ccontact,cid,croomno);
				count++;
				System.out.println("Added sucessfully");
				break;
				
			case 3:
				availableroom=totalroom-count;
				System.out.println("Available room ="+availableroom);
				
				break;
				
			case 4:
				System.out.println("Enter the customer id to search");
				cid=sc.nextInt();
				for(int i=0;i<=count;i++)
				{
					if(h[i]!=null && h[i].getCustomerId()==cid)
					{
						System.out.println(h[i]);
					}
				}
				
				break;
			case 5:
				System.out.println("Enter the customer id to check out");
				cid=sc.nextInt();
				availableroom=availableroom+1;
				for(int i=0;i<=count;i++)
				{
					if(h[i]!=null && h[i].getCustomerId()==cid)
					{
						h[i]=null;
						System.out.println("Check out succesfully");
						
					}
				}
				
				
				break;
			case 6:
				System.out.println("-----------------------customer list------------------------");
				for(int i=0;i<=count;i++)
				{
					System.out.println(h[i]);
				
				}
				break;
				
				default :
					System.out.println("invalid choice");
			}
		}while(choice!=6);
	}

}
