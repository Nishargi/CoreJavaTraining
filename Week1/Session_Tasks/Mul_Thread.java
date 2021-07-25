// 6) Multi threading:

/* Create a class for Thread1 to execute "Java is nice" in reverse order with pause of 2 seconds. --> ecin si avaJ
Create a class Thread2 to execute "Java is nice" with alternate characters with pause of 1 second.

join -->  join() method which allows one thread to wait until another thread completes its execution. */

package com.neosoft.basics;

class Thread1 extends Thread{
	public void run()
	{  
		String s1 = "Java is nice";
        for(int i=s1.length()-1;i>=0;i--)
        {
                System.out.print(s1.charAt(i));
                try
                {
                	Thread.sleep(2000);
                }
                catch(Exception e)
                {
                	
                }  
        }
		
	}  
}
class Thread2 extends Thread{
	public void run()
	{  
		String s1 = "Java is nice";
        for(int i=0; i<=s1.length()-1;i=i+2)
        {
            System.out.print(s1.charAt(i));
            try{
                	Thread.sleep(2000);
            }
            catch(Exception e)
            {
               
            }  
        }
		
	}  
}
public class Mul_Thread {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("---Thread 1---");
		Thread1 t1 = new Thread1();
		t1.start();
		try
		{  
			  t1.join();  
	    }
		catch(Exception e)
		{
	    	 System.out.println(e);
		}
		System.out.println(" ");
		System.out.println("---Thread 2---");
		Thread2 t2 = new Thread2();
		t2.start();
		try
		{  
			  t2.join();  
	    }
		catch(Exception e)
		{
	    	 System.out.println(e);
		}
	}

}

/* Output:
---Thread 1---
ecin si avaJ 
---Thread 2---
Jv snc   */
