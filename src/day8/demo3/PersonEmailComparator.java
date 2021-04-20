package day8.demo3;

import java.util.Comparator;

public class PersonEmailComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getEmail().compareTo(o2.getEmail());
	}

}
