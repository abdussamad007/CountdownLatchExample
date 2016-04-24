package com.java.example.compareto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * 
 * @author abdus
 *
 */
public class SortByEmployeeSalary {
	
	String employeeName;
	double salary;
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	SortByEmployeeSalary(){
		
	}
	public SortByEmployeeSalary(String employeeName,double salary){
		this.employeeName=employeeName;
		this.salary=salary;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SortByEmployeeSalary emp1 = new SortByEmployeeSalary("Abdus", 5000);
		SortByEmployeeSalary emp2 = new SortByEmployeeSalary("bhutu", 250);
		SortByEmployeeSalary emp3 = new SortByEmployeeSalary("kalu", 3000);
		SortByEmployeeSalary emp4 = new SortByEmployeeSalary("sambhu", 15000);
		SortByEmployeeSalary emp5 = new SortByEmployeeSalary("Abdi", 7000);
		SortByEmployeeSalary emp6 = new SortByEmployeeSalary("Sama", 100);
		
		ArrayList<SortByEmployeeSalary> list = new ArrayList<SortByEmployeeSalary>();
		list.add(emp1);list.add(emp2);list.add(emp3);list.add(emp4);list.add(emp5);
		list.add(emp6);
		
		System.out.println("----------Before short----------");
		for (SortByEmployeeSalary sortByEmployeeSalary : list) {
			System.out.println(sortByEmployeeSalary.getEmployeeName() + "<>"+sortByEmployeeSalary.getSalary());
		}
		
		Collections.sort(list, new SalaryComparator());
		System.out.println("----------after short----------");
		for (SortByEmployeeSalary sortByEmployeeSalary : list) {
			System.out.println(sortByEmployeeSalary.getEmployeeName() + "<>"+sortByEmployeeSalary.getSalary());
		}
	}
	
}

/**
 * 
 * @author abdus
 *
 */
class SalaryComparator implements Comparator<SortByEmployeeSalary>{

	@Override
	public int compare(SortByEmployeeSalary o1, SortByEmployeeSalary o2) {
		// TODO Auto-generated method stub
		double s1=o1.getSalary();
		double s2 = o2.getSalary();
		if(s1>s2)
		return 1;
		else if(s1<s2)
			return -1;
		else
			return 0;
	}
}