// 1) Program2: Ask user to enter a value for no. of rows (ex. 4) and display following Pattern	:	
/*			1
 	      2  3 
	     4  5  6 
	    7   8  9 10 */

package com.neosoft.basics;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i, j, row;  
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Total Number Of Rows:");
		 row = sc.nextInt();
		 int n=1;
		
		 //Outer loop work for rows  
		for (i=1; i<=row; i++)   
		{  
		    //inner loop work for space      
			for (j=row-i; j>=1; j--)   
			{  
			//prints space between two numbers
				System.out.print(" ");   
			}   
			for (j=1; j<=i; j++)   
			{   
			      System.out.print(n+" ");
			      n++;
			}   
			//throws the cursor in a new line after printing each line  
				System.out.println();   
		}   
	}   
}  

/* Output:
Enter Total Number Of Rows:
4
    1 
   2 3 
  4 5 6 
 7 8 9 10 */

		