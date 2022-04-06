package FirstApril.Assesment1.stApril_assessment1_employeelist.Employee;

import java.util.Comparator;

public class ageComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) o1;
		Employee employee2=(Employee)o2;
		if(((Employee) o1).getAge()==((Employee) o2).getAge())
			return ((Employee) o1).getDateOfJoining().compareTo(((Employee) o2).getDateOfJoining());
		if (employee.getAge() > employee2.getAge()) {
			return 1;
		}
		else if (employee.getAge() < employee2.getAge())  {
			return -1;
		}
		else {
			return 0;
		}
		
	}

}
