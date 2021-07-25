// 2) Class, Object and Constructor 

/* Create a class as Student Attributes --> stid, name,course,marks, param constructor to assign values Student(stid, name,course,marks)
and method as show() --> Display all details.Also, Ask user to enter 5 students details and hold these objects in an array.
Display students having more than 60 marks from BCA course. */

package com.neosoft.basics;
import java.util.*;

class Student1 {
    
	public String st_id;
    public String st_name;
    public String st_course;
    public int st_marks;

    public Student1(String stid, String name, String course, int marks)
    {
        this.st_id=stid;
        this.st_name=name;
        this.st_course=course;
        this.st_marks=marks;
    }
    public void show()
    {	
    	if(st_marks>=60 && st_course.equals("BCA"))
    	{
    		System.out.println(this.st_id+" "+this.st_name+" "+
    				this.st_course+" "+this.st_marks);	
    	}
    }
    
    public static void main(String args[]) {
        
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        Student1[] st = new Student1[n];

        for (int i = 0; i<n; i++)
        {
            
        	System.out.print("Student ID: ");
            String stid = sc.next();
            
            
            System.out.print("Student Name: ");
            String name = sc.next();
            
            
            System.out.print("Student Course: ");
            String course = sc.next();
            
            
            System.out.print("Student Marks: ");
            int marks = sc.nextInt();
            
            Student1 s = new Student1(stid, name, course, marks);
            st[i] = s;
            
       }
       System.out.println("Student Info:");
       for(int i=0;i<n;i++)
       {
    	  st[i].show(); 
       }
    }
} 


/* Output:
Enter n:
3
Student ID: 101
Student Name: Nishargi
Student Course: BCA
Student Marks: 97
Student ID: 102
Student Name: Hinal
Student Course: BCA
Student Marks: 57
Student ID: 103
Student Name: Ruchi
Student Course: CP
Student Marks: 90
Student Info:
101 Nishargi BCA 97 */