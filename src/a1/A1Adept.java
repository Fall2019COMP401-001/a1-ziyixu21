package a1;

import java.util.Scanner;
import java.util.Arrays;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberofitems= scan.nextInt();
		int size=numberofitems;
		
		//biggest and smallest spend 
		double min=0;
		double max=0;
		//arrays for items'name and price
		String name[]=new String[size];
		double price[]=new double[size];
		
		
		for(int i=0; i<numberofitems; i++)
		{	
			
			name[i] = scan.next();		
			
			price[i] = scan.nextDouble();
		}	
		
		
		
		
		//arrays for customers name
		int customers = scan.nextInt() ;
		String firstname[]=new String[customers];
		String lastname[]=new String[customers];
		//arrays for total price for each customers
		double total[]=new double[customers];
		
		
//loop for customers name
		
		for(int i=0;i<customers;i++)
		{	
			firstname[i] = scan.next();
			
			lastname[i] = scan.next();

			//number of items this customer bought
			int items = scan.nextInt();

			//quantity of each item
			int quantity[]=new int[items];
			//name of each item
			String name1[]=new String[size];
			//total money this customer paid
			double netprice=0;
			double priceofoneitem=0;
			
			//loops for items 			
		    for(int m=0;m<items;m++){	
			
			   
			
			   quantity[m]= scan.nextInt();
			
			   name1[m] = scan.next();		
			
               //loop for finding price of one item			
			   for(int l=0; l<size; l++){
		             if(name1[m].equals(name[l])){
		    		     priceofoneitem += price[l]*quantity[m];
				     }
			   }

		    }
		    netprice = priceofoneitem;
			//System.out.println(netprice);
			total[i]=netprice;
			
		}
		
		//loop for finding the max and min
		
		int index_max=0;
		int index_min=0;
		for(int i=0;i<customers;i++)
		{
			if(i==0)
			{
				min=total[i];
				max=total[i];
			}
			else
			{
				if(min>total[i])
				{
					min=total[i];
					index_min=i;
				}
				else
				if(max<total[i])
				{
					max=total[i];
					index_max=i;
				}
			}
		}
		
		//find the average
		double sum=0;
		for(int i=0; i<customers; i++)
		{			
			sum=sum+total[i];
		}
		
		double average=sum/customers;
		
		System.out.println("Biggest: "+firstname[index_max]+" "+lastname[index_max]+"("+String.format("%.2f", max)+")");
		System.out.println("Smallest: "+firstname[index_min]+" "+lastname[index_min]+"("+String.format("%.2f", min)+")");
		System.out.println("Average: "+String.format("%.2f", average));
		
		//System.out.println(firstname[0]);
		//System.out.println(lastname[0]);
		//System.out.println(total[0]);
		
		
		
		
		
   }
}
