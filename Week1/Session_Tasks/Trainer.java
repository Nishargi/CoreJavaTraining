// 8)  List:

/*Create 5 objects of Trainer (tr_id,name,course,salary) with different values.Using Collection, filter out the trainers 
having salary > 20000 and course is Java.Put these filtered trainers into another collection for further reference. 
Remove it from the original collection and Display these filtered trainers collection objects using an iterator. */

package com.neosoft.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Trainer {

	int tr_id;
	String name;
	String course;
	int salary;
	
	public Trainer(int tr_id, String name, String course, int salary) {
		this.tr_id = tr_id;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	
    public static void main(String[] args) {
		
		ArrayList<Trainer> t1 = new ArrayList <Trainer>();
		t1.add(new Trainer(101,"Nishargi Shah","Java",30000));
		t1.add(new Trainer(102,"Shruti Shah","Python",25000));
		t1.add(new Trainer(103,"Ruchi Patel","Java",25000));
		t1.add(new Trainer(104,"Yashvi Panchal","Python",20000));
		t1.add(new Trainer(105,"Hinal Rana","Java",18000));
	       
		System.out.println("-----The trainers having salary > 20000 and course is Java-----"+"\n");
		System.out.println("Trainer's Details:"+"\n");
		
		for(Trainer t2:t1) 
		{
			if(t2.salary>20000 && t2.course.equals("Java"))
			{
				//System.out.println("Id:"+t2.tr_id+" "+"Name:"+t2.name+" "+"Course:"+t2.course+" "+"Salary:"+t2.salary);
				List<Object> trainerList = new ArrayList <Object>(Arrays.asList(t2.tr_id,t2.name,t2.course,t2.salary));
				for(Object obj:trainerList) {
					System.out.println(obj);
				}
			}
			
		}
		
		Predicate<Trainer> condition = trainer -> trainer.course.equals("Java") && trainer.salary>20000;
		t1.removeIf(condition);
		
		System.out.println("\n"+"-----The Filtered Out Trainers-----"+"\n");
		
		Iterator<Trainer> itr = t1.iterator();
		while(itr.hasNext())
		{
			Trainer t3 =itr.next(); // no conversion required
			System.out.println("Id:"+t3.tr_id+" "+"Name:"+t3.name+" "+"Course:"+t3.course+" "+"Salary:"+t3.salary);	
		}
	}

}

/* Output:
-----The trainers having salary > 20000 and course is Java-----

Trainer's Details:

101
Nishargi Shah
Java
30000
103
Ruchi Patel
Java
25000

-----The Filtered Out Trainers-----

Id:102 Name:Shruti Shah Course:Python Salary:25000
Id:104 Name:Yashvi Panchal Course:Python Salary:20000
Id:105 Name:Hinal Rana Course:Java Salary:18000
*/
