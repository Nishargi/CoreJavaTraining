// 1) Program1: Ask user to enter an int value and check whether its a palindrome

package com.neosoft.basics;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		int originalNum = num;
		System.out.println("The number is:"+num);
		int rev=0,rem;                
		while(num>0)    
			{    						
				rem=num % 10;        	/* lastDigit : num = 123 -> 123 % 10 = 3; rev=0*10+3=3; num=(123/10)=12 */    
				rev=rev * 10 + rem;    	
				num= (num/10);   
			}
		System.out.println("Reverse of a number is:"+rev);
		if(originalNum == rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not a Palindrom");
		}
	}
}

/* Output: 
Enter a number:
12121
The number is:12121
Reverse of a number is:12121
Number is Palindrome */

