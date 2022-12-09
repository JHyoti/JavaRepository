package comparatormultisorting;

import java.util.Comparator;

public class IDSort implements Comparator<Employee>{

	public int compare(Employee o1, Employee o2) {
		
		 return Integer.compare(o1.geteId(), o2.geteId());

	}

}
