package day8.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


/**
 * Collections *****
 * Exception 
 * Inhertance ***** (Overriding/Upcasting/Downcasting/instance of)
 * String ::: *****
 * Lamda/Stream 
 *
 */
public class D5ArrayListDemo {

	public static void main(String[] args) {
		
		demo3();
	}
	
	
	static void demo3() {
		
		// Collection Ecosystem :: Hierarchy
		Collection<Person> list1 = new ArrayList<>();
		List<Person> list2 = new ArrayList<>();  // Preffered
		ArrayList<Person> list3 = new ArrayList<>();
		
		
		// HashSet
		Collection<Person> set1 = new HashSet<>();
		Set<Person> set2 = new HashSet<>(); // preferred
		HashSet<Person> set3 = new HashSet<>();
		
		
		// TreeSet
		SortedSet<Person> tset1 = new TreeSet<>();
		
	}
	
	
	
	static void demo2() {
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person(100, "Rohit", "rohit@abcd.com", "12121212"));
		list.add(new Person(30, "Virat", "virat@abcd.com", "32121212"));
		list.add(new Person(400, "Sachin", "sachin@abcd.com", "42121212"));
		list.add(new Person(50, "Saurav", "saurav@abcd.com", "52121212"));
		list.add(new Person(100, "Rohit", "rohit@abcd.com", "22121212"));
		
		System.out.println(list.size());
		System.out.println(list);
		
		// sorting issue :: UDD: User Defined DataType :: Comparable :: Comparator
		// Comparable is the easier option :: It affect the origina class
		// Collections.sort(list);
		// Collections.sort(list, new PersonIdComparator());
		Collections.sort(list, new PersonEmailComparator());
		
		
		System.out.println(list);
	}
	
	static void demo1() {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Mumbai");
		list.add("Delhi");
		list.add("Chennai");
		list.add("Delhi");
		
		
		System.out.println(list.size());
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
