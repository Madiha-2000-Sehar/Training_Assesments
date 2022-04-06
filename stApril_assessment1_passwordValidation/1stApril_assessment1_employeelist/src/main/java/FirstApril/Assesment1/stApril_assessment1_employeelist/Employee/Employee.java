package FirstApril.Assesment1.stApril_assessment1_employeelist.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Employee implements Comparable{
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}
	private int age;
	private int salary;
	//private Set<Employee> employee
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, String department, String dateOfJoining, int age, int salary) throws ParseException {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		String date=dateOfJoining;
		this.dateOfJoining = new SimpleDateFormat("dd/mm/yyyy").parse(date);
		this.age = age;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Object o) {
		Employee emp=(Employee)o;
		if(this.getSalary() > emp.getSalary()) {
			return 1;
		}
		else if(this.getSalary()<emp.getSalary()) {
			return -1;
		}
		else
			return 0;
	}
	
}
