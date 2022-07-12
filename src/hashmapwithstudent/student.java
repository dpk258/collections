package hashmapwithstudent;

import java.util.Objects;

public class student {
	String name;
	int age;
	int empid;
	String fname;
	public student(String name, int age, int empid, String fname) {
		super();
		this.name = name;
		this.age = age;
		this.empid = empid;
		this.fname = fname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", empid=" + empid + ", fname=" + fname + "]";
	}
	@Override
	public int hashCode() {
		return this.empid;
	}
	@Override
	public boolean equals(Object obj) {
		
		student other = (student) obj;
		return other.empid == this.empid ;
	}
	
	

}
