// 4) Inheritance and Polymorphism:

/* Write a program to create a class named shape. In this class we have three
sub classes Circle, Triangle and Square each class has two member function
named area () and draw (). Create these using polymorphism concepts. 
area() --> Calculate the area of shape
draw () --> Drawing a shape [name] */

package com.neosoft.basics;

class Shape1 {
	 public void area() {
		 System.out.println("---Finding Area of Different Shapes---");
	 }
	 public void draw()
	 {
		 System.out.println("---Drawing Different Shapes---");
	 }
}
class Square extends Shape1 {
	  float a1;
	  public void area(int l) {
	    a1 = l*l;
	    System.out.println("Area of Square is: "+a1);
	  }
	  public void draw()
		 {
			 System.out.println("...Drawing Square...");
		 }
	}

class Triangle extends Shape1 {
	  double a2;
	  public void area(float b,float h) {
		a2 = 0.5*b*h;
	    System.out.println("Area of Triangle is: "+a2);
	  }
	  public void draw()
		 {
			 System.out.println("...Drawing Triangle...");
		 }
	}
class Circle extends Shape1 {
	  double a3;
	  public void area(float r) {
		a3 = 3.14*r*r;
	    System.out.println("Area of Circle is: "+ a3);
	  }
	  public void draw()
		 {
			 System.out.println("...Drawing Circle...");
		 }
	}
public class Shape {
	  public static void main(String[] args) {
	    Shape1 s1 =new Shape1();
	    Square s2 = new Square();
	    Triangle s3 = new Triangle();
	    Circle s4 = new Circle();
	    s1.area();
	    s1.draw();
	    s2.area(5);
	    s2.draw();
	    s3.area(5,4);
	    s3.draw();
	    s4.area(10);
	    s4.draw();
	    }
}

/* Output:
---Finding Area of Different Shapes---
---Drawing Different Shapes---
Area of Square is: 25.0
...Drawing Square...
Area of Triangle is: 10.0
...Drawing Triangle...
Area of Circle is: 314.0
...Drawing Circle...*/
