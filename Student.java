package org.student;

import org.department.Department;
// using extends keyword inheriting the depart class which is in another package (multilevel inheritance)//
public class Student extends Department {
	public void studentName()
	{
		System.out.println("Sankar");
	}
	
	public void studentDept()
	{
		System.out.println("CSE-D");
	}
	public void studentID()
	{
		System.out.println("0028");
	}
	public static void main(String[] args) {
		// calling parent class and child classed methods using one object stud here//
		Student stud= new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
        stud.DeptName();
        stud.studentName();
        stud.studentDept();
        stud.studentID();
	}
	

}
