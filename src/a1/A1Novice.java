package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int customers = scan.nextInt() ;
		System.out.println(customers);
		
		for(int i=1;i<=customers;i++)
		{
			String firstname = scan.next();
			System.out.println(firstname);
			
			String lastname = scan.next();
			System.out.println(lastname);
			
			int items = scan.nextInt();
			System.out.println(items);
			
			int quantity = scan.nextInt();
			System.out.println(quantity);
			
			String name = scan.next();
			System.out.println(name);
			
			double price = scan.nextDouble();
			System.out.println(price);
			
			char firstletter = firstname.charAt(1);
			
			double netprice = quantity*price;
			
			System.out.println(firstletter+". "+lastname+": "+netprice);
						
		}
		
		
	}
}
