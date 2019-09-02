package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt() ;
		//System.out.println(customers);
		
		for(int i=0;i<customers;i++)
		{
			String firstname = scan.next();
			//System.out.println(firstname);
			
			String lastname = scan.next();
			//System.out.println(lastname);
			
			int items = scan.nextInt();
			//System.out.println(items);
			
			
			double netprice=0;
		
			
			for(int m=0;m<items;m++)
			{
			int quantity = scan.nextInt();
			//System.out.println(quantity);
			
			String name = scan.next();
			//System.out.println(name);
			
			double price = scan.nextDouble();
			//System.out.println(price);
			
			double priceofthisitem=quantity*price;
			
			netprice = netprice + priceofthisitem;
			
	
			}
			
			
			char firstletter = firstname.charAt(0);
			
			
			
			
			System.out.println(firstletter+". "+lastname+": "+String.format("%.2f", netprice));
						
		}
		
		
	}
}
