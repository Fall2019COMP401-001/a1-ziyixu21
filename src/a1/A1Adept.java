package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberofitems= scan.nextInt();
		int size=numberofitems;
		double s=0;
		double b=0;
		
		for(int i=0; i<numberofitems; i++)
		{	
			String name[]=new String[size];
			name[i] = scan.next();
			//System.out.println(name);
			
			double price[]=new double[size];
			price[i] = scan.nextDouble();
			//System.out.println(price);
		}
		
		int customers = scan.nextInt() ;
		
		
		double netprice=0;
				
		for(int i=0;i<customers;i++)
		{	
			String firstname[]=new String[customers];
			firstname[i] = scan.next();
			
			//System.out.println(firstname);
			String lastname[]=new String[customers];
			lastname[i] = scan.next();
			//System.out.println(lastname);
			
			int items = scan.nextInt();
			//System.out.println(items);
			
			
			
			
			
		for(int m=0;m<items;m++)
		{
			int quantity[]=new int[items];
			quantity[m]= scan.nextInt();
			//System.out.println(quantity);
			
			String name1[]=new String[size];
			name1[m] = scan.next();
			//System.out.println(name);
			
			for(int l=0; l<size; l++)
			{
		    if(Arrays.Equals(name1[m],name[l]))
			}
			
			int price[m];
			
			double priceofthisitem=quantity*price;
			
			netprice = netprice + priceofthisitem;
			
			
		}
		
		
		
		if(s==0&&b==0)
		{
			s=netprice;
			b=netprice;
		}
		
		if(b>netprice)
		{
		
		}
		else
		{
			b=netprice;
		}
		
		
		if(s<netprice)
		{
			s=netprice;
		}
		else
		{
			
		}
		
			
		}
		
		double average=(b+s)/2;
		System.out.println("Average: "+average);
	}
}
