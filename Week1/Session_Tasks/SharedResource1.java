// 7) Thread Synchronization:

/* doPrint(i,j) 2,5 => 2 3 4 5 6 7  (5 digits are added in seq after 2)
                3,7 => 3 4 5 6 7 8 9 10 (7 digits are added in seq after 3)
                
Print with 1 second pause and Make that doPrint method as synchronized method. */

package com.neosoft.basics;

class MyThread1{ 
	synchronized void doPrint(int m,int n) {
		for(int i=m;i<=m+n;i++)
		{
			System.out.print(" "+i+", ");
		}
		System.out.println();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			
		}	
	}
}  
public class SharedResource1
{  
	public static void main(String args[]){  
	
	MyThread1 obj = new MyThread1(); //only one object shared same method
	  
	Thread t1=new Thread() // anonymous way
	{  
		public void run(){  
			obj.doPrint(2,5);  
		}  
	};  
	
	Thread t2=new Thread()
	{  
		public void run(){  
			obj.doPrint(3,7);  
		}  
	};  
	  
	t1.start();  
	t2.start();  
	
	}  
}  


/* Output:
2,  3,  4,  5,  6,  7, 
3,  4,  5,  6,  7,  8,  9,  10, 
*/