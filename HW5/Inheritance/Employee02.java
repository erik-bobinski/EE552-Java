
/*
Overview
In this code example, we explore the concept of multi-inheritance in Java using a scenario involving a Teaching Assistant (TA). 
The TA class inherits from both the Employee and Student classes, 
showcasing how a single class can have attributes and methods from multiple parent classes.

Classes
1. Employee Class
The Employee class represents a general employee and has attributes such as
 name, job, and salary. It also includes methods to set and get these attributes.
 
 2. Student Class
The Student class represents a student and includes attributes like 
name, department, and research_interest. Similar to the Employee class, 
it provides methods to set and get these attributes.

3. TeachingAssistant Class
The TeachingAssistant class inherits from both Employee and Student, (not possible)
creating a unique class that combines attributes and methods from both parent classes. 
It utilizes the constructors of each parent class to initialize their attributes.

In the main method, 
we create a TeachingAssistant object named ta. We demonstrate how to modify attributes such as
 salary and research_interest using the setSalary and setResearchInterest methods.

Additionally, we explore how to call methods from specific parent classes using the super keyword. 
This resolves ambiguity when a method is present in both parent classes.


Output
The output demonstrates the information about the TA before and after modifications. 
The display method is called to showcase the information about the TA, including both employee and student aspects.
 */
public class Employee02 {
	
	private String name;
    private String job;
    private float salary;

    public Employee02(String n, String j, float s) {
        name = n;
        job = j;
        salary = s;
    }
    
    

	
	
	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getJob() {
		return job;
	}





	public void setJob(String job) {
		this.job = job;
	}





	public float getSalary() {
		return salary;
	}





	public void setSalary(float salary) {
		this.salary = salary;
	}





	//==========================================================================================
	public void display() {
	        System.out.println("Employee: Name= " + name + " job= " + job + " salary= " + salary);
	    }
	//===========================================================================================



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TeachingAssistant02 ta = new TeachingAssistant02("DataScience", "Nano Tech", "John");
        ta.display(); // display of parent or child 
        System.out.println(ta.getDepartment());
        System.out.println(ta.getResearchInterest());

        System.out.println("################");

        ta.setName("Lily");
        ta.setDepartment("ECE");
        ta.setResearchInterest("AI");

        ta.display();

	}

}

/* Multi-inherhitance in Java? 
 No, in Java, a class cannot directly inherit from multiple classes at the same time. 
 Java supports single inheritance for classes, which means a class can have only one direct superclass.
  This design choice was made to avoid the complications associated with multiple inheritance, such as the diamond problem.

However, Java supports multiple inheritance through interfaces. 
A class can implement multiple interfaces, allowing it to inherit behavior from multiple sources. 
Interfaces provide a way to achieve a form of multiple inheritance by defining method signatures that implementing classes must provide.
*/
