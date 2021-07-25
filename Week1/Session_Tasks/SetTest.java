// 10) Write a program to implement the HashSet, LinkedHashSet and TreeSet differences.

package com.neosoft.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class SetTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("---HashSet Example---");
		Set <String> hash_set= new HashSet <String>();
		hash_set.add("Java");
		hash_set.add("is");
		hash_set.add("nice");
		System.out.println(hash_set);
		
		Set<Integer> set1 = new HashSet <Integer>();
		set1.addAll(Arrays.asList(new Integer[] {1,3,2,4,8,6,9,0}));
		
		Set<Integer> set2 = new HashSet <Integer>();
		set2.addAll(Arrays.asList(new Integer[] {1,3,7,4,5,6,7,5}));
		
		//Union
		Set<Integer> union = new HashSet <Integer>(set1);
		union.addAll(set2);
		System.out.println("Union:"+union);
		
		//Intersection
		Set<Integer> intersect = new HashSet <Integer>(set1);
		intersect.retainAll(set2);
		System.out.println("Intersection:"+intersect);
		
		//Symmetric Difference
		Set<Integer> diff = new HashSet <Integer>(set1);
		diff.removeAll(set2);
		System.out.println("Symmetric Difference:"+diff);
		
		System.out.println("2 is there?"+diff.contains(2));
		System.out.println("Remove 0:"+diff.remove(0));
	
		for(Integer i:diff)
		{
			System.out.print("Element:"+i+", ");
		}
		System.out.println("\nWith iterator:");
		Iterator<Integer> itr= diff.iterator();
		while(itr.hasNext()) {
			System.out.print("Element:"+itr.next()+", ");
		}
		
		System.out.println();
		
		System.out.println("\n---LinkedHashSet Example---");
		
		Set <String> lhs = new LinkedHashSet<String>(); //LinkedHashSet 
		lhs.add("Nishargi");
		lhs.add("Hinal"); 
		lhs.add("Aesha");
		lhs.add("Siddhi");
		lhs.add("Shruti");
		
		System.out.print("Element:"+lhs);
		
		lhs.remove("Siddhi");
		System.out.print("\nElement:"+lhs);
		
		System.out.println();
		System.out.println("\n---TreeSet Example---");
		Set <String> ts = new TreeSet<String>(); //TreeSet -> Sorted in Ascending Order 
		ts.add("Nishargi");
		ts.add("Hinal"); 
		ts.add("Aesha");
		ts.add("Siddhi");
		ts.add("Shruti");
		
		System.out.print("Element:"+ts);
		
		ts.remove("Shruti");
		System.out.print("\nElement:"+ts);
		
		
	}

}

/* Output:
 ---HashSet Example---
[Java, is, nice]
Union:[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Intersection:[1, 3, 4, 6]
Symmetric Difference:[0, 2, 8, 9]
2 is there?true
Remove 0:true
Element:2, Element:8, Element:9, 
With iterator:
Element:2, Element:8, Element:9, 

---LinkedHashSet Example---
Element:[Nishargi, Hinal, Aesha, Siddhi, Shruti]
Element:[Nishargi, Hinal, Aesha, Shruti]

---TreeSet Example---
Element:[Aesha, Hinal, Nishargi, Shruti, Siddhi]
Element:[Aesha, Hinal, Nishargi, Siddhi]
*/ 
