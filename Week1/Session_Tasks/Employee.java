// 3) Has-A Relation:

/* Create a class as Employee (Attributes --> eid, ename,esal,project)
Create a class as Project (Attributes --> pid, pname,plocation)
Crate two employees and assign them a Project as "Mobile App for Project management"
create two more employees and assign them a Project as "E-Commerce Web App"

Out of these 4 display employees having salary > 25000 and working for Web application. */

package com.neosoft.basics;
class Project
{
  int projectid;
  String projectName;
  String projectplace;

  // Project class constructor
  Project(int pid, String name, String place)
  {
    this.projectid = pid;
    this.projectName=name;
    this.projectplace=place;
  }
}

class Employee
{
  int empid,empsal;
  String empname,emppro;
  Project project; // Reference - Has-A Relationship
  
  Employee(int eid, String ename,int esal,Project project)
  {
    this.empid=eid;
    this.empname=ename;
    this.empsal=esal;
    this.project = project;
  }
  void check() {
	  if(project.projectName=="E-Commerce Web App" && empsal>=25000)
	  {
		  System.out.println("Id:"+empid+" "+"Name:"+empname);
		  System.out.println("Project ID:"+project.projectid+" "+"Project Name:"+project.projectName+" "+"Proejct Location:"+project.projectplace);
		  System.out.println("-------------------------------");
	  }
  }
  public static void main(String[] args) {
    Project project1 = new Project(1,"Mobile App for Project management","Anand");
    Project project2 = new Project(2,"E-Commerce Web App","vadodara");
    Employee e1 = new Employee(101,"Nishargi",30000,project1);
    Employee e2 = new Employee(102,"Hinal",20000,project1);
    Employee e3 = new Employee(101,"Ruchi",30000,project2);
    Employee e4 = new Employee(102,"Shruti",25000,project2);
    e1.check();
    e2.check();
    e3.check();
    e4.check();  
  } 
}

/* Output:
Id:101 Name:Ruchi
Project ID:2 Project Name:E-Commerce Web App Proejct Location:vadodara
-------------------------------
Id:102 Name:Shruti
Project ID:2 Project Name:E-Commerce Web App Proejct Location:vadodara
-------------------------------
*/
