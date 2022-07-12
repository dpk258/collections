package hashcode_withequals;

import java.util.Iterator;

public class Employee {
	String Name;
	int Empid;
	int Age;

	public Employee(String name, int empid, int age) {
		super();
		this.Name = name;
		this.Empid = empid;
		this.Age = age;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getEmpid() {
		return this.Empid;
	}

	public void setEmpid(int empid) {
		this.Empid = empid;
	}

	public int getAge() {
		return this.Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public int hashCode() {
		System.out.println("haas code called");
		return this.Empid;
	}

	public boolean equals(Object obj) {
		System.out.println("equals called");
		Employee other = (Employee) obj;
		return other.Empid == this.Empid;
	}

	
	  @Override public String toString() { return "Employee [Name=" + Name +
	  ", Empid=" + Empid + ", Age=" + Age + "]"; }
	  
	 
}
