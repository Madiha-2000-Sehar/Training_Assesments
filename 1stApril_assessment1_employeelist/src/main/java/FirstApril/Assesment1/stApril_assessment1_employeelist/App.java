package FirstApril.Assesment1.stApril_assessment1_employeelist;
import java.util.ArrayList;
import java.util.Collections;
import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import FirstApril.Assesment1.stApril_assessment1_employeelist.Employee.ageComparator;
import FirstApril.Assesment1.stApril_assessment1_employeelist.Employee.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static <T> void main( String[] args ) throws ParseException
    {
    	Comparator c=new ageComparator();
    	Scanner sc=new Scanner(System.in);
    	String name,department,date;
    	int age,sal;
		List<Employee> emp=new ArrayList<Employee>();
		System.out.print("Enter no of employees: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the details for employee "+i);
			System.out.print("Name: ");
			name=sc.next();
			System.out.print("Department: ");
			department=sc.next();
			System.out.print("date (dd/mm/yyyy): ");
			date=sc.next();
			System.out.print("Age: ");
			age=sc.nextInt();
			System.out.print("Salary: ");
			sal=sc.nextInt();
			emp.add(new Employee(i,name,department,date,age,sal));
		}
		System.out.println("1. Sort employee by salary");
System.out.println("2. Sort employee by age and date");
int ch=sc.nextInt();
switch(ch) {
case 1:Iterator<Employee> iterator=emp.iterator();
while(iterator.hasNext())
{
	System.out.println(iterator.next());
}
break;
case 2:Collections.sort(emp,new ageComparator());;
System.out.println(emp);
break;

		//emp.add(new Employee(1,"Mary","CSE","10/10/2020",22,100));
		//emp.add(new Employee(1,"Joseph","CSE","20/10/2020",22,890));
		
    }
}}
